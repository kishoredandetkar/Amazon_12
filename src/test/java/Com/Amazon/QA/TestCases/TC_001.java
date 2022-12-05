package Com.Amazon.QA.TestCases;

import org.testng.annotations.Test;

import Com.Amazon.QA.Business.BusinessFunction;
import Com.Amazon.QA.Config.StartBrowser;

public class TC_001 extends StartBrowser{
	@Test
	public void tc_001()throws Exception {
		BusinessFunction b=new BusinessFunction();
		b.Login();
		Thread.sleep(3000);
		b.Search();
		Thread.sleep(3000);
		b.Amazon();
		Thread.sleep(3000);
		b.MintoMaxRange();
		Thread.sleep(3000);
		b.Starts();
		Thread.sleep(3000);
	}

}
