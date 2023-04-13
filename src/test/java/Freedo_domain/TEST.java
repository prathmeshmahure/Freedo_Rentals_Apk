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
		
		
		library.Custom_click(book.getClick_1st_page_enter_button(), "Enter button");
		library.date_select();
		library.Custom_click(book.getClick_Package_dropdown(), "package dropdown");
		library.Custom_click(book.getClick_1_Days_package(),"Selected package");
		library.Custom_click(book.getClick_go_freedo_Button(), "Book now button");
		///////////////
		Thread.sleep(2000);
		library.isDisplayed(book.getOur_renting_fleet_page_txt(), "Our Renting fleet Page tittle is ");	
		library.isSelected(book.getClick_Bike_Tab(), "Bike tab by default is ");
		library.getTextEqualIgnorCase(book.getselect_random_Bike(), "Book Now");
		library.bike_book_page(book.getselect_random_Bike(), "Bike");
		//Start 
		library.Custom_click(book.getclick_location_pop_up_ok_button(), "Location ok button");
		appium_1.Scroll_UP_page_Action("page up");
		library.isEnabled(book.getClick_Continue_Tab(), "Continue button is ");
		library.Custom_click(book.getClick_Continue_Tab(), "Click continue tab");
		
		///////////////
		library.isDisplayed(book.getsummary_page_text(), "SUMMARY page title is ");	
		appium_1.Scroll_UP_page_Action("page up");
		library.visible_link(book.getClick_add_helmet_extra_charges(), "Extra helmet charges = "+book.getClick_add_helmet_extra_charges().getText());
		library.getTextEqualIgnorCase(book.getClick_add_helmet_extra_charges(), "₹ 0.00");
		library.isSelectedFalse(book.getClick_cash_on_delivery(), "Before select Cod check box is ");
		library.Custom_click(book.getClick_cash_on_delivery(), "cash on delivery");
		library.isSelected(book.getClick_cash_on_delivery(), "After select Cod check box is ");
		library.Custom_click(book.getClick_I_accept_checkbox(), "I Accept checkbox");
		library.Custom_click(book.getClick_pay_now_button(), "click pay now button");
		
		
	
		
		
		
		
		
		
		
		
		
		
		
	}
	


	
}
