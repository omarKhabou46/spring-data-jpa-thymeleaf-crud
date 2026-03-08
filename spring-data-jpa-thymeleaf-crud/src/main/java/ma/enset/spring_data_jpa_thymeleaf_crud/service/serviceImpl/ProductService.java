package enset.spring_data_jpa_thymeleaf_crud.service.serviceImpl;

import enset.spring_data_jpa_thymeleaf_crud.entity.Product;
import enset.spring_data_jpa_thymeleaf_crud.service.IProductService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService {
    @Override
    public Product addProduct(Product product) {
        return null;
    }

    @Override
    public Product updateProduct(Product product) {
        return null;
    }

    @Override
    public Product getProductById(long id) {
        return null;
    }

    @Override
    public void deleteProduct(long id) {

    }

    @Override
    public Page<Product> getAllProducts(int page, int size) {
        return null;
    }
}
