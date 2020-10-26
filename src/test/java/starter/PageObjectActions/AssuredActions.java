package starter.PageObjectActions;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ResponseBodyData;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class AssuredActions extends PageObject {

    @Step("post request to API and validate code 200")
    public static String getResponseCode() {
           String token = RestAssured.given()
                    .contentType("application/json")
                    .header("Content-Type", "application/json")
                    .body("{\n" +
                            "    \"email\":\"qa+teenEmailc242a65e1@goalSetter.co\",\n" +
                            "    \"password\":\"Password1\"\n" +
                            "}")
                    .when()
                    .post("https://qa-api.goalsetter.co/auth/credentials").then().statusCode(200).extract().response().getBody().jsonPath().get("token");
           return token;
        }

}

