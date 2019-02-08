INSERT INTO movies(description, genre, title) VALUES(1,'nice', 'action', 'aquaman');
INSERT INTO movies(description, genre, title) VALUES(2,'nice', 'romance', 'titanic');
INSERT INTO movies(description, genre, title) VALUES(3,'nice', 'horror', 'hereditary');

INSERT INTO users(status, username) VALUES(1,1, 'jon');
INSERT INTO users(status, username) VALUES(2,1, 'ana');
INSERT INTO users(status, username) VALUES(3,1, 'ioana');

insert into users_movies(user_id, movie_id) values (1,2);
insert into users_movies(user_id, movie_id) values (1,1);
insert into users_movies(user_id, movie_id) values (2,3);
insert into users_movies(user_id, movie_id) values (3,3);