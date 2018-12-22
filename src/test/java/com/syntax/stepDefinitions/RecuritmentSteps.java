package com.syntax.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.syntax.pages.LoginPage;
import com.syntax.pages.Recruitment;
import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.Constants;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RecuritmentSteps {

	Recruitment rec;
	
	@Given("^I logged into OrangeHRM$")
	public void i_logged_into_OrangeHRM() {
//	System.setProperty("webdriver.chrome.driver", "/Users/khan/Downloads/Selenium/src/Drivers/chromedriver");
//	WebDriver driver=new ChromeDriver();
//	driver.get("https://opensource-demo.orangehrmlive.com/");
		
		LoginPage login =new LoginPage();
        CommonMethods.enterValue(login.username, BaseClass.prop.getProperty("username"));
       CommonMethods.enterValue(login.password, BaseClass.prop.getProperty("password"));
       CommonMethods.click(login.btnLogin);
       
       
	    
	}

	@When("^I click Recruitment Module and click Candidates$")
	public void i_click_Recruitment_Module_and_click_Candidates() {
		 rec = new Recruitment(); 
			CommonMethods.click(rec.Recruit);
			CommonMethods.click(rec.Candidates);
	}

	@When("^Click Add$")
	public void click_Add()  {
	 CommonMethods.click(rec.AddBtn);
	}

	@When("^Enter \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_and_and(String arg1, String arg2, String arg3) throws Throwable {
		  CommonMethods.enterValue(rec.FirstName, arg1);
		    CommonMethods.enterValue(rec.MiddleName, arg2);
		    CommonMethods.enterValue(rec.LastName, arg3);
	}

	@When("^Enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_and(String arg1, String arg2)  {
		CommonMethods.enterValue(rec.Email, arg1);
		CommonMethods.enterValue(rec.ContactNo, 12345678);
		
	    
	}

	@Then("^I see Job Vacancy is displayed$")
	public void i_see_Job_Vacancy_is_displayed() {
	    
	}

	@Then("^I enter user \"([^\"]*)\" and greeting \"([^\"]*)\"$")
	public void i_enter_user_and_greeting(String arg1, String arg2) throws Throwable{
	CommonMethods.enterValue(rec.Keyword, arg1);
	CommonMethods.enterValue(rec.Comment, arg2);
	}

	@Then("^I select \"([^\"]*)\"$")
	public void i_select(String arg1) throws Throwable {
	 CommonMethods.enterValue(rec.Calender, arg1);
	    
	}

	@Then("^I click Save$")
	public void i_click_Save()  {
		CommonMethods.click(rec.save);	   
	}
	

	@When("^I Select All from Job Title$")
	public void i_Select_All_from_Job_Title() throws Throwable {
       CommonMethods.DropDown(rec.JobTitle, "All");
	}

	@When("^I Select All from Vacancy$")
	public void i_Select_All_from_Vacancy() throws Throwable {
	    CommonMethods.DropDown(rec.Vacancy, "All");
	}

	@When("^I Select All from the Hiring Manager$")
	public void i_Select_All_from_the_Hiring_Manager() throws Throwable {
	    CommonMethods.DropDown(rec.HiringManager, "All");
	}

	@When("^I Select All from Status$")
	public void i_Select_All_from_Status() { 
	   CommonMethods.DropDown(rec.Status, "All");
	}

	@When("^I Enter \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_Enter_and_and(String arg1, String arg2, String arg3) throws Throwable {
	       
	}

	@When("^I Enter date \"([^\"]*)\"$")
	public void i_Enter_date(String arg1) {
	    
	}

	@When("^Select Methods of Application to Manual$")
	public void select_Methods_of_Application_to_Manual() {
	    CommonMethods.DropDown(rec.MethodofApplican, "Manual");
	}

	@When("^Click Search$")
	public void click_Search() throws Throwable {
		CommonMethods.click(rec.Search);	
	}

	@Then("^I see Candidate is present$")
	public void i_see_Candidate_is_present() throws Throwable {
	   
	}



	@Then("^I see Candidate appears in Candidates History$")
	public void i_see_Candidate_appears_in_Candidates_History()  {

	}
	


}