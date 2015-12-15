package com.intel.dadi.thymeleaf.demo.stsm.web.conversion;

import com.intel.dadi.thymeleaf.demo.stsm.model.Variety;
import com.intel.dadi.thymeleaf.demo.stsm.web.server.VarietyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

/**
 * Created by Ecic Chen on 2015/12/10.
 */
public class VarietyFormatter implements Formatter<Variety> {

    @Autowired
    private VarietyService varietyService;
    public VarietyFormatter() {
        super();
    }

    public Variety parse(final String text, final Locale locale) throws ParseException {
        final Integer varietyId = Integer.valueOf(text);
        return this.varietyService.findById(varietyId);
    }

    public String print(final Variety object, final Locale locale) {
        return (object != null ? object.getId().toString() : "");
    }
}
