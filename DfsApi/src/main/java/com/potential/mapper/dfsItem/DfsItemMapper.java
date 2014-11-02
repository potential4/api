package com.potential.mapper.dfsItem;

import java.util.ArrayList;
import java.util.Map;

import com.potential.model.DfsItem;

public interface DfsItemMapper {
	ArrayList<DfsItem> getDfsItems();
	ArrayList<DfsItem> getDfsItemsByCategory(Map params);
}
