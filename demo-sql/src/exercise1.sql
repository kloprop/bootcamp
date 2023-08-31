create schema exercise1;
USE EXERCISE1;
CREATE TABLE REGIONS(
REGION_ID INTEGER,
REGION_NAME VARCHAR(25),
PRIMARY KEY (REGION_ID)
);

CREATE TABLE COUNTRIES(
COUNTRY_ID VARCHAR(2),
COUNTRY_NAME VARCHAR(40),
REGION_ID INTEGER,
PRIMARY KEY (COUNTRY_ID),
FOREIGN KEY (REGION_ID) REFERENCES REGIONS(REGION_ID)
);

CREATE TABLE LOCATIONS(
LOCATION_ID INTEGER,
STREET_ADDRESS VARCHAR(25),
POSTAL_CODE VARCHAR(12),
CITY VARCHAR(30),
STATE_PROVINCE VARCHAR(12),
COUNTRY_ID CHAR(2),
PRIMARY KEY (LOCATION_ID),
FOREIGN KEY (COUNTRY_ID) REFERENCES COUNTRIES(COUNTRY_ID)
);

CREATE TABLE DEPARTMENTS(
DEPARTMENT_ID INTEGER,
DEPARTMENT_NAME VARCHAR(30),
MANAGER_ID INTEGER,
LOCATION_ID INTEGER,
PRIMARY KEY (DEPARTMENT_ID),
FOREIGN KEY (LOCATION_ID) REFERENCES LOCATIONS (LOCATION_ID)
);
DROP TABLE JOBS;

CREATE TABLE JOBS(
JOB_ID VARCHAR(10),
JOB_TITLE VARCHAR(35),
MIN_SALARY INTEGER,
MAX_SALARY INTEGER,
PRIMARY KEY (JOB_ID)
);

CREATE TABLE JOB_GRADES(
GRADE_LEVEL VARCHAR(2),
LOWEST_SAL INTEGER,
HIGHEST_SAL INTEGER,
PRIMARY KEY(GRADE_LEVEL)
);
DROP TABLE JOB_HISTORY;

CREATE TABLE JOB_HISTORY(
EMPLOYEE_ID INTEGER,
START_DATE DATE,
END_DATE DATE,
JOB_ID VARCHAR(20),
DEPARTMENT_ID INTEGER,
PRIMARY KEY (EMPLOYEE_ID,START_DATE),
FOREIGN KEY (JOB_ID) REFERENCES JOBS(JOB_ID),
FOREIGN KEY (DEPARTMENT_ID) REFERENCES DEPARTMENTS (DEPARTMENT_ID)
);

CREATE TABLE EMPLOYEES(	
EMPLOYEE_ID INTEGER,
FIRST_NAME VARCHAR(20),
LAST_NAME VARCHAR(25),
EMAIL VARCHAR(25),
PHONE_NUMBER VARCHAR(20),
HIRE_DATE DATE,
JOB_ID VARCHAR(10),
SALARY INTEGER,
COMMISSION_PCT INTEGER,
MANAGER_ID INTEGER,
DEPARTMENT_ID INTEGER,
PRIMARY KEY (EMPLOYEE_ID),
FOREIGN KEY (EMPLOYEE_ID) REFERENCES JOB_HISTORY (EMPLOYEE_ID),
FOREIGN KEY (DEPARTMENT_ID) REFERENCES DEPARTMENTS (DEPARTMENT_ID)
);

CREATE TABLE MANAGERS(
MANAGER_ID INTEGER,
FIRST_NAME VARCHAR(20),
LAST_NAME VARCHAR(30),

PRIMARY KEY(MANAGER_ID)
);
insert into MANAGERS values(103, 'Peter', 'But');
insert into Managers values(105, 'Winnie', 'Sit');
insert into Managers values(108, 'John', 'Wong');
insert into Managers values(109, 'Mark', 'Lee');
insert into Managers values(200, 'Kate', 'Woo');
insert into Managers values(201, 'Matt', 'Lui');
insert into Managers values (202, 'Dick', 'Sin');

