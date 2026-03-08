package enset.spring_data_jpa_thymeleaf_crud.controller;

import enset.spring_data_jpa_thymeleaf_crud.entity.Product;
import enset.spring_data_jpa_thymeleaf_crud.service.IProductService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {
    private IProductService productService;

    @GetMapping
    public String fetchAllProducts(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "5") int size, Model model) {
        Page<Product> productPage = productService.getAllProducts(page, size);
        model.addAttribute("productPage", productPage);
        return "index";
    }

    @Autowired
    public void setProductService(IProductService productService) {
        this.productService = productService;
    }

}
