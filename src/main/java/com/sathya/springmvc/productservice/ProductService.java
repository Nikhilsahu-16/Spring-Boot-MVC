package com.sathya.springmvc.productservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.springmvc.productentity.ProductEntity;
import com.sathya.springmvc.productmodel.ProductModel;
import com.sathya.springmvc.productrepository.ProductRepository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Service
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductService {
	@Autowired
	ProductRepository productrepository;
	
    public void saveProduct(ProductModel productModel) {
    	double discountRate=20;
    	double taxRate=18;
    	
    	double stockValue;
    	stockValue = productModel.getPrice()*productModel.getQuantity();
    	
    	double discountPrice;
    	discountPrice = productModel.getPrice()*discountRate/100;
    	
    	double taxPrice; 
    	taxPrice=productModel.getPrice()*taxRate/100;
    	
    	double offerPrice;
    	offerPrice = productModel.getPrice()-discountPrice;
    	
    	double finalPrice;
    	finalPrice = offerPrice+taxPrice;
    	
    	
    	ProductEntity productEntity = new ProductEntity();
    	productEntity.setName(productModel.getName());
    	productEntity.setBrand(productModel.getBrand());
    	productEntity.setMadeIn(productModel.getMadeIn());
    	productEntity.setPrice(productModel.getPrice());
    	productEntity.setQuantity(productModel.getQuantity());
		productEntity.setStockValue(stockValue);
    	productEntity.setFinalPrice(finalPrice);
    	productEntity.setOfferPrice(offerPrice);
    	productEntity.setTaxPrice(taxPrice);
    	productEntity.setDiscountPrice(discountPrice);
    	
    	productrepository.save(productEntity);
    	
    	
    	}
    public List<ProductEntity> getAllProducts(){
		List<ProductEntity> products = productrepository.findAll(); 
		return products;
    }
	public ProductEntity searchById(Long id) {
		Optional<ProductEntity> optionalProduct = productrepository.findById(id);
		if(optionalProduct.isPresent()) {
			ProductEntity product = optionalProduct.get();
			return product;
		}else {
			return null;
		}
		
		
	}
	public void deleteProductById(Long id) {
		// TODO Auto-generated method stub
		productrepository.deleteById(id);
		
	}
	public ProductModel editById(Long id) {
		// TODO Auto-generated method stub
		Optional<ProductEntity> optionalProduct = productrepository.findById(id);
		ProductModel productmodel = new ProductModel();
		if(optionalProduct.isPresent()) {
			ProductEntity entity = optionalProduct.get();
		productmodel.setName(entity.getName());
		productmodel.setBrand(entity.getBrand());
		productmodel.setMadeIn(entity.getMadeIn());
		productmodel.setPrice(entity.getPrice());
		productmodel.setQuantity(entity.getQuantity());
		return productmodel;
		}else {
			return null;
		}
	}
	public void editById(Long id,ProductModel productModel) {
		// TODO Auto-generated method stub
		Optional<ProductEntity> optionalProduct = productrepository.findById(id);
		if(optionalProduct.isPresent()) {
			double discountRate=20;
	    	double taxRate=18;
	    	
	    	double stockValue;
	    	stockValue = productModel.getPrice()*productModel.getQuantity();
	    	
	    	double discountPrice;
	    	discountPrice = productModel.getPrice()*discountRate/100;
	    	
	    	double taxPrice; 
	    	taxPrice=productModel.getPrice()*taxRate/100;
	    	
	    	double offerPrice;
	    	offerPrice = productModel.getPrice()-discountPrice;
	    	
	    	double finalPrice;
	    	finalPrice = offerPrice+taxPrice;
	    	ProductEntity entity = optionalProduct.get();
		entity.setName(productModel.getName());
		entity.setBrand(productModel.getBrand());
		entity.setMadeIn(productModel.getMadeIn());
		entity.setPrice(productModel.getPrice());
		entity.setQuantity(productModel.getQuantity());
		entity.setStockValue(stockValue);
    	entity.setFinalPrice(finalPrice);
    	entity.setOfferPrice(offerPrice);
    	entity.setTaxPrice(taxPrice);
    	entity.setDiscountPrice(discountPrice);
    	productrepository.save(entity);
		}
	}
	
	
}
