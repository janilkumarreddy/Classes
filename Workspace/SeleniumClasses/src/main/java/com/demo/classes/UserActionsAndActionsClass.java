package com.demo.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.demo.utils.BrowserInit;

public class UserActionsAndActionsClass extends BrowserInit{

	/*3)	User Actions and Mouse Over Actions and Drag and Drop
	3.1. Click
	3.2. sendKeys
	3.3. Select
	3.4. isEnabled/isSelected/isDisplayed
	3.5. Actions Class (DragAndDrop, MoveToElement etc�.)*/

	@Test
	public void fn_ActionsClassDemo() throws InterruptedException {
		//driver.get("https://www.wellsfargo.com/"); // MoveToElement
		//driver.get("http://demo.guru99.com/test/drag_drop.html"); // DragAndDrop
		driver.get("http://toolsqa.com/automation-practice-form/");//ForRadioAndcheckbox

		Thread.sleep(5000);
		/*Actions act = new Actions(driver);

		WebElement bankingTAB = driver.findElement(By.id("bankingTab"));*/



		//act.moveToElement(bankingTAB).perform(); // moveToElement is not working in latest chrome driver with selenium 3.14 version
		/*act.click(bankingTAB).perform();

		WebElement checkingAccounts = driver.findElement(By.xpath("//a[@href='/checking/?linkLoc=fn']"));
		act.click(checkingAccounts).perform();


		WebElement zipCode = driver.findElement(By.id("zipCode"));
		WebElement coninueBtn = driver.findElement(By.xpath("//input[@class='zipStateSubmit']"));		
		zipCode.sendKeys("12345");
		coninueBtn.click();*/


		//act.doubleClick(bankingTAB);

		// dragAndDrop is not working in latest chrome driver with selenium 3.14 version
		//act.dragAndDrop(driver.findElement(By.xpath("//a[@class='button button-orange'and contains(.,'BANK')]")), driver.findElement(By.xpath("//div[@class='shoppingCart']//li")));

		//act.contextClick(target)

		//act.clickAndHold(zipCode).moveToElement(coninueBtn).release().build().perform();

		
		//saveUsernameCheckbox	
		chkBoxValidation(driver);
	}
	
	public static void keyBoardActions(WebDriver driver) {
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		
	}

	public static void chkBoxValidation(WebDriver driver) {
		WebElement radio = driver.findElement(By.id("sex-0"));
		WebElement femaleRradio = driver.findElement(By.id("sex-1"));//
		WebElement chkBox = driver.findElement(By.id("profession-1"));
		
		WebElement selectObj = driver.findElement(By.id("selenium_commands"));
		try {
			//******************Radio*******************************
			//System.out.println(radio.isDisplayed());
			/*System.out.println(radio.isEnabled());
			System.out.println(radio.isSelected());
			radio.click();
			System.out.println(radio.isSelected());*/
			
			if(!femaleRradio.isSelected())
				femaleRradio.click();
			
			//*****************Checkbox*******************
			System.out.println(chkBox.isDisplayed());
			System.out.println(chkBox.isEnabled());
			System.out.println(chkBox.isSelected());
			chkBox.click();
			System.out.println(chkBox.isSelected());
			
			//**************Select*******
			Select select = new Select(selectObj);
			select.selectByVisibleText("Switch Commands");
			select.selectByIndex(1);
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
}