CREATE TABLE departments
(
    department_id   SERIAL          PRIMARY KEY,
    name            VARCHAR(100)    NOT NULL UNIQUE,
    manager         VARCHAR(100)
);

CREATE TABLE employees
(
    employee_id     SERIAL          PRIMARY KEY,
    full_name       VARCHAR(100)    NOT NULL,
    department_id   INTEGER         REFERENCES departments (department_id),
    employment_date DATE            NOT NULL, /* дата приема на работу */
    dismissal_date  DATE /* дата увольнения */
);

