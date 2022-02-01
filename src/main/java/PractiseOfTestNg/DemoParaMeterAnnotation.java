package PractiseOfTestNg;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




public class DemoParaMeterAnnotation {
  @Test
	@Parameters({"userName","pass"})
	public void getValueFormXml(String name,String password) {
		System.out.println(name);
		System.out.println(password);
		
	}

}
