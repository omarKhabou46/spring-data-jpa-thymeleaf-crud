package enset.spring_data_jpa_thymeleaf_crud;

import enset.spring_data_jpa_thymeleaf_crud.entity.Product;
import enset.spring_data_jpa_thymeleaf_crud.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataJpaThymeleafCrudApplication implements CommandLineRunner {

	private IProductService productService;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaThymeleafCrudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Product product1 = Product.builder()
				.name("Laptop")
				.price(2999.99)
				.quantity(10)
				.build();
		productService.addProduct(product1);
		Product product2 = Product.builder()
				.name("Smartphone")
				.price(3000)
				.quantity(17)
				.build();
		productService.addProduct(product2);
	}

	@Autowired
	public void setProductService(IProductService productService) {
		this.productService = productService;
	}
}
