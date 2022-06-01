-- --------------------------------
-- Запросы из нескольких таблиц
-- --------------------------------
-- Что в таблицах
SELECT * FROM departments;
SELECT * FROM employees;

-- CROSS JOIN (Декартово произведение - все строки одной таблицы со всеми строками второй)
-- Алиасы (псевдонимы имен таблиц)
SELECT e.*, d.*
FROM employees AS e
CROSS JOIN departments d

-- JOIN - внутреннее соединение, добавляется условие
SELECT employees.*, departments.*
FROM employees
JOIN departments ON departments.department_id = employees.department_id;

-- Выводим только нужные колонки
-- Псевдонимы (алиасы) таблиц - сокращают запись
SELECT e.full_name, d.name AS department_name
FROM employees AS e
JOIN departments d ON d.department_id = e.department_id;

-- Кто видит проблему? Где Сидоров?
SELECT * FROM employees;
-- См. ниже













SELECT e.full_name, d.name AS department_name
FROM employees AS e
LEFT JOIN departments d ON d.department_id = e.department_id;

-- RIGHT JOIN
SELECT e.full_name, d.name AS department_name
FROM departments AS d
RIGHT JOIN employees e ON d.department_id = e.department_id;

-- Если нет причин использовать RIGHT JOIN, то используйте LEFT JOIN - читается проще

-- FULL JOIN = LEFT JOIN + RIGHT JOIN

SELECT * FROM departments;
SELECT * FROM employees;

SELECT e.full_name, d.name AS department_name
FROM employees AS e
FULL JOIN departments d ON d.department_id = e.department_id;
