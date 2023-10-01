package com.dev.scalerbackend.Services;

import com.dev.scalerbackend.Dtos.CategoryResponseDto;
import com.dev.scalerbackend.Dtos.ProductRequestDto;
import com.dev.scalerbackend.Dtos.ProductResponseDto;
import com.dev.scalerbackend.Models.Category;
import com.dev.scalerbackend.Models.Product;
import com.dev.scalerbackend.Repositories.CategoryRepo;
import com.dev.scalerbackend.Repositories.ProductRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class SelfProductService implements ProductService{

    ProductRepo productRepo;
    CategoryRepo categoryRepo;



    private Product productRequestDtoToProduct(ProductRequestDto productRequestDto){
        Product product = new Product();

        product.setImage(productRequestDto.getImage());
        product.setTitle(productRequestDto.getTitle());
        product.setPrice(productRequestDto.getPrice());
        product.setDescription(productRequestDto.getDescription());

        String category_name = productRequestDto.getCategory_name();

        Category category = categoryRepo.findByNameEqualsIgnoreCase(category_name);
        if(category == null) {
            Category new_category = new Category();
            new_category.setName(category_name);
            category = categoryRepo.save(new_category);
        }

        product.setCategory(category);

        return product;
    }

    private ProductResponseDto productToProductResponseDto(Product product){
        ProductResponseDto productResponseDto = new ProductResponseDto();

        productResponseDto.setId(product.getId());
        productResponseDto.setTitle(product.getTitle());
        productResponseDto.setPrice(product.getPrice());
        productResponseDto.setDescription(product.getDescription());
        productResponseDto.setImage(product.getImage());

        productResponseDto.setCategoryResponseDto(new CategoryResponseDto(product
                .getCategory().getId(), product.getCategory().getName()));

        return productResponseDto;
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    @Override
    public Product getProductById(String uuid) {
        return null;
    }

    @Override
    public ProductResponseDto addProduct(ProductRequestDto productRequestDto) {

        Product product = productRequestDtoToProduct(productRequestDto);
        productRepo.save(product);

        return productToProductResponseDto(product);
    }

    @Override
    public Product updateProduct(Product product) {

        return null;
    }

    @Override
    public String deleteProductById(String uuid) {
        productRepo.deleteById(UUID.fromString(uuid));
        return "Product with id " + uuid + " deleted";
    }
}
