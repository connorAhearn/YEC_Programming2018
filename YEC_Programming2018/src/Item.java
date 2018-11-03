
public class Item {

	public double price;
	public String name;
	public String ImageURL;
	public String Description;

	public Item() {
		price = 0;
		name = "";	
		ImageURL = "";
		Description = "";
	}

	public Item(double price, String name, String ImageURL, String Description) {
		this.price = price;
		this.name = name;	
		this.ImageURL = ImageURL;
		this.Description = Description;
	}
}
