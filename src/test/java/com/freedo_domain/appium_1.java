package com.freedo_domain;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.page_object.booking_page;
import com.page_object.launch_login;
import com.utility.base_class;
import com.utility.library;
@Listeners(com.utility.listner.class)
public class appium_1 extends base_class{
	public launch_login login;
	public booking_page book;

//========================================================================================
	@Test(enabled=false)
	public void TC_001_verify_install_apk() throws Exception {
		log.info("***************TC_001_verify_install_apk starts*****************");
		login=PageFactory.initElements(driver1, launch_login.class);	
		
		appium_1.OPEN_AND_INSTALL_APP();
		library.passmsg("Freedo app is ", " Install");
	}
//========================================================================================	
	@Test
	public void TC_002_verify_select_pickup_location_date_and_packages() throws Exception {
		log.info("***************TC_002_verify_select_pickup_location_date_and_packages starts*****************");
		login=PageFactory.initElements(driver1, launch_login.class);
		
		library.visible_link(login.getFirst_page_Select_pickUP_location(), "Select pickup location date and packages");
		library.visible_link(login.getFirst_page_three_radio_Button(), "Three radio button");
		library.visible_link(login.getClick_Next_button1(), "Next_button static 1st page");
		library.visible_link(login.getClick_Skip_button1(), "Skip_button static 1st page");
		
	}
//=========================================================================================
	@Test 
	public void TC_003_verify(){
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
