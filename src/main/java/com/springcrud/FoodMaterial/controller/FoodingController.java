package com.springcrud.FoodMaterial.controller;

import com.springcrud.FoodMaterial.domain.bahan_makanan;
import com.springcrud.FoodMaterial.service.FoodingService;
import com.springcrud.FoodMaterial.domain.bahan_minuman;
import com.springcrud.FoodMaterial.service.MinumanService;
import com.springcrud.FoodMaterial.domain.supplier;
import com.springcrud.FoodMaterial.service.SupplierService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author ghozy
 */

@Controller
public class FoodingController {
    @Autowired
    private FoodingService service;

    @Autowired
    private MinumanService service2;

    @Autowired
    private SupplierService service3;

    @GetMapping("/")
    public String viewHomePage(Model model) {
         return "home";
     }

    @GetMapping("/home")
    public String home(Model model) {
        return "home";
    }

    @GetMapping("/ubahdataadmin")
    public String dataadmin(Model model) {
        return "ubah-data-admin";
    }

    @GetMapping("/olahdata")
    public String olahdata(Model model) {
        return "olah-data";
    }

    @GetMapping("/datamakanan")
    public String datamakanan(Model model) {
        return "bahan-makanan";
    }

    @GetMapping("/dataminuman")
    public String dataminuman(Model model) {
        return "bahan-minuman";
    }

    @GetMapping("/datasupplier")
    public String datasupplier(Model model) {
        return "supplier";
    }



    @GetMapping("/bahanmakanan")
    public String index(Model model) {
        List<bahan_makanan> listfooding = service.listAll();
        model.addAttribute("listfooding", listfooding);
        System.out.print("Get / ");
        model.addAttribute("fooding", new bahan_makanan());
        return "bahan-makanan";
    }
 
     @GetMapping("/tambahmakanan")
     public String add(Model model) {
         model.addAttribute("fooding", new bahan_makanan());
         return "tambah-makanan";
     }
 
     @RequestMapping(value = "/simpanmakanan", method = RequestMethod.POST)
     public String saveFooding(@ModelAttribute("fooding") bahan_makanan mkn) {
         service.save(mkn);
         return "redirect:/bahanmakanan";
     }
 
     @RequestMapping("/editmakanan/{ID_Bahan_Makanan}")
     public ModelAndView showEditFoodingPage(@PathVariable(name = "ID_Bahan_Makanan") int ID_Bahan_Makanan) {
         ModelAndView mav = new ModelAndView("tambah-makanan");
         bahan_makanan mkn = service.get(ID_Bahan_Makanan);
         mav.addObject("fooding", mkn);
         return mav;
         
     }
     @RequestMapping("/hapusmakanan/{ID_Bahan_Makanan}")
     public String deletefooding(@PathVariable(name = "ID_Bahan_Makanan") int ID_Bahan_Makanan) {
         service.delete(ID_Bahan_Makanan);
         return "redirect:/bahanmakanan";
     }



    @GetMapping("/bahanminuman")
    public String index2(Model model) {
        List<bahan_minuman> listfooding = service2.listAll();
        model.addAttribute("listfooding", listfooding);
        System.out.print("Get / ");
        model.addAttribute("fooding", new bahan_minuman());
        return "bahan-minuman";
    }

    @GetMapping("/tambahminuman")
    public String add2(Model model) {
        model.addAttribute("fooding", new bahan_minuman());
        return "tambah-minuman";
    }

    @RequestMapping(value = "/simpanminuman", method = RequestMethod.POST)
    public String saveFooding(@ModelAttribute("fooding") bahan_minuman mnm) {
        service2.save(mnm);
        return "redirect:/bahanminuman";
    }

    @RequestMapping("/editminuman/{ID_Bahan_Minuman}")
    public ModelAndView showEditFoodingPage2(@PathVariable(name = "ID_Bahan_Minuman") int ID_Bahan_Minuman) {
        ModelAndView mav = new ModelAndView("tambah-minuman");
        bahan_minuman mnm = service2.get(ID_Bahan_Minuman);
        mav.addObject("fooding", mnm);
        return mav;

    }
    @RequestMapping("/hapusminuman/{ID_Bahan_Minuman}")
    public String deletefooding2(@PathVariable(name = "ID_Bahan_Minuman") int ID_Bahan_Minuman) {
        service2.delete(ID_Bahan_Minuman);
        return "redirect:/bahanminuman";
    }



    @GetMapping("/supplier")
    public String index3(Model model) {
        List<supplier> listfooding = service3.listAll();
        model.addAttribute("listfooding", listfooding);
        System.out.print("Get / ");
        model.addAttribute("fooding", new supplier());
        return "supplier";
    }

    @GetMapping("/tambahsupplier")
    public String add3(Model model) {
        model.addAttribute("fooding", new supplier());
        return "tambah-supplier";
    }

    @RequestMapping(value = "/simpansupplier", method = RequestMethod.POST)
    public String saveFooding(@ModelAttribute("fooding") supplier spl) {
        service3.save(spl);
        return "redirect:/supplier";
    }

    @RequestMapping("/editsupplier/{ID_Supplier}")
    public ModelAndView showEditFoodingPage3(@PathVariable(name = "ID_Supplier") int ID_Supplier) {
        ModelAndView mav = new ModelAndView("tambah-supplier");
        supplier spl = service3.get(ID_Supplier);
        mav.addObject("fooding", spl);
        return mav;

    }
    @RequestMapping("/hapussupplier/{ID_Supplier}")
    public String deletefooding3(@PathVariable(name = "ID_Supplier") int ID_Supplier) {
        service3.delete(ID_Supplier);
        return "redirect:/supplier";
    }
}
