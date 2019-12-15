package steps;

import pages.TravelPage;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.Set;

public class TravelSteps {

    @Step("Нажата кнопка Оформить онлайн")
    public void stepGoToBlank(){
        TravelPage travelPage = new TravelPage();
        travelPage.goToBlanc();
    }


}
