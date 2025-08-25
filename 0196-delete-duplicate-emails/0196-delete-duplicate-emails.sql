# Write your MySQL query statement below
delete p from Person p join Person p1 where p.Email=p1.Email and p.Id>p1.Id;