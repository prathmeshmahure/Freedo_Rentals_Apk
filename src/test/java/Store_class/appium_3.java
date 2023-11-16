package Store_class;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageobject.BookingPage;
import com.utility.BaseClass;
import com.utility.Library;

import io.appium.java_client.android.AndroidTouchAction;

public class appium_3 extends BaseClass{
	public BookingPage book;
	@SuppressWarnings("deprecation")
	public AndroidTouchAction action;
//==================================================================================================================
	@SuppressWarnings("deprecation")
	@Test(priority=6)
	public void appium_3_TC_0024_verify_2_to_3_month_booking_with_valid_data() throws Exception {
		book = PageFactory.initElements(driver1, BookingPage.class);
		log.info("***************appium_3_TC_0024_verify_2_to_3_month_booking_with_valid_data starts*****************");
		
	//	Assert.assertTrue(book.getClick_1st_location_dropdown().isDisplayed());
		Library.Custom_click(book.getClick_home_page_button(), "home button");
		action=new AndroidTouchAction(driver1);
		Thread.sleep(5000);
	//	library.visible_link(book.getClick_1st_location_dropdown(), "1st location dropdown");
	//	library.Custom_click(book.getClick_1st_location_dropdown(), "1st lo");
	
		Library.Custom_click(book.getClick_Autonation_city(), "location Automation");
//		library.Custom_click(book.getClick_1st_Metro_Hospital_Sector_12(), "enter Area");
		Library.Custom_click(book.getClick_Package_dropdown(), "package dropdown");
		Library.Custom_click(book.getClick_90_Days_package(),"Selected package");
		Library.date_select();
	//	library.Custom_click(book.getClick_Book_now_Button(), "Book now button");
		
		Thread.sleep(2000);
		String s=book.getselect_random_Bike().getText();
		Assert.assertEquals(s,"Book Now");
		Library.bike_book_page(book.getselect_random_Bike(), "Bike");
		Thread.sleep(4000);
		appium_3.Scroll_UP_page_Action("page up");
			String b=book.gettxt_BKD_pickup_location().getText();
			if(b.equalsIgnoreCase("Select Pick Up Location")) {
				Library.Custom_click(book.gettxt_BKD_pickup_location(), "click pickup location ");
				driver1.findElement(By.xpath("(//android.widget.CheckedTextView)[2]")).click();
			}
		
//		driver1.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector())"+".scrollIntoView(text(\"Continue\"));"));
		Library.Custom_click(book.getClick_Continue_Tab(), "Click continue tab");
		
		String c=book.getsummary_page_text().getText();			
		Assert.assertEquals(c, "SUMMARY");
		appium_3.Scroll_UP_page_Action("page up");
//		driver1.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector())"+".scrollIntoView(text(\"Pay Now\"));"));
	}
//========================================================================================================================
	@Test(dependsOnMethods={"appium_3_TC_0024_verify_2_to_3_month_booking_with_valid_data"})
	public void appium_3_TC_0025_verify_3_to_2_month_booking_summary_page() throws Exception {
		log.info("***************appium_3_TC_0025_verify_3_to_2_month_booking_summary_page starts*****************");
		
		Library.Custom_click(book.getClick_add_helmet(), "helment added");
		Thread.sleep(2000);
		Library.visible_link(book.getClick_add_helmet_extra_charges(),"Extra helmet charges = "+book.getClick_add_helmet_extra_charges().getText());
//		library.Custom_click(book.getClick_cash_on_delivery(), "cash on delivery");
		Library.Custom_click(book.getClick_split_payment(),"select split payment");
		Library.Custom_click(book.getClick_notification_close_button(), "Alert close button");
			if(book.getClick_split_payment().isSelected()==true) {
				Library.passmsg("Split payment checkbox is = ", "Selected");
			}else {
				Library.failmsg("Split payment checkbox is = ", "NOT Selected");
			}
	}
//=======================================================================================================================
	@Test(dependsOnMethods={"appium_3_TC_0025_verify_3_to_2_month_booking_summary_page"})
	public void appium_3_TC_0026_verify_booking_payment_through_split() throws Exception {
		log.info("***************appium_3_TC_0026_verify_booking_payment_through_split starts*****************");
		
	
		Library.Custom_click(book.getClick_SUmmary_page_Continue_Tab(), "click continue button");
		Thread.sleep(2000);
		Library.Custom_click(book.getClick_split_payment_i_agree_check_box(), "click i agrre check box split payment");
				if(book.getClick_split_payment_i_agree_check_box().isSelected()==true) {
					Library.passmsg("I agree to Split payment checkbox is = ", "Selected");
				}else {
					Library.failmsg("I agree to Split payment checkbox is = ", "NOT Selected");
				}
		Library.Custom_click(book.getClick_split_make_payment_button(), "make payment button");
		Thread.sleep(4000);
		Library.Custom_click(book.getClick_Pay_using_Netbanking(), "select netbanking option");
		Library.Custom_click(book.getClick_Pay_using_SBI_bank(),"select bank ");
		Library.Custom_click(book.getClick_pay_now_button_sbi(), "pay now button");	
		String g=book.getClick_payment_successful().getText();
		Assert.assertEquals(g, "Success");
		Library.Custom_click(book.getClick_payment_successful(), "payment successful");
		Library.Custom_click(book.getClick_view_booking(), "booking details");
		Thread.sleep(3000);
		
		Library.Custom_click(book.getClick_show_more_details(), "show more details text");
		Thread.sleep(3000);
		appium_3.Scroll_UP_page_Action("page up");
		Library.Custom_click(book.getClick_show_less_details(), "show less text");
		Library.Custom_click(book.getClick_price_breakup(), "price breakp");
		Library.Custom_click(book.getClick_home_page_button(),"home button");
	}
//====================================================================================================================	
	
//===================================================================================================================
	
