package SprEdureka.SprEdu;
/**
 * 
 * Spring bean
 * 
 * @author Yogesh
 *
 */
public class HelloWorld {
	private String last;

	public void setName(String last) {
		this.last = last;
	}
	public String getName() {
		return last;
	}

	public void printHello() {
		System.out.println("- " + last);
	}
}