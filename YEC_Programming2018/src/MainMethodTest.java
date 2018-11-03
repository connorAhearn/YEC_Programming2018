import java.io.IOException;

public class MainMethodTest {

	public static void main(String[] args) throws IOException {
		
		test_HTMLPrinter();		
	}

	public static void test_HTMLPrinter() throws IOException {
		Store store = new Store("Cool store", "Very Cool");

		store.itemList.add(new Item("30", "Good stuff", "https://multimedia.bbycastatic.ca/multimedia/products/500x500/104/10416/10416668.jpg", "Its really that good"));

		store.itemList.add(new Item("30", "Good stuff", "https://multimedia.bbycastatic.ca/multimedia/products/500x500/104/10416/10416668.jpg", "Its really that good"));

		store.itemList.add(new Item("30", "Good stuff", "https://multimedia.bbycastatic.ca/multimedia/products/500x500/104/10416/10416668.jpg", "Its really that good"));

		store.itemList.add(new Item("30", "Good stuff", "https://multimedia.bbycastatic.ca/multimedia/products/500x500/104/10416/10416668.jpg", "Its really that good"));
		

		store.linkList.add(new Link("https://google.com", "Google"));
		store.linkList.add(new Link("https://google.com", "Google"));
		store.linkList.add(new Link("https://google.com", "Google"));

		HTMLPrinter printer = new HTMLPrinter(store);

		printer.print();
	}
}
