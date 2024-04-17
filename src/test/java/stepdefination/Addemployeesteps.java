package stepdefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




public class Addemployeesteps {
	WebDriver driver;
	String Expected;
	String Actual;
	@Given("^User navigates to url as\"([^\"]*)\" in a browser$")
	public void launchurl(String url) throws Throwable {
	driver = new ChromeDriver();
	driver.manage().window().maximize();driver.get(url);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("^User login by entering username as \"([^\"]*)\"$")
	public void enterusername(String user) throws Throwable {
	  driver.findElement(By.name("txtUsername")).sendKeys(user);  
	}

	@When("^Usr login by entering password as \"([^\"]*)\"$")
	public void enterpassword(String pass) throws Throwable {
	driver.findElement(By.name("txtPassword")).sendKeys(pass);    
	}

	@When("^click on login button$")
	public void click_on_login_button() throws Throwable {
	   driver.findElement(By.name("Submit")).click();
	}

	@Then("^user should login successfully$")
	public void user_should_login_successfully() throws Throwable {
	    String Expected = "dashboard";
	    String Actual = driver.getCurrentUrl();
	    if (Actual.contains(Expected)) 
	    {
			System.out.println("Logedin Successfully::"+Expected+"  "+Actual);
		}
	    else 
	    {
	    	System.out.println("Login failed::"+Expected+"  "+Actual);
		}
	}

	@When("^user clicks PIM$")
	public void user_clicks_PIM() throws Throwable {
	   driver.findElement(By.xpath("//b[normalize-space()='PIM']")).click();
	   Thread.sleep(1000);
	}

	@When("^user clicks Add button$")
	public void user_clicks_Add_button() throws Throwable {
		  driver.findElement(By.xpath("//input[@name='btnAdd']")).click();
	}

	@When("^user enters \"([^\"]*)\" in fname$")
	public void enterfname(String Firstname) throws Throwable {
		  driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(Firstname); 
	}

	@When("^user enters \"([^\"]*)\" in mnme$")
	public void entermname(String Middlename) throws Throwable {
		 driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys(Middlename); 
	}

	@When("^user enters \"([^\"]*)\" in lname$")
	public void enterlname(String Lastname) throws Throwable {
		 driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(Lastname); 
	}

	@When("^capture Eid Before Adding$")
	public void capture_Eid_Before_Adding() throws Throwable {
	  Expected = driver.findElement(By.name("employeeId")).getAttribute("value");
	}

	@When("^user click on Save button$")
	public void user_click_on_Save_button() throws Throwable {
	   driver.findElement(By.xpath("//input[@value='Save']")).click();
	}

	@When("^capture Eid after adding$")
	public void capture_Eid_after_adding() throws Throwable {
	    Actual = driver.findElement(By.name("personal[txtEmployeeId]")).getAttribute("value");
	}

	@Then("^user validates Eid$")
	public void user_validates_Eid() throws Throwable {
	   if (Expected.equals(Actual))
	   {
		System.out.println("Employee added suceesfully"+Expected+" "+Actual);
	   } 
	   else
	   {
	    System.out.println("Add Employee Failed"+Expected+" "+Actual);
	   }
	   }

	@Then("^user close browser$")
	public void user_close_browser() throws Throwable {
	   driver.quit();
	}


}
