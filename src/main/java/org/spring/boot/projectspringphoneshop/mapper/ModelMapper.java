package org.spring.boot.projectspringphoneshop.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.spring.boot.projectspringphoneshop.dto.ModelDTO;
import org.spring.boot.projectspringphoneshop.entity.Model;
import org.spring.boot.projectspringphoneshop.service.BrandService;

@Mapper(componentModel = "spring", uses = {BrandService.class})
public interface ModelMapper {

    //Mappers.
    ModelMapper INSTANCE = Mappers.getMapper(ModelMapper.class);

    @Mapping(target = "brand", source = "brandId")
    Model toModel(ModelDTO dto);

    @Mapping(target = "brandId", source = "brand.id")
    ModelDTO toModelDTO(Model model);

    /*default Brand toBrand(Integer brId){
        Brand brand = new Brand();
        brand.setId(brId);
        return bran
    }*/

}
