package SampleMaven.MavenTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SampleTest {

	@BeforeClass
	public void setup() {
		System.out.println("This is the start of the class..!!");
	}

	@AfterClass
	public void close() {
		System.out.println("This is the end of the class..!!");
	}

	@Test
	public void testRun() {
		System.out.println("Running the tests..!!");
		System.out.println("Running the tests..!!");
		System.out.println("Running the tests..!!");
		System.out.println("Running the tests..!!");

	}

}
