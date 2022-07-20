package com.example.springfreemarket.state;

import com.example.springfreemarket.country.CountryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;

@Controller
public class StateController {

    private final StateService stateService;

    public StateController(StateService stateService) {
        this.stateService = stateService;
    }

    @GetMapping(value="/states")
    public ModelAndView showStates(){ //Model, ModelMap, ModelAndView
        var states = stateService.findAll();
        var params = new HashMap<String, Object>();
        params.put("states", states);
        return new ModelAndView("showStates", params);
    }

    @GetMapping(value="/states2")
    public ModelAndView showStates2(){ //Model, ModelMap, ModelAndView
        var states = stateService.findStatesCountries();
        var params = new HashMap<String, Object>();
        params.put("states", states);
        return new ModelAndView("showStates2", params);
    }
    @GetMapping(value="/states", params = "name")
    public ModelAndView search(@RequestParam(name = "name") String name) { //Model, ModelMap, ModelAndView
        var states = stateService.search(name);
        var params = new HashMap<String, Object>();
        params.put("states", states);
        return new ModelAndView("showStates", params);
    }
}
