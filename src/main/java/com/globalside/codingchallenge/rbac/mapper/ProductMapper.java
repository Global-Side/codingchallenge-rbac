package com.globalside.codingchallenge.rbac.mapper;


import com.globalside.codingchallenge.rbac.db.model.ProductDbo;
import com.globalside.codingchallenge.rbac.model.ProductDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductDto toProductDto(ProductDbo productDbo);

    ProductDbo toProductDbo(ProductDto productDto);
}
