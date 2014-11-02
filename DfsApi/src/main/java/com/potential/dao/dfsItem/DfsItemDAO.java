package com.potential.dao.dfsItem;

import java.util.ArrayList;

import com.potential.model.DfsItem;

public interface DfsItemDAO {
	ArrayList<DfsItem> getItems();
	ArrayList<DfsItem> getDfsItemsByCategory(String category , String name , String offset , String limit );
}
