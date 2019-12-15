package steps;

import cucumber.api.java.en.When;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.ru.Когда;

public class ScenarioSteps {

    MainPersonSteps mainPersonSteps = new MainPersonSteps();
    TravelInsuranceSteps travelInsuranceSteps = new TravelInsuranceSteps();
    TravelSteps travelSteps = new TravelSteps();
    SendFormSteps sendFormSteps = new SendFormSteps();

    @When("^Выбран пункт меню \"(.*)\"$")
    public  void SelectMainMenu (String menuItem){
        mainPersonSteps.stepSelectMainMenu(menuItem);
    }

    @When("^Выбран вид страхования - \"(.*)\"$")
    public  void SelectSubMenu (String menuItem){
        mainPersonSteps.stepSelectSubMenu(menuItem);
    }

    @Then("Выполнено нажатие на кнопку - Оформить онлайн")
    public void GoToBlanc(){
        travelSteps.stepGoToBlank();
    }

    @When("^Заголовок страницы - \"(.*)\"$")
    public void CheckPageTitle(String expectedTitle){
        travelInsuranceSteps.stepCheckPageTitle(expectedTitle );

    }

    @Then("Выбран тип страховки минимальная")
    public void SelectInsuranceType(){
        travelInsuranceSteps.stepSelectInsuranceType();
    }

    @Then("Нажата кнопка Оформить")
    public void IssueButtonClick(){
        travelInsuranceSteps.stepIssueButtonClick();
    }


    @When("^Заполняются поля:$")
    public void fillForm(DataTable fields){
        fields.asMap(String.class, String.class)
                .forEach((field, value) -> sendFormSteps.stepFillField(field, value));

    }

    @Then("^Значения полей равны:$")
    public void checkFillForm(DataTable fields){
        fields.asMap(String.class, String.class)
                .forEach((field, value) -> sendFormSteps.stepCheckFillField(field, value));
    }

    @When("Выполнено нажатие на кнопку - Продолжить")
    public void СontinueButtonClick(){
        sendFormSteps.stepСontinueButton();
    }

    @Then("Сообщение об ошибке на странице - \"(.*)\"$")
    public void checkAllFieldsFill(String expectedMessage){

        sendFormSteps.stepCheckAllFieldsFillingMessage(expectedMessage);
    }





}
