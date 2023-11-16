package Include_champion_app;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.pageobject.ChampionApp;
import com.utility.BaseClass;
import com.utility.Library;

@Listeners(com.utility.listner.class)
public class Champion_test extends BaseClass{

	public ChampionApp champ;
	
///////////////////////////////////////////////////////////////////////////////////////////////////////	
	@Test()
	public void Verify_login_champion_app() throws Exception {
		champ = new ChampionApp(driver1);
		log.info("***************TC_001_Verify_login_champion_app*****************");
		
		Library.custom_sendkeys(champ.getLogin_user_id(), config.getweb_credential(), "User id");
		Library.custom_sendkeys(champ.getLogin_password(), config.getweb_credential_password(), "Password");
		Champion_test.EnterButton();
		Library.Custom_click(champ.getLogin_Button(), "Login button");
		Library.Custom_click(champ.getLogin_dont_allow_notification(), "Dont allow Notification");
		Library.Custom_click(champ.getLogin_cancel_notification(), "Cancel button Notification");
	}
	
///////////////////////////////////////////////////////////////////////////////////////////////////////	
	@Test()
	public void admin_rejest_booking() throws Exception {
		
		log.info("***************TC_002_admin_rejest_booking *****************");
		
		Library.Custom_click(champ.getDS_new_booking_request(), "New booking request");
		Thread.sleep(2000);
		Library.custom_sendkeys(champ.getNBR_search_user(), config.getMobile(), "Search User ");
		Thread.sleep(5000);
		Library.Custom_click(champ.getNBR_request_reject_icon(), "Request reject button");
		Library.Custom_click(champ.getNBR_reject_search_dropdown(), "Select reason dropdown");
		Library.Custom_click(champ.getNBR_reject_search_dropdown_booked_my_mistake(), "Booked my mistake");
		Library.Custom_click(champ.getNBR_reject_search_dropdown_booked_my_mistake_submit_button(), "Submit Button");
		Library.Custom_click(champ.getNBR_Yes_button(), "Yes button");
		Library.Custom_click(champ.getNBR_back_button(), "Back button");
	
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////	
	@Test()
	public void admin_approve_request() throws Exception {
		
		log.info("***************TC_002_admin_rejest_booking *****************");
		
		Library.Custom_click(champ.getDS_new_booking_request(), "New booking request");
		Thread.sleep(2000);
		Library.custom_sendkeys(champ.getNBR_search_user(), config.getMobile(), "Search User ");
		Thread.sleep(5000);
		Library.Custom_click(champ.getNBR_request_approve_icon(), "Request approve button");
		Library.Custom_click(champ.getNBR_Yes_button(), "Yes button");
		Library.Custom_click(champ.getNBR_request_view_icon(), "User view button");
		
		
		
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
