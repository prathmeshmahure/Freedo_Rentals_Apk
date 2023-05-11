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
		
		library.visible_link(book.getFBD_Booking_status(), "Booking status");
		library.visible_link(book.getFBD_booking_status_txt(), "Booking status = "+book.getFBD_booking_status_txt().getText());
		library.visible_link(book.getFBD_Booking_id(), "Booking ID = "+book.getFBD_Booking_id().getText());
		library.visible_link(book.getFBD_vehicle_nummber(), "Vehicle number = "+book.getFBD_vehicle_nummber().getText());
		library.visible_link(book.getClick_show_more_details(), "show more details text");
		library.Custom_click(book.getClick_show_more_details(), "show more details text");
		Thread.sleep(2000);
		library.visible_link(book.getFBD_pick_up_date(), "Pick Up Date = "+book.getFBD_pick_up_date().getText());
		library.visible_link(book.getFBD_drop_off_date(), "Drop off date = "+book.getFBD_drop_off_date().getText());
		library.visible_link(book.getFBD_pick_up_location(), "Pick Up Location = "+book.getFBD_pick_up_location().getText());
		library.visible_link(book.getFBD_duration(), "Duration = "+book.getFBD_duration().getText());
		library.visible_link(book.getFBD_handover_time(), "Handover Time = "+book.getFBD_handover_time().getText());
		library.visible_link(book.getFBD_drop_off_location(), "Drop off Location = "+book.getFBD_drop_off_location().getText());
		library.visible_link(book.getFBD_planned_drop_off_date(), "Planned drop off date = "+book.getFBD_planned_drop_off_date().getText());
		library.visible_link(book.getFBD_Actual_drop_off_date(), "Actual Drop-off date = "+book.getFBD_Actual_drop_off_date().getText());
		library.visible_link(book.getFBD_mode_of_pick_up(), "Mode of pick-up = "+book.getFBD_mode_of_pick_up().getText());
		appium_2.Scroll_UP_page_Action("page up");
		library.Custom_click(book.getClick_show_less_details(), "show less text");
		library.visible_link(book.getClick_price_breakup(), "price break up Drop down");
	
	
	
	
	}
	
}
