package com.cafe.management.controller;

import java.awt.MenuItem;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cafe.management.controller.service.MenuService;
import com.sun.tools.javac.util.List;

public class restcontroller {

	@RestController
	@RequestMapping("/api/menu")
	@CrossOrigin(origins = "http://localhost:4200")
	public class MenuController {
	    private final MenuService service;

	    public MenuController(MenuService service) {
	        this.service = service;
	    }

	    @GetMapping
	    public List<MenuItem> getMenu() {
	        return service.getAllItems();
	    }

	    @PostMapping
	    public MenuItem addItem(@RequestBody MenuItem item) {
	        return service.addItem(item);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteItem(@PathVariable Long id) {
	        service.deleteItem(id);
	    }
	}


}
