package freedodomain;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.pageobject.BookingPage;
import com.pageobject.LaunchLogin;
import com.utility.BaseClass;
import com.utility.Library;
@Listeners(com.utility.listner.class)

public class appium_3 extends BaseClass{
	public BookingPage book;
	public LaunchLogin login;
	public static ExtentTest test;
	
	
	//@Test(dependsOnMethods={"TC_0058_admin_Request_reject"})
	@Test(priority=8)
	public void TC_0059_Verify_user_able_to_Online_payment_booking() throws Exception  {
		log.info("***************TC_0059_Verify_user_able_to_Online_payment_booking starts*****************");
		book = new BookingPage(driver1);
		
		Library.Custom_click(book.getClick_home_page_button(), "Home button");
		Thread.sleep(2000);
		Library.Custom_click(book.getClick_1st_page_enter_button(), "Enter button");
		Library.date_select();
		Library.Custom_click(book.getClick_Package_dropdown(), "package dropdown");
		Library.Custom_click(book.getClick_1_Days_package(),"Selected package");
		Library.Custom_click(book.getClick_go_freedo_Button(), "Go Freedo button");
		Thread.sleep(2000);
		Library.Custom_click(book.getBook_now_button(), "Book now button");
		Thread.sleep(2000);
		Library.Custom_click(book.getclick_location_pop_up_ok_button(), "ok button");
		Library.Custom_click(book.getClick_Continue_Tab(), "Continue button");
		Thread.sleep(4000);
		BaseClass.scrollByText("Pay Now");
	//	library.Custom_click(book.getClick_I_accept_checkbox(), "I accept checkbox");
		Thread.sleep(1000);
		Library.Custom_click(book.getClick_summary_pay_now_button(), "Pay now button");
		Thread.sleep(5000);
		Library.Custom_click(book.getClick_Pay_using_Netbanking(), "Pay using Netbanking");
		Library.Custom_click(book.getClick_Pay_using_SBI_bank(), "Select SBI bank");
		Library.Custom_click(book.getClick_pay_now_button_sbi(), "Pay Now button");
		
		Library.Custom_click(book.getClick_payment_successful(), "payment successful");
		Library.Custom_click(book.getClick_view_booking(), "booking details");
		Thread.sleep(10000);	
		Library.Custom_click(book.getClick_view_booking(), "booking details");
		Thread.sleep(7000);
		try {
			if(book.getClick_view_booking().isDisplayed()) {
			driver1.findElement(By.xpath("//android.widget.TextView[@content-desc='txt_ViewBooking']")).click();
			}
		}catch(Exception e){		}	
	}
//================================================================================================================================	
	@Test(dependsOnMethods={"TC_0059_Verify_user_able_to_Online_payment_booking"})
	//@Test(priority=9)
	public void TC_0060_Admin_approved_request () throws Exception {
		log.info("***************TC_0060_Admin_approved_request starts*****************");
		
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			Browseropen();
			Thread.sleep(3000);
			Robot r = new Robot();
			for(int i=0; i<4; i++) {
				r.keyPress(KeyEvent.VK_CONTROL);Thread.sleep(300); r.keyPress(KeyEvent.VK_SUBTRACT);r.keyRelease(KeyEvent.VK_SUBTRACT);r.keyRelease(KeyEvent.VK_CONTROL);
			}
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_PAGE_DOWN);Thread.sleep(1000);
			r.keyRelease(KeyEvent.VK_PAGE_DOWN);
			WebElement ele4=driver.findElement(By.xpath("//button[@title='Reset']"));Library.Custom_click(ele4, "Reset button");
//			WebElement ele1=driver.findElement(By.xpath("(//div[@aria-haspopup='listbox'])[3]"));library.Custom_click(ele1, "10 user");
//			WebElement ele2=driver.findElement(By.xpath("//li[normalize-space()='50']"));library.Custom_click(ele2, "50 user");
			Thread.sleep(3000);
			String s="Prathmesh";//user name to find web table
			String l="Mahure";
			
