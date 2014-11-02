package com.potential.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.potential.dao.category.CategoryDAO;
import com.potential.dao.dfsItem.DfsItemDAO;
import com.potential.model.Category;
import com.potential.model.DfsItem;


@Controller
public class ApiController {
	
	@Autowired CategoryDAO categoryDAO;
	@Autowired DfsItemDAO dfsItemDAO;
	
	@RequestMapping("/category")
	@ResponseBody
	public List<Category> getCategory(){
		
		return categoryDAO.getCategory();
	}
	
	@RequestMapping("/category/{categoryNo}/sub")
	@ResponseBody
	public List<Category> getSubCategory(@PathVariable("categoryNo") String categoryNo){
		
		return categoryDAO.getSubCategory(categoryNo);
	}
	
	@RequestMapping("/category/{categoryNo}/item")
	@ResponseBody
	public List<DfsItem> getCategoryItem(@PathVariable("categoryNo") String categoryNo , @RequestParam(value="name", required = false ) String name, @RequestParam("offset") String offset , @RequestParam("limit") String limit){
		return dfsItemDAO.getDfsItemsByCategory(categoryNo, name , offset, limit);
	}
	
}
