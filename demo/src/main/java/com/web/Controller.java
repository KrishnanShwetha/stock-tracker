package com.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domain.Item;
import com.service.ItemService;

//Hosted on http://localhost:8080
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class Controller {

//Fetch all items from a random list
// List is of type item object
// Item object is a random object which has 3 attributes of bool, int and string value
//Just to make sure front-end and back-end talk to each other
	
// http Request --> controller --> Service --> Repository 
//	  Front-end <-- controller <-- Service <--

@Autowired
private ItemService itemService;
	
@GetMapping("/api/items")
public ResponseEntity<?> fetchAllItems (){
	 List<Item> items = itemService.fetchAllItems();
	 return ResponseEntity.ok(items);
}

}
