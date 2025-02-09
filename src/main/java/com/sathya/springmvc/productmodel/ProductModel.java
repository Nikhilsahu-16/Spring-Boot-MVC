package com.sathya.springmvc.productmodel;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductModel {
	@NotBlank(message = "Product name cannot be null.")
	private String name;
	@NotBlank(message = "Product brand name cannot be null.")
	private String brand;
	@NotBlank(message = "Product made in field cannot be null.")
	private String madeIn;
	@Positive(message = "Price must be greater than 0.")
	private double price;
	@Min(value = 1, message = "Quantity must be atleast 1.")
	private int quantity;
	@DecimalMax(value = "100.0",message = "Discount rate cannot exceed 100.")
	double discountRate;
	@DecimalMax(value = "100.0",message = "Tax rate cannot exceed 100.")
	double taxRate;

}
