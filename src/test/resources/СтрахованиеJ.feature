#language: ru

  Функционал: Страхование
    Сценарий: Заявка на страхование путешественника

    Когда Выбран пункт меню "Страхование"
      И Выбран вид страхования - "Страхование путешественников"
      Тогда Выполнено нажатие на кнопку - Оформить онлайн

      Когда Заголовок страницы - "Выбор полиса"
      Тогда Выбран тип страховки минимальная
      И Нажата кнопка Оформить

      Когда Заполняются поля:
        |insured_surname|Petrova|
        |insured_name|Marija|
        |insured_birthDate|12052014|
        |surname|Петров|
        |middlename|Петрович|
        |birthDate|06071997|
        |docSeries|0607|
        |docNumber|236755|
        |issueDate|25072019|
        |issuePlace|Какой-то УВД г.Москвы|

       Тогда Значения полей равны:
        |insured_surname|Petrova|
        |insured_name|Marija|
        |insured_birthDate|12.05.2014|
        |surname|Петров|
        |middlename|Петрович|
        |birthDate|06.07.1997|
        |docSeries|0607|
        |docNumber|236755|
        |issueDate|25.07.2019|
        |issuePlace|Какой-то УВД г.Москвы|


      Когда Выполнено нажатие на кнопку - Продолжить
      Тогда Сообщение об ошибке на странице - "Заполнены не все обязательные поля"










