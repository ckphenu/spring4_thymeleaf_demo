package com.intel.dadi.thymeleaf.demo.stsm.web.server;

import com.intel.dadi.thymeleaf.demo.stsm.model.Variety;
import com.intel.dadi.thymeleaf.demo.stsm.web.repository.VarietyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Ecic Chen on 2015/12/10.
 */
@Service
public class VarietyService {
    @Autowired
    private VarietyRepository varietyRepository;

    public List<Variety> findAll() {
        return this.varietyRepository.findAll();
    }

    public Variety findById(final Integer id) {
        return this.varietyRepository.findById(id);
    }
}
