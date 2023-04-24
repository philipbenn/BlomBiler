DROP DATABASE IF EXISTS blombiler;
CREATE DATABASE blombiler;
USE blombiler;

CREATE TABLE employee 
(
employee_id 			int				auto_increment  not null primary key,
employee_first_name		varchar(40)						not null,
employee_last_name		varchar(40)						not null,
employee_password		varchar(40)						not null
);

CREATE TABLE customer
(
customer_id				int				auto_increment				not null primary key,
customer_first_name		varchar(40)									not null,
customer_last_name		varchar(40)									not null,
custoemr_password		varchar(40)									not null
);

CREATE TABLE car
(
car_id					int				auto_increment  			not null primary key,
brand_name				varchar(40)									not null,
model_name				varchar(40)									not null,
fuel_type				enum('Benzin', 'Diesel', 'El', 'Hybrid')	not null,
category				varchar(40),
upfront_payment			int,
monthly_payment			int											not null,
car_image				varchar(5000),
car_feature				varchar(5000),
car_description			varchar(5000)
);

CREATE TABLE car_customer
(
car_customer_id			int				auto_increment				not null primary key,
customer_id				int											not null,
car_id					int											not null,
																	foreign key (customer_id) references customer (customer_id),
                                                                    foreign key (car_id) references car (car_id)
);
