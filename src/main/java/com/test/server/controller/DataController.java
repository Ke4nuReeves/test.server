package com.test.server.controller;

import com.test.server.data.CountryList;
import com.test.server.data.entity.Country;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Dmitriy Titov on 17.06.2017.
 */
@RequestMapping("/data_controller")
@RestController
public class DataController {

    @RequestMapping(value = "/get_countries", method = RequestMethod.GET)
    @ResponseBody
    public List<Country> getCountries() {
        return new CountryList().getCountries();
    }
}
