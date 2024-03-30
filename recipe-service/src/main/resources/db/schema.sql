create table if not exists INGREDIENTS_CATEGORY
(
    id          uuid primary key,
    name        varchar(255) not null unique,
    description text,
    create_date timestamp,
    create_by   varchar,
    date_modify timestamp,
    user_modify varchar,
    deleted     boolean,
    version     int
);

create table if not exists INGREDIENTS
(
    id                      uuid primary key,
    name                    varchar(255) not null unique,
    ingredients_category_id uuid         not null,
    foreign key (ingredients_category_id) references INGREDIENTS_CATEGORY (id)
);

create table if not exists UNITS
(
    id   uuid primary key,
    name varchar(255) not null unique
);

create table if not exists RECIPE_INGREDIENTS
(
    recipe_id     uuid  not null,
    ingredient_id uuid  not null,
    quantity      float not null,
    unit_id       uuid  not null,
    foreign key (ingredient_id) references INGREDIENTS (id),
    foreign key (unit_id) references UNITS (id)
);

create table if not exists MEALS
(
    id   uuid primary key,
    name varchar(255) not null unique
);

create table if not exists INSTRUCTIONS
(
    id          uuid primary key,
    recipe_id   uuid not null,
    step_number int  not null,
    description text not null,
    foreign key (recipe_id) references RECIPES (id)
);

create table if not exists RECIPES_CATEGORY
(
    id          uuid primary key,
    name        varchar(255) not null unique,
    description text
);

create table if not exists RECIPES
(
    id           uuid primary key,
    user_id      uuid,
    meal_id      uuid not null,
    description  text not null,
    main_img_url text,
--     foreign key (user_id) references users (id),
    foreign key (meal_id) references MEALS (id)
);