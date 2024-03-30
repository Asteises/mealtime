create table if not exists INGREDIENTS
(
    id   uuid primary key,
    name varchar(255) not null
);

create table if not exists UNITS
(
    id   uuid primary key,
    name varchar(255) not null
);

create table if not exists RECIPE_INGREDIENTS
(
    recipe_id     uuid  not null,
    ingredient_id uuid  not null,
    quantity      float not null,
    unit_id       uuid  not null
);

-- create table if not exists INSTRUCTIONS (
--   id uuid primary key,
--
-- );