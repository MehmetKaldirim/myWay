INSERT INTO user_program_rel (user_id, program_id) VALUES
                                                       ((SELECT u.id from users u WHERE u.email = 'developer1@cydeo.com'), (SELECT p.id from programs p WHERE p.program_name = 'Java Developer Core')),
                                                       ((SELECT u.id from users u WHERE u.email = 'developer1@cydeo.com'), (SELECT p.id from programs p WHERE p.program_name = 'Java Developer Spring')),
                                                       ((SELECT u.id from users u WHERE u.email = 'developer2@cydeo.com'), (SELECT p.id from programs p WHERE p.program_name = 'Java Developer Core')),
                                                       ((SELECT u.id from users u WHERE u.email = 'developer2@cydeo.com'), (SELECT p.id from programs p WHERE p.program_name = 'Java Developer Spring')),
                                                       ((SELECT u.id from users u WHERE u.email = 'developer2@cydeo.com'), (SELECT p.id from programs p WHERE p.program_name = 'JS Developer Core')),
                                                       ((SELECT u.id from users u WHERE u.email = 'developer2@cydeo.com'), (SELECT p.id from programs p WHERE p.program_name = 'React Developer'));


INSERT INTO user_program_rel (user_id, program_id) VALUES
                                                       ((SELECT u.id from users u WHERE u.email = 'developer1@cydeo.com'), (SELECT p.id from programs p WHERE p.program_name = 'Java Developer Core')),
                                                       ((SELECT u.id from users u WHERE u.email = 'developer1@cydeo.com'), (SELECT p.id from programs p WHERE p.program_name = 'Java Developer Spring')),
                                                       ((SELECT u.id from users u WHERE u.email = 'developer2@cydeo.com'), (SELECT p.id from programs p WHERE p.program_name = 'Java Developer Core')),
                                                       ((SELECT u.id from users u WHERE u.email = 'developer2@cydeo.com'), (SELECT p.id from programs p WHERE p.program_name = 'Java Developer Spring')),
                                                       ((SELECT u.id from users u WHERE u.email = 'developer2@cydeo.com'), (SELECT p.id from programs p WHERE p.program_name = 'JS Developer Core')),
                                                       ((SELECT u.id from users u WHERE u.email = 'developer2@cydeo.com'), (SELECT p.id from programs p WHERE p.program_name = 'React Developer'));

INSERT INTO movie_genre_rel (movie_id, genre_id) VALUES
                                                     ((SELECT m.id from movie m WHERE m.name = 'The Gentleman'), (SELECT g.id from genre g WHERE g.name = 'Action')),
                                                     ((SELECT m.id from movie m WHERE m.name = 'The Gentleman'), (SELECT g.id from genre g WHERE g.name = 'Comedy')),
                                                     ((SELECT m.id from movie m WHERE m.name = 'The Gentleman'), (SELECT g.id from genre g WHERE g.name = 'Crime')),
                                                     ((SELECT m.id from movie m WHERE m.name = 'A Beautiful Mind'), (SELECT g.id from genre g WHERE g.name = 'Biography')),
                                                     ((SELECT m.id from movie m WHERE m.name = 'A Beautiful Mind'), (SELECT g.id from genre g WHERE g.name = 'Drama')),
                                                     ((SELECT m.id from movie m WHERE m.name = 'The Shawshank Redemption'), (SELECT g.id from genre g WHERE g.name = 'Drama')),
                                                     ((SELECT m.id from movie m WHERE m.name = 'The Godfather'), (SELECT g.id from genre g WHERE g.name = 'Drama')),
                                                     ((SELECT m.id from movie m WHERE m.name = 'The Godfather'), (SELECT g.id from genre g WHERE g.name = 'Crime')),
                                                     ((SELECT m.id from movie m WHERE m.name = 'Tenet'), (SELECT g.id from genre g WHERE g.name = 'Sci-Fi')),
                                                     ((SELECT m.id from movie m WHERE m.name = 'Tenet'), (SELECT g.id from genre g WHERE g.name = 'Action')),
                                                     ((SELECT m.id from movie m WHERE m.name = 'The Loss Adjuster'), (SELECT g.id from genre g WHERE g.name = 'Comedy')),
                                                     ((SELECT m.id from movie m WHERE m.name = 'The Nights Before Christmas'), (SELECT g.id from genre g WHERE g.name = 'Horror')),
                                                     ((SELECT m.id from movie m WHERE m.name = 'Spider-Man: Miles Morales'), (SELECT g.id from genre g WHERE g.name = 'Action')),
                                                     ((SELECT m.id from movie m WHERE m.name = 'Spider-Man: Miles Morales'), (SELECT g.id from genre g WHERE g.name = 'Adventure')),
                                                     ((SELECT m.id from movie m WHERE m.name = 'Spider-Man: Miles Morales'), (SELECT g.id from genre g WHERE g.name = 'Crime')),
                                                     ((SELECT m.id from movie m WHERE m.name = 'Avengers: Endgame'), (SELECT g.id from genre g WHERE g.name = 'Action')),
                                                     ((SELECT m.id from movie m WHERE m.name = 'Avengers: Endgame'), (SELECT g.id from genre g WHERE g.name = 'Adventure')),
                                                     ((SELECT m.id from movie m WHERE m.name = 'Avengers: Endgame'), (SELECT g.id from genre g WHERE g.name = 'Drama'));



