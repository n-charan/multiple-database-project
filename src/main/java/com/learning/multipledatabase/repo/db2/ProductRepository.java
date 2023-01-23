package com.learning.multipledatabase.repo.db2;

import com.learning.multipledatabase.entity.db2.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("productRepository")
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
