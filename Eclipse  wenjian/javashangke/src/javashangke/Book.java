package javashangke;

public class Book {
	private String name;
	private String author;
	private double price;
	private int amount;
	public Book() {
	}
	public Book(String name, String author, double price, int amount) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public void totalPrice() {
		System.out.println("Í¼Êé×Ü¼Û="+(getPrice()*getAmount()));
	}

}
