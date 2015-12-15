package com.intel.dadi.thymeleaf.demo.stsm.model;

import javax.naming.Name;
import javax.persistence.*;

/**
 * Created by Ecic Chen on 2015/12/10.
 */
@Entity
@Table(name="t_row")
public class Row {

    @Id
    private int id;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "row")
    private Variety variety;

    @Column
    private Integer seedPreCell;

    @JoinColumn(name = "seed_id")
    @ManyToOne
    private SeedStarter seedStarter;

    public Variety getVariety() {
        return variety;
    }

    public void setVariety(Variety variety) {
        this.variety = variety;
    }

    public Integer getSeedPreCell() {
        return seedPreCell;
    }

    public void setSeedPreCell(Integer seedPreCell) {
        this.seedPreCell = seedPreCell;
    }

    public SeedStarter getSeedStarter() {
        return seedStarter;
    }

    public void setSeedStarter(SeedStarter seedStarter) {
        this.seedStarter = seedStarter;
    }
}
