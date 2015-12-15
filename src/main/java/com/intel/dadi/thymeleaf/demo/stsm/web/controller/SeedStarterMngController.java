package com.intel.dadi.thymeleaf.demo.stsm.web.controller;

import com.alibaba.fastjson.serializer.ListSerializer;
import com.intel.dadi.thymeleaf.demo.stsm.model.Feature;
import com.intel.dadi.thymeleaf.demo.stsm.model.SeedStarter;
import com.intel.dadi.thymeleaf.demo.stsm.model.Type;
import com.intel.dadi.thymeleaf.demo.stsm.model.Variety;
import com.intel.dadi.thymeleaf.demo.stsm.web.server.SeedStarterService;
import com.intel.dadi.thymeleaf.demo.stsm.web.server.VarietyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.expression.Lists;
import org.thymeleaf.util.ListUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Ecic Chen on 2015/12/10.
 */
@Controller
public class SeedStarterMngController {
    @Autowired
    private VarietyService varietyService;
    @Autowired
    private SeedStarterService seedStarterService;

    @ModelAttribute("allTypes")
    public List<Type> populateTypes() {
        return Arrays.asList(Type.ALL);
    } @
              ModelAttribute("allFeatures")
      public List<Feature> populateFeatures() {
        return Arrays.asList(Feature.ALL);
    } @
              ModelAttribute("allVarieties")
      public List<Variety> populateVarieties() {
        return this.varietyService.findAll();
    } @
              ModelAttribute("allSeedStarters")
      public List<SeedStarter> populateSeedStarters() {
        return this.seedStarterService.findAll();
    }


    @RequestMapping({"/seedstartermng"})
    public String showSeedstarters(final SeedStarter seedStarter,Model model) {
        seedStarter.setDatePlanted(Calendar.getInstance().getTime());
        model.addAttribute("list", Arrays.asList("a", "b", "c"));
        return "seedstartermng";
    }

    @RequestMapping(value="/seedstartermng", params={"save"})
      public String saveSeedstarter(
            final SeedStarter seedStarter, final BindingResult bindingResult, final ModelMap
            model) {
        if (bindingResult.hasErrors()) {
            return "seedstartermng";
        }
        this.seedStarterService.add(seedStarter);
        model.clear();
        return "redirect:/seedstartermng";
    }

    @RequestMapping({"/"})
    public String showSeedstarter() {
        return "seedstartermng";
    }
}
