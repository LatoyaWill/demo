SET SQL_SAFE_UPDATES = 0;

SELECT * FROM training.students;

INSERT INTO training.students VALUES (243673, 'Damari', 'Smith', 'Kindergarten');

INSERT INTO training.students VALUES (142526, 'Devin', 'Smith', 'PreK');
commit;


SELECT * FROM training.file_table;