CREATE TABLE PRODUCT(
	ID SERIAL,
	SKU VARCHAR(32),
	PRODUCT_NAME VARCHAR(128),
	PRODUCT_DESCRIPTION TEXT,
	CURRENT_PRICE DECIMAL(8,2),
	QUANTITY_IN_STOCK INT
);
alter table Product add primary key (id);

CREATE TABLE CITY(
	ID SERIAL,
	NAME VARCHAR(20))
alter table city add primary key(id);

CREATE TABLE CUSTOMER(
	ID SERIAL PRIMARY KEY,
	CUSTOMER_NAME VARCHAR(255),
	CITY_ID INT,
	CUSTOMER_ADDRESS VARCHAR(255),
	CONTACT_PERSON VARCHAR(255) NOT NULL,
	EMAIL VARCHAR(128),
	PHONE VARCHAR(128),
	FOREIGN KEY (CITY_ID) REFERENCES CITY(ID)
)
alter table customer alter column contact_person drop not null;

CREATE TABLE INVOICE (
	ID SERIAL PRIMARY KEY,
	INVOICE_NUMBER VARCHAR(255),
	CUSTOMER_ID INT,
	USER_ACCOUNT_ID INT,
	TOTAL_PRICE DECIMAL(8,2),
	TIME_ISSUED VARCHAR ,
	TIME_DUE VARCHAR ,
	TIME_PAID VARCHAR ,
	TIME_CANCELED VARCHAR ,
	TIME_REFUNDED VARCHAR ,
	FOREIGN KEY(CUSTOMER_ID) REFERENCES CUSTOMER(ID)
)

CREATE TABLE INVOICE_ITEM(
	ID INT PRIMARY KEY,
	INVOICE_ID INT,
	PRODUCT_ID INT,
	QUANTITY INT,
	PRICE DECIMAL(8,2),
	LINE_TOTAL_PRICE DECIMAL(8,2),
	FOREIGN KEY (INVOICE_ID) REFERENCES INVOICE(ID),
	FOREIGN KEY (PRODUCT_ID) REFERENCES PRODUCT (ID)
)
select * from product;
insert into Product values (1,'330120', 'Games Of Thrones - URBAN DECAY','Game Of Thrones Eyeshadow Palette', 65, 122 );
insert into Product values (2,'330121', 'Advanced Night Repair - ESTEE LAUDER','Advanced Night Repair Synchronized Recovery Complex II', 98, 51 );
insert into Product values (3,'330122', 'Rose Deep Hydration - FRESH','Rose Deep Hydration Facial Toner', 45, 34 );
insert into Product values (4,'330123', 'Pore - Perfecting Moisturizer - TATCHA','Pore - Perfecting Moisturizer & Cleanser Duo', 25, 393 );
insert into Product values (5,'330124', 'Capture Youth - DIOR','Capture Youth Serum Collection', 95, 74 );
insert into Product values (6,'330125', 'Slice of Glow - GLOW RECIPE','Slice of Glow Set', 45, 40 );
insert into Product values (7,'330126', 'Healthy Skin - KIEHL S SINCE 1851','Healthy Skin Squad', 68, 154 );
insert into Product values (8,'330127', 'Power Pair! - IT COSMETICS','IT is Your Skincare Power Pair! Best-Selling Moisturizer & Eye Cream Duo', 80, 0 );
insert into Product values (9,'330128', 'Dewy Skin Mist - TATCHA','Limited Edition Dewy Skin Mist Mini', 20, 281 );
insert into Product values (10,'330129', 'Silk Pillowcase - SLIP','Silk Pillowcase Duo + Scrunchies Kit', 170, 0 );

insert into City values(1,'Hong Kong');
insert into City values(2,'Tai pei');
insert into City values(3,'Toyto');
insert into City values(4,'Seoul');
select * from City;

