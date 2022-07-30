CREATE PROCEDURE `training.stuprocedure` (StudentId int, FirstName varchar(45))

BEGIN
		
        insert into students values(StudentId, FirstName);
	
END 

