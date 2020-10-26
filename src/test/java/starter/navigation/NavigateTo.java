package starter.navigation;

import net.thucydides.core.annotations.Step;

public class NavigateTo {

    GoalSetterHomePage goalSetterHomePage;

    @Step("Open the GoalSetter home page")
    public void goalSetterHomePage() {
        goalSetterHomePage.openUrl("https://qa-portal.goalsetter.co/user/kyle3080");
    }

}
