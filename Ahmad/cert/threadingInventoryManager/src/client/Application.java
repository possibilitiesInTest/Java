package client;

import inventory.InventoryManager;

public class Application {

	public static void main(String[] args) {

		InventoryManager manager = new InventoryManager();

		Thread inventoryTask = new Thread(new Runnable() {
			
			@Override
			public void run() {
				manager.populateSoldProducts();
			}
		});
		
		Thread displayTask = new Thread(new Runnable() {
			
			@Override
			public void run() {
				manager.populateSoldProducts();
			}
		});
		
		inventoryTask.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		inventoryTask.join();

		displayTask.start();
	}
}
