create database airplane;
use airplane;

create table login
(
username varchar(60) primary key,
password varchar(20)
);

show tables;

select *from login;

create table flightdetails
(
airlinename varchar(30),
price double,
flightno varchar(20) primary key,
sourcecity varchar(20),
destinationcity varchar(20),
depaturetime time,
arrivaltime time,
totalseats int,
bookedseats int,
availableseats int ,
dateoftravel date,
class varchar(10));
desc flightdetails;
drop table flightdetails;
insert into flightdetails values('Deccon',500,'CH1','chennai','coimbatore','09:00','10:00',80,3,77,'2012-12-12','economic');
insert into flightdetails values('Deccon',500,'CH2','chennai','banglore','09:30','10:30',100,40,60,'2012-12-12','economic');
insert into flightdetails values('Deccon',1500,'CH3','chennai','mumbai','10:00','11:30',150,50,100,'2012-12-12','business');
insert into flightdetails values('Deccon',1500,'CH4','chennai','delhi','10:30','12:00',100,20,80,'2012-12-12','business');

insert into flightdetails values('Deccon',500,'CH5','chennai','coimbatore','09:00','10:00',80,3,77,'2012-12-13','economic');
insert into flightdetails values('Deccon',500,'CH6','chennai','banglore','09:30','10:30',100,40,60,'2012-12-13','economic');
insert into flightdetails values('Deccon',1500,'CH7','chennai','mumbai','10:00','11:30',150,50,100,'2012-12-13','business');
insert into flightdetails values('Deccon',1500,'CH8','chennai','delhi','10:30','12:00',100,20,80,'2012-12-13','business');
insert into flightdetails values('airjazz',2000,'aj1','chennai','coimbatore','09:00','10:00',80,3,77,'2012-12-14','economic');
insert into flightdetails values('airjazz',4500,'aj2','chennai','banglore','09:30','10:30',100,40,60,'2012-12-14','business');
insert into flightdetails values('airjazz',6500,'aj3','chennai','mumbai','10:00','11:30',150,50,100,'2012-12-14','business');
insert into flightdetails values('airjazz',6500,'aj4','chennai','delhi','10:30','12:00',100,20,80,'2012-12-14','business');
insert into flightdetails values('airjazz',2000,'aj5','chennai','coimbatore','09:00','10:00',80,3,77,'2012-12-15','economic');
insert into flightdetails values('airjazz',3000,'aj6','chennai','banglore','09:30','10:30',100,40,60,'2012-12-15','economic');
insert into flightdetails values('airjazz',4500,'aj7','chennai','mumbai','10:00','11:30',150,50,100,'2012-12-15','business');
insert into flightdetails values('airjazz',1500,'aj8','chennai','delhi','10:30','12:00',100,20,80,'2012-12-15','business');

select * from flightdetails;

create table registerdetails(
name varchar(30),
address varchar(100),
age int,
pno int,
username varchar(60) primary key,
govproof varchar(30),
country varchar(20),
foreign key(username) references login(username));
desc registerdetails;

create table booking(
username varchar(60),
bookingid varchar(20) primary key,
flightno varchar(20),
foreign key(username) references login(username),
foreign key(flightno) references flightdetails(flightno));
desc booking;
insert into login values('asd@gmail.com','asd123');

select * from booking;
select * from login;
create table sample as 
select l.username,
f.flightno from login l,flightdetails f;

show tables;
drop table booking;
drop table flightdetails;
drop table registerdetails;

create table flightdetails
(
airline_name varchar(30),
price double,
flight_no varchar(20) primary key,
source_city varchar(20),
destination_city varchar(20),
depature_time time,
arrival_time time,
total_seats int,
booked_seats int,
available_seats int ,
date_of_travel date,
class varchar(10));


insert into flightdetails values('airindia',500,'AI1','chennai','coimbatore','09:00','10:00',80,3,77,'2012-12-12','economic');
insert into flightdetails values('airindia',500,'AI2','chennai','banglore','09:30','10:30',100,40,60,'2012-12-12','economic');
insert into flightdetails values('airindia',2500,'AI3','chennai','mumbai','10:00','11:30',150,50,100,'2012-12-12','economic');
insert into flightdetails values('airindia',4500,'AI4','chennai','delhi','10:30','12:00',100,20,80,'2012-12-12','economic');

