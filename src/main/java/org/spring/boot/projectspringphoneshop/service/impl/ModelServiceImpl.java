package org.spring.boot.projectspringphoneshop.service.impl;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.spring.boot.projectspringphoneshop.dto.ModelDTO;
import org.spring.boot.projectspringphoneshop.entity.Model;
import org.spring.boot.projectspringphoneshop.mapper.ModelMapper;
import org.spring.boot.projectspringphoneshop.repository.ModelRepository;
import org.spring.boot.projectspringphoneshop.service.BrandService;
import org.spring.boot.projectspringphoneshop.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@RequiredArgsConstructor
@Service
public class ModelServiceImpl implements ModelService {

    private final ModelRepository modelRepository;
    private final ModelMapper modelMapper;
    @Override
    public Model save(Model model) {
        return modelRepository.save(model);
    }
}
