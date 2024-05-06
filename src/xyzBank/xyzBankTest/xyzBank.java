package xyzBank.xyzBankTest;

import io.cucumber.java.en.*;


public class xyzBank extends Parameter {
	@Given("Select one random user name to finish the login process")
	public void setup() {
		driver.manage().window().maximize();
		driver.get(URLlink);
	}

	@When("choose the right name and click on login button")
	public void login() throws InterruptedException {
		randomLogin();
	}// login


	@Then("User should navigate to account page")
	public void afterTest() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.close();
	}

}




//@Test(priority = 2)
//public void DepositProcess() throws InterruptedException {
//	deposit_process();
//}// DepositProcess
//
//@Test(priority = 3)
//public void withdrawalProcess() throws InterruptedException {
//	withdrawal_Process();
//}// withdrawalProcess
//
//@Test(priority = 4)
//public void AssertionPart() throws InterruptedException {
//	balance();
//}// AssertionPart
