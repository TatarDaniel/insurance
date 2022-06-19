INSERT INTO
    users (id,name,surname,email,password,personal_code,phone,dob)
VALUES
    (1,'Ričards-Daniels','Krivko','example@example.com','P@$$w0rd','100990-10500','20112287','1990-09-10'),
    (2,'Janis','Romans','romansj@example.com','P@$$w0rd','100990-10500','20112287','1990-09-10'),
    (3,'Olegs','Krivko','krivko@example.com','P@$$w0rd','100990-10500','20112287','1990-09-10'),
    (3,'Olegs','Krivko','krivko@example.com','P@$$w0rd','100990-10500','20112287','1990-09-10')

INSERT INTO claim
VALUES
    (1,250.50,'need longer json', 1,1,'2022-01-23 11:59:59', 'tried burning house, failed'),
    (2,250100.50,'house burned down', 2,3,'2022-02-23 12:59:59', 'tried burning house, success!'),
    (3,250.50,'dentist', 2,1,'2022-01-23 11:59:59', 'dentist was rough'),
    (4,50.50,'dentist again', 2,1,'2022-04-23 11:00:00', 'dentist was rough again');

INSERT INTO comment
VALUES
       (1,1,1,'please prove you didnt burn it yourself', '2022-01-24 08:00:00'),
       (2,2,2,'please prove you didnt burn it yourself', '2022-02-24 08:00:00'),
       (3,2,3,'please prove you didnt burn it yourself', '2022-01-24 09:00:00');

INSERT INTO disease
VALUES
       (1,'pulmonary', 'Covid-19'),
       (2,'pulmonary', 'Influenza'),
       (3,'pulmonary', 'Pneumonia'),
       (4,'hereditary', 'Sickle Cell Disease'),
       (5,'hereditary', 'Huntington''s Disease'),
       (6,'hereditary', 'Cystic fibrosis');


INSERT INTO hospital
VALUES (1, '56.95666811940647, 24.116149176363802','Strada Ciheiului', 'Pelican'),
       (2, '15.95666811940647, 13.116149176363802','Strada Maria', 'Maria'),
       (3, '15.95666811940647, 24.116149176363802','Strada Universitatii', 'DentMed'),
       (4, '56.95036358383003, 24.10769315915534','Strada Chisinaului', 'MedPark');

INSERT INTO specialization
VALUES (1, 'Neurology', 'Child neurology'),
       (2, 'Neurology', 'Pain medicine'),
       (3, 'Neurology', 'Sleep medicine'),
       (4, 'Neurology', 'Vascular neurology'),
       (5, 'Dermatology', 'Dermatopathology'),
       (6, 'Dermatology', 'Pediatric dermatology'),
       (7, 'Dermatology', 'Procedural dermatology'),
       (8, 'Surgery', 'Eye surgery'),
       (9, 'Surgery', 'Knee surgery'),
       (10, 'Surgery', 'Arm surgery'),
       (11, 'Dentistry', 'Stomatology');

INSERT INTO policy
VALUES
    (1, 'Sport', 'Tvoya','Elite'),
    (2, 'Sport','Tvoya', 'Light'),
    (3, 'Life', 'Tvoya','Elite'),
    (4, 'Life', 'Tvoya','Light');

INSERT INTO hospital_specialization
VALUES (1,1),
       (1,2),
       (1,3),
       (1,7),
       (2,1),
       (2,8),
       (2,9),
       (3,11),
       (4,7),
       (4,8),
       (4,9),
       (4,1);

INSERT INTO policy_coverage_specialization
VALUES (1,8),
       (1,9),
       (2,9),
       (3,1),
       (3,4),
       (3,4),
       (3,7),
       (3,8),
       (3,11),
       (4,10);


INSERT INTO policy_coverage_hospital
VALUES (1,1),
       (1,2),
       (2,2),
       (3,1),
       (3,3);


INSERT INTO branch
VALUES
       (1,'Main branch','56.951827269189984, 24.07952050817991','Sunset lane'),
       (2,'Second branch','56.95117561830236, 24.117341287158457','Freedom boulevard'),
       (3,'Moldova branch','47.08112301373525, 28.76910448980739','React cul-de-sac');