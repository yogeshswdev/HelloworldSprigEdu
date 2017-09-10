package SprEdureka.SprEdu;
/**
 * 
 * Spring bean
 * 
 * @author Yogesh
 *
 */
public class HelloWorld2 {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}


	public void printHello() {
		System.out.println("Hello ! " + name);
	}
}