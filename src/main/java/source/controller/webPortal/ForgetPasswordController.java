package source.controller.webPortal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ForgetPasswordController {
    @Autowired
    @GetMapping("/account/forgetpassword")
    public String forgetPassword(){
        return "forgetPassword";
    }
}
