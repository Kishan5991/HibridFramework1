package test_scripts;

import org.testng.annotations.Test;

import genaric_scripts.BaseTest;
import pom_scripts.FacebookScript;

public class FacebookRunner extends BaseTest{
	@Test
	public void run() {
		driver.get("https://www.facebook.com/");
		FacebookScript fb=new FacebookScript(driver);
		fb.unPass("kishanygj@gmail.com");
		fb.pwdPass("Kichu@95");
		fb.clickLogin();
	}

}
