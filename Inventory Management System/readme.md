# 🛒 Inventory Management System (IMS)

A robust, console-based Java application designed to manage store inventory using **Object-Oriented Programming (OOP)** principles.

## 📝 Project Overview
This system allows a store manager to manage different types of products (Electronics and Clothing), track stock levels, and process sales with automatic tax calculation.

## 🚀 Key Features
- **Add Products:** Add category-specific items (Electronics with warranty, Clothing with size).
- **Stock Management:** Automatically decreases stock upon a successful sale.
- **Dynamic Billing:** Calculates total price including category-specific GST (18% for Electronics, 5% for Clothing).
- **Validation:** Prevents sales if stock is insufficient and ensures stock levels never go negative.
## 📺 Project Demo

See the Inventory Management System in action:

<video src="https://github.com/user-attachments/assets/dd296844-eda6-43d0-adb5-0e17ae7c9147" controls="controls" style="max-width: 100%;">
  Your browser does not support the video tag.
</video>

## 🏗️ Technical Architecture (OOP Pillars)
This project was built to demonstrate core Java OOP concepts:

1. **Abstraction:** Used an `abstract class Product` to define a template for all items.
2. **Encapsulation:** All data fields are `private`. Access is controlled via `getters` and `setters` with built-in logic validation.
3. **Inheritance:** `Electronics` and `Clothing` classes extend `Product` to reuse common attributes.
4. **Polymorphism:** - **Method Overriding:** Both child classes override `calculateTotalBill()` to apply different tax rates.
   - **Polymorphic Collections:** Using a `List<Product>` to store and manage different object types seamlessly.

## 📂 File Structure
```text
src/ims/
│
├── Product.java          # Abstract Base Class
├── Electronics.java      # Subclass for Electronic items
├── Clothing.java         # Subclass for Apparel items
├── Inventory.java        # Business Logic & Collection management
├── Menu.java             # User Interface (Console-based)
└── Main.java             # Program Entry Point
