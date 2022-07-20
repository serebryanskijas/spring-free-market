package com.example.springfreemarket.city;

import com.example.springfreemarket.state.StateService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;

@Controller
public class CityController {

    private final CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping(value="/cities")
    public ModelAndView showStates(){ //Model, ModelMap, ModelAndView
        var cities = cityService.findAll();
        var params = new HashMap<String, Object>();
        params.put("cities", cities);
        return new ModelAndView("showCities", params);
    }

    @GetMapping(value="/cities", params = "states")
    public ModelAndView showCitiesStates(){ //Model, ModelMap, ModelAndView
        var cities = cityService.findCitiesStates();
        var params = new HashMap<String, Object>();
        params.put("cities", cities);
        return new ModelAndView("showCities2", params);
    }

    @GetMapping(value="/cities", params = "name")
    public ModelAndView search(@RequestParam(name = "name") String name) { //Model, ModelMap, ModelAndView
        var cities = cityService.search(name);
        var params = new HashMap<String, Object>();
        params.put("cities", cities);
        return new ModelAndView("showCities", params);
    }

}
