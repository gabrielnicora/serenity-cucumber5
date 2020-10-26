package starter.PageObjectActions;


import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import net.serenitybdd.screenplay.actions.*;
import starter.utils.RandomString;
import static io.restassured.RestAssured.*;

public class ChallengeActions extends UIInteractionSteps {

    static By BTN_GIVE_GOALCARD = By.id("body_btnGiveGoalCard");
    static By BTN_START_SMALL_DREAM_BIG = By.xpath("//*[@id='goalcardItems']/div[1]/div/img");
    static By FLD_FUN_FUND = By.id("goalAmount1");
    static By FLD_SAVINGS_GOAL = By.id("goalAmount2");
    static By FLD_SENDER_CARD = By.id("senderName");
    static By FLD_SENDER_EMAIL = By.id("senderEmail");
    static By BTN_CONTINUE = By.id("body_LinkButton2");
    static By FLD_CARD_HOLDER_NAME = By.id("body_recipientEmail");

    @Step("Click button goalcard")
    public void clickButtonGoalCard() {
        $(BTN_GIVE_GOALCARD).click();
    }

    @Step("select goal card motive \"Smart small Dream Big\"")
    public void clickSmartSmallDreamBigCard() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        $(BTN_START_SMALL_DREAM_BIG).click();
    }

    @Step("Set 50 dollars on the Fun Fund goal input field")
    public void setFunFundFld() {
        $(FLD_FUN_FUND).click();
        new Actions(getDriver()).sendKeys(Keys.chord(Keys.NUMPAD5)).perform();
        new Actions(getDriver()).sendKeys(Keys.chord(Keys.NUMPAD0)).perform();
    }

    @Step("Set 10 dollars on the savings goal input field")
    public void setSavingsGoalFld() {
        $(FLD_SAVINGS_GOAL).click();
        new Actions(getDriver()).sendKeys(Keys.chord(Keys.NUMPAD1)).perform();
        new Actions(getDriver()).sendKeys(Keys.chord(Keys.NUMPAD0)).perform();
    }

    @Step("Scroll until Sender Card is visible")
    public void setSenderCardFld() {
        new Actions(getDriver()).sendKeys(Keys.chord(Keys.TAB)).perform();
        new Actions(getDriver()).sendKeys(Keys.chord(Keys.TAB)).perform();
        $(FLD_SENDER_CARD).click();
        new Actions(getDriver()).sendKeys(Keys.chord("JHON DOE")).perform();
    }

    @Step("Set sender mail with random address")
    public void setSenderEmail(){
        new Actions(getDriver()).sendKeys(Keys.chord(Keys.TAB)).perform();
        $(FLD_SENDER_EMAIL).click();
        String mail = RandomString.generate(10);
        new Actions(getDriver()).sendKeys(Keys.chord(mail)).perform();

    }

    @Step("Navigate To Purchase Screen")
    public void navigateToPurchaseScreen(){
        new Actions(getDriver()).sendKeys(Keys.chord(Keys.TAB)).perform();
        new Actions(getDriver()).sendKeys(Keys.chord(Keys.TAB)).perform();
        new Actions(getDriver()).sendKeys(Keys.chord(Keys.TAB)).perform();
        $(BTN_CONTINUE).click();

    }

    @Step("Set a cardholder's full name")
    public void setCardholderFullName(){
        $(FLD_CARD_HOLDER_NAME).click();
        new Actions(getDriver()).sendKeys(Keys.chord("JHON DOE")).perform();
    }

}


