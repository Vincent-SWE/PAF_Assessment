-- CREATE DATABASE paf;
-- USE paf;

-- CREATE TABLE user (
-- user_id CHAR(8),
-- username VARCHAR(50) NOT NULL,
-- name VARCHAR(50),
-- CONSTRAINT PRIMARY KEY user_id_pk(user_id)
-- );


-- CREATE TABLE task (
-- task_id INT NOT NULL AUTO_INCREMENT,
-- description VARCHAR(255),
-- priority INT(1) NOT NULL CHECK (priority >= 1 AND priority <=3),
-- due_date DATE,
-- CONSTRAINT PRIMARY KEY task_pk(task_id)
-- );

-- SELECT * FROM task;
-- INSERT INTO task (description, priority, due_date) VALUES ("hello", 3, "1990-03-03")
-- DELETE FROM task WHERE task_id = 1;
-- SELECT * FROM task;
