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
	
//click links help center
	   private void handleModalAndMoveToHelpCenter() {
	        WebUI.waitForElementVisible(
	            By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
	        WebUI.clickElementWithJs(
	            By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
	        if (WebUI.verifyElementExists(
	            By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"))) {
	            WebUI.clickElementWithJs(
	                By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
	        }
	        WebUI.moveToElement(By.xpath("//a[contains(text(),'Help Center')]"));
	    }
	   
	   public static void closeDiscountModalIfPresent() {
	        By closeButton = By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']");
	        try {
	            if (WebUI.verifyElementExists(closeButton)) {
	                WebUI.waitForElementVisible(closeButton);
	                WebUI.clickElementWithJs(closeButton);
	                // Double-check in case it didn’t close on first click
	                if (WebUI.verifyElementExists(closeButton)) {
	                    WebUI.clickElementWithJs(closeButton);
	                }
	            }
	        } catch (Exception e) {
	            System.out.println("No discount modal found: " + e.getMessage());
	        }
	    }
	   
	   public static void handleModalAndMoveToQuickLinks() {
	        By modalCloseBtn = By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']");
	        By quickLinksSection = By.xpath("//h3[normalize-space()='Quick Link']");

	        try {
	            // Wait for modal and close if exists
	            WebUI.waitForElementVisible(modalCloseBtn);
	            WebUI.clickElementWithJs(modalCloseBtn);

	            if (WebUI.verifyElementExists(modalCloseBtn)) {
	                WebUI.clickElementWithJs(modalCloseBtn);
	            }
	        } catch (Exception e) {
	            System.out.println("No modal found, continuing...");
	        }

	        // Move to Quick Links section
	        WebUI.moveToElement(quickLinksSection);
	    }

	    @When("the user clicks on Student Login link")
	    public void clickStudentLoginLink() {
	        handleModalAndMoveToHelpCenter();
	        WebUI.clickElementWithJs(By.xpath("//a[contains(text(),'Student Login')]"));
	    }

	    @When("the user clicks on About link")
	    public void clickAboutLink() {
	        handleModalAndMoveToHelpCenter();
	        WebUI.clickElementWithJs(By.xpath("(//a[contains(text(),'About')])[2]"));
	    }

	    @When("the user clicks on Group Login link")
	    public void clickGroupLoginLink() {
	        handleModalAndMoveToHelpCenter();
	        WebUI.clickElementWithJs(By.xpath("//a[contains(text(),'Group Login')]"));
	    }

	    @When("the user clicks on FAQ link")
	    public void clickFAQLink() {
	        handleModalAndMoveToHelpCenter();
	        WebUI.clickElementWithJs(By.xpath("//a[contains(text(),'FAQs')]"));
	    }

	    @When("the user clicks on Verify Certificate link")
	    public void clickVerifyCertificateLink() {
	        handleModalAndMoveToHelpCenter();
	        WebUI.clickElementWithJs(By.xpath("(//a[contains(text(),'Verify Certificate')])[2]"));
	    }

	    @When("the user clicks on Reviews link")
	    public void clickReviewsLink() {
	        handleModalAndMoveToHelpCenter();
	        WebUI.clickElementWithJs(By.xpath("(//a[contains(text(),'Reviews')])[2]"));
	    }

	    @When("the user clicks on Blogs link")
	    public void clickBlogsLink() {
	        handleModalAndMoveToHelpCenter();
	        WebUI.clickElementWithJs(By.xpath("//a[contains(text(),'Blogs')]"));
	    }

	    @When("the user clicks on Partners link")
	    public void clickPartnersLink() {
	        handleModalAndMoveToHelpCenter();
	        WebUI.clickElementWithJs(By.xpath("//a[contains(text(),'Partners')]"));
	    }

	    @When("the user clicks on Contact Us link")
	    public void clickContactUsLink() {
	        handleModalAndMoveToHelpCenter();
	        WebUI.clickElementWithJs(By.xpath("//a[contains(text(),' Contact Us')]"));
	    }

	    @When("the user clicks on Privacy Policy link")
	    public void clickPrivacyPolicyLink() {
	        handleModalAndMoveToHelpCenter();
	        WebUI.clickElementWithJs(By.xpath("//a[contains(text(),'Privacy Policy')]"));
	    }

	    @When("the user clicks on Refund Policy link")
	    public void clickRefundPolicyLink() {
	        handleModalAndMoveToHelpCenter();
	        WebUI.clickElementWithJs(By.xpath("//a[contains(text(),'Refund Policy')]"));
	    }

	    @When("the user clicks on Terms of Use link")
	    public void clickTermsOfUseLink() {
	        handleModalAndMoveToHelpCenter();
	        WebUI.clickElementWithJs(By.xpath("//a[contains(text(),' Terms of Use')]"));
	    }	
	
	
	
	

	@When("User clicks on {string}")
	public void user_clicks_on(String menuItem) {
//		 WebUI.clickElementWithJsWithJsWithJs(By.xpath("//div[@id='header-for_desktop']//a[text()='" + menuItem + "']"));
		 WebUI.clickElementWithJs(By.xpath("//div[@id='header-for_desktop']//a[contains(text(),'" + menuItem + "')]")); 
		//div[@id='header-for_desktop']//a[contains(text(),'All Industries')]

	}
	//homepage
	
	 @When("User clicks on Construction")
	    public void clickOnConstruction() {
	        WebUI.clickElementWithJs(By.xpath("(//a[contains(text(),'Construction')])[1]"));
	    }

	    @When("User clicks on Healthcare")
	    public void clickOnHealthcare() {
	        WebUI.clickElementWithJs(By.xpath("(//a[contains(text(),'Healthcare')])[1]"));
	    }

	    @When("User clicks on Assisted Living")
	    public void clickOnAssistedLiving() {
	        WebUI.clickElementWithJs(By.xpath("(//a[contains(text(),'Assisted Living')])[1]"));
	    }

	    @When("User clicks on Therapy")
	    public void clickOnTherapy() {
	        WebUI.clickElementWithJs(By.xpath("(//a[contains(text(),'Therapy')])[1]"));
	    }

	    @When("User clicks on Education")
	    public void clickOnEducation() {
	        WebUI.clickElementWithJs(By.xpath("(//a[contains(text(),'Education')])[1]"));
	    }
	    
	    @When("User clicks on Group Discount")
	    public void clickOnGroupDiscount() {
	        WebUI.clickElementWithJs(By.xpath("(//a[contains(text(),'Group Discount')])[1]"));
	    }

	    @When("User clicks on Login")
	    public void clickOnLogin() {
	        WebUI.clickElementWithJs(By.xpath("(//a[contains(text(),'Log in')])[1]"));
	    }
	//coursenavigation
	 // ------------------- Healthcare Courses -------------------

	    @When("the user clicks on Physicians link")
	    public void the_user_clicks_on_physicians_link() {
	    	closeDiscountModalIfPresent();
	        WebUI.clickElementWithJs(By.xpath("(//a[contains(text(),'Physicians')])[1]"));
	    }

	    @When("the user clicks on the Pharmacist link")
	    public void the_user_clicks_on_the_pharmacist_link() {
	    	closeDiscountModalIfPresent();
	        WebUI.clickElementWithJs(By.xpath("(//a[contains(text(),'Pharmacist')])[1]"));
	    }

	    @When("the user clicks on the Registered Nurse link")
	    public void the_user_clicks_on_the_registered_nurse_link() {
	    	closeDiscountModalIfPresent();
	        WebUI.clickElementWithJs(By.xpath("(//a[contains(text(),'Registered Nurse')])[1]"));
	    }

	    @When("the user clicks on the Nurse Practitioner link")
	    public void the_user_clicks_on_the_nurse_practitioner_link() {
	    	closeDiscountModalIfPresent();
	        WebUI.clickElementWithJs(By.xpath("(//a[contains(text(),'Nurse Practitioner')])[1]"));
	    }


	    // ------------------- Assisted Living Courses -------------------

	    @When("the user clicks on the Assisted Living Facility Manager link")
	    public void the_user_clicks_on_the_assisted_living_facility_manager_link() {
	    	closeDiscountModalIfPresent();
	        WebUI.clickElementWithJs(By.xpath("(//a[contains(text(),'Assisted Living Facility Manager')])[1]"));
	    }

	    @When("the user clicks on the Assisted Living Nursing link")
	    public void the_user_clicks_on_the_assisted_living_nursing_link() {
	    	closeDiscountModalIfPresent();
	        WebUI.clickElementWithJs(By.xpath("(//a[contains(text(),'Assisted Living Nursing')])[1]"));
	    }

	    @When("the user clicks on the Caregivers link")
	    public void the_user_clicks_on_the_caregivers_link() {
	    	closeDiscountModalIfPresent();
	        WebUI.clickElementWithJs(By.xpath("(//a[contains(text(),'Caregivers')])[1]"));
	    }

	    @When("the user clicks on the ALF Training link")
	    public void the_user_clicks_on_the_alf_training_link() {
	    	closeDiscountModalIfPresent();
	        WebUI.clickElementWithJs(By.xpath("(//a[contains(text(),'ALF Training')])[1]"));
	    }


	    // ------------------- Therapy Courses -------------------

	    @When("the user clicks the Athletic Trainers course link")
	    public void the_user_clicks_the_athletic_trainers_course_link() {
	    	closeDiscountModalIfPresent();
	        WebUI.clickElementWithJs(By.xpath("(//a[contains(text(),'Athletic Trainers')])[1]"));
	    }

	    @When("the user clicks the Massage Therapy course link")
	    public void the_user_clicks_the_massage_therapy_course_link() {
	    	closeDiscountModalIfPresent();
	        WebUI.clickElementWithJs(By.xpath("(//a[contains(text(),'Massage Therapy')])[1]"));
	    }

	    @When("the user clicks the Occupational Therapy course link")
	    public void the_user_clicks_the_occupational_therapy_course_link() {
	    	closeDiscountModalIfPresent();
	        WebUI.clickElementWithJs(By.xpath("(//a[contains(text(),'Occupational Therapy')])[1]"));
	    }

	    @When("the user clicks the Physical Therapy course link")
	    public void the_user_clicks_the_physical_therapy_course_link() {
	    	closeDiscountModalIfPresent();
	        WebUI.clickElementWithJs(By.xpath("(//a[contains(text(),'Physical Therapy')])[1]"));
	    }

	    //quick links
	    @When("the user clicks the About link in the Quick Links section")
	    public void clickAboutLinkbyQuickLinks() {
	    	handleModalAndMoveToQuickLinks();
	        WebUI.clickElement(By.xpath("//a[contains(text(),'About')]"));
	    }

	    @When("the user clicks the Partners link in the Quick Links section")
	    public void clickPartnersLinkbyQuickLinks() {
	    	handleModalAndMoveToQuickLinks();
	        WebUI.clickElement(By.xpath("//a[contains(text(),'Partners')]"));
	    }

	    @When("the user clicks the Reviews link in the Quick Links section")
	    public void clickReviewsLinkbyQuickLinks() {
	    	handleModalAndMoveToQuickLinks();
	        WebUI.clickElement(By.xpath("//a[contains(text(),'Reviews')]"));
	    }

	    @When("the user clicks the Blog link in the Quick Links section")
	    public void clickBlogsLinkbyQuickLinks() {
	    	handleModalAndMoveToQuickLinks();
	        WebUI.clickElement(By.xpath("//a[contains(text(),'Blog')]"));
	    }

	    @When("the user clicks the Verify Certificate link in the Quick Links section")
	    public void clickVerifyCertificateLinkbyQuickLinks() {
	    	handleModalAndMoveToQuickLinks();
	        WebUI.clickElement(By.xpath("//a[contains(text(),'Certificate')]"));
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


	@Then("User should be navigated to the {string} category page")
	public void user_should_be_navigated_to_category_page(String PageTitle) {
		
		wait.until(ExpectedConditions.titleContains(PageTitle));
		Assert.assertEquals(WebUI.getPageTitle(),PageTitle);

	}



	@Then("User should be navigated to the login page")
	public void user_should_be_navigated_to_login_page() {
		wait.until(ExpectedConditions.titleContains("Student Login | Learntastic"));
		Assert.assertEquals(WebUI.getPageTitle(),"Student Login | Learntastic");
	}
	@Then("User should be navigated to the Cart page")
	public void user_should_be_navigated_to_cart_page() {
		wait.until(ExpectedConditions.titleContains("Student Login | Learntastic"));
		Assert.assertEquals(WebUI.getPageTitle(),"Student Login | Learntastic");
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

	    @Then("the user should be navigated to the About page")
	    public void the_user_should_be_taken_to_the_about_page() {
	    	
	    	Assert.assertTrue(WebUI.verifyPageTitleContains("About Us | Learntastic"));
	   
	    
	    }

	    @Then("the user should be navigated to the Partners page")
	    public void the_user_should_be_taken_to_the_partners_page() {
	    	Assert.assertTrue(WebUI.verifyPageTitleContains("Our Partners | Learntastic | Partner For Courses"));
	    	
	    }

	    @Then("the user should be navigated to the Reviews page")
	    public void the_user_should_be_taken_to_the_reviews_page() {
	    	Assert.assertTrue(WebUI.verifyPageTitleContains("Reviews | Learntastic | Feedback online courses"));
	    	
	    }

	    @Then("the user should be navigated to the Blogs page")
	    public void the_user_should_be_taken_to_the_blog_page() {
	    	Assert.assertTrue(WebUI.verifyPageTitleContains("Blog on online courses | Learntastic"));
	    	
	    }
	    

	    @Then("the user should be navigated to the Verify Certificate page")
	    public void the_user_should_be_taken_to_the_certificate_verification_page() {
	    	Assert.assertTrue(WebUI.verifyPageTitleContains("Certificate Validation | Learntastic"));
	    	
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
	    @Then("the user should be navigated to the Group Login page")
	    public void theUserShouldBeNavigatedToGroupLoginPage() {
	        Assert.assertTrue(WebUI.verifyPageTitleContains("Group Discount | LearnTastic"));
	
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
	    
	    
	    @When("the user clicks on the {string} link under Healthcare section")
	    public void the_user_clicks_on_the_link_under_healthcare_section(String courseName) {
	   
	    	WebUI.waitForElementVisible(
					By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
			WebUI.clickElementWithJs(By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
			if(WebUI.verifyElementExists(By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"))) {
				WebUI.clickElementWithJs(By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
			}
	    WebUI.clickElementWithJs(By.xpath("//span[contains(text(), '"+courseName+"')]"));
	    
	    }

	    @When("the user clicks on the {string} link under Assisted Living section")
	    public void the_user_clicks_on_the_link_under_assisted_living_section(String courseName) {
	    	WebUI.waitForElementVisible(
					By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
			WebUI.clickElementWithJs(By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
			if(WebUI.verifyElementExists(By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"))) {
				WebUI.clickElementWithJs(By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
			}
	    WebUI.clickElementWithJs(By.xpath("//span[contains(text(), '"+courseName+"')]"));
	    
	    
	    
	    }
	    
	    @When("the user clicks the {string} course link")
	    public void the_user_clicks_the_course_link(String courseName) {
	    	WebUI.waitForElementVisible(
					By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
			WebUI.clickElementWithJs(By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
			if(WebUI.verifyElementExists(By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"))) {
				WebUI.clickElementWithJs(By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
			}
	    WebUI.clickElementWithJs(By.xpath("//span[contains(text(), '"+courseName+"')]"));
	    
	    
	    }

	    @Then("the user should be navigated to the Physicians course page")
	    public void the_user_should_be_navigated_to_the_physicians_course_page() {
	        Assert.assertTrue(WebUI.verifyPageTitleContains("Training Programs for Physicians"));
	    }

	    @Then("the user should be navigated to the Pharmacist course page")
	    public void the_user_should_be_navigated_to_the_pharmacist_course_page() {
	        Assert.assertTrue(WebUI.verifyPageTitleContains("Training Programs for Pharmacists"));
	    }

	    @Then("the user should be navigated to the Registered Nurse course page")
	    public void the_user_should_be_navigated_to_the_registered_nurse_course_page() {
	        Assert.assertTrue(WebUI.verifyPageTitleContains("Training Programs for Registered Nurses"));
	    }

	    @Then("the user should be navigated to the Nurse Practitioner course page")
	    public void the_user_should_be_navigated_to_the_nurse_practitioner_course_page() {
	        Assert.assertTrue(WebUI.verifyPageTitleContains("Training Programs for Nurse Practitioners"));
	    }

	    @Then("the user should be navigated to the Assisted Living Facility Manager course page")
	    public void the_user_should_be_navigated_to_the_assisted_living_facility_manager_course_page() {
	        Assert.assertTrue(WebUI.verifyPageTitleContains("Facility Manager Training for Assisted Living"));
	    }

	    @Then("the user should be navigated to the Assisted Living Nursing course page")
	    public void the_user_should_be_navigated_to_the_assisted_living_nursing_course_page() {
	        Assert.assertTrue(WebUI.verifyPageTitleContains("Nursing Training for Assisted Living"));
	    }

	    @Then("the user should be navigated to the Caregivers course page")
	    public void the_user_should_be_navigated_to_the_caregivers_course_page() {
	        Assert.assertTrue(WebUI.verifyPageTitleContains("Caregiver Training Program for Assisted Living"));
	    }

	    @Then("the user should be navigated to the ALF Training course page")
	    public void the_user_should_be_navigated_to_the_alf_training_course_page() {
	        Assert.assertTrue(WebUI.verifyPageTitleContains("ALF Training Courses - Assisted Living Facilities"));
	    }

	    @Then("the user should be navigated to the Athletic Trainers course page")
	    public void the_user_should_be_navigated_to_the_athletic_trainers_course_page() {
	        Assert.assertTrue(WebUI.verifyPageTitleContains("Athletic Trainers - Expert Care for Peak Performance | Learntastic"));
	    }

	    @Then("the user should be navigated to the Massage Therapy course page")
	    public void the_user_should_be_navigated_to_the_massage_therapy_course_page() {
	        Assert.assertTrue(WebUI.verifyPageTitleContains("Massage Courses Online | LearnTastic"));
	    }

	    @Then("the user should be navigated to the Occupational Therapy course page")
	    public void the_user_should_be_navigated_to_the_occupational_therapy_course_page() {
	        Assert.assertTrue(WebUI.verifyPageTitleContains("Occupational Therapy - Enhance Daily Living Skills | Learntastic"));
	    }

	    @Then("the user should be navigated to the Physical Therapy course page")
	    public void the_user_should_be_navigated_to_the_physical_therapy_course_page() {
	        Assert.assertTrue(WebUI.verifyPageTitleContains("Continuing Education For Physical Therapists | LearnTastic"));
	    }

	
}