			WebElement ele5=driver.findElement(By.xpath("//text[text()='"+s+" "+l+"']/parent::div/parent::td//following-sibling::td//div[@id='approve-action']"));
			Library.Custom_click(ele5, "accept booking request");
			Thread.sleep(1000);
			WebElement ele6=driver.findElement(By.xpath("//button[text()='Yes']"));
			Library.Custom_click(ele6, "Yes button");
			Thread.sleep(2000);
			WebElement ele7=driver.findElement(By.xpath("//text[text()='"+s+" "+l+"']/parent::div/parent::td//following-sibling::td//div[@id='view-action']"));
			Library.Custom_click(ele7, "view data");
			Thread.sleep(3000);
//			WebElement ele8=driver.findElement(By.xpath("//p[text()='Booking Management']"));library.Custom_click(ele8, "Booking management");
//			
//			WebElement ele9=driver.findElement(By.xpath("//input[@placeholder='Search User' or @value='prathmesh']"));	library.custom_sendkeys(ele9, config.getFirst_name(), "Search user name");
//			Thread.sleep(3000);
			///////////////////////////////////////////////// calender
			
			
//			WebElement calendar=driver.findElement(By.xpath("(//*[@data-testid='CalendarIcon'])[2]"));		library.Custom_click(calendar, "calender click");
//			
//			Date d=new Date();
//			int  da=d.getDate();
//			int m=Integer.parseInt(config.getdate());
//			int date=da+m;
//			
//			List<WebElement> lastday=driver.findElements(By.xpath("//div[@role][4]/parent::div/parent::div/parent::div//following-sibling::div//button"));
//			int totaldays=lastday.size();
//			int i=date + 2; //adding 2 days extra to visible 
//			int nextdate=i-totaldays;
//				if(i<=totaldays) {
//					WebElement dateselect=driver.findElement(By.xpath("(//button[normalize-space()="+i+"])[1]"));
//					library.Custom_click(dateselect, "Select date");
//				}else {
//					driver.findElement(By.xpath("//button[@title='Next month']")).click();
//					WebElement dateselect=driver.findElement(By.xpath("(//button[normalize-space()="+nextdate+"])[1]"));
//					library.Custom_click(dateselect, "Select date");
//				}
//			
//					
//			///////////////////////////////////////////////////////////
//			WebElement ele10=driver.findElement(By.xpath("//h5[text()='Upcoming']"));library.Custom_click(ele10, "Upcoming button");
//			
//			Thread.sleep(1000);
//			WebElement ele11=driver.findElement(By.xpath("//div[@id='view-action']"));
//			library.Custom_click(ele11, "table search user request view action");
			/////// Upgrade vehicle ////////
			r.keyPress(KeyEvent.VK_PAGE_UP); Thread.sleep(1000);
			r.keyRelease(KeyEvent.VK_PAGE_UP);
			WebElement ele91=driver.findElement(By.xpath("//button[text()='Upgrade Vehicle']"));Library.Custom_click(ele91, "Upgrade vehicle");
			WebElement ele92=driver.findElement(By.xpath("//em[text()='Available Vehicles']"));Library.Custom_click(ele92, "Available vehicles");
			WebElement ele93=driver.findElement(By.xpath("//li[text()='HF Deluxe']"));Library.Custom_click(ele93, "Hf deluxe bike selected");
			WebElement ele94=driver.findElement(By.xpath("//button[@title='Request Upgrade']"));Library.Custom_click(ele94, "Request upgrade vehicle");
			Thread.sleep(3000);
			////////////////
			
			WebElement ele13=driver.findElement(By.xpath("(//button[text()='Start Ride' or @data-bs-toggle='modal'])[1]"));Library.Custom_click(ele13, "Start ride");
			Thread.sleep(3000);
			WebElement ele14=driver.findElement(By.xpath("(//input[@placeholder='Start Reading'])[1]"));
			try {ele14.click(); }catch(Exception e) {}Thread.sleep(2000);
			Library.custom_sendkeys(ele14, "20", "enter bike reading");
			Thread.sleep(1000);
			WebElement dropdownbike=driver.findElement(By.xpath("//option[text()='Select Registration']"));Library.Custom_click(dropdownbike, "Select bike number");
			Thread.sleep(700);
			WebElement dropdownbike1=driver.findElement(By.xpath("(//option[@value])[2]"));Library.Custom_click(dropdownbike1, "bike number is selected");
			
			//////////////////////////////////////////////////////// date as per select bike booking
//			WebElement calendar2=driver.findElement(By.xpath("//input[@type=\"date\"]"));		library.Custom_click(calendar2, "calender click");
//			if(i<=totaldays) {
//				WebElement dateselect=driver.findElement(By.xpath("(//button[normalize-space()="+i+"])[1]"));
//				library.Custom_click(dateselect, "Select date");
//			}else {
//				driver.findElement(By.xpath("//button[@title='Next month']")).click();
//				WebElement dateselect=driver.findElement(By.xpath("(//button[normalize-space()="+nextdate+"])[1]"));
//				library.Custom_click(dateselect, "Select date");
//			}
			/////////////////////////////////////////////////////// MITS form 
			Thread.sleep(700);
			WebElement Generate_MITC_Form = driver.findElement(By.xpath("//button[normalize-space()='Generate MITC Form']"));	Library.Custom_click(Generate_MITC_Form, "Generate MITC Form");
			String parentwindow = driver.getWindowHandle();
			WebElement MITC_FORM_Link = driver.findElement(By.xpath("//a[normalize-space()='MITC FORM Link']"));	Library.Custom_click(MITC_FORM_Link, "MITC FORM Link");
			
