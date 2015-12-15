package com.intel.dadi.thymeleaf.demo.stsm.model;

import javax.persistence.*;

/**
 * Created by Ecic Chen on 2015/12/10.
 */
@Entity
@Table(name="t_variety")
public class Variety {

    @Id
    private Integer id;
    @Column
    private String name;

    @JoinColumn(name = "id", unique=true, referencedColumnName = "id")
    @OneToOne
    private Row row;

    public Row getRow() {
        return row;
    }

    public void setRow(Row row) {
        this.row = row;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
