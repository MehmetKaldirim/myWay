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


INSERT INTO users (created_by, created_time, is_deleted, updated_by, updated_time, email, enabled, first_name, last_name,  user_status,  r_id,program_id)
VALUES (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'root@cydeo.com', TRUE, 'Root', 'RootSurname',  'ACTIVE', 1,1),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'admin@cydeo.com', TRUE, 'Mike', 'Smith', 'ACTIVE', 2,1),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'instructor@cydeo.com', TRUE, 'mathi', 'schlagger', 'ACTIVE', 3,1),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'developer1@cydeo.com', TRUE, 'Rumi', 'RumCake',  'ACTIVE', 4,2),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'developer2@cydeo.com', TRUE, 'Mehmet', 'Kal', 'ACTIVE', 4,6);

INSERT INTO subjects (created_by, created_time, is_deleted, updated_by, updated_time,  subject_duration, subject_study_progress, title, program_id)
VALUES (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 180,0, 'Spring MVC', 1),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 180,0, 'Spring ORM', 1),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 180,0, 'React Intro', 1),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 180,0, 'Spring ORM', 2),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 180,0, 'Spring REST', 2),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 180,0, 'OOP Principles', 3),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 180,0, 'Error Handling', 3),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 180,0, 'Java Collections', 3),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 180,0, 'React Handling SideEffects', 6),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 180,0, 'React Redux ', 6),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 180,0, 'React Form', 6),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 180,0, 'React Styling', 6);

INSERT INTO topics (created_by, created_time, is_deleted, updated_by, updated_time,  title, topic_duration, topic_study_progress, subject_id)
VALUES (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'Controller',180,0, 1),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'Path Variable', 60,0, 1),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'RequestParam', 60,0, 1),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'Table Creation', 60,0, 2),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'OneToOne Relationship', 60,0, 2),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'ManyToOne/OneToMany Relationship', 60,0, 2),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'ManyToMany Relationship', 60,0, 2),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'ManyToMany Relationship', 60,0, 2),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'Table Creation', 60,0, 4),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'OneToOne Relationship', 60,0, 4),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'ManyToOne/OneToMany Relationship', 60,0, 4),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'ManyToMany Relationship', 60,0, 4),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'ManyToMany Relationship', 60,0, 4),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'Rest Controller', 60,0, 5),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'REST JAckson', 60,0, 5),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'REST Consuming Api', 60,0, 5);



-- $2a$10$nAB5j9G1c3JHgg7qzhiIXO7cqqr5oJ3LXRNQJKssDUwHXzDGUztNK
-- Abc1 // real password