insert into Customer values(1,'Drogerie Wien', 1,'Deckergasse 15A', 'Emil Steinbach', 'emil@drogeriewien.com','094234234');
insert into Customer values(2,'Cosmetics Store', 4,'Watling Street 347', 'Jeremy Corbyn', 'jeremy@c-store.org','093923923');
insert into Customer values(3,'Kosmetikstudio', 3,'Rothenbaumchaussee 53', 'Willy Brandt', 'willy@kosmetikstudio.com','0941562222');
insert into Customer values(4,'Neue Kosmetik', 1,'Karlsplatz 2', null, 'info@neuekosmetik.com','094109253');
insert into Customer values(5,'Bio Kosmetik', 2,'Mortzstrße 23', 'Clara Zetkin', 'clara@biokosmetik.org','093825825');
insert into Customer values(6,'K-Wien', 1,'Karntner Straße 204', 'Maria Rauch-Kallat', 'maria@kwien.org','093427002');
insert into Customer values(7,'Natural Cosmetics', 4,'Clerkenwell Road 14B', 'Glenda Jackson', 'glena.j@natural-cosmetics.com','093555123');
insert into Customer values(8,'Kosmetik Plus', 2,'Unter den Liden 1', 'Angela Merkel', 'angela@k-plus.com','094727727');
insert into Customer values(9,'New Line Cosmetics', 4,'Devonshire Street 92', 'Oilver Cromwell', 'oliver@nlc.org','093202404');
select * from Customer;

insert into Invoice values (1,'in_25181b07ba800c8d2fc967fe991807d9',7,4,1436,'7/20/2019 3:05:07 PM','7/27/2019 3:05:07 PM','7/25/2019 9:24:12 AM' ,null,null);
insert into Invoice values (2,'8fba0000fd456b27502b9f81e9d52481',9,2,1000,'7/20/2019 3:07:11 PM','7/27/2019 3:07:11 PM','7/20/2019 3:10:32 PM' ,null,null);
insert into Invoice values (3,'3b6638118246b6bcfd3dfcd9be487599',3,2,360,'7/20/2019 3:06:15 PM','7/27/2019 3:06:15 PM','7/31/2019 9:22:11 PM' ,null,null);
insert into Invoice values (4,'dfe7f0a01a682196cac0120a9adbb550',5,2,1675,'7/20/2019 3:06:34 PM','7/27/2019 3:06:34 PM',null ,null,null);
insert into Invoice values (5,'2a24cc2ad4440d698878a0a1a71f70fa',6,2,9500,'7/20/2019 3:06:42 PM','7/27/2019 3:06:42 PM',null ,'7/22/2019 11:17:02 AM',null);
insert into Invoice values (6,'cbd304872ca6257716bcab8fc43204d7',4,2,150,'7/20/2019 3:08:15 PM','7/27/2019 3:08:15 PM','7/27/2019 1:42:45 AM' ,null,'7/27/2019 2:11:20 PM');
select * from Invoice;

insert into Invoice_item values(1,1,1,20,65,1300);
insert into Invoice_item values(2,1,7,2,68,136);
insert into Invoice_item values(3,1,5,10,100,1000);
insert into Invoice_item values(4,3,10,2,180,360);
insert into Invoice_item values(5,4,1,5,65,325);
insert into Invoice_item values(6,4,2,10,95,950);
insert into Invoice_item values(7,4,5,4,100,400);
insert into Invoice_item values(8,5,10,100,95,9500);
insert into Invoice_item values(9,6,4,6,25,150);

select * from Invoice_item;

-- Question 1c

select id, customer_name as Customer
from Customer
where id not in (select customer_id from Invoice);

select id, product_name as Product
from Product
where id not in (select product_id from Invoice_item);

CREATE TABLE EMPLOYEE (
	ID SERIAL NOT NULL,
	EMPLOYEE_NAME VARCHAR(30) NOT NULL,
	SALARY NUMERIC(8,2),
	PHONE NUMERIC (15),
	EMAIL VARCHAR(50),
	DEPT_ID INTEGER NOT NULL
);
ALTER TABLE EMPLOYEE  ADD PRIMARY KEY (ID);
CREATE TABLE DEPARTMENT (
	ID SERIAL NOT NULL PRIMARY KEY,
	DEPT_CODE VARCHAR (3) NOT NULL,
	DEPT_NAME VARCHAR (200) NOT NULL)

-- Question 2
insert into employee values (1, 'John', 20000, 90234567, 'John@gmail.com',1);
insert into employee values (2, 'Mary', 10000, 90234561, 'Mary@gmail.com',1);
insert into employee values (3, 'Steve', 30000, 90234562, 'Steve@gmail.com',3);
insert into employee values (4, 'Sunny', 40000, 90234563, 'Sunny@gmail.com',4);
select dept_id from employee;

insert into department values (1,'HR','Human Resources');
insert into department values (2,'9UP','9UP Resources');
insert into department values (3,'SA','Sales Resources');
insert into department values (4,'IT','Information Technology Department');
select * from department;

select d.dept_code as Department_name, count(e.id) as count
from Department d left join Employee e  on e.dept_id = d.id
group by d.dept_code
order by count(e.id) desc , d.dept_code;