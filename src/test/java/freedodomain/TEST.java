package freedodomain;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.pageobject.BookingPage;
import com.pageobject.ChampionApp;
import com.pageobject.LaunchLogin;
import com.utility.BaseClass;
import com.utility.Library;
@Listeners(com.utility.listner.class)
public class TEST extends BaseClass {
	public LaunchLogin login;
	public BookingPage book;
	public ChampionApp champ;
	public static ExtentTest test;
//	public SoftAssert ass= new SoftAssert(); 
	
//	@Test
//	public void t1() throws Exception {
		
	@Test(priority=0)
	public void TC_002_verify_select_pickup_location_date_and_packages() {
		login = new LaunchLogin(driver1);
		log.info("***************TC_001_verify_select_pickup_location_date_and_packages starts*****************");
		
		try {
		if(login.getFirst_page_Select_pickUP_location().isDisplayed()) {
		
		Library.Custom_click(login.getClick_Next_button1(), "Next_button1 static 1st page");
		}	}catch(Exception e) {}
		android_home("Home");
	}
	//////////////////////////////////////////////
		@Test(priority=1)
		public void TC_0052_verify_install_apk() throws Exception {
			login = new LaunchLogin(driver1);
			book = new BookingPage(driver1);
			champ = new ChampionApp(driver1);
			log.info("***************TC_002_test_demo starts*****************");
			Thread.sleep(5000);
				

		       
			championapp_activity();
			Library.custom_sendkeys(champ.getLogin_user_id(), config.getweb_credential(), "User id");
			Library.custom_sendkeys(champ.getLogin_password(), config.getweb_credential(), "Password");
			android_home("Home");
				
			
		}
		///////////////////////////
		@SuppressWarnings("deprecation")
		@Test(priority=2)
		public void TC_0052_Freddo_apk() throws Exception {
			
			log.info("***************TC_003_freedo test_demo starts*****************");
				
			BaseClass.freedoapp_activity();
		       Library.Custom_click(login.getClick_Next_button2(), "Next_button2 static 2nd page");
		       championapp_activity();  
		       Library.Custom_click(champ.getLogin_Button(), "Login button");
		}
}
