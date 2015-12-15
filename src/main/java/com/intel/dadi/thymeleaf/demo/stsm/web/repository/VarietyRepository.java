package com.intel.dadi.thymeleaf.demo.stsm.web.repository;

import com.intel.dadi.thymeleaf.demo.stsm.model.SeedStarter;
import com.intel.dadi.thymeleaf.demo.stsm.model.Variety;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * Created by Ecic Chen on 2015/12/10.
 */
public interface VarietyRepository extends Repository<Variety, Integer> {

    public List<Variety> findAll();
    public Variety findById(Integer id);
}
