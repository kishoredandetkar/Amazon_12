package Com.Amazon.QA.Business;

import org.openqa.selenium.WebDriver;

import Com.Amazon.QA.Config.StartBrowser;
import Com.Amazon.QA.Locators.Homepage;
import Com.Amazon.QA.Locators.Loginpage;
import Com.Amazon.QA.Method.ActionDriver;

public class BusinessFunction {
	WebDriver driver;
	ActionDriver adriver;
	
	public BusinessFunction() {
	  driver=StartBrowser.driver;
	  adriver=new ActionDriver();
	}
    
	public void Login() throws Exception{
	StartBrowser.childTest=StartBrowser.parentTest.createNode("Navigate to Google");
	adriver.OpenApplication(Homepage.url1);
	}
	
	public void Search()throws Exception {
		StartBrowser.childTest=StartBrowser.parentTest.createNode("Search Amazon");
		adriver.type(Homepage.amazon1, Loginpage.amazon, "Google Search Amazon");
		Thread.sleep(3000);
		adriver.Listele(Homepage.List, Loginpage.amazon2, "Click on Amazon");
		Thread.sleep(3000);
		adriver.Click(Loginpage.AmazonLink, "Click on Amazon Link");
		Thread.sleep(3000);	
	}
	
	public void Amazon()throws Exception{
		StartBrowser.childTest=StartBrowser.parentTest.createNode("Navigate to Amazon and Search Dell Computers");
		adriver.WebEle(Loginpage.all,"Click On All Button");
		Thread.sleep(3000);
		adriver.WebEle(Loginpage.Electronis, "Click On Electronics");
		Thread.sleep(3000);
		adriver.type(Loginpage.AmazonSearch, Loginpage.AmazonSeachKey, "Search Dell Computers");
		Thread.sleep(3000);
		adriver.Click(Loginpage.ClickonSrarch, "Click on Search Button");
		Thread.sleep(3000);
	}
	
	public void MintoMaxRange()throws Exception {
		StartBrowser.childTest=StartBrowser.parentTest.createNode("Minimum to maximam range of price");
		adriver.scrolldown(Homepage.scrolldown, "Scroll dwon Range");
		Thread.sleep(3000);
		adriver.type(Homepage.minimump, Loginpage.Lowprice, "Enter 30,000 Amount Range");
		Thread.sleep(3000);
		adriver.type(Homepage.maximum, Loginpage.highprice, "Enter 50,000 Amount Range");
		Thread.sleep(3000);
		adriver.Click(Loginpage.go, "Click on Go Button");
		Thread.sleep(3000);
	}
	public void Starts()throws Exception{
		StartBrowser.childTest=StartBrowser.parentTest.createNode("Dell Computer 5 out of 5 Stars");
		adriver.ListEle2(Loginpage.stars, "Count Starts 1st Page");
		adriver.scrolldown(Homepage.scroll1, "Scroll down 2nd Page");
		adriver.Click(Loginpage.page2, "Click on 2nd Page");
		adriver.ListEle2(Loginpage.page2Stars, "Count 5 out of 5 stars");
	}
}
