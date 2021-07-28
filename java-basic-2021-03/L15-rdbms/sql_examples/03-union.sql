-- UNION

SELECT * FROM departments;
SELECT * FROM employees;

-- Задача - отобразить названия подразделений и ФИО сотрудников в одной колонке

SELECT name FROM departments
UNION
SELECT full_name FROM employees;

-- Задача - сначала отобразить подразделения, потом сотрудников
-- http://sqlfiddle.com/#!9/48d6f7/6
-- Подсказка - можно в SELECT писать константы:
SELECT 1;

SELECT 1
UNION
SELECT 2;

SELECT 1 AS some_column_name
UNION
SELECT 2
UNION
SELECT 3;
-- См. ниже










SELECT 1 as row_type, name FROM departments
UNION
SELECT 2, full_name FROM employees
ORDER BY row_type;

-- EXCEPT на самостоятельное изучение
-- https://metanit.com/sql/postgresql/6.6.php

-- INTERSECT на самостоятельное изучение
-- https://metanit.com/sql/postgresql/6.7.php