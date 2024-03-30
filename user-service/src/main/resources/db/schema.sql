drop table users_roles;
drop table roles;
drop table users;

CREATE TABLE IF NOT EXISTS roles
(
    id   UUID PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS users
(
    id       UUID PRIMARY KEY,
    username VARCHAR(255) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL,
    deleted BOOLEAN NOT NULL
);

CREATE TABLE IF NOT EXISTS users_roles
(
    user_id UUID NOT NULL REFERENCES users (id) ON DELETE CASCADE,
    role_id UUID NOT NULL REFERENCES roles (id) ON DELETE CASCADE
);