			Thread.sleep(3000);
		      Set<String> allWindows = driver.getWindowHandles();
		      for (String childwindow:allWindows) {
		         if(!childwindow.equals(parentwindow)){
		            driver.switchTo().window(childwindow);
		            System.out.println("The child window is "+childwindow + " " +parentwindow);
								            try {
								    			// clancel 2 line after fixing bug	
								    			WebElement NOIda = driver.findElement(By.xpath("//div[text()='Noida']"));	//library.Custom_click(NOIda, "Noida");
								    			NOIda.click();
								    		//	WebElement Send_Otp=driver.findElement(By.xpath("//button[normalize-space()='Send Otp']"));	library.Custom_click(Send_Otp, "Send Otp button");
								    	}catch(Exception e) {
								    		
								    	}
								///////////////
											JavascriptExecutor js = (JavascriptExecutor) driver;  // scrolling		
											for(int i=0; i<2; i++) {
												r.keyPress(KeyEvent.VK_PAGE_DOWN); 
												r.keyRelease(KeyEvent.VK_PAGE_DOWN);
											//js.executeScript("window.scrollBy(0,1000)","");
												}
											Thread.sleep(2000);
											WebElement MITS_form_checkbox = driver.findElement(By.xpath("//input[@value='Personal']"));																							
											WebElement Send_Otp=driver.findElement(By.xpath("//button[text()='Send OTP']"));												
											js.executeScript("arguments[0].scrollIntoView();",Send_Otp);
											Library.Custom_click(MITS_form_checkbox, "MITS form checkbox");
											Library.Custom_click(Send_Otp, "Send Otp button");
											WebElement OTP_input_box=driver.findElement(By.xpath("(//input[@type='number'])[1]"));	Library.custom_sendkeys(OTP_input_box,"123456", "OTP input box");
											WebElement Verify_button=driver.findElement(By.xpath("//div[text()='Verify']"));	Library.Custom_click(Verify_button, "Verify button");
							 							
		         } else {
		            System.out.println("There are no children");
		         }
		      }
			driver.switchTo().window(parentwindow);
			Library.Custom_click(ele13, "Start ride");			
			WebElement MITC_FORM_status = driver.findElement(By.xpath("//a[normalize-space()='Check MITC Status']"));	Library.Custom_click(MITC_FORM_status, "MITC FORM Status");
			Thread.sleep(1000);
			WebElement Start_Ride=driver.findElement(By.xpath("(//button[text()='Start Ride'])[2]"));	Library.Custom_click(Start_Ride, "Start ride button");
			Thread.sleep(2000);
			////// verify booking is ongoing
			WebElement Ongoing=driver.findElement(By.xpath("//span[text()='Ongoing']"));
			if(Ongoing.isDisplayed()) {
				log.info("Approval is sucessfully Accepted");
			}else {
				log.error("Approval is not accepted");
			}
			driver.quit();			
		}
