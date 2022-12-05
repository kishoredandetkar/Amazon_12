package Com.Amazon.QA.Locators;

import org.openqa.selenium.By;

public class Loginpage {
	public static String amazon="amazon";
	public static String amazon2="amazon";
	//public static By AmazonLink=By.xpath("(//cite[@role='text'])[1]");
	public static By AmazonLink=By.xpath("(//h3[normalize-space()='Amazon.in'])[1]");
	public static By all=By.xpath("//div[@id='nav-search-dropdown-card']");
	public static By Electronis=By.xpath("(//option[contains(text(), 'Electronics')])[1]");
	public static By AmazonSearch=By.id("twotabsearchtextbox");
	public static String AmazonSeachKey="dell computers";
	public static By ClickonSrarch=By.id("nav-search-submit-button");
	public static String Lowprice="30000";
	public static String highprice="50000";
	public static By go=By.xpath("(//input[@class='a-button-input'])[1]");
	public static By stars=By.xpath("//span[@aria-label='5.0 out of 5 stars']");
	public static By page2=By.xpath("//a[@aria-label='Go to page 2']");
	public static By page2Stars=By.xpath("//span[@aria-label='5.0 out of 5 stars']");

}
