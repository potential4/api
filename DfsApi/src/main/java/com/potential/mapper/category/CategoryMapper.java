package com.potential.mapper.category;

import java.util.List;

import com.potential.model.Category;

public interface CategoryMapper {
	List<Category> getCategorys();
	List<Category> getSubCategorys(String categoryNo);
}
