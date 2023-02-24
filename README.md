# PortSwiggerTest
# Проект по автоматизации тестирования элементов хедера главной страницы PortSwigger
## :pushpin: Содержание:

- [Использованный стек технологий](#computer-использованный-стек-технологий)
- [Сборка в Jenkins](#-сборка-в-jenkins)
- [Запуск тестов](#running_woman-запуск-тестов)
- [Пример Allure-отчета](#-пример-allure-отчета)
- [Уведомления в Telegram с использованием бота](#-уведомления-в-telegram-с-использованием-бота)
- [Видео примера запуска теста в Selenoid](#-видео-примера-запуска-теста-в-selenoid)

## :computer:  Использованный стек технологий
<p align="center">
<a href="https://www.jetbrains.com/idea/"><img src="/pictures/logo/Idea.svg" width="50" height="50"  alt="IDEA"/></a>
<a href="https://www.java.com/"><img src="/pictures/logo/Java.svg" width="50" height="50"  alt="Java"/></a>
<a href="https://github.com/"><img src="/pictures/logo/Github.svg" width="50" height="50"  alt="Github"/></a>
<a href="https://junit.org/junit5/"><img src="/pictures/logo/Junit5.svg" width="50" height="50"  alt="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="/pictures/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>
<a href="https://selenide.org/"><img src="/pictures/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>
<a href="https://aerokube.com/selenoid/"><img src="/pictures/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="/pictures/logo//Allure.svg" width="50" height="50"  alt="Allure"/></a>
<a href="https://https://qameta.io/"><img src="/pictures/logo/Allure_TO.svg" width="50" height="50"  alt="Allure_TO"/></a>
<a href="https://www.jenkins.io/"><img src="/pictures/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>
<a href="https://https://telegram.org/"><img src="/pictures/logo/Telegram.svg" width="50" height="50"  alt="Telegram"/></a>
</p>

## Реализованные проверки:

- *Проверка выпадающего меню элементов хедера главной страницы*
- *Проверка изменения свойств логотипа при наведении*
- *Проверка выпадающего меню кнопки гамбургера*
- *Проверка наличия ссылок на кнопках в хедере главной страницы*





## Сборка в Jenkins
[Build](https://jenkins.autotests.cloud/job/C17-eaach-lesson14-HW2/)
![jenkins_build](/pictures/jenkins.png)

__*Параметры сборки:*__
![jenkins_parameters](/pictures/jenkins_2.png)

## :running_woman:  Запуск тестов
```
gradle clean test
```

__*Удалённо, из Jenkins:*__

```
clean test  -Durl="${URL}"  -Dbrowser="${BROWSER}"  -DbrowserVersion="${BROWSERVERSION}"  -DbrowserSize="${BROWSERSIZE}"
```




## Allure Report
__*Ссылка на*__ [отчёт](https://jenkins.autotests.cloud/job/C17-eaach-lesson14-HW2/3/allure/)


__Общаая информация:__
![allure_overview](/pictures/allure.png)


__Тестовые сценарии:__
![allure_tc](/pictures/allure_2.png)


## Allure TestOps
__Общаая информация:__
![allure_test_ops_overview](/pictures/allureTestOps.png)

__Тестовые сценарии:__
![allure_testOps_tc](/pictures/allureTestOps_2.png)




### Уведомления в Telegram с использованием бота:
![bot_result](/pictures/telegram.png)

### Видео примера запуска теста в Selenoid:

<p>
<img title="Selenoid Video" src="/pictures/93ecee38f0bc3ae75051dcf127febdd6.gif" width="750" height="459"  alt="video"> 
</p>
