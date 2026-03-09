package enset.spring_data_jpa_thymeleaf_crud.repository;

import enset.spring_data_jpa_thymeleaf_crud.entity.Product;
import jakarta.validation.constraints.Size;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    Page<Product> findAllByNameContainingIgnoreCase(String name, Pageable pageable);
}
