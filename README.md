# PortSwiggerTest
# Проект по автоматизации тестирования подписок на tinkoff.ru
## :pushpin: Содержание:

- [Использованный стек технологий](#computer-использованный-стек-технологий)
- [Сборка в Jenkins](#-сборка-в-jenkins)
- [Запуск тестов](#running_woman-запуск-тестов)
- [Пример Allure-отчета](#-пример-allure-отчета)
- [Уведомления в Telegram с использованием бота](#-уведомления-в-telegram-с-использованием-бота)
- [Видео примера запуска теста в Selenoid](#-видео-примера-запуска-теста-в-selenoid)

## :computer: Использованный стек технологий






## Реализованные проверки:

- *Проверка выпадающего меню элементов хедера главной страницы*
- *Проверка изменения при наведении логотипов клиентов*
- *Проверка выпадающего меню кнопки гамбургера*
- *Проверка наличия ссылок на кнопках в хедере главной страницы*





##  Сборка в Jenkins
[Build](https://jenkins.autotests.cloud/job/C17-eaach-lesson14-HW2/)
![jenkins_build](/pictures/jenkins.png)

__*Параметры сборки:*__
![jenkins_parameters](/pictures/jenkins_2.png)

## :running_woman: Запуск тестов
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


__Тестовые сценарии:__


__Примеры запусков:__


## Jira
__Пример интеграции:__



### Уведомления в Telegram с использованием бота:
![bot_result](/pictures/telegram.png)

### Видео примера запуска теста в Selenoid:
https://github.com/Elena-Chaplygina/PortSwiggerTest/blob/main/pictures/93ecee38f0bc3ae75051dcf127febdd6%20(online-video-cutter.com).mp4
