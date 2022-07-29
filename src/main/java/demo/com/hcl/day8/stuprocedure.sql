CREATE PROCEDURE training.stuprocedure(StudentId int, FirstName varchar(45))
	begin
		
        insert into students values(StudentId, FirstName);
	
END

