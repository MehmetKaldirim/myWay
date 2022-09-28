INSERT INTO roles (enabled, description)
VALUES (TRUE, 'Root'), -- 1
       (TRUE, 'Admin'), -- 2
       (TRUE, 'Instructor'),-- 3
       (TRUE, 'Developer'); --4



INSERT INTO programs (created_by, created_time, is_deleted, updated_by, updated_time, program_code, program_name,program_status, study_progress, duration)
VALUES (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'FS01', 'Full Stack Developer Core','OPEN', 0,500),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'JD01', 'Java Developer Spring','OPEN',0,500),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'JS01', 'Java Developer Core', 'OPEN', 0,700),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'FE01', 'CSS and HTML', 'OPEN',0,700),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'FE02', 'Angulor', 'OPEN',0, 700),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'FE03', 'React Developer','OPEN',0,750);


INSERT INTO users (created_by, created_time, is_deleted, updated_by, updated_time, email, enabled, first_name, last_name, user_status, r_id, program_id)
VALUES (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'root@cydeo.com', TRUE, 'Root', 'RootSurname', 'ACTIVE', 1,1),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'admin@cydeo.com', TRUE, 'Mike', 'Smith', 'ACTIVE', 2,1),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'instructor@cydeo.com', TRUE, 'Hamsik', 'sampu', 'ACTIVE', 3,1),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'rumicake@gmail.com', TRUE, 'Rumi', 'RumCake', 'ACTIVE', 4, 2),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'mehmetkaldirimde2@gmail.com', TRUE, 'Mehmet', 'Kal', 'ACTIVE', 4, 1),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'mathiasweber@gmail.com', TRUE, 'mathias', 'weber', 'ACTIVE', 4, 6),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'marcbatra@gmail.com', TRUE, 'Marc', 'Batra', 'ACTIVE', 4, 3);

INSERT INTO subjects (created_by, created_time, is_deleted, updated_by, updated_time,  subject_duration, subject_status, subject_study_progress, title, program_id,user_id)
VALUES (5, '2021-05-01 00:00:00', FALSE, 5, '2021-05-01 00:00:00', 180, 'OPEN', 0, 'Spring MVC', 1,5),
       (5, '2021-05-01 00:00:00', FALSE, 5, '2021-05-01 00:00:00', 180, 'OPEN', 0, 'Spring ORM', 1,5),
       (5, '2021-05-01 00:00:00', FALSE, 5, '2021-05-01 00:00:00', 180, 'OPEN', 0, 'React useState', 1,5),
       (5, '2021-05-01 00:00:00', FALSE, 5, '2021-05-01 00:00:00', 180, 'OPEN', 0, 'React Redux ', 1,5),
       (4, '2021-05-01 00:00:00', FALSE, 4, '2021-05-01 00:00:00', 180, 'OPEN', 0, 'Spring ORM', 2,4),
       (4, '2021-05-01 00:00:00', FALSE, 4, '2021-05-01 00:00:00', 180, 'OPEN', 0, 'Spring REST', 2,4),
       (7, '2021-05-01 00:00:00', FALSE, 7, '2021-05-01 00:00:00', 180, 'OPEN', 0, 'OOP Principles', 3,7),
       (7, '2021-05-01 00:00:00', FALSE, 7, '2021-05-01 00:00:00', 180, 'OPEN', 0, 'Error Handling', 3,7),
       (7, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 180, 'OPEN', 0, 'Java Collections', 3,7),
       (6, '2021-05-01 00:00:00', FALSE, 6, '2021-05-01 00:00:00', 180, 'OPEN', 0, 'React Handling SideEffects', 6,6),
       (6, '2021-05-01 00:00:00', FALSE, 6, '2021-05-01 00:00:00', 180, 'OPEN', 0, 'React Styling', 6,6);

INSERT INTO topics (created_by, created_time, is_deleted, updated_by, updated_time,  title, topic_duration,topic_status, topic_study_progress, subject_id,user_id)
VALUES (5, '2021-05-01 00:00:00', FALSE, 5, '2021-05-01 00:00:00', 'Controller',180,'OPEN', 0, 1,5),
       (5, '2021-05-01 00:00:00', FALSE, 5, '2021-05-01 00:00:00', 'Path Variable', 60,'OPEN', 0, 1,5),
       (5, '2021-05-01 00:00:00', FALSE, 5, '2021-05-01 00:00:00', 'RequestParam', 60, 'OPEN', 0, 1,5),
       (5, '2021-05-01 00:00:00', FALSE, 5, '2021-05-01 00:00:00', 'Redux useState creating', 30, 'OPEN', 0, 4,5),
       (5, '2021-05-01 00:00:00', FALSE, 5, '2021-05-01 00:00:00', 'Redux Multiple Slices Creating', 60, 'OPEN',0, 4,5),
       (5, '2021-05-01 00:00:00', FALSE, 5, '2021-05-01 00:00:00', 'Redux Multiple Slices using', 60, 'OPEN', 0, 4,5),
       (5, '2021-05-01 00:00:00', FALSE, 5, '2021-05-01 00:00:00', 'OneToOne Relationship', 60, 'OPEN', 0, 2,5),
       (4, '2021-05-01 00:00:00', FALSE, 4, '2021-05-01 00:00:00', 'ManyToOne/OneToMany Relationship', 60, 'OPEN',0, 5,4),
       (4, '2021-05-01 00:00:00', FALSE, 4, '2021-05-01 00:00:00', 'ManyToMany Relationship', 60, 'OPEN', 0, 5,4),
       (4, '2021-05-01 00:00:00', FALSE, 4, '2021-05-01 00:00:00', 'Table Creation', 60, 'OPEN', 0, 5,4),
       (4, '2021-05-01 00:00:00', FALSE, 4, '2021-05-01 00:00:00', 'ManyToMany Relationship', 60, 'OPEN', 0, 5,4),
       (4, '2021-05-01 00:00:00', FALSE, 4, '2021-05-01 00:00:00', 'Rest Controller', 60, 'OPEN', 0, 6,4),
       (4, '2021-05-01 00:00:00', FALSE, 4, '2021-05-01 00:00:00', 'REST Jackson', 60, 'OPEN', 0, 6,4),
       (4, '2021-05-01 00:00:00', FALSE, 4, '2021-05-01 00:00:00', 'REST Consuming Api', 60, 'OPEN', 0, 6,4),
       (7, '2021-05-01 00:00:00', FALSE, 7, '2021-05-01 00:00:00', 'Inheritance', 60, 'OPEN', 0, 7,7),
       (7, '2021-05-01 00:00:00', FALSE, 7, '2021-05-01 00:00:00', 'Abstraction', 60, 'OPEN', 0, 7,7),
       (7, '2021-05-01 00:00:00', FALSE, 7, '2021-05-01 00:00:00', 'Polimorphism', 60, 'OPEN', 0, 7,7),
       (7, '2021-05-01 00:00:00', FALSE, 7, '2021-05-01 00:00:00', 'Encapsulation', 60, 'OPEN', 0, 7,7),
       (6, '2021-05-01 00:00:00', FALSE, 6, '2021-05-01 00:00:00', 'using useState', 60, 'OPEN',0, 4,6),
       (6, '2021-05-01 00:00:00', FALSE, 6, '2021-05-01 00:00:00', 'Css module', 60, 'OPEN',0, 4,6);




-- $2a$10$nAB5j9G1c3JHgg7qzhiIXO7cqqr5oJ3LXRNQJKssDUwHXzDGUztNK
-- Abc1 // real password