package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ProductDao;
import com.model.Product;

@Service
public class ProductService {
	
	@Autowired
	private ProductDao dao;
	
	public Product addProduct(Product product) {
		return dao.save(product);
	}
	
	public List<Product> getProducts(){
		return (List<Product>)dao.findAll();
	}
	
	public List<Product> getById(List<Long> plist){
		return (List<Product>)dao.findAllById(plist);
	}
	
	public boolean deleteProduct(long id) {
		Optional<Product> data = dao.findById(id);
		if(data.isPresent()) {
			dao.deleteById(id);
			return true;
		}
		return false;
	}
	
	public boolean updateProducts(Product product, long id){
		dao.updateProduct(product.getProductName(), product.getQuantity(), product.getAmount(),id);
		return true;
	}
}
