-- --------------------------------
-- Создание новой базы данных
-- --------------------------------

CREATE DATABASE otus_demo;

-- Удалить БД можно так:
-- DROP DATABASE otus_demo;

-- Или можно создать через pgAdmin

-- Создавать будем БД оргструктуры:
-- Подразделение --1--*--> Сотрудник

-- --------------------------------
-- Подразделения
-- --------------------------------

CREATE TABLE departments
(
    department_id   SERIAL          PRIMARY KEY,
    name            VARCHAR(100)    NOT NULL UNIQUE,
    manager         VARCHAR(100)
);
-- SERIAL - целое число, автоинкремент
-- PRIMARY KEY - первичный ключ (автоматически NOT NULL и UNIQUE)
-- NOT NULL - поле не может быть NULL
-- UNIQUE - в поле не может быть повторяющихся значений

-- Удалить таблицу:
-- DROP  TABLE departments

-- Посмотрим, что в таблице
SELECT * FROM departments;
-- * - выбор всех колонок в таблице
-- но * в продакшн коде плохо

-- Заполним данными (INSERT)
INSERT INTO departments(name, manager)
VALUES ('Бухгалтерия', 'Иванов');

INSERT INTO departments(name)
VALUES ('Отдел продаж');

-- Проверим, что записи добавились
SELECT * FROM departments;

-- Можно добавлять несколько строк
INSERT INTO departments(name, manager)
VALUES
('Отдел ИТ', 'Петров'),
('Отдел закупок', null);

-- Посмотрим, что теперь в таблице
-- Выведем колонки в произвольном порядке
SELECT department_id, manager, name FROM departments;

-- Можем выводить не все колонки, а только нужные
SELECT name FROM departments;

-- Проверим работу ограничений
-- NOT NULL
INSERT INTO departments(name) VALUES (null);
-- UNIQUE
INSERT INTO departments(name) VALUES ('Отдел ИТ');

-- --------------------------------
-- Сотрудники
-- --------------------------------

CREATE TABLE employees
(
    employee_id     SERIAL          PRIMARY KEY,
    full_name       VARCHAR(100)    NOT NULL,
    department_id   INTEGER         REFERENCES departments (department_id),
    employment_date DATE            NOT NULL, /* дата приема на работу */
    dismissal_date  DATE /* дата увольнения */
);
-- REFERENCES departments (department_id) - внешний ключ
-- на таблицу departments, колонку department_id

-- Удалить таблицу:
-- DROP TABLE employees

SELECT * FROM employees;

INSERT INTO employees(full_name, department_id, employment_date, dismissal_date)
VALUES
       ('Иванов Иван Иванович', 1, '2020-01-01', null),
       ('Петров Петр Петрович', 1, '2020-02-01', '2021-05-01'),
       ('Петров Иван Петрович', 3, '2020-08-15', null),
       ('Иванов Петр', 4, '2021-04-04', null),
       ('Сидоров', null, '2021-05-25', null);

SELECT * FROM departments;
SELECT * FROM employees;

-- Проверим работу внешних ключей (FK)
-- Попробуем добавить сотрудника с несуществующим подразделением
INSERT INTO employees(full_name, department_id, employment_date, dismissal_date)
VALUES ('Петров', 100, '2020-01-01', null);

-- Попробуем удалить подразделение с сотрудниками
DELETE FROM departments
WHERE department_id = 1;

-- См. ON DELETE и ON UPDATE - https://metanit.com/sql/postgresql/2.5.php

-- ORDER BY
SELECT *
FROM employees;

SELECT *
FROM employees
ORDER BY full_name; -- эквивалентно ORDER BY full_name ASC;

-- Сортировка по убыванию - DESC
SELECT *
FROM employees
ORDER BY full_name DESC;

-- WHERE (фильтрация)
SELECT *
FROM employees;

SELECT *
FROM employees
WHERE employment_date > '2021-01-01';

-- Подразделения без руководителя
SELECT *
FROM departments
WHERE manager IS NULL;

-- Подразделения с руководителем
SELECT *
FROM departments
WHERE manager IS NOT NULL;

SELECT * FROM departments;

-- Ищем Иванова Ивана Ивановича
SELECT *
FROM employees
WHERE full_name = 'Иванов Иван Иванович';

-- LIKE
-- Начинается с "Иванов"
SELECT *
FROM employees
WHERE full_name  like 'Иванов%';

-- Заканчивается на "Иванович"
SELECT *
FROM employees
WHERE full_name  like '%Иванович';

-- Встречается в любом месте "Иванов"
SELECT *
FROM employees
WHERE full_name  like '%Иванов%';

-- Удаление (так удалить все записи)
DELETE FROM employees;

SELECT * FROM employees;

-- Вставим опять
INSERT INTO employees(full_name, department_id, employment_date, dismissal_date)
VALUES
('Иванов Иван Иванович', 1, '2020-01-01', null),
('Петров Петр Петрович', 1, '2020-02-01', '2021-05-01'),
('Петров Иван Петрович', 3, '2020-08-15', null),
('Иванов Петр', 4, '2021-04-04', null),
('Сидоров', null, '2021-05-25', null),
('Снегирев', null, '2021-05-20', null);

SELECT * FROM employees;

-- Удаление только нужных записей
DELETE FROM employees
WHERE full_name = 'Снегирев';

SELECT * FROM employees;

-- UPDATE - Изменение записей
UPDATE employees
SET full_name = 'Сидоров Петр'
WHERE full_name = 'Сидоров';

SELECT * FROM employees;