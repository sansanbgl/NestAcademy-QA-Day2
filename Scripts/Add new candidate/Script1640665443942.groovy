import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

not_run: WebUI.callTestCase(findTestCase('Goto Candidates Page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('View Candidate Button'))

WebUI.click(findTestObject('Object Repository/Object Repository/Form Add Candidate Button'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input__addCandidatefirstName'), firstName)

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Middle Name_addCandidatemiddleName'), findTestData(
        'NewCandidateData').getValue(2, 1))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input__addCandidatelastName'), findTestData('NewCandidateData').getValue(
        3, 1))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input__addCandidateemail'), findTestData('NewCandidateData').getValue(
        4, 1))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Contact No_addCandidatecontactNo'), '080989999')

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/Page_OrangeHRM/select_-- Select --Associate IT ManagerJuni_2d939a'), 
    '4', true)

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Keywords_addCandidatekeyWords'), 'Key, Word')

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/textarea_Comment_addCandidatecomment'), 'No Comment')

WebUI.click(findTestObject('Page_OrangeHRM/checkbox_ConsentKeepData'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input__btnSave'))

WebUI.verifyTextPresent('added John Buzz Doe', false)

