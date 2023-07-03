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
	
//	@Test
//	public void t1() throws Exception {
		
		
		@Test(priority=0)
		public void TC_001_verify_install_apk() throws Exception {
			login=PageFactory.initElements(driver1, launch_login.class);
			book = PageFactory.initElements(driver1, booking_page.class);
			log.info("***************TC_001_verify_install_apk starts*****************");
			login=PageFactory.initElements(driver1, launch_login.class);	
			
			library.visible_link(login.getFirst_page_Select_pickUP_location(), "Freedo app is Install");
			
		}
	
//============================	Launch Application =============================================================
		@Test(priority=1)
		public void TC_002_verify_select_pickup_location_date_and_packages() {
			login=PageFactory.initElements(driver1, launch_login.class);	
			log.info("***************TC_002_verify_select_pickup_location_date_and_packages starts*****************");
			
			library.visible_link(login.getFirst_page_Select_pickUP_location(), "Select pickup location date and packages");
			library.isSelected(login.getfirst_page_first_slide_indicator(), "First slide indicator is ");
			library.visible_link(login.getfirst_page_first_slide_indicator(), "first slide indicator");
			library.visible_link(login.getFirst_page_second_slide_indicator(), "second slide indicator");
			library.visible_link(login.getFirst_page_third_slide_indicator(), "third slide indicator");
			library.visible_link(login.getClick_Next_button1(), "Next_button static 1st page");
			library.visible_link(login.getClick_Skip_button1(), "Skip_button static 1st page");
				
		}
	
		
	
	
//	}
	
}