//===================================================================================================================================	
	@Test(dependsOnMethods={"TC_0060_Admin_approved_request"})
	//@Test(priority=10)
	public void TC_0061_Verify_user_able_to_view_booking_status_all_elements() throws Exception {
		log.info("***************TC_0061_Verify_user_able_to_view_booking_status_all_elements starts*****************");
		
		appium_2.Back_button();
		Thread.sleep(1000);
		appium_2.Back_button();
		Library.Custom_click(book.getClick_home_page_Bookings_button(), "Bookings button");
		Thread.sleep(3000);
		try {
			BaseClass.scrollByText("Booking Status");
			driver1.findElement(By.xpath("//android.widget.TextView[@text='View']")).click();
		}catch(Exception e){
			
		}
		//library.Custom_click(book.getClick_booking_page_view_button(), "View button");
//		Thread.sleep(4000);
//		library.visible_link(book.getClick_show_more_details(), "show more details text");
		Library.Custom_click(book.getClick_show_more_details(), "show more details text");
		Thread.sleep(2000);
		BaseClass.scrollByText("Booking Status");
		Library.visible_link(book.getFBD_Booking_status(), "Booking status");
		Library.visible_link(book.getFBD_booking_status_txt(), "Booking status = "+book.getFBD_booking_status_txt().getText());
		Thread.sleep(2000);
		Library.visible_link(book.getFBD_Booking_id(), "Booking ID  ");
		Library.visible_link(book.getFBD_vehicle_nummber(), "Vehicle number  ");		
		Library.visible_link(book.getFBD_pick_up_date(), "Pick Up Date  ");
		Library.visible_link(book.getFBD_drop_off_date(), "Drop off date  ");
		Library.visible_link(book.getFBD_pick_up_location(), "Pick Up Location  ");
		Library.visible_link(book.getFBD_duration(), "Duration  ");
		Library.visible_link(book.getFBD_handover_time(), "Handover Time  ");
		Library.visible_link(book.getFBD_drop_off_location(), "Drop off Location  ");
		Library.visible_link(book.getFBD_planned_drop_off_date(), "Planned drop off date  ");
		Library.visible_link(book.getFBD_Actual_drop_off_date(), "Actual Drop-off date  ");
		BaseClass.scrollByText("Mode of Pick-Up");
		Library.visible_link(book.getFBD_mode_of_pick_up(), "Mode of pick-up  ");
		
		try {
			BaseClass.scrollByText("Booking Status");
		Library.visible_link(book.getFBD_Booking_id(), "Booking ID = "+book.getFBD_Booking_id().getText());
		Library.visible_link(book.getFBD_vehicle_nummber(), "Vehicle number = "+book.getFBD_vehicle_nummber().getText());		
		Library.visible_link(book.getFBD_pick_up_date(), "Pick Up Date = "+book.getFBD_pick_up_date().getText());
		Library.visible_link(book.getFBD_drop_off_date(), "Drop off date = "+book.getFBD_drop_off_date().getText());
		Library.visible_link(book.getFBD_pick_up_location(), "Pick Up Location = "+book.getFBD_pick_up_location().getText());
		Library.visible_link(book.getFBD_duration(), "Duration = "+book.getFBD_duration().getText());
		Library.visible_link(book.getFBD_handover_time(), "Handover Time = "+book.getFBD_handover_time().getText());
		Library.visible_link(book.getFBD_drop_off_location(), "Drop off Location = "+book.getFBD_drop_off_location().getText());
		Library.visible_link(book.getFBD_planned_drop_off_date(), "Planned drop off date = "+book.getFBD_planned_drop_off_date().getText());
		Library.visible_link(book.getFBD_Actual_drop_off_date(), "Actual Drop-off date = "+book.getFBD_Actual_drop_off_date().getText());
		BaseClass.scrollByText("Mode of Pick-Up");
		Library.visible_link(book.getFBD_mode_of_pick_up(), "Mode of pick-up = "+book.getFBD_mode_of_pick_up().getText());
		}catch(Exception e) {
			log.error("text is not present");
		}
		BaseClass.scrollByText("Show Less");
		Library.Custom_click(book.getClick_show_less_details(), "show less text");
		BaseClass.scrollByText("Invoice");
		Library.visible_link(book.getClick_Home_booking_tab_extend_ride(), "Extend ride drop down");
		Library.visible_link(book.getFBD_end_ride(), "End ride drop down");
		Library.visible_link(book.getClick_price_breakup(), "price break up Drop down");
		Library.visible_link(book.getFBD_vehicle_documents(), "Vehicle document");
		
	}
//============================================================================================================================
	@Test(dependsOnMethods={"TC_0061_Verify_user_able_to_view_booking_status_all_elements"})
	//@Test(priority=11)
	public void TC_0062_Verify_user_End_ride_request() throws Exception {
		log.info("***************TC_0062_Verify_user_End_ride_request starts*****************");
		
		Library.Custom_click(book.getFBD_end_ride(), "End ride drop down");
		Library.Custom_click(book.getFBD_end_ride_raised_request_button(), "End ride raised request button");
		
	}
	
//============================================================================================================================	
	@Test(dependsOnMethods={"TC_0062_Verify_user_End_ride_request"})
	//@Test(priority=12)
	public void TC_0063_Verify_user_end_ride_booking_status() throws Exception {
		log.info("***************TC_0063_Verify_user_end_ride_booking_status starts*****************");
		
		Thread.sleep(5000);
		BaseClass.scrollByText("Booking Status");
		Library.visible_link(book.getFBD_Booking_status(), "Booking status");
		Library.visible_link(book.getFBD_booking_status_txt(), "Booking status = "+book.getFBD_booking_status_txt().getText());
	}
	
