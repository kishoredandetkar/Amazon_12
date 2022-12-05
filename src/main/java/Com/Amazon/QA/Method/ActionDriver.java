package Com.Amazon.QA.Method;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.MediaEntityBuilder;

import Com.Amazon.QA.Config.StartBrowser;

public class ActionDriver {
	WebDriver driver;
	
	public ActionDriver() {
		driver=StartBrowser.driver;
	}
	
	public void OpenApplication(String url) throws Exception{
		try {
		driver.get(url);
		StartBrowser.childTest.pass("Navigate To url", MediaEntityBuilder.createScreenCaptureFromBase64String(screenshot()).build());	
	}catch(Exception e) {
		StartBrowser.childTest.fail("Unable To Navigate To url");
		throw e;
		}
	}
	
	public void Click(By locator, String ele)throws Exception {
		try {
		driver.findElement(locator).click();
		StartBrowser.childTest.pass("Click on Button"+ele, MediaEntityBuilder.createScreenCaptureFromBase64String(screenshot()).build());
	}catch(Exception e) {
		StartBrowser.childTest.fail("Unable to Click on Button"+ele);
		throw e;
		}
	}
	public void type(By Locator, String TestData, String ele)throws Exception {
		try {
		driver.findElement(Locator).sendKeys(TestData);
		StartBrowser.childTest.pass("EnterValues with"+ele,MediaEntityBuilder.createScreenCaptureFromBase64String(screenshot()).build());
	}catch(Exception e) {
		StartBrowser.childTest.fail("Unable to Pass Valus with"+ele);
		throw e;
		}
	}
	
	public void scrolldown(String Value, String ele)throws Exception {
		try {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript(Value, ele);
		StartBrowser.childTest.pass("ScrollDown"+Value+"page"+ele,MediaEntityBuilder.createScreenCaptureFromBase64String(screenshot()).build());
	}catch(Exception e) {
		StartBrowser.childTest.fail("Unable to ScrollDown"+Value+"page"+ele);
		throw e;
		}
	}
	public void WebEle(By Locator, String ele)throws Exception {
		try {
		WebElement el=driver.findElement(Locator);
		el.click();
		StartBrowser.childTest.pass("CLick on Webelement Button"+ele, MediaEntityBuilder.createScreenCaptureFromBase64String(screenshot()).build());
	}catch(Exception e) {
		StartBrowser.childTest.fail("Unable to Click on WebElement Button"+ele);
		throw e;
		}
	}
	public void Listele(By Locator, String TestData, String ele)throws Exception {
		try {
		List<WebElement> el=driver.findElements(Locator);
		System.out.println(el.size());
		for(WebElement e:el) {
			System.out.println(e.getText());
		}
		for(int i=0; i<el.size(); i++) {
			String list=el.get(i).getText();
			if(list.contains(TestData)) {
				el.get(i).click();
				break;
			}
		}
		StartBrowser.childTest.pass("Verify List"+TestData+"with Enter Text"+ele,MediaEntityBuilder.createScreenCaptureFromBase64String(screenshot()).build());
	}catch(Exception e) {
		StartBrowser.childTest.fail("Unable to Verify List"+TestData+"With Enter Text"+ele);
		throw e;
		}
	}
	
	public void ListEle1(By Locator, String TestData, String ele)throws Exception {
		try {
		List<WebElement> el=driver.findElements(Locator);
		System.out.println(el.size());
		for(int j=0; j<=el.size(); j++) {
			String list=el.get(j).getText();
			if(list.contains(TestData)) {
				el.get(j).click();
				break;
			}
		}
		StartBrowser.childTest.pass("Select List Text"+TestData+"with"+ele, MediaEntityBuilder.createScreenCaptureFromBase64String(screenshot()).build());
	}catch(Exception e) {
		StartBrowser.childTest.fail("Unable to List Select Text"+TestData+"with"+ele);
		throw e;
		}
	}
	
	public void ListEle2(By locator, String  ele)throws Exception {
		try {
		List<WebElement> el=driver.findElements(locator);
		System.out.println(el.size());
		for(int k=0; k<el.size();k++) {
			String e=el.get(k).getText();
			System.out.println(e);
			StartBrowser.childTest.pass("Click on List WebElement"+ele,MediaEntityBuilder.createScreenCaptureFromBase64String(screenshot()).build());
		}
		
	}catch(Exception e) {
		StartBrowser.childTest.fail("Unableto Click on List WebElement"+ele);
		throw e;
		}
	}
	public void scrollByVisableELement(By Locator,String TestData,String ele)throws Exception {
		try {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			WebElement scroll=driver.findElement(Locator);
			js.executeScript(TestData, scroll);
			StartBrowser.childTest.pass("Scroll Down to Visable ELement"+TestData+"With"+ele, MediaEntityBuilder.createScreenCaptureFromBase64String(screenshot()).build());
		}catch(Exception e) {
			StartBrowser.childTest.fail("Unable to scroll down To Visable Element"+TestData+"with"+ele);
			throw e;
		}
	}
	
	public String screenshot() {
		return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
	}

}
