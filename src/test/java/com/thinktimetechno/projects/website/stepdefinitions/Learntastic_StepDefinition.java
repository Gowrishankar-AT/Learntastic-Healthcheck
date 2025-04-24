package com.thinktimetechno.projects.website.stepdefinitions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.thinktimetechno.driver.DriverManager;
import com.thinktimetechno.hooks.TestContext;
import com.thinktimetechno.keywords.WebUI;
//import com.thinktimetechno.projects.website.pages.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Learntastic_StepDefinition {

//	DashboardPage dashboardPage;

	WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
	public Learntastic_StepDefinition(TestContext testContext) {
//		dashboardPage = testContext.getDashboardPage();

	}
	@Given("User is on the LearnTastic homepage")
	public void user_is_on_homepage() {
WebUI.getURL("https://learntastic.com/");
	}

	@When("User clicks on {string}")
	public void user_clicks_on(String menuItem) {
//		 WebUI.clickElementWithJsWithJsWithJs(By.xpath("//div[@id='header-for_desktop']//a[text()='" + menuItem + "']"));
		 WebUI.clickElementWithJs(By.xpath("//div[@id='header-for_desktop']//a[contains(text(),'" + menuItem + "')]")); 
		//div[@id='header-for_desktop']//a[contains(text(),'All Industries')]

	}
	
	@When("User clicks on Join for free button")
	public void user_clicks_on_Join_for_free_button() {
		
		WebUI.waitForElementVisible(
				By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
		WebUI.clickElementWithJs(By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
		if(WebUI.verifyElementExists(By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"))) {
			WebUI.clickElementWithJs(By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
		}
		WebUI.clickElementWithJs(
				By.xpath("//div[@class='home-item_desc']/descendant::button[contains(text(),'Join for free')]"));

//	 WebUI.clickElementWithJsWithJsWithJsWithJs(By.xpath("//button[@class='dynamic_button_join']")); 
		
	}
	
	@When("User clicks on Help me choose button")
	public void user_clicks_on_Help_me_choose_button() {
		
		WebUI.waitForElementVisible(
				By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
		WebUI.clickElementWithJs(By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
		if(WebUI.verifyElementExists(By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"))) {
			WebUI.clickElementWithJs(By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
		}
//		WebUI.clickElementWithJsWithJsWithJsWithJs(
//				By.xpath("//div[@class='home-item_desc']/descendant::button[contains(text(),'Help me choose)]"));

		 WebUI.clickElementWithJs(By.xpath("//button[@class='dynamic_button_help']")); 
		
	}
	

	
	
	
	@When("User clicks on {string} dropdown")
	public void user_clicks_on_dropdown(String dropdownName) {
		
		WebUI.waitForElementVisible(
				By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
		WebUI.clickElementWithJs(By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
		if(WebUI.verifyElementExists(By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"))) {
			WebUI.clickElementWithJs(By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
		}
		WebUI.clickElementWithJs(
				By.xpath("//div[@class='home-item_desc']/descendant::button[contains(text(),'Join for free')]"));

		
		WebUI.clickElementWithJs(By.xpath("//div[@class='category-title_other']"));
		
//		 WebUI.clickElementWithJsWithJsWithJs(By.xpath("//div[@id='header-for_desktop']//a[contains(text(),'" + dropdownName + "')]")); 

		 
		 
		 
		 
		 
		 
	}

	@When("User clicks on the {string} icon")
	public void user_clicks_on_icon(String iconName) {

	}

	@Then("User should be navigated to the {string} category page")
	public void user_should_be_navigated_to_category_page(String PageTitle) {
		
		wait.until(ExpectedConditions.titleContains(PageTitle));
		Assert.assertEquals(WebUI.getPageTitle(),PageTitle);

	}

	@Then("User should be navigated to the sign-up page")
	public void user_should_be_navigated_to_signup_page() {

	}

	@Then("User should be navigated to the login page")
	public void user_should_be_navigated_to_login_page() {
		wait.until(ExpectedConditions.titleContains("Student Login | Learntastic"));
		Assert.assertEquals(WebUI.getPageTitle(),"Student Login | Learntastic");
	}

	@Then("User should be navigated to the payment and course start page")
	public void user_should_be_navigated_to_payment_page() {

	}

	@Then("User should be navigated to the group discount details page")
	public void user_should_be_navigated_to_group_discount_page() {
		wait.until(ExpectedConditions.titleContains("Group Discount | LearnTastic"));
		Assert.assertEquals(WebUI.getPageTitle(),"Group Discount | LearnTastic");
	}

	@Then("User should see {string}, {string}, {string}, {string}, {string}, and {string} options")
	public void user_should_see_all_industry_options(String a, String b, String c, String d, String e, String f) {
		Assert.assertTrue(WebUI.isElementVisible(By.xpath("//h4[normalize-space()='"+a+"']"), 5));
//		Assert.assertTrue(WebUI.isElementVisible(By.xpath("//h4[normalize-space()='"+b+"']"), 5));
//		Assert.assertTrue(WebUI.isElementVisible(By.xpath("//h4[normalize-space()='"+c+"']"), 5));
//		Assert.assertTrue(WebUI.isElementVisible(By.xpath("//h4[normalize-space()='"+d+"']"), 5));
//		Assert.assertTrue(WebUI.isElementVisible(By.xpath("//h4[normalize-space()='"+e+"']"), 5));
//		Assert.assertTrue(WebUI.isElementVisible(By.xpath("//h4[normalize-space()='"+f+"']"), 5));
	
	}

	@Then("User should see all course options")
	public void user_should_see_all_courses() {

	}

	@Then("User should see {string}, {string}, {string}, and {string}")
	public void user_should_see_resources(String a, String b, String c, String d) {
		Assert.assertTrue(WebUI.isElementVisible(By.xpath("//h4[normalize-space()='"+a+"']"), 5));
//		Assert.assertTrue(WebUI.isElementVisible(By.xpath("//h4[normalize-space()='"+b+"']"), 5));
//		Assert.assertTrue(WebUI.isElementVisible(By.xpath("//h4[normalize-space()='"+c+"']"), 5));
//		Assert.assertTrue(WebUI.isElementVisible(By.xpath("//h4[normalize-space()='"+d+"']"), 5));
		

	}

	@Then("User should see a pop-up message {string}")
	public void user_should_see_popup_message(String expectedMessage) {
		WebUI.waitForElementVisible(
				By.xpath("(//div[@id='modal_join_for_free'])//p"));
		
		
//		(//p[@class='choose_header_title'])[1]
		
		Assert.assertEquals(WebUI.getTextElement(By.xpath("(//div[@id='modal_join_for_free'])//p")), expectedMessage);
		

	}
	
	@Then("User should see a pop-up message Let us help you choose a course")
	public void user_should_see_popup_message_Let_us_help_you_choose_a_course() {
		WebUI.waitForElementVisible(
				By.xpath("(//p[@class='choose_header_title'])[1]"));	
		Assert.assertEquals(WebUI.getTextElement(By.xpath("(//p[@class='choose_header_title'])[1]")), "Let us help you choose a course");
		

	}
	@When("User clicks on Resources dropdown")
	public void User_clicks_on_Resources_dropdown() {
		
		
		WebUI.waitForElementVisible(
				By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
		WebUI.clickElementWithJs(By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
		if(WebUI.verifyElementExists(By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"))) {
			WebUI.clickElementWithJs(By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
		}
//		WebUI.clickElementWithJsWithJsWithJsWithJs(
//				By.xpath("//div[@class='home-item_desc']/descendant::button[contains(text(),'Join for free')]"));

		
		
		WebUI.mouseHover(By.xpath("//div[@id='all_course_resource']"));
		WebUI.clickElementWithJs(By.xpath("//div[@id='all_course_resource']"));		
	}
	
	
	@When("User clicks on All Industries dropdown")
	public void User_clicks_on_All_Industries_dropdown() {
		
		
		WebUI.waitForElementVisible(
				By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
		WebUI.clickElementWithJs(By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
		if(WebUI.verifyElementExists(By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"))) {
			WebUI.clickElementWithJs(By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
		}
//		WebUI.clickElementWithJsWithJsWithJsWithJs(
//				By.xpath("//div[@class='home-item_desc']/descendant::button[contains(text(),'Join for free')]"));

		
		
		WebUI.mouseHover(By.xpath("//a[normalize-space(text())='All Industries']"));
		
	}
	
	
	@When("User clicks on All Courses dropdown")
	public void User_clicks_on_All_Courses_dropdown() {
		
		
		WebUI.waitForElementVisible(
				By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
		WebUI.clickElementWithJs(By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
		if(WebUI.verifyElementExists(By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"))) {
			WebUI.clickElementWithJs(By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
		}
//		WebUI.clickElementWithJsWithJsWithJsWithJs(
//				By.xpath("//div[@class='home-item_desc']/descendant::button[contains(text(),'Join for free')]"));

		
		
		WebUI.mouseHover(By.xpath("//a[normalize-space(text())='All Courses']"));
		
	}
	
	 @Then("the user should see the Quick Links section in the footer")
	    public void the_user_should_see_the_quick_links_section_in_the_footer() {
		 WebUI.waitForElementVisible(
					By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
			WebUI.clickElementWithJs(By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
			if(WebUI.verifyElementExists(By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"))) {
				WebUI.clickElementWithJs(By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
			}
		 WebUI.moveToElement(By.xpath("//h3[normalize-space()='Quick Link']"));
	 
	 
	 }

	    @Then("it should include the following links:")
	    public void it_should_include_the_following_links(io.cucumber.datatable.DataTable dataTable) {
	  
	    	 List<String> expectedLinks = dataTable.asList();

	    	    // Find all link elements under the "Quick Link" section
	    	 List<String> actualLinks = WebUI.getListElementsText(
	    	        By.xpath("//h3[normalize-space()='Quick Link']/parent::div/div/a")
	    	    );

	    	   

	    	  
	    	    for (String expected : expectedLinks) {
	    	        Assert.assertTrue(actualLinks.contains(expected));
	    	    }
	    
	    
	    
	    }

	    @When("the user clicks the {string} link in the Quick Links section")
	    public void the_user_clicks_the_link_in_the_quick_links_section(String linkText) {
	    	 WebUI.waitForElementVisible(
						By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
				WebUI.clickElementWithJs(By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
				if(WebUI.verifyElementExists(By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"))) {
					WebUI.clickElementWithJs(By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
				}
			 WebUI.moveToElement(By.xpath("//h3[normalize-space()='Quick Link']"));
	    
	    WebUI.clickElementWithJs(By.xpath("//h3[normalize-space()='Quick Link']/parent::div/div/a[contains(text(),'"+linkText+"')]"));
	    }

	    @Then("the user should be taken to the About page")
	    public void the_user_should_be_taken_to_the_about_page() {
	    	
	    	Assert.assertTrue(WebUI.verifyPageTitleContains("About Us | Learntastic"));
	   
	    
	    }

	    @Then("the user should be taken to the Partners page")
	    public void the_user_should_be_taken_to_the_partners_page() {
	    	Assert.assertTrue(WebUI.verifyPageTitleContains("Our Partners | Learntastic | Partner For Courses"));
	    	
	    }

	    @Then("the user should be taken to the Reviews page")
	    public void the_user_should_be_taken_to_the_reviews_page() {
	    	Assert.assertTrue(WebUI.verifyPageTitleContains("Reviews | Learntastic | Feedback online courses"));
	    	
	    }

	    @Then("the user should be taken to the Blog page")
	    public void the_user_should_be_taken_to_the_blog_page() {
	    	Assert.assertTrue(WebUI.verifyPageTitleContains("Blog on online courses | Learntastic"));
	    	
	    }

	    @Then("the user should be taken to the Certificate Verification page")
	    public void the_user_should_be_taken_to_the_certificate_verification_page() {
	    	Assert.assertTrue(WebUI.verifyPageTitleContains("Certificate Validation | Learntastic"));
	    	
	    }
	    @When("the user clicks on {string} link")
	    public void theUserClicksOnLink(String linkText) {
	        WebUI.waitForElementVisible(
							By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
					WebUI.clickElementWithJs(By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
					if(WebUI.verifyElementExists(By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"))) {
						WebUI.clickElementWithJs(By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
					}
				 WebUI.moveToElement(By.xpath("//h3[normalize-space()='Help Center']"));
		    
		    WebUI.clickElementWithJs(By.xpath("//h3[normalize-space()='Help Center']/parent::div/div/a[contains(text(),'"+linkText+"')]"));


	    }

	    
	    
	    @Then("the user should be navigated to the Student Login page")
	    public void theUserShouldBeNavigatedToStudentLoginPage() {
	        Assert.assertTrue(WebUI.verifyPageTitleContains("Student Login | Learntastic"));
	    }

	    @Then("the user should be navigated to the Staff Login page")
	    public void theUserShouldBeNavigatedToStaffLoginPage() {
	       Assert.assertTrue(WebUI.verifyPageTitleContains("Student Login | Learntastic"));
	    }

	    @Then("the user should be navigated to the FAQ page")
	    public void theUserShouldBeNavigatedToFAQPage() {
	        Assert.assertTrue(WebUI.verifyPageTitleContains("FAQs | Learntastic | Online Courses"));
	    }

	    @Then("the user should be navigated to the Contact Us page")
	    public void theUserShouldBeNavigatedToContactUsPage() {
	        Assert.assertTrue(WebUI.verifyPageTitleContains("Contact Us | Learntastic | Customer Support"));
	    }

	    @Then("the user should be navigated to the Privacy Policy page")
	    public void theUserShouldBeNavigatedToPrivacyPolicyPage() {
	        Assert.assertTrue(WebUI.verifyPageTitleContains("Privacy Policy | LearnTastic"));
	    }

	    @Then("the user should be navigated to the Refund Policy page")
	    public void theUserShouldBeNavigatedToRefundPolicyPage() {
	        Assert.assertTrue(WebUI.verifyPageTitleContains("Refund Policy | LearnTastic"));
	    }

	    @Then("the user should be navigated to the Terms of Use page")
	    public void theUserShouldBeNavigatedToTermsOfUsePage() {
	        Assert.assertTrue(WebUI.verifyPageTitleContains("Terms of Use | LearnTastic"));
	    }

	    @Then("the user should see the Help Center section in the footer")
	    public void theUserShouldSeeTheHelpCenterSectionInTheFooter() {

	WebUI.waitForElementVisible(
						By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
				WebUI.clickElementWithJs(By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
				if(WebUI.verifyElementExists(By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"))) {
					WebUI.clickElementWithJs(By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
				}
			 WebUI.moveToElement(By.xpath("//h3[normalize-space()='Help Center']"));
		 
	      
	    }

	    @Then("the Help Center section should contain:")
	    public void theHelpCenterSectionShouldContain(io.cucumber.datatable.DataTable dataTable) {
	 List<String> expectedLinks = dataTable.asList();

		    	    // Find all link elements under the "Quick Link" section
		    	 List<String> actualLinks = WebUI.getListElementsText(
		    	        By.xpath("//h3[normalize-space()='Help Center']/parent::div/div/a")
		    	    );

		    	    for (String expected : expectedLinks) {
		    	        Assert.assertTrue(actualLinks.contains(expected));
		    	    }
	
	    }
	
}
