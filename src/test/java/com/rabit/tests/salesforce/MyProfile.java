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
public class MyProfile extends SuperTestNG {

	@Test()
	public void testMyProfile() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='username_container']/input")).clear();
	    driver.findElement(By.xpath("//div[@id='username_container']/input")).sendKeys("test@hugeprofile.com");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//form[@id='login_form']/input")).clear();
	    driver.findElement(By.xpath("//form[@id='login_form']/input")).sendKeys("Rabit@345");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//form[@id='login_form']/input[2]")).click();
	    Thread.sleep(6000);
	    driver.findElement(By.xpath("//div[@id='userNavButton']/span")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//a[@id='setupLink']")).click();
	}
	
}
