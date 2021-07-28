-- Агрегатные функции

SELECT * FROM employees;

-- Количество работников
SELECT COUNT(*) FROM employees;

-- Количество уволенных работников
SELECT COUNT(*)
FROM employees
WHERE employees.dismissal_date IS NOT NULL;

SELECT * FROM employees;

-- AVG
SELECT
    avg(employee_id) avg_employee_id,
    sum(employee_id) sum_employee_id,
    min(employment_date) min_employment_date,
    max(employment_date) max_employment_date
FROM employees;

-- --------------------------
-- GROUP BY, HAVING
-- --------------------------

-- Сколько сотрудников работает в каждом подразделении

-- так выведет общее количество
SELECT count(*)
FROM departments d
JOIN employees e ON e.department_id = d.department_id;

-- разбивка на группы - GROUP BY

SELECT d.name, count(e.employee_id)
FROM departments d
JOIN employees e ON e.department_id = d.department_id
GROUP BY d.name;

-- Нет отдела продаж. Как его добавить? И почему его нет?
SELECT * FROM departments;
SELECT * FROM employees;
-- См. ниже









-- Использовать LEFT JOIN (в отделе продаж нет сотрудников)
SELECT d.name, count(e.employee_id)
FROM departments d
LEFT JOIN employees e ON e.department_id = d.department_id
GROUP BY d.name;

-- Подразделения без сотрудников - HAVING
SELECT d.name, count(e.employee_id)
FROM departments d
LEFT JOIN employees e ON e.department_id = d.department_id
GROUP BY d.name
HAVING count(e.employee_id) = 0;
