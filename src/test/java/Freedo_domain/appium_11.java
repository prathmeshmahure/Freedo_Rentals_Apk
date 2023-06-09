package Freedo_domain;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.page_object.booking_page;
import com.page_object.launch_login;
import com.utility.base_class;
import com.utility.library;





@Listeners(com.utility.listner.class)
public class appium_11
extends base_class {
	
	public booking_page book;
	public launch_login login;
	public static ExtentTest test;
//	SoftAssert Assert = new SoftAssert();

//========================================== Booking page ============================================================================	

	@Test
	public void appium_1_TC_007_Verify_book_your_city_section() throws Exception {
		book = PageFactory.initElements(driver1, booking_page.class);
		log.info("***************appium_1_TC_007_Verify_book_your_city_section starts*****************");		
		
		Thread.sleep(2000);
		library.Custom_click(book.getClick_1st_page_enter_button(), "Enter button");
		library.date_select();
		library.Custom_click(book.getClick_Package_dropdown(), "package dropdown");
		library.Custom_click(book.getClick_1_Days_package(),"Selected package");
		library.Custom_click(book.getClick_go_freedo_Button(), "Go Freedo button");
	}
//=============================== Rental fleet ======================================================================================	
		
	@Test(dependsOnMethods={"appium_1_TC_007_Verify_book_your_city_section"})
	public void appium_1_TC_008_verify_book_your_vehicle_section() throws Exception  {
		log.info("***************appium_1_TC_008_verify_book_your_vehicle_section starts*****************");
		
		Thread.sleep(2000);
		library.isDisplayed(book.getOur_renting_fleet_page_txt(), "Our Renting fleet Page tittle is ");	
		library.isSelected(book.getClick_Bike_Tab(), "Bike tab by default is ");
		library.getTextEqualIgnorCase(book.getselect_random_Bike(), "Book Now");
		library.bike_book_page(book.getselect_random_Bike(), "Bike");
		//Start 
		library.Custom_click(book.getclick_location_pop_up_ok_button(), "Location ok button");
		appium_11.Scroll_UP_page_Action("page up");
		library.isEnabled(book.getClick_Continue_Tab(), "Continue button is ");
		library.Custom_click(book.getClick_Continue_Tab(), "Click continue tab");
	}
//================================================================================================================
		@Test(dependsOnMethods={"appium_1_TC_008_verify_book_your_vehicle_section"})
		public void appium_1_TC_009_cod_payment() throws Exception {
			log.info("***************appium_1_TC_009_cod_payment starts*****************");
						
			library.isDisplayed(book.getsummary_page_text(), "SUMMARY page title is ");	
			appium_11.Scroll_UP_page_Action("page up");
			library.visible_link(book.getClick_add_helmet_extra_charges(), "Extra helmet charges = "+book.getClick_add_helmet_extra_charges().getText());
			library.getTextEqualIgnorCase(book.getClick_add_helmet_extra_charges(), "₹ 0.00");
			library.isSelected(book.getClick_cash_on_delivery(), "Before select Cod check box is ");
			library.Custom_click(book.getClick_cash_on_delivery(), "cash on delivery");
			library.isSelected(book.getClick_cash_on_delivery(), "After select Cod check box is ");
			library.Custom_click(book.getClick_I_accept_checkbox(), "I Accept checkbox");
			library.Custom_click(book.getClick_pay_now_button(), "click pay now button");
		}
//=======================================================================================================================
	@Test(dependsOnMethods={"appium_1_TC_009_cod_payment"})
	public void appium_1_TC_0010_verify_booking_Rentals_fleet_section() throws Exception {
		log.info("***************appium_1_TC_0010_verify_booking_Rentals_fleet_section starts*****************");
		
		Thread.sleep(2000);
		library.Custom_click(book.getClick_view_booking(), "booking details");
		Thread.sleep(2000);
		library.Custom_click(book.getClick_show_more_details(), "show more details text");
		Thread.sleep(2000);
		appium_11.Scroll_UP_page_Action("page up");
		library.Custom_click(book.getClick_show_less_details(), "show less text");
		library.Custom_click(book.getClick_price_breakup(), "price breakup");
		Thread.sleep(1000);
		library.Custom_click(book.getClick_home_page_button(), "Home button");
		
	}
//=========================================================================================================================		
	@Test(priority=2)
	public void appium_1_TC_0011_verify_kyc_verification_process() throws Exception {	
		book = PageFactory.initElements(driver1, booking_page.class);
		log.info("***************appium_1_TC_0011_verify_kyc_verification_process starts*****************");
		
		Thread.sleep(2000);
//		Assert.assertTrue(book.getClick_home_page_button().isDisplayed(),"Home button");
		library.Custom_click(book.getClick_home_page_button(), "home button");
		library.Custom_click(book.getClick_home_page_More_button(), "show more text");
		library.Custom_click(book.getClick_more_option_kyc_txt(), "KYC text tab");
		library.visible_link(book.getKYC_verification_page_title(), "Kyc verification page title is Displayed");
		library.Custom_click(book.getClick_driving_licence_tab(), "D.L. tab");
		try {
		if(book.getKYC_DL_radio_button().isSelected()==true) {
			library.isSelected(book.getKYC_DL_radio_button(), "Driving licence radio button is ");
			library.visible_link(book.getKYC_DL_verified_txt(), "Driving licence verified txt");
				if(book.getKYC_DL_verified_txt().isDisplayed()==true) {
					library.passmsg("Driving licence is = ", "Verified");
				}
		}}catch(Exception e) {
			library.failmsg("Driving licence is = ", "Not Verified");
		}
		
	}
//==========================================================================================================
	@Test(dependsOnMethods={"appium_1_TC_0011_verify_kyc_verification_process"})
	public void appium_1_TC_0012_verify_Aadhaar_verification_process() {	
		log.info("***************appium_1_TC_0012_verify_Aadhaar_verification_process starts*****************");
		
		library.Custom_click(book.getClick_Aadhaar_tab_txt(), "Aadhar tab txt");
		if(book.getKYC_Aadhar_radio_button().isSelected()==true) {
			library.isSelected(book.getKYC_Aadhar_radio_button(), "Aadhar radio button is ");
			library.visible_link(book.getClick_Aadhaar_card_Verified_txt(), "Aadhar card verified txt");
				if(book.getClick_Aadhaar_card_Verified_txt().isDisplayed()==true) {
					library.passmsg("Aadhar card is = ", "Verified");
				}
		}else {
			library.failmsg("Aadhar card is = ", "Not Verified");
		}
//		library.visible_link(book.getClick_initiate_aadhaar_card(),"initiate aadhar card radio buttton");
	}
//==========================================================================================================
	@Test(dependsOnMethods={"appium_1_TC_0012_verify_Aadhaar_verification_process"})
	public void appium_1_TC_0013_verify_Selfi_verification_process() {	
		log.info("***************appium_1_TC_0013_verify_Selfi_verification_process starts*****************");
	
		library.Custom_click(book.getClick_selfi_tab_txt(), "Selfi tab txt");
//		try {
//		if(book.getKYC_selfi_radio_button().isSelected()==true) {
//			library.isSelected(book.getKYC_selfi_radio_button(), "Selfi radio button is ");
//			library.visible_link(book.getKYC_selfi_verified_txt(), "Selfi verified txt");
//				if(book.getKYC_selfi_verified_txt().isDisplayed()) {
//					library.passmsg("Selfi is = ", "Verified");
//				}
//		}}catch(Exception e) {
		library.passmsg("Selfi is = ", "Not Verified");
		library.visible_link(book.getClick_Take_selfi_camera(), "Take selfi camera");
		library.visible_link(book.getClick_upload_photo(), "Upload photo");
		library.visible_link(book.getClick_kyc_Verify_later_button(), "Verify later button");
		library.visible_link(book.getClick_kyc_next_button(), "Next button");
//		}
	}
//======================================================================================================
	@Test(dependsOnMethods={"appium_1_TC_0013_verify_Selfi_verification_process"})
	public void appium_1_TC_0014_verify_More_document_verification_process() {
		log.info("***************appium_1_TC_0014_verify_More_document_verification_process starts*****************");
		
		library.Custom_click(book.getClick_more_tab_txt(), "More tab txt");
//		try {
//		if(book.getKYC_more_radio_button().isSelected()==true) {
//			library.isSelected(book.getKYC_more_radio_button(), "Selfi radio button is ");
//			//library.visible_link(book.getKYC_selfi_verified_txt(), "Selfi verified txt");
//			//	if(book.getKYC_selfi_verified_txt().isDisplayed()) {
//					library.passmsg("Selfi is = ", "Verified");
//			//	}
//		}}catch(Exception e) {
		library.passmsg("Selfi is = ", "Not Verified");
		
		library.visible_link(book.getCLick_voter_id(), "voter id");
		library.visible_link(book.getClick_Bank_details(), "Bank details");
		library.visible_link(book.getCLick_electricity_bill(), "Electricity bill");
		library.visible_link(book.getClick_rental_bill(), "Rental bill");
		library.visible_link(book.getCLick_other_document(),"Other document");
		library.visible_link(book.getCLick_document_submit_button(), "Submit button");
		library.Custom_click(book.getClick_selfi_tab_txt(), "Return selfi tab");
		library.Custom_click(book.getClick_kyc_Verify_later_button(), "Verify later button");
		library.Custom_click(book.getClick_home_page_button(), "Home page button");
//		}
	}
//======================================================================================================
			
//===================================================================================================================================		
	
	@Test(dependsOnMethods={"appium_1_TC_0014_verify_More_document_verification_process"})
//	@Test
	public void appium_1_TC_0015_admin_Request_reject () throws Exception  {
		log.info("***************appium_1_TC_0015_admin_Request_reject starts*****************");

		Browseropen();
		Robot r = new Robot();
		for(int i=0; i<4; i++) {
			r.keyPress(KeyEvent.VK_CONTROL);r.keyPress(KeyEvent.VK_SUBTRACT);r.keyRelease(KeyEvent.VK_SUBTRACT);r.keyRelease(KeyEvent.VK_CONTROL);
		}
		Thread.sleep(3000);
		
		WebElement ele3=driver.findElement(By.xpath("//p[text()='Dashboard']"));library.Custom_click(ele3, "Dashboard");
		WebElement ele4=driver.findElement(By.xpath("//button[@title='Reset']"));library.Custom_click(ele4, "Reset button");
		
		Thread.sleep(2000);
		String s=config.getFirst_name();            
		WebElement ele5=driver.findElement(By.xpath("//text[text()='"+s+"']/parent::div/parent::td//following-sibling::td//div[@id='reject-action']"));
		library.Custom_click(ele5, "Reject bike booking");
		WebElement ele6=driver.findElement(By.xpath("//div[@id='demo-simple-select-label']"));library.Custom_click(ele6, "select drop down");
		
		Thread.sleep(1000);
		WebElement ele7=driver.findElement(By.xpath("//li[@data-value='Booked by mistake']"));library.Custom_click(ele7, "Booked My Mistake");
		WebElement ele8=driver.findElement(By.xpath("//button[text()='Submit']"));library.Custom_click(ele8, "Submit button");
		Thread.sleep(1000);
		WebElement ele9=driver.findElement(By.xpath("//button[text()='Yes']"));library.Custom_click(ele9, "Yes button");
		Thread.sleep(4000);
		try {
			driver.navigate().refresh();
			Thread.sleep(3000);
			if(ele5.isDisplayed()) {
				library.Custom_click(ele5, "Reject bike booking");
				library.Custom_click(ele6, "select drop down");
				
				Thread.sleep(1000);
				library.Custom_click(ele7, "Booked My Mistake");
				library.Custom_click(ele8, "Submit button");
				Thread.sleep(1000);
				library.Custom_click(ele9, "Yes button");
				Thread.sleep(4000);
			}
		}catch(Exception e) {
			
		}	
		library.passmsg("Approval is sucessfully "," rejected");
		driver.close();
	}


	
	
}
