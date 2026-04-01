package source.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PortalManagementController {
    @Autowired
    @GetMapping("/admin/newsmanagement/list")
    public String news(){
        return "newsManagement";
    }

    @GetMapping("/admin/categorymanagement/list")
    public String category(){
        return "categoryManagement";
    }

    @GetMapping("/admin/authormanagement/list")
    public String author(){
        return "authorManagement";
    }

    @GetMapping("/admin/newsmanagement/insert")
    public String insertNews() {
        return "insertNews";
    }
}
