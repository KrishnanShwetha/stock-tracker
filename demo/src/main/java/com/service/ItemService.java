package com.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.domain.Item;
import com.repository.ItemRepository;

@Service
public class ItemService {
	
@Autowired
private ItemRepository itemRepo;

	
public List<Item> fetchAllItems(){
	return itemRepo.fetchAllItems();
	
}


}