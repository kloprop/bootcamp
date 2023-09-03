create schema exercise2;
use exercise2;
CREATE TABLE WORKER (
  WORKER_ID INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
  FIRST_NAME CHAR(25),
  LAST_NAME CHAR(25),
  SALARY NUMERIC(15),
  JOINING_DATE DATETIME,
  DEPARTMENT CHAR(25)
);

-- inesrt data to worker
INSERT INTO WORKER 
  (FIRST_NAME, LAST_NAME, SALARY, JOINING_DATE, DEPARTMENT) VALUES
    ('Monika', 'Arora', 100000, '21-02-20 09:00:00', 'HR'),
    ('Niharika', 'Verma', 80000, '21-06-11 09:00:00', 'Admin'),
    ('Vishal', 'Singhal', 300000, '21-02-20 09:00:00', 'HR'),
    ('Mohan', 'Sarah', 300000, '12-03-19 09:00:00', 'Admin'),
    ('Amitabh', 'Singh', 500000, '21-02-20 09:00:00', 'Admin'),
    ('Vivek', 'Bhati', 490000, '21-06-11 09:00:00', 'Admin'),
    ('Vipul', 'Diwan', 200000, '21-06-11 09:00:00', 'Account'),
    ('Satish', 'Kumar', 75000, '21-01-20 09:00:00', 'Account'),
    ('Geetika', 'Chauhan', 90000, '21-04-11 09:00:00', 'Admin');

-- create table bonus
CREATE TABLE BONUS (
  WORKER_REF_ID INTEGER,
  BONUS_AMOUNT NUMERIC(10),
  BONUS_DATE DATETIME,
  FOREIGN KEY (WORKER_REF_ID) REFERENCES Worker(WORKER_ID)
);
select * from bonus;

-- task1
insert into Bonus values((select worker_id from Worker where first_name = 'Vivek'),32000, '2021-11-02');
insert into Bonus values((select worker_id from Worker where first_name = 'Vivek'),20000, '2022-11-02');
insert into Bonus values((select worker_id from Worker where first_name = 'Amitabh'),21000, '2021-11-02');
insert into Bonus values((select worker_id from Worker where first_name = 'Geetika'),30000, '2021-11-02');
insert into Bonus values((select worker_id from Worker where first_name = 'Satish'),4500, '2022-11-02');

-- task2
select coalesce(max(salary)) as secondHighestSalary
from  Worker
where salary <>(
select max(salary)
from Worker)
;

-- task3
With max_salary as (
select department , max(salary) as max_salary
from Worker 
group by department
)

select w.department as department,concat(w.first_name,' ', w.last_name) as name
from worker w,  max_salary w2
where  w.department = w2.department
and w.salary = w2.max_salary;

-- task4
select salary ,group_concat(concat (first_name, ' ', last_name) ) as empolyees
from worker
group by salary
order by salary desc;

-- task 5

select concat(w.first_name, ' ', w.last_name) as name,w.salary + sum(coalesce(b.bonus_amount, 0)) as total_amount
from Worker w left join Bonus b on w.worker_id = b.worker_ref_id
group by w.worker_id;




