CREATE DATABASE CompanyDB;

USE CompanyDB;

CREATE TABLE Employee (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    salary DOUBLE
);

INSERT INTO Employee VALUES
(101,'Rahul',35000),
(102,'Amit',45000),
(103,'Priya',50000);

DELIMITER $$

CREATE PROCEDURE GetEmployee(IN empId INT)
BEGIN
    SELECT * FROM Employee
    WHERE id = empId;
END $$

DELIMITER ;