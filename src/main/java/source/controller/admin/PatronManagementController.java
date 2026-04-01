package source.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import source.entity.Patron;
import source.entity.PatronTypes;
import source.entity.User;
import source.service.PatronManagementService;
import source.service.PatronTypeService;
import source.service.UserService;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.sql.Date;
import java.util.List;


@Controller
public class PatronManagementController {

    long millis = System.currentTimeMillis();
    java.sql.Date date = new java.sql.Date(millis);

    @Autowired
    private PatronManagementService patronManagerService;

    @Autowired
    private UserService userService;

    @Autowired
    private PatronTypeService patronTypeService;


    @GetMapping("/admin/patronmanagement/list")
    public String indexPatron(Model model, HttpServletRequest request
            , RedirectAttributes redirect) {
        request.getSession().setAttribute("patronmanagementlist", null);
        return "redirect:/admin/patronmanagement/list/pageindex=1";
    }

    @GetMapping("/admin/patronmanagement/list/pageindex={pageNumber}")
    public String showPatronPage(HttpServletRequest request,
                                 @PathVariable int pageNumber, Model model) {
        PagedListHolder<?> pages = (PagedListHolder<?>) request.getSession().getAttribute("patronmanagementlist");
        int pagesize = 4;
        List<Patron> patrons = patronManagerService.findAllByActiveFag(0);
        System.out.println("total patron " + patrons.size());
        int total = patrons.size();
        if (pages == null) {
            pages = new PagedListHolder<>(patrons);
            pages.setPageSize(pagesize);
        } else {
            final int goToPage = pageNumber - 1;
            if (goToPage <= pages.getPageCount() && goToPage >= 0) {
                pages.setPage(goToPage);
            }
        }

        request.getSession().setAttribute("patronmanagementlist", pages);
        int current = pages.getPage() + 1;
        int begin = Math.max(1, current - patrons.size());
        int end = Math.min(begin + 5, pages.getPageCount());
        int totalPageCount = pages.getPageCount();
        String baseUrl = "/admin/patronmanagement/list/pageindex=";

        model.addAttribute("beginIndex", begin);
        model.addAttribute("endIndex", end);
        model.addAttribute("currentIndex", current);
        model.addAttribute("totalPageCount", totalPageCount);
        model.addAttribute("baseUrl", baseUrl);
        model.addAttribute("patrons", pages);
        model.addAttribute("total", total);

        return "patronManagement";
    }

    @GetMapping("/admin/patronmanagement/insert")
    public String insertPatron(Model model) {
        int min = 100000000;
        int max = 999999999;
        int random_int = (int) (Math.random() * (max - min + 1) + min);
        List<PatronTypes> patronTypes = patronTypeService.findAllByActiveFag(0);
        model.addAttribute("patronTypes", patronTypes);
        model.addAttribute("randomCode", "LM20210" + String.valueOf(random_int));
        return "insertPatron";
    }

    @GetMapping("/admin/patronmanagement/update")
    public String updatePatron(@RequestParam("id") long id, Model model) {
        model.addAttribute("patron", patronManagerService.findById(id));
        List<PatronTypes> patronType = patronTypeService.findAllByActiveFag(0);
        model.addAttribute("patronType", patronType);
        return "updatePatron";
    }

    @PostMapping("/patron/updatestatus")
    @ResponseBody
    public Patron patron(@RequestBody Patron patron1) {
        System.out.println(patron1.toString());
        Patron patron = patronManagerService.findById(patron1.getId());
        if (patron1.getStatus() == 0) {
            patron.setStatus(1);
        } else {
            patron.setStatus(0);
        }
        patronManagerService.save(patron);
        return patron;
    }

    @PostMapping("/patron/delete")
    @ResponseBody
    public Patron delete(@RequestBody Patron patron2) {
        System.out.println(patron2.toString());
        Patron patron = patronManagerService.findById(patron2.getId());
        patron.setActiveFag(2);
        patronManagerService.save(patron);
        return patron;
    }


    @GetMapping("/admin/blockedtracking/list")
    public String blockedtracking() {
        return "blockedTrackingManagement";
    }

