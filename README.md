### Логин:
* Проверить ввод правильного пароля и логина <br/>
* При попытке входа с пустыми понями выдает ошибку - Epic sadface: Username is required <br/>
* При вводе только логина выдает ошибку - Epic sadface: Password is required <br/>
* При вооде  только пароля выдает ошибку - Epic sadface: Username is required <br/>
* При непривильном вводе логина выдает ошибку - Epic sadface: Username and password do not match any user in this service <br/>
* При непривильном вводе пароля выдает ошибку - Epic sadface: Username and password do not match any user in this service <br/>
### Главная страница: <br/>
#### Меню:   
* При клике на окно меню должн открыться список из пунктов меню <br/>
* При клике на All items переход список товаров <br/>
* При клике на About происходит переход на https://saucelabs.com/ <br/>
* При клике на Logout происходи выход из системы <br/>
* При клике на Reset app state происходит сброс товаров из корзины <br/>
#### Заголовок:
* Проверить наличие заголовка <br/>
#### Логотип:
* Проверить наличие логотипа <br/>
#### Фильтр: 
* При выборе в сортировке Name (A to Z) продукты выстраиваются в алфавитном порядке <br/>
* При выборе в сортировке Name (Z to A) продукты выстраиваются обратно алфавитному порядку <br/>
* При выборе в сортировке Price (low to high) продукты выстраиваются от минимальной цены к наибольшей <br/>
* При выборе в сортировке Price (high to low)  продукты выстраиваются от наибольшей цены к наименьшей <br/>
#### Продукт:
* При клике на название продукта открывается другая страница с описанием продукта <br/>
* На персонольной странице продукта появляется кнопка back yo products <br/>
* При клике на кнопку add to card  кнопка меняется на remove <br/>
#### Ссылки:
* При клике на иконку твитера происходит переход на страницу перслнальную твитера <br/>
* При клике на иконку фейсбука происходит переход на страницу перслнальную фейбука <br/>
* При клике на иконку инстаграма  происходит переход на страницу перслнальную инстаграма <br/>
### Страница корзины: 
* При клике на корзину должна открыться страница корзины <br/>
* При клике на кнопку continue shopping осуществляеться переход на главную страницу <br/>
* При клике на кнопку checkout осуществляеться переход на страницу с формой <br/>
* Проверить наличие заголовка <br/>
* Проверить отображение в корзине название,описание и цену товара <br/>
* Проверить соосветсвие цены и названия продукта в корзине и на главной странице <br/>
* Страница checkout:Проверить наличие заголовка <br/>
* Проверить наличие поля First Name <br/>
* Проверить наличие поля Last Name <br/>
* Проверить наличие поля Zip/Postal code <br/>
* При клине на кнопку clear происходит переход страницы на страницу корзины <br/>
* При клине на кнопку continue с пустыми полями выводится ошибка Error: First Name is required <br/>
* При вооде только First Name и клике на кнопку continue выбивает ошибку Error: Last Name is required <br/>
* При вооде только Last Name и клике на кнопку continue выбивает ошибку Error: First Name is required <br/>
* При вооде только Zip/Postal code и клике на кнопку continue выбивает ошибку Error: First Name is required <br/>
* При вооде только First Name и Last Name и клике на кнопку continue выбивает ошибку Error: Postal Code is required <br/>
* При вооде только First Name и ip/Postal code и клике на кнопку continue выбивает ошибку Error: Last Name is required <br/>
* При вооде только Last Name и ip/Postal code и клике на кнопку continue выбивает ошибку Error: First Name is required <br/>
* При вооде всех полей верно и клике на кнопку continue происходит переход на страницу CHECKOUT: OVERVIEW <br/>
### Обзор заказа : 
* Проверить наличие заголовка <br/> 
* Проверка на наличие на странице название товара <br/>
* Проверка на наличие на странице цены <br/> 
* Проверка на наличие на странице орисания товара <br/>
* Проверка на наличие на странице Payment Information <br/>
* Проверка на наличие на странице Shipping Information <br/>
* Проверка на наличие на странице комисии <br/>
* Проверка на наличие на странице итоговой цены <br/>
* При клике на кнопку clear происходит переход на главную страницу <br/>
* При клике на кнопку Finish происходит переход на финальную страницу <br/>
* Финальная страница: Проверить наличие заголовка <br/>
* Проверить наличие надписи THANK YOU FOR YOUR ORDER <br/>
* Проверить наличие такста Your order has been dispatched, and will arrive just as fast as the pony can get there! <br/>
* Проверить наличие img <br/>
* При клике на кнопку beck home происходит переход на главную страницу <br/>

## **MAVEN**
### Доступные обновления версий  _mvn versions:display-dependency-updates_
> [INFO] The following dependencies in Dependencies have newer versions: <br/>
[INFO]   io.github.bonigarcia:webdrivermanager ................. 5.0.0 -> 5.0.3 <br/>
[INFO]   io.qameta.allure:allure-testng ...................... 2.13.9 -> 2.17.2 <br/>
[INFO]   org.aspectj:aspectjweaver ......................... 1.9.6 -> 1.9.8.RC3 <br/>
[INFO]   org.seleniumhq.selenium:selenium-java .............. 3.141.59 -> 4.1.1 <br/>
[INFO]   org.testng:testng ..................................... 7.1.0 -> 7.4.0 <br/>
[INFO] ------------------------------------------------------------------------ <br/>
[INFO] BUILD SUCCESS <br/>
[INFO] ------------------------------------------------------------------------ <br/>
[INFO] Total time:  59.438 s <br/>
[INFO] Finished at: 2022-01-04T11:38:54+03:00 <br/>

### Обновление версий  _mvn versions:use-latest-versions_
>[INFO] -------------------------< groupId:Saucedemo >-------------------------- <br/>
[INFO] Building Saucedemo 1.0-SNAPSHOT <br/>
[INFO] --------------------------------[ jar ]--------------------------------- <br/>
[INFO] --- versions-maven-plugin:2.8.1:use-latest-versions (default-cli) @ Saucedemo --- <br/>
[INFO] Major version changes allowed <br/>
[INFO] ------------------------------------------------------------------------<br/>
[INFO] BUILD SUCCESS <br/>
[INFO] ------------------------------------------------------------------------ <br/>
[INFO] Total time:  1.679 s <br/>
[INFO] Finished at: 2022-01-04T12:08:24+03:00 <br/>

### Запуск тестов _mvn clean test_
>Tests run: 7, Failures: 2, Errors: 0, Skipped: 0, Time elapsed: 0.684 sec  <<< FAILURE!

### Запуск конкретных тестов  _mvn -Dtest=CheckoutTest test_ 
>Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 15.03 sec

### Запуск конкретного теста  _mvn -Dtest=LoginPageTest#userPasswordShouldBeRequired test_
>Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 4.731 sec

### Запуск двух тестов _mvn -Dtest=CheckoutTest#checkoutIsDisplay+checkoutNotDisplayWithoutFirstName test_
>Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 6.991 s - in tests.CheckoutTest










        


        

 