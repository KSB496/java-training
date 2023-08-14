package com.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Template;
import org.springframework.boot.autoconfigure.mustache.MustacheResourceTemplateLoader;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.SpringTemplateLoader;

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
	
	public List<Product> getByCategory() {
		List<Product> plist = new ArrayList<Product>();
		for (Product p : dao.findAll()) {
			if (p.getCategory().equalsIgnoreCase("clothes")) {
				plist.add(p);
			}
		}
		return plist;
	}
	
//
//	public List<Product> getByCategory() {
//		Template t = TemplateLoader.load("/products/clothes.html");
//		Map<String, Product> map = new HashMap<String, Product>();
//		List<Product> plist = new ArrayList<Product>();
//		map.put("clothes", plist);
//		return t.render(map);
//	}
	 
	public boolean deleteProduct(long id) {
		Optional<Product> data = dao.findById(id);
		if(data.isPresent()) {
			dao.deleteById(id);
			return true;
		}
		return false;
	}
	
	public boolean updateProducts(Product product, long id){
		dao.updateProduct(product.getProductName(), product.getQuantity(), product.getAmount(),product.getCategory(),id);
		return true;
	}
}
