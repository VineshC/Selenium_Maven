/**
 * 
 */
package com.rabit.tests.salesforce;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.rabit.util.SuperTestNG;

/**
 * @author sampath.c
 *
 */
public class ObjectCreation extends SuperTestNG {

	@Test()
	public void testObjectCreation() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='username_container']/input")).clear();
	    driver.findElement(By.xpath("//div[@id='username_container']/input")).sendKeys("test@hugeprofile.com");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//form[@id='login_form']/input")).clear();
	    driver.findElement(By.xpath("//form[@id='login_form']/input")).sendKeys("Rabit@345");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//form[@id='login_form']/input[2]")).click();
	    Thread.sleep(6000);
	    driver.findElement(By.xpath("//a[@id='DevTools_icon']/img")).click();
	    Thread.sleep(8000);
		driver.get("https://ap17.salesforce.com/p/setup/custent/CustomObjectsPage?retURL=%2Fui%2Fsetup%2FSetup%3Fsetupid%3DDevTools&setupid=CustomObjects");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//td[@id='bodyCell']/div[3]/div/div/div/table/tbody/tr/td[2]/input")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[@id='ep']/div[2]/div[3]/table/tbody/tr[2]/td[2]/div/input")).clear();
		driver.findElement(By.xpath("//div[@id='ep']/div[2]/div[3]/table/tbody/tr[2]/td[2]/div/input")).sendKeys("Test54");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[@id='ep']/div[2]/div[3]/table/tbody/tr[3]/td[2]/div/input")).clear();
		driver.findElement(By.xpath("//div[@id='ep']/div[2]/div[3]/table/tbody/tr[3]/td[2]/div/input")).sendKeys("Test54s");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//td[@id='topButtonRow']/input")).click();
		Thread.sleep(2000);
	}
	
}
