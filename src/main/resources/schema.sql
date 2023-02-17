create table Book
(
   id bigint auto_increment not null,
   name varchar(255) not null,
   primary key(id)
);

create table Author
(
   id bigint auto_increment not null,
   book_key bigint not null,
   book varchar(255),
   name varchar(255) not null,
   primary key(id)
);