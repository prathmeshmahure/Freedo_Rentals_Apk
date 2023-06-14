package Freedo_domain;

import org.openqa.selenium.By;
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
		
		library.Custom_click(book.getClick_home_delivery_radio_button(), "Home delivery radio button");
		appium_1.Scroll_UP_page_Action("up");
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
			driver1.findElement(By.xpath("//android.widget.Button[@content-desc='TabNav, back']")).click();
			driver1.findElement(By.xpath("//android.view.ViewGroup[@content-desc='home_tab']")).click();
		}catch(Exception e) {
			driver1.findElement(By.xpath("//android.view.ViewGroup[@content-desc='home_tab']")).click();
		}
		Thread.sleep(1000);
		appium_1.Scroll_down_page_Action("Down");
	
		
	
	
	}
	
}
