package steps;

import pages.MainPersonPage;
import ru.yandex.qatools.allure.annotations.Step;

public class MainPersonSteps {

    @Step("Выбран пункт меню {0}")
    public void stepSelectMainMenu(String menuItem){
        new MainPersonPage().selectMainMenu(menuItem);
        /*MainPersonPage mainPersonPage = new MainPersonPage();
        mainPersonPage.selectMainMenu(menuItem);*/

    }
    @Step("Выбран пункт меню {0}")
    public void stepSelectSubMenu(String menuItem){
        /*MainPersonPage mainPersonPage = new MainPersonPage();
        mainPersonPage.selectSubMenu(menuItem);*/
        new MainPersonPage().selectSubMenu(menuItem);
    }

}
