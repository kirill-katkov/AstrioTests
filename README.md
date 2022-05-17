# Проект по автоматизации тестирования сайта "Аstrio"
## <a target="_blank" href="https://astrio.ru"> Аstrio - платформа по созданию интернет-магазинов на самых продвинутых e-commerce платформах в мире Magento Open Source и Magento Commerce</a>

## :floppy_disk: Содержание:

- <a href="#computer-технологии-и-инструменты">Технологии и инструменты</a>
- <a href="#notebook_with_decorative_cover-реализованные-проверки">Функционал и реализованные проверки</a>
- <a href="#electric_plug-сборка-в-Jenkins">Сборка в Jenkins</a>
- <a href="#arrow_forward-запуск-из-терминала">Запуск из терминала</a>
-  <a href="#remote_start-запуск-из-терминала">Удаленный запуск тестов</a>
- <a href="#open_book-allure-отчет">Allure отчет</a>
- <a href="#robot-отчет-в-telegram">Отчет в Telegram</a>
- <a href="#film_projector-видео-примеры-прохождения-тестов">Видео примеры прохождения тестов</a>

## :computer: Технологии и инструменты
<p align="center">
<img width="6%" title="IntelliJ IDEA" src="images/logo/Intelij_IDEA.svg">
<img width="6%" title="Java" src="images/logo/Java.svg">
<img width="6%" title="Selenide" src="images/logo/Selenide.svg">
<img width="6%" title="Selenoid" src="images/logo/Selenoid.svg">
<img width="6%" title="Allure Report" src="images/logo/Allure_Report.svg">
<img width="6%" title="Gradle" src="images/logo/Gradle.svg">
<img width="6%" title="JUnit5" src="images/logo/JUnit5.svg">
<img width="6%" title="GitHub" src="images/logo/GitHub.svg">
<img width="6%" title="Jenkins" src="images/logo/Jenkins.svg">
<img width="6%" title="Telegram" src="images/logo/Telegram.svg">
</p>

## :notebook_with_decorative_cover: Реализованные проверки
- Проверка копирайт на главной странице
- Проверка открытия страницы вакансий и меню
- Проверка контента на странице "О нас"
- Проверка контента на странице "Обучение и карьера"
- Проверка контента на странице "Что мы делаем"
- Проверка заполнения формы "для старта в IT"
- Проверка отсутствия ошибок в консоли бразуера

## :electric_plug: Сборка в Jenkins
### <a target="_blank" href="https://jenkins.autotests.cloud/job/AUTO-978/">Сборка в Jenkins</a>
<p align="center">
<img title="Jenkins Dashboard" src="images/screenshots/111.png">
</p>  

## :arrow_forward: Запуск из терминала
Локальный запуск:
```
gradle clean test
```
## :gear: Запуск тестов с выбором параметров 
<img title="Jenkins ParamStart" src="images/screenshots/param.png">

Удаленный запуск:
```
clean
test
-Dbrowser=${BROWSER}
-DbrowserVersion=${BROWSER_VERSION}
-DbrowserSize=${BROWSER_SIZE}
-DbrowserMobileView="${BROWSER_MOBILE}"
-DremoteDriverUrl=https://user1:1234@${REMOTE_DRIVER_URL}/wd/hub/
-DvideoStorage=https://${REMOTE_DRIVER_URL}/video/
```
:monocle_face: Попробуйте - это очень удобно!
- -Dbrowser - можно выбрать браузер, который необходимо открыть именно вам 
(chrome,
  opera,
  firefox,
  safari)
- -DbrowserVersion - выберете нужную версию браузера
- -DbrowserSize - возможность упралять разрешением (1920x1080,
  1366x768,
  1280x1024,
  1280x800,
  1024x768)
- -DbrowserMobileView - возможность проверить свой продукт на мобильном устройстве (браузере)
- -DremoteDriverUrl - попробуйте выбрать свой аеро куб :)

## :open_book: Allure отчет
- ### Главный экран отчета
<p align="center">
<img title="Allure Overview Dashboard" src="images/screenshots/4321.png">
</p>

- ### Страница с проведенными тестами
<p align="center">
<img title="Allure Test Page" src="images/screenshots/1234.png">
</p>

## :hammer: Allure Test Ops отчет
<p align="center">
<img title="Allure Test Ops Launch" src="images/screenshots/2222.png">
</p>

## :wrench: Интеграция с Jira
<p align="center">
<img title="Jira Issue Dashboard" src="images/screenshots/jira.png">
</p>

## :robot: Отчет в Telegram
<p align="center">
<img title="Telegram notification message" src="images/screenshots/Screenshot_2.png">
</p>

## :film_projector: Видео примеры прохождения тестов
> К каждому тесту в отчете прилагается видео. Одно из таких видео представлено ниже.
<p align="center">
  <img title="Selenoid Video" src="images/screenshots/e6bfd1a5ec0643a6.gif">
</p>