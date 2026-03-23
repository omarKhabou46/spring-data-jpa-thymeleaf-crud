package enset.spring_data_jpa_thymeleaf_crud.controller;

import enset.spring_data_jpa_thymeleaf_crud.entity.Product;
import enset.spring_data_jpa_thymeleaf_crud.service.IProductService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {
    private IProductService productService;

    @GetMapping
    public String fetchAllProducts(@RequestParam(required = false) String name,@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "5") int size, Model model) {
        Page<Product> productPage = null;
        if (name == null) {
            productPage = productService.getAllProducts(page, size);
        }else {
            productPage = productService.getAllProductsByName(name ,page, size);
        }
        model.addAttribute("productPage", productPage);
        return "index";
    }

    @GetMapping("/delete")
    public String deleteProduct(long id) {
        productService.deleteProduct(id);
        return "redirect:/";
    }

    @GetMapping("/addPage")
    public String redirectToAddProuctP(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);
        return "addPage";
    }

    @PostMapping("/addProduct")
    public String addProduct(@Valid Product product, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) return "addPage";
        productService.addProduct(product);
        return "redirect:/";
    }

    @GetMapping("/update")
    public String updateProduct(long id, Model model) {
        Product product = productService.getProductById(id);
        model.addAttribute("product", product);
        return "addPage";
    }

    @Autowired
    public void setProductService(IProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/notAuthorized")
    public String getNotAuthorizedPage() {
        return "notAuthorized";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request) {
        request.getSession().invalidate();
        return "login";
    }

}
