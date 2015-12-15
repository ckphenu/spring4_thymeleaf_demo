package com.intel.dadi.thymeleaf.demo.stsm.model;

import javax.persistence.*;
import java.io.Serializable;
import java.security.Policy;
import java.util.Date;
import java.util.List;

/**
 * Created by Ecic Chen on 2015/12/10.
 */
@Entity
@Table(name = "t_seed_starter")
public class SeedStarter implements Serializable {

    @Id
    private Integer id;

    @Column(name="date_planted")
    private Date datePlanted;

    @Column(name="covered")
    private boolean covered;


    @Enumerated(EnumType.ORDINAL)
    private Type type;

    @Column(name="feature")
    @Enumerated(EnumType.ORDINAL)
    private Feature features;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "seedStarter")
    private List<Row> rows;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDatePlanted() {
        return datePlanted;
    }

    public void setDatePlanted(Date datePlanted) {
        this.datePlanted = datePlanted;
    }

    public boolean isCovered() {
        return covered;
    }

    public void setCovered(boolean covered) {
        this.covered = covered;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Feature getFeatures() {
        return features;
    }

    public void setFeatures(Feature features) {
        this.features = features;
    }

    public List<Row> getRows() {
        return rows;
    }

    public void setRows(List<Row> rows) {
        this.rows = rows;
    }
}
