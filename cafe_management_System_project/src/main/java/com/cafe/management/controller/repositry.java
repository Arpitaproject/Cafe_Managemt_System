package com.cafe.management.controller;
import java.awt.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;

public class repositry {
	public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
	}

}
