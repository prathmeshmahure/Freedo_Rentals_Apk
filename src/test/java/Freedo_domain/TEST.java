package Freedo_domain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
//	public SoftAssert ass= new SoftAssert(); 
	
//	@Test
//	public void t1() throws Exception {
		
		
		@Test(priority=0)
		public void TC_0052_verify_install_apk() throws Exception {
			login = new launch_login(driver1);
			book = new booking_page(driver1);
			log.info("***************TC_001_test_demo starts*****************");
				
			try {
				library.Custom_click(book.getClick_home_delivery_radio_button(), "Home delivery radio button");
				base_class.scrollByText("Select Time Slot");
				library.Custom_click(book.getClick_home_delivery_add_address(), "Add Address");
				try {
				library.Custom_click(book.getCod_1st_available_ok_button(), "Location on device ok");
				}catch(Exception e) {		}
				library.custom_sendkeys(book.getClick_home_delivery_search_address(), config.getgpsaddress(), "Searching address");
				appium_1.EnterButton();
				Thread.sleep(1000);
				library.Custom_click(book.getClick_home_delivery_search_address_1(), "Random 1 option is selected address");
				library.Custom_click(book.getClick_home_delivery_confirm_location(), "Confirm location");
				library.custom_sendkeys(book.getClick_home_delivery_enter_name(), config.getFirst_name(), "Prathmesh");
				library.custom_sendkeys(book.getClick_home_delivery_enter_complete_address(), config.getPort(), "Dummy address");
				library.custom_sendkeys(book.getClick_home_delivery_landmark_optional(), config.getPort(), "Dummy address");
				appium_1.EnterButton();
				base_class.scrollByText("Save Address Details");
				library.Custom_click(book.getClick_home_delivery_save_address_details(), "Save address details");
				library.Custom_click(book.getClick_home_delivery_delete_address(), "delete address");
				library.Custom_click(book.getClick_home_delivery_yes_address(), "delete confirm Yes ");
				Thread.sleep(3000);
				library.Custom_click(book.getClick_home_delivery_add_new_address_(), "Add new address");
				Thread.sleep(2000);
				appium_1.Back_button();
				Thread.sleep(1000);
				appium_1.Back_button();
				Thread.sleep(3000);
				try {
					WebElement element=driver1.findElement(By.xpath("//android.widget.Button[@content-desc='TabNav, back']"));
					if(element.isDisplayed() || element.isEnabled()==true) {
						element.click();
						driver1.findElement(By.xpath("//android.view.ViewGroup[@content-desc='home_tab']")).click();
					}
				}catch(Exception e) {
					driver1.findElement(By.xpath("//android.view.ViewGroup[@content-desc='home_tab']")).click();
				}
				Thread.sleep(1000);
				base_class.scrollByText("Search in");
				}catch(Exception e) {	}
			
			
			
			
			
			
			
			
			
			
			
			
			
//			base_class.scrollByText("Why Freedo");
			
//			Thread.sleep(13000);
//			Point s=login.getFirst_page_Select_pickUP_location().getLocation();
//			int x=s.x;
//			int y=s.y;
//			System.out.println("x-asis= "+x+ "yaxis"+y);
//			System.out.println(s);
			
			
			
			
			
			
			
			
			
			
		}
}
