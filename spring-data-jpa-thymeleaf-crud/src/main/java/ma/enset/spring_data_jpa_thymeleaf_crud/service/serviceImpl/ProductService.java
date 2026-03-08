package enset.spring_data_jpa_thymeleaf_crud.service.serviceImpl;

import enset.spring_data_jpa_thymeleaf_crud.entity.Product;
import enset.spring_data_jpa_thymeleaf_crud.repository.ProductRepository;
import enset.spring_data_jpa_thymeleaf_crud.service.IProductService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@NoArgsConstructor
@Service
public class ProductService implements IProductService {

    private ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product getProductById(long id) {
        Product product = productRepository.findById(id).get();
        return product;
    }

    @Override
    public void deleteProduct(long id) {
       Product product = productRepository.findById(id).get();
       if (product == null) {
           System.out.println("product not found");
       }else {
           productRepository.deleteById(id);
       }
    }

    @Override
    public Page<Product> getAllProducts(int page, int size) {
        Page<Product> products = productRepository.findAll(PageRequest.of(page, size));
        return products;
    }

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
}
