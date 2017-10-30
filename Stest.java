import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stest
{
	private WebDriver driver;
	@Before
	public void setUp() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/Dmitry Ognev/Desktop/Java/Selenium/Selenium_files/Drivers/16_1/chromedriver.exe");
		driver = new ChromeDriver();	
	}

	@After
	public void tearDown() throws Exception
	{
		
	}

	
	@Test
	public void test()
	{
		driver.get("https://google.com");
	
	}
}
