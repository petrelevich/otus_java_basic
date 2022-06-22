INSERT INTO departments(name, manager)
VALUES 
('Бухгалтерия', 'Иванов'),
('Отдел продаж', null),
('Отдел ИТ', 'Петров'),
('Отдел закупок', null);

INSERT INTO employees(full_name, department_id, employment_date, dismissal_date)
VALUES
('Иванов Иван Иванович', 1, '2020-01-01', null),
('Петров Петр Петрович', 1, '2020-02-01', '2021-05-01'),
('Петров Иван Петрович', 3, '2020-08-15', null),
('Иванов Петр', 4, '2021-04-04', null),
('Сидоров', null, '2021-05-25', null);
