

DROP TABLE student;
CREATE TABLE student (
student_id INT PRIMARY KEY AUTO_INCREMENT,
student_name VARCHAR(20) NOT NULL,
major VARCHAR(20) DEFAULT 'Undecided'
);
SELECT * FROM student;
INSERT INTO student VALUES(1, 'Jack', 'Biology');
INSERT INTO student VALUES(2, 'Kate', 'Sociology');
INSERT INTO student(student_id, student_name) VALUES(3, 'Claire');
INSERT INTO student VALUES(4, 'Jack', 'Biology');
INSERT INTO student VALUES(5, 'Mike', 'Computer Science');
-- DESCRIBE student

UPDATE student
SET major = 'bio'
WHERE student_id = 4;

-- Delete a specific row
DELETE FROM student
WHERE student_id = 5;

SELECT student.student_name, student.major
FROM student
ORDER BY student_name DESC
LIMIT 2;


-- Add a new column using alter
-- ALTER TABLE student ADD gpa DECIMAL(3,2);
-- ALTER TABLE student DROP gpa;

-- DROP TABLE student; (to delete a table)