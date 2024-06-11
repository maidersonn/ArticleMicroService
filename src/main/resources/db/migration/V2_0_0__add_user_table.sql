create table if not exists users (
    id serial NOT NULL PRIMARY KEY,
    name varchar(20) not null unique,
    roles varchar(100)[] not null
)