package com.potential.dao.category;

import java.util.List;

import com.potential.model.Category;


public interface CategoryDAO {
	List<Category> getCategory();
	List<Category> getSubCategory(String categoryNo);
}
