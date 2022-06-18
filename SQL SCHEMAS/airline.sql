drop schema if exists airline;
create schema airline;
use airline;


create table aircraft (
	aircraft_name varchar(255),
    total_seats int,
    primary key (aircraft_name)
);

create table customers (
	id int not null auto_increment,
    customer_name varchar(255),
    customer_status varchar(255),
    customer_total_mileage int,
    primary Key (id)
);

create table flights (
	flight_number varchar(5),
    aircraft_name varchar(255),
    flight_mileage int,
    primary key (flight_number),
    foreign key(aircraft_name) references aircrafts(aircraft_name)
);

create table airline (
	id int not null auto_increment,
    flight_number varchar(5),
    customer_id int,
    primary key (id),
    foreign key (flight_number) references fligths(flight_number),
    foreign key (customer_id) references customers(id)
);

insert into aircraft values
	('Boeing-747', 400),
	('Boeing-777', 264),
	('Airbus-A330', 236);

insert into customers (customer_name, customer_status, customer_total_mileage)  values
	('Agustine Riviera', 'Silver', 115235),
	('Alaina Sepulvida', 'None', 6008),
	('Tom Jones', 'Gold', 205767),
	('Sam Rio', 'None', 2653),
	('Jessica James', 'Silver', 127656),
	('Ana Janco', 'Silver', 136773),
	('Jennifer Cortez', 'Gold', 300582),
	('Christian Janco', 'Silver', 14642);

insert into flights values
	('DL143', 'Boeing-747', 135),
	('DL122', 'Airbus-A330', 4370),
	('DL53', 'Boeing-777', 2078),
	('DL222', 'Boeing-777', 1765),
	('DL37', 'Boeing-747', 531);

insert into airline (flight_number, customer_id) values
	('DL143', 1),
	('DL122', 1),
	('DL122', 2),
	('DL122', 3),
	('DL53', 3),
	('DL143', 4),
	('DL222', 3),
	('DL143', 5),
	('DL222', 6),
	('DL222', 7),
	('DL122', 5),
	('DL37', 4),
	('DL222', 8);