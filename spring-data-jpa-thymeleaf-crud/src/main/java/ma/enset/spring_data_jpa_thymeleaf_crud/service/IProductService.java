package enset.spring_data_jpa_thymeleaf_crud.service;

import enset.spring_data_jpa_thymeleaf_crud.entity.Product;
import org.springframework.data.domain.Page;

public interface IProductService {
    Product addProduct(Product product);
    Product updateProduct(Product product);
    Product getProductById(long id);
    void deleteProduct(long id);
    Page<Product> getAllProducts(int page, int size);
}
