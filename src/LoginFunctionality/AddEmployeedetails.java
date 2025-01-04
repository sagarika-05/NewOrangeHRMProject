package LoginFunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddEmployeedetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir");
		System.getProperty("webdriver.chrome.driver","D:\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("sagarika");
		driver.findElement(By.id("txtPassword")).sendKeys("sagarika123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		driver.findElement(By.id("firstName")).sendKeys("abc");
		driver.findElement(By.id("lastName")).sendKeys("XYZ");
		driver.findElement(By.id("employeeId")).sendKeys("0011");
		driver.findElement(By.id("btnSave")).click();
		//driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		//System.out.println("print this step");
		//driver.findElement(By.id("Edit")).click();
		//driver.findElement(By.id("personal_txtEmpFirstName")).sendKeys("bunny");
		//driver.findElement(By.id("btnSave")).click();
	}

}
