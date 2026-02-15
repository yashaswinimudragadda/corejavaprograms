package ims;

public abstract class Product {
	private int id;
    private String name;
    private double price;
    private int stock;

public Product(int id,String name, double price, int stock) {
this.id=id;
this.name=name;
this.price=price;
this.stock=stock;
}

// getters:

public int getId() {return id;
}
public String getname() {
	return name;
}
public double getPrice() {
	return price;
}
public int getStock() {
	return stock;
}
public void setStock(int stock) {
	if(stock >= 0) {
		this.stock=stock;
	}
	else {
		System.out.println("error: stock cannot be negative");
	}
}

	
	
public abstract double calculateTotalBill(int buyQuantity);

// common method for all the products 
public void displayBaseDetails() {
    System.out.print("ID: " + id + " | Name: " + name + " | Price: " + price + " | Stock: " + stock);
}
}
	
