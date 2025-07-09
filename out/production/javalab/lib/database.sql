-- Create the database
CREATE DATABASE IF NOT EXISTS jdbc;

-- Select the database to use
USE jdbc;

-- Create the users table
CREATE TABLE IF NOT EXISTS users (
                                     id INT AUTO_INCREMENT PRIMARY KEY,
                                     name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    gender VARCHAR(50),
    city VARCHAR(255)
    );



INSERT INTO users (name, email, password, gender, city) VALUES

                                                            ('Harry Potter', 'harry.potter@hogwarts.com', 'expelliarmus123', 'Male', 'Hogwarts'),
                                                            ('Hermione Granger', 'hermione.g@hogwarts.com', 'leviosa123', 'Female', 'Hogwarts'),
                                                            ('Tony Stark', 'ironman@starkindustries.com', 'ilovejarvis', 'Male', 'New York'),
                                                            ('Bruce Wayne', 'batman@wayneenterprises.com', 'iamthebat', 'Male', 'Gotham'),
                                                            ('Jack Sparrow', 'captain.jack@blackpearl.com', 'rumlover123', 'Male', 'Caribbean'),
                                                            ('Leia Organa', 'princess.leia@rebellion.org', 'hope123', 'Female', 'Alderaan'),
                                                            ('Darth Vader', 'vader@deathstar.com', 'darkside123', 'Male', 'Mustafar'),
                                                            ('Wanda Maximoff', 'wanda@marvel.com', 'scarletwitch', 'Female', 'Sokovia'),
                                                            ('Peter Parker', 'spiderman@dailybugle.com', 'withgreatpower', 'Male', 'New York'),
                                                            ('Anakin Skywalker', 'anakin@jediorder.com', 'chosenone', 'Male', 'Tatooine'),
                                                            ('Elizabeth Swann', 'elizabeth@pirates.com', 'piratelife', 'Female', 'Caribbean'),
                                                            ('Ron Weasley', 'ron.weasley@hogwarts.com', 'chessmaster', 'Male', 'Hogwarts'),
                                                            ('Loki Laufeyson', 'loki@asgard.com', 'trickster', 'Male', 'Asgard');

INSERT INTO users (name, email, password, gender, city) VALUES
                                                            ('Steve Rogers', 'cap.america@avengers.com', 'freedom123', 'Male', 'Brooklyn'),
                                                            ('Natasha Romanoff', 'black.widow@shield.com', 'redroom456', 'Female', 'Stalingrad'),
                                                            ('Arthur Curry', 'aquaman@atlantis.com', 'seaking', 'Male', 'Atlantis'),
                                                            ('Han Solo', 'han.solo@falcon.com', 'kesslerun', 'Male', 'Corellia'),
                                                            ('Padmé Amidala', 'padme@naboo.com', 'senatorqueen', 'Female', 'Naboo'),
                                                            ('Severus Snape', 'snape@hogwarts.com', 'halfbloodprince', 'Male', 'Spinner''s End'),
                                                            ('Sirius Black', 'sirius.black@hogwarts.com', 'barkbark123', 'Male', 'Grimmauld Place'),
                                                            ('Pepper Potts', 'pepper@starkindustries.com', 'ceo123', 'Female', 'New York'),
                                                            ('James Norrington', 'norrington@portroyal.com', 'navylife', 'Male', 'Port Royal'),
                                                            ('Tia Dalma', 'tiadalma@calypso.com', 'seagoddess', 'Female', 'Caribbean'),
                                                            ('Obi-Wan Kenobi', 'kenobi@jediorder.com', 'hellothere', 'Male', 'Stewjon'),
                                                            ('Wonder Woman', 'diana.prince@themyscira.com', 'lasso123', 'Female', 'Themyscira'),
                                                            ('Deadpool', 'wade.wilson@marvel.com', 'chimichanga', 'Male', 'Regina'),
                                                            ('Gamora', 'gamora@guardians.com', 'deadliestwoman', 'Female', 'Zen-Whoberi'),
                                                            ('Bucky Barnes', 'winter.soldier@hydra.com', 'manonthebridge', 'Male', 'Brooklyn');
