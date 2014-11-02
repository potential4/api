package com.potential.dao.dfsItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.potential.mapper.dfsItem.DfsItemMapper;
import com.potential.model.DfsItem;

@Service
public class DfsItemDAOImpl implements DfsItemDAO{
	
	@Autowired
    private SqlSession sqlSession;
	
	public ArrayList<DfsItem> getItems() {
		DfsItemMapper dfsItemMapper = sqlSession.getMapper(DfsItemMapper.class);
        return dfsItemMapper.getDfsItems();
	}

	public ArrayList<DfsItem> getDfsItemsByCategory(String category, String name ,String offset, String limit) {
		DfsItemMapper dfsItemMapper = sqlSession.getMapper(DfsItemMapper.class);
		
		Map params = new HashMap();
		params.put("categoryNo", category);
		
		if( name != null ){
			name = "%" + name + "%";
		}
		
		params.put("name", name);
		params.put("offset", offset);
		params.put("limit", limit);
		
		
		return dfsItemMapper.getDfsItemsByCategory(params);
	}
}
