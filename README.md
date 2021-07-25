# demoServlet

[![Build Status](https://travis-ci.com/OKaluzny/demoServlet.svg?branch=master)](https://travis-ci.com/OKaluzny/demoServlet)

Для того что бы запустить это приложение, необходимо:

1. Сделать Fork данного проекта (приоритет) или клонировать репозиторий

```bash
git clone https://github.com/OKaluzny/demoServlet.git
```

2. Собрать это приложение с помощью maven 

```bash
mvn clean install
```
3. Скачать и установить WildFly. Запустить WildFly. Перейти в каталог /bin и вызвать standalone
   далее задеплоить приложение с помощью команды

```bash
mvn org.wildfly.plugins:wildfly-maven-plugin:2.0.2.Final:deploy
```
4. Скачать и установить клиент запросов Postman
   
Коллекция запросов: https://www.getpostman.com/collections/b138f38f94df025bc9c7
   
5. Скачать и установить базу данных MySQL
```bash
USE employee;
create table users
(
    id           int auto_increment
        primary key,
    first_name   varchar(50) null,
    second_name  varchar(50) null,
    birthdate    varchar(50) null,
    speciality   varchar(50) null,
    country      varchar(50) null,
    phone_number varchar(50) null,
    email        varchar(50) null
);
```