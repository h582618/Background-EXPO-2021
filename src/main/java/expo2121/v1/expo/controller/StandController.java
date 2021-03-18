package expo2121.v1.expo.controller;


import expo2121.v1.expo.models.Stand;
import expo2121.v1.expo.models.Vote;
import expo2121.v1.expo.service.StandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class StandController {

    private final StandService standservice;

    @Autowired
    public StandController(StandService standservice) {
        this.standservice = standservice;
    }

    @RequestMapping("vote/{id}")
    public ModelAndView vote(@PathVariable("id") int id, Vote vote){

        ModelAndView modelAndView = new ModelAndView("voting_page");

        modelAndView.addObject("vote",vote);
        var stand = standservice.getStandByID(id);


        return modelAndView;
    }



}
