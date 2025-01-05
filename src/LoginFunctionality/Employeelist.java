package LoginFunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Employeelist {

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
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("utnoor");
		driver.findElement(By.id("empsearch_id")).sendKeys("0016");
		
		driver.findElement(By.id("searchBtn")).click();
		driver.findElement(By.id("btnDelete")).click();
		System.out.println("button delete");
		//driver.findElement(By.id("btnAdd")).click();
		//driver.findElement(By.id("firstName")).sendKeys("ABC");
		//driver.findElement(By.id("lastName")).sendKeys("XYZ");
		//driver.findElement(By.id("employeeId")).sendKeys("0020");
		//driver.findElement(By.id("btnSave")).click();
		}
}
	
