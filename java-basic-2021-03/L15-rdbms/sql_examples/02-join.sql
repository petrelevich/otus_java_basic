-- --------------------------------
-- Запросы из нескольких таблиц
-- --------------------------------
-- Что в таблицах
SELECT * FROM departments;
SELECT * FROM employees;

-- JOIN
SELECT employees.full_name, departments.name AS department_name
FROM employees
JOIN departments ON departments.department_id = employees.department_id;

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

-- Если нет причин использовать RIGHT JOIN, то используйте LEFT JOIN - он читаемее

-- FULL JOIN

SELECT * FROM departments;
SELECT * FROM employees;

SELECT e.full_name, d.name AS department_name
FROM employees AS e
FULL JOIN departments d ON d.department_id = e.department_id;

-- CROSS JOIN (Декартово произведение - все строки одной таблицы со всеми строками второй)
SELECT e.full_name, d.name AS department_name
FROM employees AS e
CROSS JOIN departments d



