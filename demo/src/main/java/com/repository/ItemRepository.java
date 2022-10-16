package com.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.domain.Item;

@Repository 
public class ItemRepository {
private Integer id = 0; 
private List<Item> Items = new ArrayList<>();

public List<Item> fetchAllItems(){
	if (Items.size() == 0);
		Item item1 = new Item();
		item1.setInt_val(id++);
		item1.setBool_val(false);
		item1.setString_val("Test String 1");
		
		Items.add(item1);
	return Items;
}

}
