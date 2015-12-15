package com.intel.dadi.thymeleaf.demo.stsm.web.repository;

import com.intel.dadi.thymeleaf.demo.stsm.model.SeedStarter;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * Created by Ecic Chen on 2015/12/10.
 */
public interface SeedStarterRepository extends Repository<SeedStarter, Integer> {

    public List<SeedStarter> findAll();
    public SeedStarter findById(Integer id);
    public void save(SeedStarter seedStarter);
}
