# 📱Contacts

Team Members:

1.Arpita Avadhut Kulkarni 

Mail:- arpitakulkarnii2212@gmail.com

2.Akanksha Laxman More

Mail:-akankshalm810@gmail.com

3.Afrin Farukh Shaikh

Mail:-shaikhafrin1607@gmail.com 


# 👨‍🏫👩‍🏫 cafe Management System – java Console Project

A Cafe Management System is a software application designed to help cafe owners and staff efficiently manage day-to-day operations such as menu management, order processing, inventory tracking, billing, and customer service.

##Project Structure

cafe-management-backend/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── cafe/
│   │   │           └── management/
│   │   │               ├── controller/
│   │   │               │   └── MenuController.java
│   │   │               ├── model/
│   │   │               │   └── MenuItem.java
│   │   │               ├── repository/
│   │   │               │   └── MenuItemRepository.java
│   │   │               ├── service/
│   │   │               │   └── MenuService.java
│   │   │               └── CafeManagementApplication.java
│   │   └── resources/
│   │       ├── application.properties
│   │       └── data.sql (optional sample data)
│   └── test/
│       └── java/ (unit & integration tests)
├── pom.xml


# ✨ Features

✅ Add, edit, and delete menu items

✅ Categorize items (e.g., Beverages, Snacks, Bakery)

✅ View all items in a clean tabular format

✅ Real-time updates on the UI


# 💻 Technologies Used
##🛠️ Backend (Server-side)
| Technology          | Description                                         |
| ------------------- | --------------------------------------------------- |
| Java                | Main programming language for backend logic         |
| Spring Boot         | Backend framework to build REST APIs                |
|   Spring Web        | For handling HTTP requests and building controllers |
| Spring Data JPA     | Simplifies database access and ORM operations       |
|   Hibernate         | ORM implementation for mapping Java objects to DB   |


##🖥️ Frontend (Client-side)
| Technology                 | Description                                      |
| -------------------------- | ------------------------------------------------ |
| Angular                    | Framework for building the user interface (v16+) |
| TypeScript                 | Language used for developing Angular apps        |
| HTML5                      | Markup language for UI structure                 |
| CSS3 / SCSS                | Styling and layout for responsive design         |
| Bootstrap (optional)       | UI components and grid system                    |
| Angular HTTPClient         | For calling RESTful APIs                         |

# 📦 Dependencies

<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    <dependency>
        <groupId>com.mysql</groupId>
        <artifactId>mysql-connector-j</artifactId>
        <scope>runtime</scope>
    </dependency>
    <dependency>
        <groupId>com.h2database</groupId>
        <artifactId>h2</artifactId>
        <scope>runtime</scope>
    </dependency>
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <optional>true</optional>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-devtools</artifactId>
        <scope>runtime</scope>
        <optional>true</optional>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>org.postgresql</groupId>
        <artifactId>postgresql</artifactId>
        <scope>runtime</scope>
    </dependency>
</dependencies>

## 🗃️ Database Tables

CREATE TABLE menu_item (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    price DECIMAL(10, 2) NOT NULL,
    category VARCHAR(50) NOT NULL
);


CREATE TABLE orders (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    order_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    total_amount DECIMAL(10, 2) NOT NULL
);


CREATE TABLE order_item (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    order_id BIGINT,
    menu_item_id BIGINT,
    quantity INT NOT NULL,

    FOREIGN KEY (order_id) REFERENCES orders(id) ON DELETE CASCADE,
    FOREIGN KEY (menu_item_id) REFERENCES menu_item(id)
);


CREATE TABLE users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL,
    role VARCHAR(20) DEFAULT 'USER'
);


INSERT INTO menu_item (name, price, category) VALUES
('Espresso', 2.50, 'Beverage'),
('Cappuccino', 3.50, 'Beverage'),
('Bagel', 2.00, 'Food'),
('Muffin', 2.75, 'Food');


## 📸 Final Output

<img width="991" height="93" alt="backend" src="https://github.com/user-attachments/assets/7425b001-c203-4011-ae85-d2f7420f1e5e" />



<img width="1347" height="624" alt="cafe" src="https://github.com/user-attachments/assets/5e873218-c902-4517-a8cd-010fa7be0a94" />



