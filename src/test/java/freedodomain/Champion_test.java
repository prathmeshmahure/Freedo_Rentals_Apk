package freedodomain;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.pageobject.ChampionApp;
import com.utility.BaseClass;
import com.utility.Library;

@Listeners(com.utility.listner.class)
public class Champion_test extends BaseClass{

	public ChampionApp champ;
	
	@Test(priority=1)
	public void TC_001_Verify_login_champion_app() throws Exception {
		champ = new ChampionApp(driver1);
		log.info("***************TC_001_Verify_login_champion_app*****************");
		
		Library.custom_sendkeys(champ.getLogin_user_id(), config.getweb_credential(), "User id");
		Library.custom_sendkeys(champ.getLogin_password(), config.getweb_credential(), "Password");
		Library.EnterButton();
		Library.Custom_click(champ.getLogin_Button(), "Login button");
		Library.Custom_click(champ.getLogin_dont_allow_notification(), "Dont allow Notification");
		Library.Custom_click(champ.getLogin_cancel_notification(), "Cancel button Notification");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
