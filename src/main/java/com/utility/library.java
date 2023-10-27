package com.utility;



import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.google.common.collect.ImmutableMap;
import com.page_object.booking_page;

import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
@Listeners(com.utility.listner.class)

public class library extends base_class{
	public static WebDriver driver;
	public static ExtentTest test;
	public static WebDriverWait wait;
	public static booking_page book;
	static listner listner = new listner();
	
//	public library(AndroidDriver driver1) {
//		library.driver1=driver1;
//		
//	}
	
	
	

//////////////////////////////////////////////////////////////////////////////////////////////////////	
		public static void custom_sendkeys(WebElement element,String value,String fieldname ) {
			
//			boolean ans =element.isDisplayed() || element.isEnabled();
//			Assert.assertTrue(ans);
			try {
				wait = new WebDriverWait(driver1, Duration.ofSeconds(10));
				wait.until(ExpectedConditions.elementToBeClickable(element));
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
				wait = new WebDriverWait(driver1, Duration.ofSeconds(10));
				wait.until(ExpectedConditions.visibilityOfAllElements(element));
				
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
				wait = new WebDriverWait(driver1, Duration.ofSeconds(10));
				wait.until(ExpectedConditions.visibilityOfAllElements(element));
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
				if(element.isEnabled() || element.isDisplayed()==true) {
					wait = new WebDriverWait(driver1, Duration.ofSeconds(10));
					wait.until(ExpectedConditions.elementToBeClickable(element));
					
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
	//////////////////////////////////////////////////////////////////////////////////////////////////////
	    public static void Swipe_page_Action(WebElement element,String direction,String fieldname) {
	    	try {
				if(element.isEnabled() && element.isDisplayed()==true) {
	    	((JavascriptExecutor)driver1).executeScript("mobile: swipeGesture", 
	    			ImmutableMap.of("elementId",((RemoteWebElement)element).getId(),"direction",direction,"percent",1));
	    	//direction ( left , right , up , down) & increase percentage you want
	    	test.log(Status.PASS, fieldname+ "Successfully swipe Action=="+ direction);
					log.info("OK==Successfully swipe Action "+fieldname);
					}
	    		}
	    	catch(Exception e) {
				test.log(Status.FAIL,fieldname+ "Unable To swipe Action =="+e);
				log.error("==NOT==Unable To swipe Action  "+fieldname);
				listner.onTestFailure(null);
				}
	    }
	    


	  ///////////////////////////////////////////Explicit Wait //////////////////////////////////////////////////////////////  	
	    public static void Explicit_wait_for_element(WebElement element) {
	    	
	    	WebDriverWait wait1=new WebDriverWait(driver1,Duration.ofSeconds(20));
	    	wait.until(ExpectedConditions.visibilityOf(element));
	    }
	  
	  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	    public static void bike_book_page(WebElement Bike,String fieldname) {
	    //	booking_page book = PageFactory.initElements(driver1, booking_page.class);
	    	try {
				if(Bike.isEnabled() || Bike.isDisplayed() ==true) {
					String a=Bike.getText();
								if(a.equalsIgnoreCase("Book Now")) {
								Bike.click();
						
								test.log(Status.PASS , a+"==Bike is available & Selected =="+fieldname);
								log.info("OK==Bike is available & Selected  "+fieldname);
							}
					}
	    	}
		catch(Exception e) {
				test.log(Status.FAIL,fieldname+ "==Bike is  not available & Selected=="+e);
				log.error("==NOT==Bike is not available & Selected "+fieldname);
		//		listner.onTestFailure(null);
				}
	    }
//==============================================================================================================================
	    @SuppressWarnings("deprecation")
		public static void tapactionUsingXY(WebElement ele ,int x , int y,String fieldname) {
	    try {
	    	if(ele.isEnabled() || ele.isDisplayed()==true) {
	    		AndroidTouchAction action=new AndroidTouchAction(driver1);
				action.tap(TapOptions.tapOptions().withPosition(ElementOption.point(x,y))).perform();
//				test.log(Status.PASS , ele+"== Successfully Tap =="+fieldname);
				log.info("OK==Successfully Tap  "+fieldname);
	    		}	    	
	    	}catch(Exception e) {
//	    		test.log(Status.FAIL,fieldname+ "==Tap action failed=="+e);
	    		log.error("==NOT==Tap action failed "+fieldname);
	    		
	    		}
	    }
//=================================================================================================================================	    	
	    @SuppressWarnings("deprecation")
		public static void tapactionUsingElement(WebElement ele ,String fieldname) {
	    try {
	    	if(ele.isEnabled() || ele.isDisplayed()==true) {
	    		AndroidTouchAction action=new AndroidTouchAction(driver1);
				action.tap(TapOptions.tapOptions().withElement(ElementOption.element(ele))).perform();
				test.log(Status.PASS , ele+"== Successfully Tap =="+fieldname);
				log.info("OK==Successfully Tap  "+fieldname);
	    		}	    	
	    	}catch(Exception e) {
	    		test.log(Status.FAIL,fieldname+ "==Tap action failed=="+e);
	    		log.error("==NOT==Tap action failed "+fieldname);
	    		listner.onTestFailure(null);
	    		}
	    }
//==================================================================================================================================    	
	   
	    @SuppressWarnings("deprecation")
		public static void date_select() {
	    //	book = PageFactory.initElements(driver1, booking_page.class);
	    	book = new booking_page(driver1);
			library.Custom_click(book.getClick_calender_date(), "calender date select");
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
				library.Custom_click(book.getClick_calender_ok_button(), "calender ok button");
			}
			else {
				driver1.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Next month']")).click();
				WebElement ele=	driver1.findElement(By.xpath("//android.view.View[@text='"+nextdate+"']"));
				ele.click();
				library.Custom_click(book.getClick_calender_ok_button(), "calender ok button");
				
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
		try {	
		
			if(end_position.isDisplayed() || end_position.isEnabled() && Start_position.isDisplayed() || Start_position.isEnabled()==true) {
					
				Point location1=end_position.getLocation();
				Point location2=Start_position.getLocation();
				int end_x=location1.x;
				int end_y=location1.y;
				int start_x=location2.x;
				int start_y=location2.y;
				
				for(int i=0;i<=3;i++) {
					base_class.swipe_page_direction(start_x, start_y, end_x, end_y, "Page scroll");
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
				try {	
				
					if(end_position.isDisplayed() || end_position.isEnabled() && Start_position.isDisplayed() || Start_position.isEnabled()==true) {
							
						Point location1=end_position.getLocation();
						Point location2=Start_position.getLocation();
						int end_x=location1.x;
						int end_y=location1.y;
						int start_x=location2.x;
						int start_y=location2.y;
												
							base_class.swipe_page_direction(start_x, start_y, end_x, end_y, "Page scroll");
													
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
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    	
}
