package Freedo_domain;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.page_object.booking_page;
import com.page_object.launch_login;
import com.utility.base_class;
@Listeners(com.utility.listner.class)
public class TEST extends base_class {
	public launch_login login;
	public booking_page book;
	public static ExtentTest test;
//	public SoftAssert ass= new SoftAssert(); 
	
//	@Test
//	public void t1() throws Exception {
		
		
		@Test(priority=0)
		public void TC_0052_verify_install_apk() throws Exception {
		//	login=PageFactory.initElements(driver1, launch_login.class);
		//	book = PageFactory.initElements(driver1, booking_page.class);
			login = new launch_login(driver1);
			book = new booking_page(driver1);
			
			log.info("***************TC_0052_admin_Request_reject starts*****************");
			
			Thread.sleep(20000);
			log.info(" chrome launch");
			
			driver1.findElement(By.xpath("//android.widget.Button[@text='Accept & continue']")).click();
			driver1.findElement(By.xpath("//android.widget.Button[@text='No thanks']")).click();
			
//			driver1.findElement(By.xpath("//android.widget.Button[@text='Accept & continue']")).click();
//			driver1.findElement(By.xpath("//android.widget.Button[@text='Accept & continue']")).click();
//			driver1.findElement(By.xpath("//android.widget.Button[@text='Accept & continue']")).click();
//			driver1.findElement(By.xpath("//android.widget.Button[@text='Accept & continue']")).click();
//			driver1.findElement(By.xpath("//android.widget.Button[@text='Accept & continue']")).click();
//			driver1.findElement(By.xpath("//android.widget.Button[@text='Accept & continue']")).click();
//			driver1.findElement(By.xpath("//android.widget.Button[@text='Accept & continue']")).click();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
}
