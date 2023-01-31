package ca.sheridancollege.gollej.controllers;

import ca.sheridancollege.gollej.beans.Employee;
import ca.sheridancollege.gollej.beans.Store;
import ca.sheridancollege.gollej.repositories.EmployeeRepository;
import ca.sheridancollege.gollej.repositories.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StoreController {

    @Autowired
    private StoreRepository storeRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("stores", storeRepository.findAll());
        model.addAttribute("employees", employeeRepository.findAll());
        return "index";
    }

    // navigate to the add employee page
    @GetMapping("/add")
    public String navigateAdd(Model model) {
        model.addAttribute("stores", storeRepository.findAll());
        return "addEmployee.html";
    }

    // process the form action
    @GetMapping("/processEmployee")
    public String processAdd(@RequestParam String name, @RequestParam Long storeid) {
        Store s = storeRepository.findById(storeid).get();
        Employee e = new Employee();
        e.setName(name);
        e.setStore(s);
        employeeRepository.save(e);
        return "redirect:/";

    }

}
