DROP DATABASE IF EXISTS users;
CREATE DATABASE users;
USE  users;

-- DROP TABLE IF EXISTS users;


CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `last_name` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT  INTO  `users`(name,last_name) values ('Mario', 'Kirven');
INSERT  INTO  `users`(name,last_name) values ('Alejandro', 'Gutierrez');
INSERT  INTO  `users`(name,last_name) values ('Manuel', 'Villareal');
INSERT  INTO  `users`(name,last_name) values ('Elba', 'Lazo');
INSERT  INTO  `users`(name,last_name) values ('Armando', 'Paredes');
INSERT  INTO  `users`(name,last_name) values ('Laura', 'Gonzales');


SELECT * FROM users ;