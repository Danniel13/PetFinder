package co.project.petfinder.Controller;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import co.project.petfinder.Controller.dto.RegisterDto;
import co.project.petfinder.model.entity.Pqrs;
import co.project.petfinder.model.entity.Reporter;
import co.project.petfinder.service.ReporterService;
import co.project.petfinder.service.PqrsService;
import co.project.petfinder.service.RegisterService;
import lombok.AllArgsConstructor;



@AllArgsConstructor
//@RequestMapping("/index")
@Controller
public class PetFindercontroller {
    
  private RegisterService registerService;
    @Autowired
    @Qualifier("reporterservice")
    private ReporterService reporterService;
    private PqrsService pqrsService;

    @GetMapping("/")
    public String findAll(@RequestParam Map<String, Object> params, Model model) {
        int page = params.get("page") != null ? (Integer.valueOf(params.get("page").toString()) -1) : 0;

        PageRequest pageRequest = PageRequest.of(page, 8);

        Page<Reporter> pageReporter = reporterService.getAll(pageRequest);

        int totalPage = pageReporter.getTotalPages();

        if (totalPage > 0) {
            List <Integer> pages = IntStream.rangeClosed(1, totalPage).boxed().collect(Collectors.toList());
            model.addAttribute("pages", pages);
        }

        model.addAttribute("list", pageReporter.getContent());
        model.addAttribute("reporters", new Reporter());
        model.addAttribute("pqrs", new Pqrs());
        
        return "index";
    }
    // @RequestMapping(value="/")
    // public ModelAndView listOfReporters( @RequestParam(required = false) Integer page) {
    //     ModelAndView modelAndView = new ModelAndView("index");

    //     List<Reporter> users = reporterService.getReportes();
    //     PagedListHolder<Reporter> pagedListHolder = new PagedListHolder<>(users);
    //     pagedListHolder.setPageSize(5);
    //     modelAndView.addObject("maxPages", pagedListHolder.getPageCount());
    //     modelAndView.addObject("reporters", new Reporter());

    //     if(page==null || page < 1 || page > pagedListHolder.getPageCount())page=1;

    //     modelAndView.addObject("page", page);
    //     if(page == null || page < 1 || page > pagedListHolder.getPageCount()){
    //         pagedListHolder.setPage(0);
    //         modelAndView.addObject("report", pagedListHolder.getPageList());
    //     }
    //     else if(page <= pagedListHolder.getPageCount()) {
    //         pagedListHolder.setPage(page-1);
    //         modelAndView.addObject("report", pagedListHolder.getPageList());
    //     }

    //     return modelAndView;
    // }
    
    @GetMapping(value = "/reporter") 
        public String reporter(@ModelAttribute("reporters") Reporter reporter) { // Model es la forma como se va a enviar desde backend al html
            return "reporter";
    }
    @PostMapping("/reporter") 
    public String reporterAction(@ModelAttribute("reporters") Reporter reporter, RedirectAttributes flash) { // Model es la forma como se va a enviar desde backend al html
        reporterService.addReporter(reporter);
        flash.addFlashAttribute("message", "Tu mascota ah sido reportada!");
        return "redirect:/reporter";
    }


    @GetMapping("/signin")
        public String signin(Model model) { // Model es la forma como se va a enviar desde backend al html
        return "signin";
    }

    @GetMapping("/pqrs")
        public String pqrs(@ModelAttribute("pqrs") Pqrs pqrs) { // Model es la forma como se va a enviar desde backend al html
        return "pqrs";
    }
    @PostMapping("/pqrs") 
    public String pqrsAction(@ModelAttribute("pqrs") Pqrs pqrs, RedirectAttributes flash) { // Model es la forma como se va a enviar desde backend al html
        pqrsService.addPqrs(pqrs);
        flash.addFlashAttribute("message", "PQR enviado. Gracias por tu tiempo!");
        
        return "redirect:/pqrs";
    }

    @GetMapping("/about_us")
        public String aboutus(Model model) { // Model es la forma como se va a enviar desde backend al html
        return "about_us";
    } 
    


    @GetMapping("/register")
    public String register(Model model) {
        // model.addAttribute("page", "contact");
        return "register";
    }


  @GetMapping("/registerok")
  public String getRegister(@ModelAttribute RegisterDto registerinfo, Model model) {
       
      
      // registerService.save(registerinfo);
      
      try {

        registerService.save(registerinfo);
      
        // ...no hay errores aquí
      
        model.addAttribute("mensaje", "Registro exitoso, inicie sesión para ingresar su reporte.");

        return "/register";
      
      } catch (ConstraintViolationException | DataIntegrityViolationException ex) {
      
        
        model.addAttribute("mensaje2", "El usuario ya existe con este correo");
        



        return "/register";
        
      }

    
     
    


  }


}
