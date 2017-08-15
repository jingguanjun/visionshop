package com.vito16.shop.repository;

import java.util.List;

import com.vito16.shop.model.Product;
import com.vito16.shop.model.Shop;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * @author Vito
 * @email zhouwentao16@gmail.com
 * @date 2013-7-9
 */
@Repository
public interface ShopRepository extends JpaRepository<Product, Integer> {

    public Shop findById(Integer shopId);
}
