package xyzBank.xyzBankTest;
import io.cucumber.java.en.*;

public class Processes extends Parameter {

	@Given("Add random amount to Deposit process then withdraw the same random amount")
	public void setup() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(URLlink);
		randomLogin();
	}

	@When("use java concepts to add random amount")
	public void login() throws InterruptedException {
		deposit_process();
	}

	@And("use java concepts to withdraw the random amount")
	public void withdrawalProcess() throws InterruptedException {
	withdrawal_Process();
		}// withdrawalProcess

	@Then("the amount should added to the balance and the amount should decrease in the balance")
	public void afterTest() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.close();
	}

}

