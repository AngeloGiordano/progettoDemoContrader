package com.example.demo.Controller;

import com.example.demo.Model.User;
import com.example.demo.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@ControllerAdvice
@RequestMapping("/login")
public class LoginController {

    private LoginService loginService;

    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @RequestMapping(value="/page")
    public String loginPage()
    {
        return "loginPage";
    }

    @RequestMapping(value = "/menu", method = RequestMethod.POST)
    public String menu (@RequestParam("username") String username, @RequestParam("password") String password, Model model)
    {
        User user = loginService.login(username, password);

        if (user == null)
        {
            model.addAttribute("msg","Credenziali non valide");
            return "loginPage";
        }

        model.addAttribute("Nome", user.getNomeUser());
        model.addAttribute("Cognome", user.getCognomeUser());

        if(user.getRuolo().equalsIgnoreCase("admin"))
            return "menuAdmin";
        else
            return "menuUser";
    }

    @RequestMapping(value="/regControl", method=RequestMethod.POST)
    public String control (@ModelAttribute User User, Model model, RedirectAttributes redirectAttrs)
    {
        String username = User.getUsername();
        String password = User.getPassword();
        User user = loginService.login(username, password);
        //model.addAttribute("user",user);
        if (user != null)
        {
            model.addAttribute("msg","Username già in uso...");
            return "insertUser";
        }
        else
        {
            model.addAttribute("user",User);
            redirectAttrs.addFlashAttribute("user",User);
            return  "redirect:/users/newUser";

        }

    }




}
