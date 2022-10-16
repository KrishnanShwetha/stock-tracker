package com.coderscampus.todoapp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.todoapp.domain.TodoItem;
import com.coderscampus.todoapp.service.TodoService;


// hosted on http://localhost:8080/api/todoItems
// Fetch all to do items from database
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class TodoController {
	
	@Autowired
	private TodoService todoService;;
	 
	@GetMapping("/api/todoItems")
	public ResponseEntity<?> fetchAllTodoItems (){
		List<TodoItem> todoItems = todoService.fetchAllTodoItems();
		//return ResponseEntity.status(HttpStatus.OK).body(todoItems);
		// Same thing as above
		return ResponseEntity.ok(todoItems);
	}
}
