package Freedo_domain;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.page_object.champion;
import com.utility.base_class;
import com.utility.library;

@Listeners(com.utility.listner.class)
public class Champion_test extends base_class{

	public champion champ;
	
	@Test(priority=1)
	public void TC_001_Verify_login_champion_app() throws Exception {
		champ = new champion(driver1);
		log.info("***************TC_001_Verify_login_champion_app*****************");
		
		library.custom_sendkeys(champ.getLogin_user_id(), config.getweb_credential(), "User id");
		library.custom_sendkeys(champ.getLogin_password(), config.getweb_credential(), "Password");
		Champion_test.EnterButton();
		library.Custom_click(champ.getLogin_Button(), "Login button");
		library.Custom_click(champ.getLogin_dont_allow_notification(), "Dont allow Notification");
		library.Custom_click(champ.getLogin_cancel_notification(), "Cancel button Notification");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
