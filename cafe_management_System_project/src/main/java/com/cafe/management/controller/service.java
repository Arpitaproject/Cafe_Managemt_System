package com.cafe.management.controller;
import java.awt.MenuItem;
import org.springframework.stereotype.Service;
import com.cafe.management.controller.repositry.MenuItemRepository;
import com.sun.tools.javac.util.List;

public class service {
	

	@Service
	public class MenuService {
	    private final MenuItemRepository repo;

	    public MenuService(MenuItemRepository repo) {
	        this.repo = repo;
	    }

	    public List<MenuItem> getAllItems() {
	        return repo.findAll();
	    }

	    public MenuItem addItem(MenuItem item) {
	        return repo.save(item);
	    }

	    public void deleteItem(Long id) {
	        repo.deleteById(id);
	    }
	}

}
