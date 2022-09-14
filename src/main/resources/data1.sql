INSERT INTO user_program_rel (user_id, program_id) VALUES
                                                       ((SELECT u.id from users u WHERE u.email = 'developer1@cydeo.com'), (SELECT p.id from programs p WHERE p.program_name = 'Java Developer Core')),
                                                       ((SELECT u.id from users u WHERE u.email = 'developer1@cydeo.com'), (SELECT p.id from programs p WHERE p.program_name = 'Java Developer Spring')),
                                                       ((SELECT u.id from users u WHERE u.email = 'developer2@cydeo.com'), (SELECT p.id from programs p WHERE p.program_name = 'Java Developer Core')),
                                                       ((SELECT u.id from users u WHERE u.email = 'developer2@cydeo.com'), (SELECT p.id from programs p WHERE p.program_name = 'Java Developer Spring')),
                                                       ((SELECT u.id from users u WHERE u.email = 'developer2@cydeo.com'), (SELECT p.id from programs p WHERE p.program_name = 'JS Developer Core')),
                                                       ((SELECT u.id from users u WHERE u.email = 'developer2@cydeo.com'), (SELECT p.id from programs p WHERE p.program_name = 'React Developer'));

