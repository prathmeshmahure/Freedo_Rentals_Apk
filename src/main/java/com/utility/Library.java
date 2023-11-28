package com.utility;



import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.pageobject.BookingPage;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
@Listeners(com.utility.listner.class)

public class Library extends BaseClass{
	public static WebDriver driver;
	public static ExtentTest test;
	public static WebDriverWait wait;
	public static BookingPage book;
//	public static AndroidDriver driver1 ;
	static listner listner = new listner();
	
//	public library(AndroidDriver driver1) {
//		library.driver1=driver1;
//		
//	}
	
	
	

//////////////////////////////////////////////////////////////////////////////////////////////////////	
		public static void custom_sendkeys(WebElement element,String value,String fieldname ) {
			try {
				waitForVisibilityOf( element);
					if(element.isEnabled() || element.isDisplayed()==true) {		
						element.click();
						element.sendKeys(value);					
					test.log(Status.PASS, fieldname+ "==value send successfully=="+value );
					log.info("OK==Value send successfully "+fieldname);
					}
			}
			catch(Exception e) {
					test.log(Status.FAIL, fieldname+"== Unable To Send  Value=="+e);
					log.error("==Not==Value not send "+fieldname);					
					listner.onTestFailure(null);
			}
		}
	/////////////////////////////////////////////////////////////////////////////////////////////////
		public static void Custom_click(WebElement element,String fieldname) {
			try {	
				waitForVisibilityOf( element);				
					if(element.isDisplayed() || element.isEnabled()==true) {						
						element.click();						
					test.log(Status.PASS, "Successfully click=="+ fieldname);
					log.info("OK==Element is clickable "+fieldname);
					}
				}
			catch(Exception e) {
					test.log(Status.FAIL,fieldname+ "==Unable To Click =="+e);
					log.error("==Not==Element is not clickable "+fieldname);					
					listner.onTestFailure(null);
								}
		}
/////////////////////////////////////////////////////////////////////////////////////////////////
		public static void waitAndClick(WebElement element,String fieldname , long MiliSeconds) {
			try {	
				Thread.sleep(MiliSeconds);
				waitForVisibilityOf( element);				
				if(element.isDisplayed() || element.isEnabled()==true) {						
				element.click();						
				test.log(Status.PASS, "Successfully click=="+ fieldname);
				log.info("OK==Element is clickable "+fieldname);
				}
				}
				catch(Exception e) {
				test.log(Status.FAIL,fieldname+ "==Unable To Click =="+e);
				log.error("==Not==Element is not clickable "+fieldname);					
				listner.onTestFailure(null);
				}
		}
	////////////////////////////////////////////////////////////////////////////////////////////////	
		public static void visible_link(WebElement element,String fieldname) {
			try {
				waitForVisibilityOf( element);
				if(element.isEnabled() || element.isDisplayed()==true) { 
					
				test.log(Status.PASS , "Field is visible =="+fieldname);
				log.info("OK==Field is visible  "+fieldname);
				}
		}
		catch(Exception e) {
				test.log(Status.FAIL,fieldname+ "==Field is not visible=="+e);
					log.error("==NOT==Field is not visible "+fieldname);
					listner.onTestFailure(null);
		}
		}
	//////////////////////////////////////////////////////////////////////////////////////////////////////   
		public static void visible_link_gettext(WebElement element,String fieldname) {
			try {
				waitForVisibilityOf( element);
				if(element.isEnabled() || element.isDisplayed()==true) {
					
					String text=element.getText();
				
				test.log(Status.PASS , "==Field is visible =="+fieldname+""+text);
				log.info("OK==Field is visible  "+fieldname+""+text);
				}
		}
		catch(Exception e) {
				test.log(Status.FAIL,fieldname+ "==Field is not visible=="+e);
					log.error("==NOT==Field is not visible "+fieldname);
					listner.onTestFailure(null);
		}
		}


//==================================================================================================================================    	
	   