insert into flightdetails values('airindia',500,'AI5','chennai','coimbatore','09:00','10:00',80,3,77,'2012-12-13','economic');
insert into flightdetails values('airindia',500,'AI6','chennai','banglore','09:30','10:30',100,40,60,'2012-12-13','economic');
insert into flightdetails values('airindia',4500,'AI7','chennai','mumbai','10:00','11:30',150,50,100,'2012-12-13','business');
insert into flightdetails values('airindia',5500,'AI8','chennai','delhi','10:30','12:00',100,20,80,'2012-12-13','business');


insert into flightdetails values('emirates',2000,'EM1','chennai','coimbatore','09:00','10:00',80,3,77,'2012-12-14','economic');
insert into flightdetails values('emirates',4500,'EM2','chennai','banglore','09:30','10:30',100,40,60,'2012-12-14','business');
insert into flightdetails values('emirates',6500,'EM3','chennai','mumbai','10:00','11:30',150,50,100,'2012-12-14','business');
insert into flightdetails values('emirates',6500,'EM4','chennai','delhi','10:30','12:00',100,20,80,'2012-12-14','business');

insert into flightdetails values('emirates',2000,'EM5','chennai','coimbatore','09:00','10:00',80,3,77,'2012-12-15','economic');
insert into flightdetails values('emirates',6000,'EM6','chennai','banglore','09:30','10:30',100,40,60,'2012-12-15','business');
insert into flightdetails values('emirates',4500,'EM7','chennai','mumbai','10:00','11:30',150,50,100,'2012-12-15','business');
insert into flightdetails values('emirates',1500,'EM8','chennai','delhi','10:30','12:00',100,20,80,'2012-12-15','business');

select * from flightdetails;
desc flightdetails;
create table registerdetails(
name varchar(30),
address varchar(100),
age int,
pno int,
username varchar(60) primary key,
govproof varchar(30),
country varchar(20),
foreign key(username) references login(username));
desc registerdetails;

select * from login;
ALTER TABLE flightdetails CHANGE class type varchar(10) AFTER date_of_travel;

insert into flightdetails values('emirates',6500,'EM9','chennai','delhi','10:30','12:00',100,20,80,'2012-12-15','economic');
alter table registerdetails
add column gidvalue varchar(20)  after govproof;
desc registerdetails;
select * from registerdetails;
INSERT INTO registerdetails (username)
VALUES ('jillu@gmail.com');

drop table registerdetails;

create table registerdetails(
name varchar(30),
address varchar(100),
age int,
pno int,
username varchar(60) primary key,
govproof varchar(30),
country varchar(20)
);
drop table registerdetails;


create table registerdetails(
name varchar(30),
address varchar(100),
age int,
pno int,
username varchar(60) primary key,
govproof varchar(30),
gidvalue varchar(30),
country varchar(20)
);

desc registerdetails;
select * from registerdetails;
desc flightdetails;

UPDATE flightdetails
SET booked_seats =booked_seats+3, available_seats =total_seats-booked_seats
WHERE flight_no = 'AI1';
select * from flightdetails;
select airline_name,flight_no,depature_time,arrival_time,available_seats,price*2 as Payable_price,type from flightdetails where flight_no='EM9';

desc booking;
desc login;

desc booking;
select * from login;
insert into booking(username,flight_no)
select username ,flight_no from
login,flightdetails
where username='raja@gmail.com' and flight_no='EM9';

create table booking(
username varchar(60),
bookingid int primary key AUTO_INCREMENT,
flight_no varchar(20),
foreign key(username) references login(username),
foreign key(flight_no) references flightdetails(flight_no));
drop table booking;
select * from booking;
create table admin(
aid int primary key,
cpassword varchar(20),
npassword varchar(20),
opassword varchar(20));
desc admin;
drop table admin;

create table admin(
aid int primary key,
cpassword varchar(20),
npassword varchar(20)
);
select * from admin;
insert into admin(aid,cpassword)
values(1,'1111');
insert into admin(aid,cpassword)
values(2,'2222');
insert into admin(aid,cpassword)
values(3,'3333');
update  admin 
set npassword='abcd',cpassword=npassword
where aid=2;
select * from flightdetails;
select * from booking;
select * from registerdetails;
select * from login;