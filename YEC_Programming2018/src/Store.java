import java.util.ArrayList;

public class Store {

	
	public String storeName;
	public String slogan;
	public ArrayList<Item> itemList;
	public ArrayList<Link> linkList;
	//public int storeID;
	
	
	
	public Store() {
		storeName = "";
		slogan = "";
		itemList = new ArrayList<Item>();
		linkList = new ArrayList<Link>();
	}
	
	public Store(String storeName, ArrayList<Item> itemList, ArrayList<Link> linkList) {
		this.storeName = storeName;
		this.itemList = itemList;
		this.linkList = linkList;
		this.slogan = "";
	}
	
	public Store(String storeName, String slogan, ArrayList<Item> itemList, ArrayList<Link> linkList) {
		this(storeName,itemList,linkList);
		this.slogan = slogan;
	}

}//end class