    @GetMapping("/admin/renewcardlog/list")
    public String renewcardlog() {
        return "renewCardlogManagement";
    }

    @GetMapping("/admin/patrontypemanagement/list")
    public String patrontypemanagement() {
        return "patronTypeManagement";
    }

    @PostMapping("/patron/insert")
    public String insert(@ModelAttribute("patron") Patron patron,
                         @RequestParam("file") MultipartFile file,
                         @RequestParam("Code") String Code,
                         @RequestParam("Status") int Status,
                         @RequestParam("FullName") String FullName,
                         @RequestParam("Birthdate") Date Birthdate,
                         @RequestParam("Phone") String Phone,
                         @RequestParam("Email") String Email,
                         @RequestParam("Sex") int Sex,
                         @RequestParam("PatronType") int PatronType,
                         @RequestParam("Address") String Address,
                         @RequestParam("CreationDate") Date CreationDate,
                         @RequestParam("ExpirationDate") Date ExpirationDate) throws IOException {
        User user = new User();
//        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
//        if (fileName.contains("..")) {
//            System.out.println("not file image");
//        }
//        user.setImage(Base64.getEncoder().encodeToString(file.getBytes()));
//        System.out.println(user.getImage());
        user.setFullName(FullName);
        user.setBirthdate(Birthdate);
        user.setPhone(Phone);
        user.setEmail(Email);
        user.setSex(Sex);
        user.setAddress(Address);
        user.setPassword("lms123456");
        user.setActive(false);
        user.setActiveFag(0);
        user.setUserName(user.getEmail());
        user.setRole(0);
        user.setCreateDate(date);
        user.setUpdateDate(date);
        userService.save(user);

//        patron.setUserId(userService.findByEmail(user.getEmail()));
        patron.setTypeId(patronTypeService.findById(PatronType));
        patron.setCode(Code);
        patron.setStatus(Status);
        patron.setActiveFag(0);
        patron.setCreationDate(CreationDate);
        patron.setExpirationDate(ExpirationDate);
        patron.setUpdationDate(patron.getCreationDate());
        patron.setCreateDate(date);
        patron.setUpdateDate(date);
        patronManagerService.save(patron);
        return "redirect:/admin/patronmanagement/list";
    }

    @PostMapping("/patron/update")
    public String update(Patron patron,
                         @RequestParam("FullName") String FullName,
                         @RequestParam("Birthdate") Date Birthdate,
                         @RequestParam("Phone") String Phone,
                         @RequestParam("Email") String Email,
                         @RequestParam("Sex") int Sex,
                         @RequestParam("Status") int Status,
                         @RequestParam("PatronType") int PatronType,
                         @RequestParam("Address") String Address,
                         @RequestParam("CreationDate") Date CreationDate,
                         @RequestParam("ExpirationDate") Date ExpirationDate,
                         @RequestParam("patronId") int patronId,
                         @RequestParam("userId") int userId) {
        User user = userService.findById(userId);
        patron = patronManagerService.findById(patronId);
        user.setFullName(FullName);
        user.setBirthdate(Birthdate);
        user.setPhone(Phone);
        user.setEmail(Email);
        user.setSex(Sex);
        user.setAddress(Address);
        user.setUserName(user.getEmail());
        user.setUpdateDate(date);
        userService.update(user);

//        patron.setUserId(userService.findByEmail(user.getEmail()));
        patron.setTypeId(patronTypeService.findById(PatronType));
        patron.setStatus(Status);
        patron.setCreationDate(CreationDate);
        patron.setExpirationDate(ExpirationDate);
        patron.setUpdateDate(date);
        patronManagerService.update(patron);
        return "redirect:/admin/patronmanagement/list";
    }

    @PostMapping("/patron/renew")
    public String renew(Patron patron,
                        @RequestParam("ExpirationDate") Date ExpirationDate,
                        @RequestParam("patronId") long patronId) {
        patron = patronManagerService.findById(patronId);
        patron.setExpirationDate(ExpirationDate);
        patron.setUpdateDate(date);
        patronManagerService.update(patron);
        return "patronManagement";
    }
}
