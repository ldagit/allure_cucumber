package steps;

import pages.SendFormPage;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.HashMap;

import static org.junit.Assert.assertTrue;

public class SendFormSteps {

    @Step("поле {0} заполняется значением {1}")
    public void stepFillField(String field, String value)
    {
        new SendFormPage().fillField(field, value);

    }

    @Step("проверка, что поле {0} заполнено значением {1}")
    public void stepCheckFillField(String field, String value){
        String actual = new SendFormPage().getFillField(field);
        assertTrue(String.format("Значение поля [%s] равно [%s]. Ожидалось - [%s]",field,actual, value),
                actual.equals(value));
    }

    @Step("заполняются поля")
    public void fillFields(HashMap<String, String> fields)
    {
        fields.forEach(this::stepFillField);

    }

    @Step("нажата кнопка Оформить")
    public void stepСontinueButton(){
        new SendFormPage().continueButton.click();
    }

    @Step("проверка сообщений об ошибке - Заполнены не все обязательные поля")
    public void stepCheckAllFieldsFillingMessage(String expectedMessage){
        new SendFormPage().CheckAllFieldsFillingMessage(expectedMessage);
    }

    @Step("поля заполнены верно")
    public void stepCheckFillFields (HashMap<String, String> fields){
        fields.forEach(this::stepCheckFillField);
    }

}
