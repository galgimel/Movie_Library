DROP TABLE IF EXISTS movie_actors;
DROP TABLE IF EXISTS actors;
DROP TABLE IF EXISTS movies;
DROP TABLE IF EXISTS directors;
CREATE TABLE IF NOT EXISTS directors
(
    id                   VARCHAR PRIMARY KEY,
    name                 VARCHAR(30),
    surname              VARCHAR(30),
    country              VARCHAR(30)
);
CREATE TABLE IF NOT EXISTS movies
(
    id          VARCHAR PRIMARY KEY,
    name        VARCHAR(30),
    genre       VARCHAR(30),
    year        INT,
    director_id VARCHAR,
    FOREIGN KEY (director_id)
        REFERENCES directors (id)
);
CREATE TABLE IF NOT EXISTS actors
(
    id      VARCHAR PRIMARY KEY,
    name    VARCHAR(30),
    surname VARCHAR(30),
    country VARCHAR(30)
);
CREATE TABLE IF NOT EXISTS movie_actors
(
    actor_id VARCHAR,
    movie_id VARCHAR,
    FOREIGN KEY (actor_id) REFERENCES actors (id),
    FOREIGN KEY (movie_id) REFERENCES movies (id)
);