insert into REGIONS values (1,'Europe');
insert into REGIONS values (2, 'America');
insert into REGIONS values (3, 'Asia');

insert into countries values('DE','Germany',1);
insert into countries values('IT','Italy',1);
insert into countries values ('JP','Japan',3);
insert into countries values ('US','United State',2);

select * from locations;
insert into locations values(1000, '1297 Via Cola di Rie', '989', 'Roma', ' ', 'IT');
insert into locations values(1100,'93091 Calle della Te','10934','Venice',' ', 'IT');
insert into locations values(1200,'2017 Shinjuku-ku','1689','Toyto','Toyto Prefec', 'JP');
insert into locations values(1400,'2014 Jabberwocky Rd','26192','Southlake','Texas', 'US');



insert into departments values(10,'Administration', 200, 1100);
insert into departments values(20,'Marketing', 201, 1200);
insert into departments values (30, 'Purchasing' ,202, 1400);

insert into jobs values('IT_PROG','programmer', 40000, 80000 );
insert into jobs values ('MK_REP', 'reception' , 13000, 20000);
insert into jobs values ('ST_CLERK', 'Clerk', 12000, 20000);

insert into job_history values(102, '1993-01-13', '1998-07-24', 'IT_PROG', 20);
insert into job_history values(101, '1989-09-21', '1993-10-27', 'MK_REP', 10);
insert into job_history values(101, '1993-10-28', '1998-03-15', 'MK_REP', 30);
insert into job_history values(100, '1996-02-17', '1999-12-19', 'ST_CLERK', 30);
insert into job_history values(103, '1998-03-24', '1999-12-31', 'MK_REP', 20);

insert into employees values(100, 'Steven', 'King', 'SKING', '515-1234567', '1987-06-17', 'ST_CLERK', 24000.00, 0.00, 109, 10);
insert into employees values(101, 'Neena', 'Kochhar', 'NKOCHHAR', '515-1234568', '1987-06-18', 'MK_REP', 17000.00, 0.00, 103, 20);
insert into employees values(102, 'Lex', 'De Haan', 'LDEHAAN', '515-1234569', '1987-06-19', 'IT_PROG', 17000.00, 0.00, 108, 30);
insert into employees values(103, 'Alexander', 'Hunold', 'AHUNOLD', '590-4234567', '1987-06-20', 'HK_REP', 9000.00, 0.00, 105, 20);

-- Q3
select l.location_id,l.street_address, l.city, l.state_province, c. country_name
from LOCATIONS l, countries c 
where c.country_id = l.country_id;


-- Q4
select first_name, last_name , department_id
from EMPLOYEES;

-- Q5
select e.first_name, e.last_name, e.job_id, e.department_id
from employees e, departments d, locations l, countries c
where e.department_id = d.department_id 
and d.location_id = l.location_id
and l.country_id = c.country_id
and c.country_id = 'JP';

-- Q6
select e.employee_id, e.last_name, m.manager_id, m.last_name
from Employees e, Managers m
where e.manager_id = m.manager_id;

-- Q7
With date_table as(
select hire_date as target
from employees
where last_name = 'De Haan'
and first_name = 'Lex')

select e.first_name, e.last_name, e.hire_date
from Employees e, date_table d
where hire_date > d.target;

-- Q8
select d.department_name, count(e.employee_id)
from Employees e, Departments d
where e.department_id = d.department_id
group by d.department_id;

-- Q9
select j.employee_id, j2.job_title, datediff(j.end_date, j.start_date) as nums_of_day
from Job_history j, Jobs j2
where j.job_id = j2.job_id
and j.department_id = 30;

-- Q10
select d.department_name, concat(m.first_name, m.last_name) as manager_name, l.city, c.country_name
from Departments d, Managers m, Locations l, Countries c
where d.manager_id = m.manager_id
and d.location_id = l.location_id
and l.country_id = c.country_id;

-- Q11
select d.department_name, Round (avg(e.salary), 2) as average_salary
from Departments d, Employees e
where d.department_id = e.department_id
group by d.department_id