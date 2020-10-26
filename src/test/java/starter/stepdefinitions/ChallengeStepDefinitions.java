package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.PageObjectActions.ChallengeActions;
import starter.PageObjectActions.AssuredActions;
import starter.navigation.NavigateTo;

public class ChallengeStepDefinitions {

    @Steps
    NavigateTo navigateTo;

    @Steps
    ChallengeActions challengeActions;

    @Steps
    AssuredActions assuredActions;

    @Given("I am on the GoalSetter home page")
    public void i_am_on_the_GoalSetter_home_page() {
        navigateTo.goalSetterHomePage();
    }

    @When("^click on button \"GIVE GOALCARD\"")
    public void i_click_on_button_give_goaldcard() { challengeActions.clickButtonGoalCard();}

    @When("^select goal card motive \"Smart small Dream Big\"")
    public void i_click_on_button_holiday() { challengeActions.clickSmartSmallDreamBigCard();}


    @When("Set 50 dollars on the Fun Fund goal input field")
    public void i_set_fun_fund_input_field(){challengeActions.setFunFundFld();}

    @When("Set 10 dollars on the savings goal input field")
    public void i_set_saving_goal_input_field(){challengeActions.setSavingsGoalFld();}

    @When("Set who the card is from name")
    public void i_set_sender_card_filed(){
        challengeActions.setSenderCardFld();
    }

    @When("Set sender email by creating a random email address")
    public void i_set_sender_with_random_mail(){
      challengeActions.setSenderEmail();
    }

    @When("Navigate to purchase Screen")
    public void navigate_to_purchase_Screen(){
        challengeActions.navigateToPurchaseScreen();
    }

    @When("Set a cardholder's full name")
    public void set_cardholder_full_name(){
        challengeActions.setCardholderFullName();
    }

    @Given("post request to API and validate code 200 and Print Token")
    public void valildate_response_code() {
       System.out.println("TOKEN: *********************************" + assuredActions.getResponseCode());
    }

}
