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
		
		
		
		library.Custom_click(login.getClick_Privacy_Policy(), "Privacy policy");
		library.visible_link(login.getPrivacy_policy_page_heading(), "Privacy policy page Heaading");
		library.visible_link(login.getDelete_account(), "Delete account txt");
		library.visible_link(login.getPrivacy_policy(), "Privacy policy txt");
		library.visible_link(login.getBack_button(), " back button ");
		
		
		log.info("***************TC_0013_verify_Privacy_policy_under_delete_dropdown_all_element starts*****************");
		
		library.Custom_click(login.getDelete_account_dropdown(), "Delete account dropdown open");
		library.visible_link(login.getDA_checkbox_1(), "Bad experiance on a ride");
		library.visible_link(login.getDA_checkbox_2(), "it's too experiance");
		library.visible_link(login.getDA_checkbox_3(), "Negative support experiance");
		library.visible_link(login.getDA_checkbox_4(), "Issues with my internet");
		library.visible_link(login.getDA_checkbox_5(), "No longer support company");
		library.visible_link(login.getDA_checkbox_6(), "Prefer not to say");
		library.visible_link(login.getDA_checkbox_7(), "Others");
	//	library.Custom_click(login.getDelete_account_dropdown(), "Delete account dropdown close");	
		
		log.info("***************TC_0014_verify_Privacy_policy_under_Privacy_policy_dropdown_all_element starts*****************");
		
		library.Custom_click(login.getDelete_account_dropdown(), "Privacy policy dropdown open");
		library.visible_link(login.getPrivacy_policy_info(), "Privacy policy information");
	//	library.Custom_click(login.getPrivacy_policy_dropdown(), "Privacy policy dropdown Close");	
		library.Custom_click(login.getBack_button(), " back button ");
		
		
	
		
		
		
		
		
		
		
		
		
		
		
	}
	


	
}
