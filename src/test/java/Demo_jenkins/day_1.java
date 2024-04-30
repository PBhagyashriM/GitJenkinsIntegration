package Demo_jenkins;

import org.testng.annotations.Test;

public class day_1 {

	@Test
	public void hi() {
		System.out.println("hello jenkins");
		
		
	}

	@Test(groups= {"sanity","smoke"})
	  public void testcase1() {
		  System.out.println("i am in tc sanity ,smoke");
	  }

	@Test(groups= {"sanity","regression"})
	  public void testcase4() throws InterruptedException {
		  System.out.println("i am in tc sanity,regression");
		  Thread.sleep(3000);
	  }
	@Test(groups= {"sanity"})
	  public void testcase5() throws InterruptedException {
		  System.out.println("i am in tc sanity");
		  Thread.sleep(3000);
	  }
	@Test(groups= {"sanity","alpha"})
	  public void testcase6() throws InterruptedException {
		  System.out.println("i am in tc sanity,&alpha");
		  Thread.sleep(3000);
	  }
}
