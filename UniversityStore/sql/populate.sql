 

INSERT INTO users(username,password,enabled) VALUES ('admin','$2a$10$S/wlXEo/APzf.Sn1cO2p4.V12EJmaw.uzrHelMvkpuahjmHWnSafe', TRUE);
INSERT INTO users(username,password,enabled) VALUES ('user','$2a$10$7UHaei1zqhcszQ.yaJgEn.TZP/VVS5tMmO7ptMH/ZOP3rt7.y3hMC', TRUE);
INSERT INTO users(username,password,enabled) VALUES ('rajesh','$2a$10$xlI8t4EWESlpUXEE9zfptOkkCNqorLqy9z8tMdEfiPw7JZ4RH5jMO', true);
INSERT INTO users(username,password,enabled) VALUES ('rabi','$2a$10$QrODyCkaKZaCgHAXxgnUSOF0UZw.FMh4K1xcIy7sGy04UsKMfmLf.', true);


INSERT INTO authorities (username, authority) VALUES ('admin', 'ROLE_ADMIN');
INSERT INTO authorities (username, authority) VALUES ('admin', 'ROLE_USER');
INSERT INTO authorities (username, authority) VALUES ('user', 'ROLE_USER');
INSERT INTO authorities (username, authority) VALUES ('rajesh', 'ROLE_USER');
INSERT INTO authorities (username, authority) VALUES ('rabi', 'ROLE_USER');

INSERT INTO  `MEMBER` VALUES (NULL,12,'Rajesh','Yadav', 8754,'Raj Pulsar','user');
INSERT INTO `MEMBER` VALUES (NULL,123,'Rabi','Khadka', 8733,'Rabi Pulsar','admin');

http://bcrypthashgenerator.apphb.com/
for online converting of password to bcrypt hashcode.