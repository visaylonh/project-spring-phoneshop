package org.spring.boot.projectspringphoneshop.repository;

import org.spring.boot.projectspringphoneshop.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer> {


}
