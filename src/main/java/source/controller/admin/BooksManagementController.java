package source.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class BooksManagementController {
    @Autowired
    @GetMapping("/admin/booksmanagement/list")
    public String listBooks(){
        return "booksManagement";
    }

    @GetMapping("/admin/booksmanagement/insert")
    public String insertBooks(){
        return "insertBooks";
    }

    @GetMapping("/admin/materialmanagement/list")
    public String materialmanagement(){
        return "materialManagement";

    }
}