	    @SuppressWarnings("deprecation")
		public static void date_select() {
	    	book = new BookingPage(driver1);
			Library.Custom_click(book.getClick_calender_date(), "calender date select");
		Date d=new Date();
		int  da=d.getDate();
		int m=Integer.parseInt(config.getdate());
		int date=da+m;
		
		List<WebElement> lastday=driver1.findElements(By.xpath("//android.view.View[@text='22']/parent::android.view.View//following-sibling::android.view.View"));
		int totaldays=lastday.size();
		
		int i=date;
		int nextdate=i-totaldays;
			if(i<=totaldays) {
				WebElement ele=	driver1.findElement(By.xpath("//android.view.View[@text='"+i+"']"));
				ele.click();
				Library.Custom_click(book.getClick_calender_ok_button(), "calender ok button");
			}
			else {
				driver1.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Next month']")).click();
				WebElement ele=	driver1.findElement(By.xpath("//android.view.View[@text='"+nextdate+"']"));
				ele.click();
				Library.Custom_click(book.getClick_calender_ok_button(), "calender ok button");
				
			}
	    }
//===================================================================================================================================	    
	    public static void passmsg(String fieldname,String fieldname1) {
			try {
						test.log(Status.PASS,""+fieldname+" "+ fieldname1);
						log.info("OK=="+fieldname+""+fieldname1);
				}
			catch(Exception e) {
					test.log(Status.FAIL, fieldname1+"==Unable Action performed =="+e);
					log.error("==NOT=="+fieldname+""+fieldname1);
					listner.onTestFailure(null);
								}
		}
//=============================================================================================================================	    
	    public static void failmsg(String fieldname,String fieldname1) {
			try {		test.log(Status.FAIL, fieldname+""+fieldname1);
						log.error("==NOT=="+fieldname+""+fieldname1);
				//		listner.onTestFailure(null);
				}
			catch(Exception e) {
					test.log(Status.FAIL, fieldname+""+fieldname1+" "+e);
					log.error("==NOT=="+fieldname+""+fieldname1);
					listner.onTestFailure(null);
								}
		}
//================================================================================================================================	    
	    public static void isSelected(WebElement ele, String Element_name) {
			try {	
				waitForVisibilityOf( ele);
				if(ele.isSelected()==true) {
					test.log(Status.PASS, Element_name+"= Selected");
					log.info("OK=="+Element_name+"= Selected");
				   }
				
				}
			catch(Exception e) {
					test.log(Status.FAIL, Element_name+"= Not Selected"+" "+e);
					log.error("==NOT=="+Element_name+"=Not Selected");
					listner.onTestFailure(null);
					}
		}
//================================================================================================================================	    
	    public static void isSelectedFalse(WebElement ele, String Element_name) {
			try {	
				waitForVisibilityOf( ele);
				if(ele.isSelected()==false) {
					test.log(Status.PASS, Element_name+"= Not Selected");
					log.info("OK=="+Element_name+"= Not Selected");
				   }
				}
			catch(Exception e) {
					test.log(Status.FAIL, Element_name+"=  Selected"+" "+e);
					log.error("==NOT=="+Element_name+"= Selected");
					listner.onTestFailure(null);
					}
		}
//===============================================================================================================================	    
	    public static void isEnabled(WebElement ele, String Element_name) {
			try {	
				waitForVisibilityOf(ele);
				if(ele.isEnabled()==true) {
					test.log(Status.PASS, Element_name+"= Enabled");
					log.info("OK=="+Element_name+"= Enabled");
				   }
				
				
				}
			catch(Exception e) {
					test.log(Status.FAIL, Element_name+"= Not Enabled"+" "+e);
					log.error("==NOT=="+Element_name+"=Not Enabled");
					listner.onTestFailure(null);
					}
		}
//===============================================================================================================================	    
	    public static void isEnabledFalse(WebElement ele, String Element_name) {
			try {	
				waitForVisibilityOf( ele);
				if(ele.isEnabled()==false) {
					test.log(Status.PASS, Element_name+"= Disabled");
					log.info("OK=="+Element_name+"= Disabled");
				   }
				
				}
			catch(Exception e) {
					test.log(Status.FAIL, Element_name+"=  Enabled"+" "+e);
					log.error("==NOT=="+Element_name+"= Enabled");
					listner.onTestFailure(null);
					}
		}
//=================================================================================================================================	    
	    public static void isDisplayed(WebElement ele, String Element_name) {
			try {
				waitForVisibilityOf( ele);
				if(ele.isDisplayed()==true) {
					test.log(Status.PASS, Element_name+"= Displayed");
					log.info("OK=="+Element_name+"= Displayed");
				   }
				}
			catch(Exception e) {
					test.log(Status.FAIL, Element_name+"= Not Displayed"+" "+e);
					log.error("==NOT=="+Element_name+"= Not Displayed");
					listner.onTestFailure(null);
					}
		}
//=================================================================================================================================	   
	    public static void getTextEqualIgnorCase(WebElement ele, String Expected_value) {
			try {	
				waitForVisibilityOf( ele);
				String Actual_value =ele.getText();
				if(Actual_value.equalsIgnoreCase(Expected_value)) {
					test.log(Status.PASS, Expected_value +" Expected value is Match");
					log.info("OK=="+ Expected_value+ " Expected value is Match");
				   }
				}
			catch(Exception e) {
					test.log(Status.FAIL, Expected_value+" Expected value is not Match"+" "+e);
					log.error("==NOT=="+Expected_value +"Expected value is not Match");
					listner.onTestFailure(null);
					}
		}
//=================================================================================================================================
		public static void horizontal_scroll_image(WebElement end_position,WebElement Start_position ,String fieldname) {
		try {	waitForVisibilityOf( end_position);waitForVisibilityOf( Start_position);
		
			if(end_position.isDisplayed() || end_position.isEnabled() && Start_position.isDisplayed() || Start_position.isEnabled()==true) {
					
				Point location1=end_position.getLocation();
				Point location2=Start_position.getLocation();
				int end_x=location1.x;
				int end_y=location1.y;
				int start_x=location2.x;
				int start_y=location2.y;
				
				for(int i=0;i<=3;i++) {
					BaseClass.swipe_page_direction(start_x, start_y, end_x, end_y, "Page scroll");
					}
				
				test.log(Status.PASS, "Successfully Scroll=="+ fieldname);
				log.info("OK==Successfully Scroll "+fieldname);
				}
		}
		catch(Exception e) {
		test.log(Status.FAIL,fieldname+ "==Unable To Scroll =="+e);
		log.error("==Not==Unable To Scroll"+fieldname);		
		listner.onTestFailure(null);
		}
		} 
//=================================================================================================================================
		public static void Vertical_scroll_image(WebElement end_position,WebElement Start_position ,String fieldname) {
				try {	waitForVisibilityOf( end_position);waitForVisibilityOf( Start_position);
				
					if(end_position.isDisplayed() || end_position.isEnabled() && Start_position.isDisplayed() || Start_position.isEnabled()==true) {
							
						Point location1=end_position.getLocation();
						Point location2=Start_position.getLocation();
						int end_x=location1.x;
						int end_y=location1.y;
						int start_x=location2.x;
						int start_y=location2.y;
												
							BaseClass.swipe_page_direction(start_x, start_y, end_x, end_y, "Page scroll");
													
						//test.log(Status.PASS, "Successfully Scroll=="+ fieldname);
						log.info("OK==Successfully Scroll "+fieldname);
						}
				}
				catch(Exception e) {
			//	test.log(Status.FAIL,fieldname+ "==Unable To Scroll =="+e);
				log.error("==Not==Unable To Scroll"+fieldname);		
				listner.onTestFailure(null);
				}
				} 	    
	    
//=================================================================================================================================
		public static WebElement waitForVisibilityOf( WebElement element) {
			
			WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOf(element));
			return element;
		}

		public static WebElement waitForVisibilityOf( WebElement element, String LogMessge) {
			
			WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOf(element));
			return element;
		}

		public static WebElement waitShortTimeForVisibilityOf(WebDriver driver1, WebElement element, int MiliSeconds) throws Exception {
			Thread.sleep(MiliSeconds);
			WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOf(element));
			return element;
		}

		public static WebElement waitForElementToBeClickable( WebElement element) {
			WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(element));
			return element;
		}
		public static void back() {
			driver1.pressKey(new KeyEvent(AndroidKey.BACK));
		}

		public static void navigateBack() {
			driver1.navigate().back();
		}

		public static void refresh() {
			driver1.navigate().refresh();
		}

		public static void navigateForword() {
			driver1.navigate().forward();
		}
		
		public static void android_home(String fieldname) {
			try {driver1.pressKey(new KeyEvent(AndroidKey.HOME));
				log.info("OK==Successfully click Android home "+fieldname);	
				}
			catch(Exception e) {
				log.error("==NOT==Unable To Click Android home "+fieldname);
				}
				}
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////    
		public static void android_switch_app (String fieldname) 	{
			try {driver1.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
				log.info("OK==Successfully click Android switch_app "+fieldname);	
				}
			catch(Exception e) {
				log.error("==NOT==Unable To Click Android switch_app "+fieldname);
				}
				}		
	///////////////////////////////////////////Android keys //////////////////////////////////////////////////////////////  	
			    public static void EnterButton() {
			    	try {
			    	driver1.pressKey(new KeyEvent(AndroidKey.ENTER));
			    	}
			    	catch(Exception e) {
			    		
			    	}
			    	
			    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    	
}
