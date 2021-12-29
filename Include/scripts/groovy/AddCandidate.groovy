import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import login as MyLogin


class AddCandidate {
	//	Given login
	//	And I want to go page candidate list
	//	Then I want to click Add Candidate Button
	//	When I open add candidate page
	//	When Input First Name <name>
	//	And Input Last Name <name>
	//	And Input Email <email>
	//	Then Click Save Button
	//	And Verify new candidate already added
	//	Then Close Browser
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	//	@Given("login")
	//	def login() {
	//		loginSteps()
	//	}
	//	def loginSteps(){
	//		var loginVar = new MyLogin();
	//		loginVar.navigate_to_login_page();
	//		loginVar.input_username('Admin');
	//		loginVar.input_password('admin123');
	//		loginVar.click_the_login_button();
	//
	//	}

	@And("I want to go page candidate list")
	def I_want_to_go_page_candidate_list() {
		WebUI.callTestCase(findTestCase('Goto Candidates Page'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("I want to click Add Candidate Button")
	def I_want_to_click_add_candidate_button() {
		WebUI.click(findTestObject('Object Repository/Object Repository/Form Add Candidate Button'))
	}

	//	@When("I open candidate page")
	//	def I_open_candidate_page() {
	//	}

	@When("Input First Name (.*)")
	def InputFirstName(String name) {
		WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input__addCandidatefirstName'), name)
	}

	@And("Input Last Name (.*)")
	def InputLastName(String name) {
		WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input__addCandidatelastName'),name)
	}

	@And("Input Email (.*)")
	def InputEmail(String email) {
		WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input__addCandidateemail'), email)
	}

	@Then("Click Save")
	def clickSaveButton() {
		WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input__btnSave'))

	}

	@And("Verify")
	def verifyNewCandidate() {
		WebUI.verifyTextPresent('added', false)

	}
	@Then("CloseBrowser")
	def closeBrowser() {
		WebUI.closeBrowser();
	}
}