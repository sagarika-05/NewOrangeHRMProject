package LoginFunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginwithWUWOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir");
		System.getProperty("webdriver.chrome.driver","D:\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("sagarika");
		driver.findElement(By.id("txtPassword")).sendKeys("");
		driver.findElement(By.id("btnLogin")).click();
		String actualmessage=driver.findElement(By.id("spanMessage")).getText();
		String expectedmessage="password cannot empty";
		if(actualmessage.equals(expectedmessage))
		{
			System.out.println("test pass");
		}
		else
		{
			System.out.println("test fail");
		}
	}

}
