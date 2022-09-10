INSERT INTO roles (enabled, description)
VALUES (TRUE, 'Root'), -- 1
       (TRUE, 'Admin'), -- 2
       (TRUE, 'Instructor'),-- 3
       (TRUE, 'Developer'); --4

INSERT INTO users (created_by, created_time, is_deleted, updated_by, updated_time, email, enabled, first_name, last_name,  user_status,  r_id)
VALUES (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'root@cydeo.com', TRUE, 'Root', 'RootSurname',  'ACTIVE', 1),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'admin@cydeo.com', TRUE, 'Mike', 'Smith', 'ACTIVE', 2),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'instructor@cydeo.com', TRUE, 'mathi', 'schlagger', 'ACTIVE', 3),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'developer1@cydeo.com', TRUE, 'Rumi', 'RumCake',  'ACTIVE', 4),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'developer2@cydeo.com', TRUE, 'Mehmet', 'Kal', 'ACTIVE', 4);

INSERT INTO programs (created_by, created_time, is_deleted, updated_by, updated_time, program_name, study_progress, duration)
VALUES (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'Java Developer Core', 0,500),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'Java Developer Spring',0,500),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'JS Developer Core', 0,700),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'CSS Styling', 0,700),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'Angulor', 0, 700),
       (1, '2021-05-01 00:00:00', FALSE, 1, '2021-05-01 00:00:00', 'React Developer',0,750);


INSERT INTO user_program_rel (user_id, program_id) VALUES
                                                       ((SELECT u.id from users u WHERE u.email = 'developer1@cydeo.com'), (SELECT p.id from programs p WHERE p.program_name = 'Java Developer Core')),
                                                       ((SELECT u.id from users u WHERE u.email = 'developer1@cydeo.com'), (SELECT p.id from programs p WHERE p.program_name = 'Java Developer Spring')),
                                                       ((SELECT u.id from users u WHERE u.email = 'developer2@cydeo.com'), (SELECT p.id from programs p WHERE p.program_name = 'Java Developer Core')),
                                                       ((SELECT u.id from users u WHERE u.email = 'developer2@cydeo.com'), (SELECT p.id from programs p WHERE p.program_name = 'Java Developer Spring')),
                                                       ((SELECT u.id from users u WHERE u.email = 'developer2@cydeo.com'), (SELECT p.id from programs p WHERE p.program_name = 'JS Developer Core')),
                                                       ((SELECT u.id from users u WHERE u.email = 'developer2@cydeo.com'), (SELECT p.id from programs p WHERE p.program_name = 'React Developer'));


-- $2a$10$nAB5j9G1c3JHgg7qzhiIXO7cqqr5oJ3LXRNQJKssDUwHXzDGUztNK
-- Abc1 // real password