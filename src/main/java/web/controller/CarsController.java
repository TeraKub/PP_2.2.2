package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
@RequestMapping(value = "/cars")
public class CarsController {

    @Autowired
    private CarService carService;

    @GetMapping()
    public String printCars(@RequestParam(value = "count", defaultValue = "0") int count, Model model) {
        model.addAttribute("cars", carService.getCars(count));
        return "cars";
    }



//    @GetMapping("/{count}")
//    public String printCars(@PathVariable("count") int count, Model model) {
//        model.addAttribute("cars", carDao.getCars(count));
//        return "cars";
//    }

//    @GetMapping
//    public String printCars(Model model) {
//        model.addAttribute("cars", carDao.getCars());
//        return "cars";
//    }
}
