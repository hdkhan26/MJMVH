package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;

public class Recruitment extends BaseClass {

	
	@FindBy(xpath="//img[contains(@src,'logo')]")
	public WebElement logo;
	
	@FindBy(id="txtUsername")
	public WebElement username;
	
	@FindBy(id="txtPassword")
	public WebElement password;
	
	@FindBy(linkText="Recruitment")
	public WebElement Recruit;
	
	@FindBy(xpath="//a[@id='menu_recruitment_viewCandidates']")
	public WebElement Candidates;
	
	@FindBy(id="menu_recruitment_viewCandidates")
	public WebElement id;
	
	@FindBy(css="#btnAdd")
	public WebElement AddBtn;
	
	@FindBy(name="addCandidate[firstName]")
	public WebElement FirstName;
	
	@FindBy(name="addCandidate[middleName]")
	public WebElement MiddleName;
	
	@FindBy(name="addCandidate[lastName]")
	public WebElement LastName;
	
	@FindBy(name="addCandidate[email]")
	public WebElement Email;
	
	@FindBy(name="addCandidate[contactNo]")
	public WebElement ContactNo;
	
	@FindBy(id="addCandidate_keyWords")
	public WebElement Keyword;
	
	@FindBy(id="addCandidate_comment")
	public WebElement Comment;
	
	@FindBy(name="addCandidate[appliedDate]")
	public WebElement Calender;
	
	@FindBy(id="btnSave")
	public WebElement save;
	
	@FindBy(id="candidateSearch_candidateName")
	public WebElement CanName;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[3]/div[1]/div[2]/form[1]/fieldset[1]/ol[1]/li[1]/select[1]")
	public WebElement JobTitle;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[3]/div[1]/div[2]/form[1]/fieldset[1]/ol[1]/li[1]/select[1]")
	public WebElement Vacancy;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[3]/div[1]/div[2]/form[1]/fieldset[1]/ol[1]/li[3]/select[1]")
	public WebElement HiringManager;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[3]/div[1]/div[2]/form[1]/fieldset[1]/ol[1]/li[4]/select[1]")
	public WebElement Status;
	
	
	@FindBy(name="candidateSearch[dateApplication][from]")
	public WebElement Doa;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[3]/div[1]/div[2]/form[1]/fieldset[1]/ol[1]/li[9]/select[1]")
	public WebElement MethodofApplican;
	
	
	@FindBy(id="btnSrch")
	public WebElement Search;
	
	
	
	public Recruitment() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
