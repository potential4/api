package com.potential.dao.category;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.potential.mapper.category.CategoryMapper;
import com.potential.model.Category;

@Service
public class CategoryDAOImpl implements CategoryDAO{
	
	@Autowired
    private SqlSession sqlSession;
	
	
	public List<Category> getCategory() {
		CategoryMapper categoryMapper = sqlSession.getMapper(CategoryMapper.class);
		return categoryMapper.getCategorys();
	}

	public List<Category> getSubCategory(String categoryNo) {
		CategoryMapper categoryMapper = sqlSession.getMapper(CategoryMapper.class);
		return categoryMapper.getSubCategorys(categoryNo);
	}
}
