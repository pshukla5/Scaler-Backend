package com.dev.scalerbackend.ThirdPartyClients.ProductService.FakeStore.Services;

import com.dev.scalerbackend.Dtos.GenericProductRequestDto;
import com.dev.scalerbackend.Dtos.GenericProductResponseDto;
import com.dev.scalerbackend.Services.ProductService;
import com.dev.scalerbackend.ThirdPartyClients.ProductService.FakeStore.Dtos.FakeStoreProductResponseDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class FakeStoreProductService implements ProductService {

    final private RestTemplateBuilder restTemplateBuilder;
    final private String productRequestBaseUrl;
    final private String specificProductRequestUrl;

    private GenericProductResponseDto convertFakeStoreResponseDtoToGenericResponseDto(
            FakeStoreProductResponseDto fakeStoreProductResponseDto){

        GenericProductResponseDto genericProductResponseDto = new GenericProductResponseDto();

        genericProductResponseDto.setId(fakeStoreProductResponseDto.getId());
        genericProductResponseDto.setCategory(fakeStoreProductResponseDto.getCategory());
        genericProductResponseDto.setDescription(fakeStoreProductResponseDto.getDescription());
        genericProductResponseDto.setImage(fakeStoreProductResponseDto.getImage());
        genericProductResponseDto.setPrice(fakeStoreProductResponseDto.getPrice());
        genericProductResponseDto.setTitle(fakeStoreProductResponseDto.getTitle());


        return genericProductResponseDto;
    }

    public FakeStoreProductService(RestTemplateBuilder restTemplateBuilder,
                                   @Value("${fakestore.api.url}") String fakeStoreApiUrl,
                                   @Value("${fakestore.api.paths.product}") String fakeStoreApiProductPath
    ) {

        this.restTemplateBuilder = restTemplateBuilder;
        this.productRequestBaseUrl = fakeStoreApiUrl + fakeStoreApiProductPath;
        this.specificProductRequestUrl = fakeStoreApiUrl + fakeStoreApiProductPath + "/{id}";
    }

    @Override
    public List<GenericProductResponseDto> getAllProducts() {
        RestTemplate restTemplate = restTemplateBuilder.build();

        ResponseEntity<FakeStoreProductResponseDto[]> resonse = restTemplate.getForEntity(
                productRequestBaseUrl,
                FakeStoreProductResponseDto[].class);

        List<FakeStoreProductResponseDto> fakeStoreProductResponseDtos =
                Arrays.stream(resonse.getBody()).toList();

        List<GenericProductResponseDto> genericProductResponseDtos = new ArrayList<>();

        fakeStoreProductResponseDtos.forEach(fakeStoreProductResponseDto ->
                genericProductResponseDtos.add(
                        convertFakeStoreResponseDtoToGenericResponseDto(
                                fakeStoreProductResponseDto)));
        return genericProductResponseDtos;
    }

    @Override
    public GenericProductResponseDto getProductById(Long id) {

        RestTemplate restTemplate = restTemplateBuilder.build();

        ResponseEntity<FakeStoreProductResponseDto> response =
                restTemplate.getForEntity(specificProductRequestUrl,
                        FakeStoreProductResponseDto.class, id);

        if(response.getBody() == null) return null;

        return convertFakeStoreResponseDtoToGenericResponseDto(
                response.getBody());
    }

    @Override
    public List<String> getAllCategories() {

        RestTemplate restTemplate = restTemplateBuilder.build();


        ResponseEntity<String[]> response = restTemplate.getForEntity(
                productRequestBaseUrl + "/categories",
                String[].class
        );

        if(response.getBody() == null) return null;

        return Arrays.asList(response.getBody());
    }

    @Override
    public List<GenericProductResponseDto> getInCategory(String category) {

        RestTemplate restTemplate = restTemplateBuilder.build();

        ResponseEntity<FakeStoreProductResponseDto[]> response = restTemplate.getForEntity(
                productRequestBaseUrl + "/category/{category}",
                FakeStoreProductResponseDto[].class,
                category
        );

        if(response.getBody() == null) return null;

        List<FakeStoreProductResponseDto> fakeStoreProductResponseDtos =
                Arrays.asList(response.getBody());

        List<GenericProductResponseDto> genericProductResponseDtos = new ArrayList<>();

        fakeStoreProductResponseDtos.forEach(fakeStoreProductResponseDto ->
                genericProductResponseDtos.add(
                        convertFakeStoreResponseDtoToGenericResponseDto(
                                fakeStoreProductResponseDto)
                ));
        return genericProductResponseDtos;
    }

    @Override
    public GenericProductResponseDto addProduct(GenericProductRequestDto genericProductRequestDto) {
        return null;
    }

    @Override
    public GenericProductResponseDto updateProuct(Long id, GenericProductRequestDto genericProductRequestDto) {
        return null;
    }

    @Override
    public GenericProductResponseDto deleteProduct(Long id) {
        return null;
    }
}
