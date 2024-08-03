package org.spring.boot.projectspringphoneshop.service.impl;

import org.spring.boot.projectspringphoneshop.repository.BrandRepository;
import org.spring.boot.projectspringphoneshop.service.BrandService;
import org.spring.boot.projectspringphoneshop.entity.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BrandServiceImpl implements BrandService {

    @Autowired

    private BrandRepository brandRepository;

    @Override
    public Brand create(Brand brand) {

        return brandRepository.save(brand);
    }
}
