package Que_p16;

public class Item {
	String name;
	String catagory;
	String dom;
	String doe;
	float price;
	public Item(String name, String catagory, String dom, String doe, float price) {
		super();
		this.name = name;
		this.catagory = catagory;
		this.dom = dom;
		this.doe = doe;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCatagory() {
		return catagory;
	}
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	public String getDom() {
		return dom;
	}
	public void setDom(String dom) {
		this.dom = dom;
	}
	public String getDoe() {
		return doe;
	}
	public void setDoe(String doe) {
		this.doe = doe;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	

}
