package com.intel.dadi.thymeleaf.demo.stsm.web.server;

import com.intel.dadi.thymeleaf.demo.stsm.model.SeedStarter;
import com.intel.dadi.thymeleaf.demo.stsm.web.repository.SeedStarterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Ecic Chen on 2015/12/10.
 */
@Service
public class SeedStarterService {

    @Autowired
    private SeedStarterRepository seedstarterRepository;
    public List<SeedStarter> findAll() {
        return this.seedstarterRepository.findAll();
    }


    public void add(final SeedStarter seedStarter) {
        this.seedstarterRepository.save(seedStarter);
    }

}
