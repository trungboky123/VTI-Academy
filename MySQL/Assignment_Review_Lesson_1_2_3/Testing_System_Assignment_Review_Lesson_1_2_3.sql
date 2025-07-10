create database management;
use management;

create table customers(
      customer_id int auto_increment primary key,
      customer_name varchar(30) not null
);

create table loyalty_card(
      card_id int auto_increment primary key,
      customer_id int unique key,
      foreign key(customer_id) references customers(customer_id)
);

create table products(
      product_id int auto_increment primary key,
      product_name varchar(30) not null,
      category_id int not null,
      foreign key(category_id) references category(category_id)
);

create table orders(
     order_id int auto_increment primary key,
     order_date date not null,
     customer_id int,
     foreign key(customer_id) references customers(customer_id)
);

create table order_product(
      order_id int not null,
      product_id int not null,
      quantity int not null,
      primary key(order_id, product_id),
      foreign key(order_id) references orders(order_id),
      foreign key(product_id) references products(product_id)
);

create table category(
      category_id int auto_increment primary key,
      category_name varchar(30) not null
);