INSERT INTO genre (name) VALUES ('Comedy'), ('Sci-Fi'), ('Horror'), ('Action'), ('Thriller'), ('Drama'),
                                ('Mystery'), ('Crime'), ('Animation'), ('Adventure'), ('Fantasy'), ('Biography'), ('History');

INSERT INTO movie (duration, name, price, release_date, state, summary, type)  VALUES
                                                                                   (113, 'The Gentleman', 20.0,  '2020-01-24 00:00:01', 'ACTIVE', 'An American expat tries to sell off his highly profitable marijuana empire in London, triggering plots, schemes, bribery and blackmail in an attempt to steal his domain out from under him.', 'REGULAR'),
                                                                                   (135, 'A Beautiful Mind', 15.00, '2002-01-04 00:00:01', 'DRAFT', 'After John Nash, a brilliant but asocial mathematician, accepts secret work in cryptography, his life takes a turn for the nightmarish.', 'REGULAR'),
                                                                                   (142, 'The Shawshank Redemption', 35.00, '1994-10-14 00:00:01', 'DRAFT', 'Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency', 'REGULAR'),
                                                                                   (175, 'The Godfather', 35.00, '1972-03-24 00:00:01', 'DRAFT', 'The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son', 'REGULAR'),
                                                                                   (150, 'Tenet', 35.00, '2020-09-03 00:00:01', 'ACTIVE', 'Armed with only one word, Tenet, and fighting for the survival of the entire world, a Protagonist journeys through a twilight world of international espionage on a mission that will unfold in something beyond real time', 'PREMIER'),
                                                                                   (100, 'The Loss Adjuster', 35.00, '2020-12-01 00:00:01', 'DRAFT', 'Hapless Insurance Loss Adjuster - Martin Dyer - feels his life is spiralling out of control but discovers that even when you reach rock bottom, that some clouds really do have a silver lining', 'PREMIER'),
                                                                                   (100, 'The Nights Before Christmas', 28.00, '2020-11-19 00:00:01', 'ACTIVE', 'A murderous Santa and Mrs Claus play a cat and mouse game with the FBI.', 'REGULAR'),
                                                                                   (130, 'Spider-Man: Miles Morales', 28.00, '2020-12-12 00:00:01', 'DRAFT', 'In this sequel of Marvel''s Spider-Man (2018), you can play as Miles Morales as a new and different Spider-Man while he learns some stories about his will of fighting crime and serving justice by his mentor and former hero, Peter Parker.', 'PREMIER'),
                                                                                   (181, 'Avengers: Endgame', 48.00, '2019-04-26 00:00:01', 'DRAFT', 'After the devastating events of Avengers: Infinity War (2018), the universe is in ruins. With the help of remaining allies, the Avengers assemble once more in order to reverse Thanos'' actions and restore balance to the universe.', 'REGULAR');