//============================================================================================================================	
	@Test(dependsOnMethods={"TC_0063_Verify_user_end_ride_booking_status"})
	//@Test(priority=13)
	public void TC_0064_Admin_check_End_ride_request () throws Exception {
		log.info("***************TC_0064_Admin_check_End_ride_request starts*****************");
		
		Browseropen();
		Thread.sleep(3000);
		Robot r = new Robot();
		for(int i=0; i<4; i++) {
			r.keyPress(KeyEvent.VK_CONTROL);Thread.sleep(300);r.keyPress(KeyEvent.VK_SUBTRACT);r.keyRelease(KeyEvent.VK_SUBTRACT);r.keyRelease(KeyEvent.VK_CONTROL);
		}
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		WebElement ele3=driver.findElement(By.xpath("//h5[normalize-space()='Return Requests Received']"));Library.Custom_click(ele3, "Return Requests Received");
		
		Thread.sleep(3000);
		String s=config.getFirst_name();//user name to find web table
		String l=config.getLast_name();
		WebElement ele5=driver.findElement(By.xpath("//text[text()='"+s+" "+l+"']/parent::div/parent::td//following-sibling::td//div[@id='view-action']"));
		Library.Custom_click(ele5, "View booking request");
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_CONTROL);r.keyPress(KeyEvent.VK_R);r.keyRelease(KeyEvent.VK_R);r.keyRelease(KeyEvent.VK_CONTROL);
		
		WebElement ViewEditreaidng=driver.findElement(By.xpath("//button[text()=' Update Odometer Reading']"));Library.Custom_click(ViewEditreaidng, "Update Odometer Readings");
		Thread.sleep(2000);
		WebElement endreading=driver.findElement(By.xpath("//input[@placeholder='Update Reading']"));	Library.custom_sendkeys(endreading, config.getend_km_reading(), "End ride km reading");
		Thread.sleep(1000);
		WebElement ele15=driver.findElement(By.xpath("//button[text()='Update Reading']"));	Library.Custom_click(ele15, "Update Reading");
		WebElement closepopup=driver.findElement(By.xpath("//a[@id='closeModal2']"));	Library.Custom_click(closepopup, "Close Update Reading popup");
		
		Thread.sleep(2000);
		WebElement ele19=driver.findElement(By.xpath("//button[text()=' Complete Ride']"));
		Library.Custom_click(ele19, "Complete ride");
//		WebElement extracharge=driver.findElement(By.xpath("//button[text()='Add Extra Charges']"));library.Custom_click(extracharge, "add extra charges");
		WebElement Complete=driver.findElement(By.xpath("//input[@id='checkboxNoLabel']"));		Library.Custom_click(Complete, "Complete ride checkbox");
		Thread.sleep(2000);
		WebElement ele16=driver.findElement(By.xpath("//button[text()='Confirm & Complete Ride']"));Library.Custom_click(ele16, "Confirm and complete ride button");
		Thread.sleep(2000);
		
		Thread.sleep(3000);
		log.info("Ride  is sucessfully completed");
		driver.close();
	}
//===================================================================================================================================	
	//@Test(dependsOnMethods={"TC_0064_Admin_check_End_ride_request"})
	@Test(priority=14)
	public void TC_0065_Verify_user_Complete_ride_booking_status() throws Exception {
		log.info("***************TC_0065_Verify_user_Complete_ride_booking_status starts*****************");
		
		Thread.sleep(3000);
		Library.Custom_click(book.getClick_home_page_button(), "Home button");
		Thread.sleep(3000);
		Library.Custom_click(book.getClick_home_page_Bookings_button(), "Bookings button");
		Thread.sleep(3000);
		try {
		//	driver1.findElement(By.xpath("//android.widget.TextView[@text='View']")).click();
		}catch(Exception e) {}
		Thread.sleep(10000);
		BaseClass.scrollByText("Booking Status");
		Library.visible_link(book.getFBD_Booking_status(), "Booking status");
		Thread.sleep(2000);
		Library.visible_link(book.getFBD_booking_status_txt(), "Booking status = "+book.getFBD_booking_status_txt().getText());
	}
//====================================================================================================================================	
	//@Test(dependsOnMethods={"TC_0065_Verify_user_Complete_ride_booking_status"})
	@Test(priority=15)
	public void TC_0066_Verify_after_Complete_ride_invoice_button() throws Exception {
		log.info("***************TC_0066_Verify_after_Complete_ride_invoice_button starts*****************");
		
		Thread.sleep(2000);
		BaseClass.scrollByText("Invoice");
		Library.visible_link(book.getFBD_Invoice_button(), "Invoice Button");
	}
//===================================================================================================================================	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}