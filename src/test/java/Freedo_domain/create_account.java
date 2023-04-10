package Freedo_domain;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.page_object.launch_login;
import com.utility.base_class;
import com.utility.library;

public class create_account extends base_class {
	
	public launch_login login;
	
//============================	Launch Application =============================================================
	@Test
	public void Module1_TC_001_On_boarding_screen() {
				
		login = PageFactory.initElements(driver1, launch_login.class);
		
		library.visible_link(login.getClick_Next_button1(), "Next_button1");
		library.visible_link(login.getClick_Skip_button1(), "Skip_button1");
		
		
	}
//================================ static_pages_view ============================================================
	@Test(dependsOnMethods="Module1_TC_001_On_boarding_screen")	
	public void Module1_TC_002_static_pages_view() throws Exception  {
		
		library.Custom_click(login.getClick_Next_button1(), "Click_Next_button1");
		library.visible_link(login.getClick_Skip_button2(), "Skip_button2");
//			Thread.sleep(2000);
		library.Error_message_something(login.getClick_Next_button1(), "firstpage message");	
		library.Custom_click(login.getClick_Next_button2(), "Click_Next_button2");
//			Thread.sleep(2000);
		library.Error_message_something(login.getClick_Next_button2(), "Secondpage message");	
		library.Custom_click(login.getClick_Done_button(), "Click_Done_button");
//			Thread.sleep(2000);
		library.Error_message_something(login.getClick_Next_button2(), "Thirdpage message");	
			
	}

//=====================Verify_login_component_login_page =======================================================
	@Test(dependsOnMethods="Module1_TC_002_static_pages_view")	
	public void Module2_TC_003_Verify_login_component()  {
				
		library.visible_link(login.getCreateAccount(), "CreateAccount");	
		library.visible_link(login.getEnter_MO_Number(), "Enter mobile number");
		library.visible_link(login.getClick_Login_button(), "login button");
	}
	
//=================================== Create Account ======================================================
	@Test(dependsOnMethods="Module2_TC_003_Verify_login_component")
	public void Module4_TC_004_Verify_Create_Account_functionality() throws Exception {
	
	library.Custom_click(login.getCreateAccount(), "CreateAccount");
	library.custom_sendkeys(login.getClick_First_name(), config.getFirst_name(), "First name");
	library.custom_sendkeys(login.getClick_Last_name(), config.getLast_name(), "Last name");
	library.custom_sendkeys(login.getClick_Enter_Mobile_Number_C_A(), config.getMobile(), "Enter number");
	library.custom_sendkeys(login.getClick_Enter_Email(), config.getEnter_Email(), "Enter Email");
//	library.Custom_click(login.getClick_Email_remove_keyboard(), "Remove keyboard");
	library.Custom_click(login.getClick_Gender_Female(), "Female gender selected");
	library.Custom_click(login.getClick_Gender_Other(), "Other gender selected");
	library.Custom_click(login.getClick_Gender_Male(), "Male gender selected");
	library.Custom_click(login.getClick_I_accept_checkbox(), "Check box selected");
	library.visible_link(login.getClick_Terms_and_Conditions(), "Terms and condition ");
	library.visible_link(login.getClick_Login_button_C_A(), "login button is present");
	library.Custom_click(login.getClick_Create_My_Account(), "Create my account");
//	library.Custom_click(login.getClick_User_already_registered_ok(), "Alredy user register");
//	library.Custom_click(login.getClick_Login_button_C_A(), "login button");
	Thread.sleep(5000);
	library.custom_sendkeys(login.getEnter_OTP(),config.getOTP(), "Otp");
	
	Thread.sleep(5000);

	}
	

}
