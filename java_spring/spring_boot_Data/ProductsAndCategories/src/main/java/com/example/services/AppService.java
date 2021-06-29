//package com.example.services;
//
//import java.util.List;
//import java.util.Locale.Category;
//
//import org.springframework.stereotype.Service;
//
//import com.example.models.Association;
//import com.example.models.Product;
//import com.example.repo.AssociationRepoistory;
//import com.example.repo.categoryRepo;
//import com.example.repo.productRpo;
//
//@Service
//public class AppService {
//	private final productRpo pRepo;
//	private final categoryRepo cRepo;
//	private final AssociationRepoistory aRepo;
//	
//	
//	public AppService(productRpo pRepo, categoryRepo cRepo,AssociationRepoistory aRepo) {
//		super();
//		this.pRepo = pRepo;
//		this.cRepo = cRepo;
//		this.aRepo=aRepo;
//	}
//	public List<Product> findProducts() {
//		return this.pRepo.findAll();
//	}
//	public Product getProduct(Long id) {
//		return this.pRepo.findById(id).orElse(null);
//	}
//	public List<Category> findCategories() {
//		return this.cRepo.findAll();
//	}
//	public Product createProduct(Product product) {
//		return this.pRepo.save(product);
//	}
//	public Association createAssociation(Association ass) {
//		return this.aRepo.save(ass);
//	}
////	public List<Category> findCategoriesNotInProduct(Product product) {
////		return cRepo.findByProductsNotContains(product);
////	}
//	public List<Product> findProductsNotInCategory(Category category) {
//		return pRepo.findByCategoriesNotContains(category);
//	}
//}