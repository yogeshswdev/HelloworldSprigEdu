package SprEdureka.SprEdu;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import SprEdureka.SprEdu.HelloWorld;

/**
 * Hello world!
 *
 */
public class App 

{
	private HelloWorld helloWorld;
	private HelloWorld2 helloWorld2;
	public HelloWorld2 getHelloWorld2(){
		return helloWorld2;
	}
	public HelloWorld getHelloWorld(){
		return helloWorld;
	}
	App(HelloWorld helloWorld,HelloWorld2 helloWorld2){
		this.helloWorld = helloWorld;
		this.helloWorld2 = helloWorld2;
	}
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext(
    			"Spring-Module.xml");

       // HelloWorld2 obj2 = (HelloWorld2) context.getBean("helloBean2");
    	//obj2.printHello();
    	// HelloWorld obj = (HelloWorld) context.getBean("helloBean");
     	//obj.printHello();
    	// System.out.println( "Hello " + obj.getName()+obj2.getName());

    	 App obj = (App) context.getBean("app");
    	 HelloWorld helloWorld2= obj.getHelloWorld();
    	 helloWorld2.printHello();
    	 HelloWorld2 helloWorld3= obj.getHelloWorld2();
    	 helloWorld3.printHello();
     	//obj.printHello();
    }


	
}
