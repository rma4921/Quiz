CREATE database tester;

use tester;

CREATE TABLE customer (
    customer_id INT PRIMARY KEY,  
    email VARCHAR(100) UNIQUE,        
    phone_number VARCHAR(15) UNIQUE
);

CREATE TABLE employee (
    id INT PRIMARY KEY,  
    name VARCHAR(50),        
    position VARCHAR(100),
    hire_date DATETIME DEFAULT NOW()
);
INSERT INTO employee (id, name, position, hire_date) VALUES
(1, '금종민', '소프트웨어 엔지니어', '2023-04-08 13:00:00'),
(2, '바보', '멍청이', '2025-03-26 09:00:00'),
(3, '테스터', '테스터', '2025-03-26 18:00:00');

SELECT * FROM employee;