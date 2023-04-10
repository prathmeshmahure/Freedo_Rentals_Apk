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
		
		library.Custom_click(book.getClick_selfi_tab_txt(), "Selfi tab txt");
		if(book.getKYC_selfi_radio_button().isSelected()==true) {
			library.isSelected(book.getKYC_selfi_radio_button(), "Selfi radio button is ");
			library.visible_link(book.getKYC_selfi_verified_txt(), "Selfi verified txt");
				if(book.getKYC_selfi_verified_txt().isDisplayed()) {
					library.passmsg("Selfi is = ", "Verified");
				}
		}else {
		library.passmsg("Selfi is = ", "Not Verified");
		library.visible_link(book.getClick_Take_selfi_camera(), "Take selfi camera");
		library.visible_link(book.getClick_upload_photo(), "Upload photo");
		library.visible_link(book.getClick_kyc_skip_button(), "Skip button");
		library.visible_link(book.getClick_kyc_next_button(), "Next button");
		}
		
		
	
		
		
		
		
		
		
		
		
		
		
		
	}
	


	
}
