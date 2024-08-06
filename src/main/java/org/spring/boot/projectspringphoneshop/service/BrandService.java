package org.spring.boot.projectspringphoneshop.service;

import org.spring.boot.projectspringphoneshop.entity.Brand;

public interface BrandService {

    Brand create(Brand brand);
    Brand getById(Integer id);

    Brand update(Integer id, Brand brandUpdate);
}
