create table if not exists users (
    id serial NOT NULL PRIMARY KEY,
    name varchar(20),
    role varchar(20)
)