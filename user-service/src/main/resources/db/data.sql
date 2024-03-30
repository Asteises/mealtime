INSERT INTO roles (id, name) VALUES ('5c875576-7ff6-48e3-864c-4ca972c17f85', 'ADMIN');
INSERT INTO roles (id, name) VALUES ('2580eab3-c00d-4a1d-91cf-fe2fdce92bde', 'USER');

INSERT INTO users (id, username, password, deleted) VALUES ('71acebd1-7f6d-475d-83f3-7e9a11c27feb', 'MEALTIME', '$2a$05$paMdtfwh3x2pyGlaA5w.G.UaEqLpyx5os4vF9nuk9YCET2oh1.Tqm', false);
INSERT INTO users (id, username, password, deleted) VALUES ('2936962a-646b-4095-b3ca-2af7e111a8e4', 'FILIPP', '$2a$05$t9QYvnHZj8yY32gwX6WW2eGcT1Zp7R3CBUgappVpU1LXkDxTzENJ6', false);

INSERT INTO users_roles (user_id, role_id) VALUES ('71acebd1-7f6d-475d-83f3-7e9a11c27feb', '5c875576-7ff6-48e3-864c-4ca972c17f85');
INSERT INTO users_roles (user_id, role_id) VALUES ('2936962a-646b-4095-b3ca-2af7e111a8e4', '2580eab3-c00d-4a1d-91cf-fe2fdce92bde');