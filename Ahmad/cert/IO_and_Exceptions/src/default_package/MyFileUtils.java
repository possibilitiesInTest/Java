package default_package;

public class MyFileUtils {
	
	public int subtract10FromLargerNumber(int number) throws Exception {
		if(number < 10) {
			throw new fooRuntimeErr("Foo runtime exception...");
		}
		return number -10;
	}
	
	public class fooRuntimeErr extends Exception {
		public fooRuntimeErr(String message) {
			super(message);
		}
	}
}
