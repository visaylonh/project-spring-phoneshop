package org.spring.boot.projectspringphoneshop.service.impl;

import org.spring.boot.projectspringphoneshop.Exception.ApiException;
import org.spring.boot.projectspringphoneshop.Exception.ResourceNotFoundException;
import org.spring.boot.projectspringphoneshop.repository.BrandRepository;
import org.spring.boot.projectspringphoneshop.service.BrandService;
import org.spring.boot.projectspringphoneshop.entity.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.Optional;


@Service
public class BrandServiceImpl implements BrandService {

    @Autowired

    private BrandRepository brandRepository;

    @Override
    public Brand create(Brand brand) {

        return brandRepository.save(brand);
    }

    @Override
    public Brand getById(Integer id) {

        return brandRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Brand", id));
    }

    @Override
    public Brand update(Integer id, Brand brandUpdate) {

        Brand brand = getById(id);
        brand.setName(brandUpdate.getName()); // @TODO improve update
        return brandRepository.save(brand);
    }
}
