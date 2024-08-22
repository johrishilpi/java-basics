package assignments;
import java.util.NoSuchElementException;
public class Throw_throws {

	public static void main(String[] args) throws InterruptedException,NoSuchElementException {
	System.out.println("Hello");
	Thread.sleep(1000);
	throw new NoSuchElementException("throwing exception program");
	
	}

}
