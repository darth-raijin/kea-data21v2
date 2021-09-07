CREATE DATABASE KEA;
USE KEA;

CREATE TABLE students (
	id serial primary key UNIQUE NOT NULL,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    cpr_number VARCHAR(11) UNIQUE NOT NULL,
    enrollment_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP(),
    class_1 VARCHAR(255),
    grade_1 INT,
	class_2 VARCHAR(255),
    grade_2 INT,
	class_3 VARCHAR(255),
    grade_3 INT,
	class_4 VARCHAR(255),
    grade_4 INT
);

INSERT INTO students (first_name, last_name, cpr_number, class_1, grade_1)
VALUES ("CoCo", "DeLoco", "120554-2459", "Programming", "-03");

INSERT INTO students (first_name, last_name, cpr_number, class_1, grade_1)
VALUES ("BadMann", "Demitri", "041197-1211", "Virksomhed", "12");

SELECT * FROM students;
