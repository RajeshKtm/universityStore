CREATE  TABLE users (
  username VARCHAR(45) NOT NULL ,
  password VARCHAR(60) NOT NULL ,
  enabled TINYINT NOT NULL DEFAULT 1 ,
  PRIMARY KEY (username));

CREATE TABLE user_roles (
  user_role_id int(11) NOT NULL AUTO_INCREMENT,
  username varchar(45) NOT NULL,
  role varchar(45) NOT NULL,
  PRIMARY KEY (user_role_id),
  UNIQUE KEY uni_username_role (role,username),
  KEY fk_username_idx (username),
  CONSTRAINT fk_username FOREIGN KEY (username) REFERENCES users (username));

INSERT INTO users(username,password,enabled)
VALUES ('rajesh','$2a$10$xlI8t4EWESlpUXEE9zfptOkkCNqorLqy9z8tMdEfiPw7JZ4RH5jMO', true);
INSERT INTO users(username,password,enabled)
VALUES ('rabi','$2a$10$QrODyCkaKZaCgHAXxgnUSOF0UZw.FMh4K1xcIy7sGy04UsKMfmLf.', true);

INSERT INTO user_roles (username, role)
VALUES ('rajesh', 'ROLE_USER');
INSERT INTO user_roles (username, role)
VALUES ('rajesh', 'ROLE_ADMIN');
INSERT INTO user_roles (username, role)
VALUES ('rabi', 'ROLE_USER');