	@SuppressWarnings("deprecation")
	@Test(dependsOnMethods={"appium_3_TC_0026_verify_booking_payment_through_split"})
//	@Test
	public void appium_3_TC_0027_Admin_approved_request () throws Exception {
		log.info("***************appium_3_TC_0027_Admin_approved_request starts*****************");
		
		Browseropen();
		Robot r = new Robot();
		for(int i=0; i<4; i++) {
			r.keyPress(KeyEvent.VK_CONTROL);r.keyPress(KeyEvent.VK_SUBTRACT);r.keyRelease(KeyEvent.VK_SUBTRACT);r.keyRelease(KeyEvent.VK_CONTROL);
		}
		Thread.sleep(3000);
		
		WebElement ele3=driver.findElement(By.xpath("//p[text()='Dashboard']"));Library.Custom_click(ele3, "Dashboard");
		WebElement ele4=driver.findElement(By.xpath("//button[@title='Reset']"));Library.Custom_click(ele4, "Reset button");
		Thread.sleep(3000);
		String s=config.getFirst_name();//user name to find web table
		WebElement ele5=driver.findElement(By.xpath("//text[text()='"+s+"']/parent::div/parent::td//following-sibling::td//div[@id='approve-action']"));
		Library.Custom_click(ele5, "accept booking request");
		Thread.sleep(1000);
		WebElement ele6=driver.findElement(By.xpath("//button[text()='Yes']"));Library.Custom_click(ele6, "Yes button");
		
		WebElement biketext=driver.findElement(By.xpath("//text[contains(text(),\"Prathmesh\")]/parent::div/parent::td//following-sibling::td[2]"));
		String b1=biketext.getText();
				try {
				if(ele5.isDisplayed()) {
					
					Library.Custom_click(ele5, "accept booking request");
					Thread.sleep(1000);
					Library.Custom_click(ele6, "Yes button");
				}}catch(Exception e) {
					Library.passmsg("Admin request ", "Accepted");
				}
		
		
		Thread.sleep(2000);
		WebElement ele7=driver.findElement(By.xpath("//text[text()='"+s+"']/parent::div/parent::td//following-sibling::td//div[@id='view-action']"));
		Library.Custom_click(ele7, "view data");
		Thread.sleep(3000);
		WebElement ele8=driver.findElement(By.xpath("//p[text()='Booking Management']"));Library.Custom_click(ele8, "Booking management");
		
		WebElement ele9=driver.findElement(By.xpath("//input[@placeholder='Search User' or @value='prathmesh']"));	Library.custom_sendkeys(ele9, config.getFirst_name(), "Search user name");
		Thread.sleep(3000);
		///////////////////////////////////////////////// calender
		
		
		WebElement calendar=driver.findElement(By.xpath("(//*[@data-testid='CalendarIcon'])[2]"));		Library.Custom_click(calendar, "calender click");
		
		Date d=new Date();
		int  da=d.getDate();
		int m=Integer.parseInt(config.getdate());
		int date=da+m;
		
		List<WebElement> lastday=driver.findElements(By.xpath("//div[@role][4]/parent::div/parent::div/parent::div//following-sibling::div//button"));
		int totaldays=lastday.size();
		int i=date;
		int nextdate=i-totaldays;
			if(i<=totaldays) {
				WebElement dateselect=driver.findElement(By.xpath("(//button[normalize-space()="+i+"])[1]"));
				Library.Custom_click(dateselect, "Select date");
			}else {
				driver.findElement(By.xpath("//button[@title='Next month']")).click();
				WebElement dateselect=driver.findElement(By.xpath("(//button[normalize-space()="+nextdate+"])[1]"));
				Library.Custom_click(dateselect, "Select date");
			}
		
				
		///////////////////////////////////////////////////////////
		WebElement ele10=driver.findElement(By.xpath("//h5[text()='Upcoming']"));Library.Custom_click(ele10, "Upcoming button");
		
		Thread.sleep(1000);
		WebElement ele11=driver.findElement(By.xpath("//text[contains(text(),"+s+")]/parent::td//following-sibling::td//div[@id='view-action']"));
		Library.Custom_click(ele11, "table search user request view action");
		
		WebElement ele12=driver.findElement(By.xpath("//*[text()='Control Buttons']"));Library.Custom_click(ele12, "Control button");
		WebElement ele13=driver.findElement(By.xpath("//button[text()='Start Ride']"));Library.Custom_click(ele13, "Start ride");
		WebElement ele14=driver.findElement(By.xpath("//input[@value='0']"));Library.custom_sendkeys(ele14, config.getstart_km_reading(), "enter bike reading");
		
		WebElement ele15=driver.findElement(By.xpath("//button[text()='Submit']"));	Library.Custom_click(ele15, "Submit button");
		WebElement ele16=driver.findElement(By.xpath("//button[text()='Yes']"));Library.Custom_click(ele16, "Yes button");
		
		
		
		
		
		
		
		
		
//		try {
//			WebElement alert=driver.findElement(By.xpath("//div[contains(text(),'Vehicle is already engaged for booking number')]"));
//			if(alert.isDisplayed()) {
//				driver.findElement(By.xpath("//*[text()='Control Buttons']")).click();
//				driver.findElement(By.xpath("//button[text()='Upgrade Vehicle']")).click();
//				driver.findElement(By.xpath("//em[text()='Available Vehicles']")).click();
//				String bike=b1;
//				driver.findElement(By.xpath("//li[@data-value="+bike+"]")).click();
//				driver.findElement(By.xpath("//em[text()='Vehicle Licenses']")).click();
//				driver.findElement(By.xpath("(//li[@data-value])[2]")).click();
//				driver.findElement(By.xpath("//button[text()='Request Upgrade']")).click();
//				driver.findElement(By.xpath("//button[text()='Submit']")).click();
//			}
//		}catch(Exception e) {
//			
//		}
//		
		Thread.sleep(3000);
		log.info("Approval is sucessfully Accepted");
		driver.close();
	}
//=========================================	
	
	
	
		
	
	
}
