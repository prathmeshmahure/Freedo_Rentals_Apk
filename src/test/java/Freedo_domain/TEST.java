package Freedo_domain;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.page_object.booking_page;
import com.page_object.champion;
import com.page_object.launch_login;
import com.utility.base_class;
import com.utility.library;

import io.appium.java_client.android.AndroidDriver;
@Listeners(com.utility.listner.class)
public class TEST extends base_class {
	public launch_login login;
	public booking_page book;
	public champion champ;
	public static ExtentTest test;
//	public SoftAssert ass= new SoftAssert(); 
	
//	@Test
//	public void t1() throws Exception {
		
	@Test(priority=0)
	public void TC_002_verify_select_pickup_location_date_and_packages() {
		login = new launch_login(driver1);
		log.info("***************TC_001_verify_select_pickup_location_date_and_packages starts*****************");
		
		try {
		if(login.getFirst_page_Select_pickUP_location().isDisplayed()) {
		
		library.Custom_click(login.getClick_Next_button1(), "Next_button1 static 1st page");
		}	}catch(Exception e) {}
		android_home("Home");
	}
	
		@Test(priority=1)
		public void TC_0052_verify_install_apk() throws Exception {
			login = new launch_login(driver1);
			book = new booking_page(driver1);
			champ = new champion(driver1);
			log.info("***************TC_002_test_demo starts*****************");
				
			championapp_launch();
			library.custom_sendkeys(champ.getLogin_user_id(), config.getweb_credential(), "User id");
			library.custom_sendkeys(champ.getLogin_password(), config.getweb_credential(), "Password");
			android_home("Home");
				
			
		}
		@Test(priority=2)
		public void TC_0052_Freddo_apk() throws Exception {
			
			log.info("***************TC_003_freedo test_demo starts*****************");
				
			
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability("appium:automationName", "uiautomator2");
			cap.setCapability("platformName", "Android");
			cap.setCapability("appium:deviceName", "pixel_6");//Infinix //pixel_6
			cap.setCapability("appium:udid", "emulator-5554");// 0836731257071990 //emulator-5554 //0526532038000424
			cap.setCapability("appium:avd", "Pixel_6");// if u connect real device comment this line
			cap.setCapability("appium:avdLaunchTimeout", 600000);
			cap.setCapability("appPackage", "com.heerofreedo");               //Champion
			cap.setCapability("appActivity", "com.heerofreedo.MainActivity"); //Champion
			cap.setCapability("appium:noReset", "true");
			Thread.sleep(2000);
			
			driver1=new AndroidDriver(new URL(config.getIpAddress()),cap);
				
			
		}
}
