
public class Item {

	public String price;
	public String name;
	public String ImageURL;
	public String Description;

	public Item() {
		price = "";
		name = "";	
		ImageURL = "";
		Description = "";
	}

	public Item(String price, String name, String ImageURL, String Description) {
		this.price = price;
		this.name = name;	
		this.ImageURL = ImageURL;
		this.Description = Description;
	}
}
