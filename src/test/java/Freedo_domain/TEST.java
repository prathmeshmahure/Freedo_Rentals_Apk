package Freedo_domain;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.page_object.booking_page;
import com.page_object.launch_login;
import com.utility.base_class;
import com.utility.library;
@Listeners(com.utility.listner.class)
public class TEST extends base_class {
	public launch_login login;
	public booking_page book;
	public static ExtentTest test;
	
	@Test
	public void t1() throws Exception {
		login=PageFactory.initElements(driver1, launch_login.class);
		book = PageFactory.initElements(driver1, booking_page.class);
		
		
		
		appium_0.Back_button();
		
		log.info("***************TC_0020_Search_city_name starts*****************");
		
		library.visible_link(login.getSearch_city(), "Please select your city");
		library.custom_sendkeys(login.getSearch_city(), config.getcity_name(), "Search city by city name");
		appium_0.EnterButton();
		library.visible_link(login.getSelect_City_Automation_City(), "Automation city");
		
		
		
		
		
		
		
		
		
		
		
	}
	


	
}
