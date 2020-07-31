package client;

public class Application {

	public static void main(String[] args) {

		InventoryManager manager = new InventoryManager();

		Thread inventoryTask = new Thread(new Runnable() {
			
			@Override
			public void run() {
				manager.populateSoldProducts();
			}
		});
	}
}
