package lambdasPractice;

public class App {

	public static void main(String[] args) {
		
		Human tom = new Human();
		// tom.walk();
		walker(tom);
		
		Robot wally = new Robot();
		//wally.walk();
		walker(wally);
		
//		// anonymous class definition
//		walker(new Walkable() {
//			
//			@Override
//			public void walk() {
//				System.out.println("Custom object walking ...");
//				// behavior not tied to any class
//			}
//		});
		
		// lambda expression
		// walker(() -> System.out.println("Custom object walking ...."));
		ALambdaInterface aBlockOfCode = () -> {
			System.out.println("Custom obejct walking ....");
		};
		
	}
	
//	public static void walker(Human human) {
//		human.walk();
//	}
	
	public static void walker(Walkable walkableEntity) {
	walkableEntity.walk();
	}
}
		
