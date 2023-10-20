package Store_class;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.page_object.booking_page;
import com.utility.base_class;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class appium_6 extends base_class{
	public booking_page book;
	
	
	@Test(enabled=true)
	public void date () {
		book = PageFactory.initElements(driver1, booking_page.class);
		
		Set<String>context=driver1.getContextHandles();
		for(String s:context) {
			System.out.println(s);//NATIVE_APP //WEBVIEW_chrome
		}
		driver1.context("WEBVIEW_chrome");
		appium_6.android_home("home");
		driver1.findElement(By.xpath("//android.widget.TextView[@text='Chrome']")).click();
		driver1.get("https://adminuat.freedo.rentals/");
		driver1.pressKey(new KeyEvent(AndroidKey.ENTER));
	}
	@Test(enabled=false)
	public void keyboardcheck () {
		book = PageFactory.initElements(driver1, booking_page.class);
		WebElement ele=driver1.findElement(By.xpath("//android.widget.RadioButton[@content-desc='radioBtn_Pickup']"));
		if(book.getClick_Continue_Tab().isEnabled()) {
			System.out.println("it is selected");
		}
		else {
			System.out.println("Not selected");
		}
		WebElement ele2=driver1.findElement(By.xpath("//android.widget.RadioButton[@content-desc='radioBtn_Home']"));
		if(book.getClick_Continue_Tab().isSelected()) {
			System.out.println("it is selected");
		}
		else {
			System.out.println("Not selected");
		}
	}
	
	
	
}
