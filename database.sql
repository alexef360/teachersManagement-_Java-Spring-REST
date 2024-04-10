CREATE DATABASE IF NOT EXISTS `teacher_directory`;

USE `teacher_directory`;

CREATE TABLE IF NOT EXISTS `teacher` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=latin1;

INSERT INTO `teacher` (`first_name`, `last_name`, `email`) VALUES
('John', 'Doe', 'john.doe@example.com'),
('Jane', 'Smith', 'jane.smith@example.com'),
('Michael', 'Johnson', 'michael.johnson@example.com'),
('Emily', 'Brown', 'emily.brown@example.com'),
('David', 'Williams', 'david.williams@example.com'),
('Sarah', 'Jones', 'sarah.jones@example.com'),
('Christopher', 'Garcia', 'christopher.garcia@example.com'),
('Jennifer', 'Martinez', 'jennifer.martinez@example.com'),
('Matthew', 'Hernandez', 'matthew.hernandez@example.com'),
('Amanda', 'Young', 'amanda.young@example.com');

