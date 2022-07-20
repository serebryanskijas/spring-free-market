package com.example.springfreemarket.country;

import com.example.springfreemarket.state.StateService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.HashMap;

@Controller
public class CountryController {

    private final CountryService countryService;
    private final StateService stateService;

    public CountryController(CountryService countryService,StateService stateService) {
        this.countryService = countryService;
        this.stateService = stateService;
    }

    @GetMapping(value="/index")
    public String index(Model model){
        return "index";
    }


    @GetMapping(value="/countries")
    public ModelAndView showCountries(){ //Model, ModelMap, ModelAndView
        var countries = countryService.findAll();
        var params = new HashMap<String, Object>();
        params.put("countries", countries);
        return new ModelAndView("showCountries", params);
    }

    @GetMapping(value="/contries", params = "states")
    public String showCountriesStates(Model model){
        var countries = countryService.findAll();
        var states = stateService.findAll();
        var params = new HashMap<String, Object>();
        params.put("countries", countries);
        params.put("states", states);
        return "showAll";
    }

}
