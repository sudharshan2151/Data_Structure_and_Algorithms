# Write your MySQL query statement below #(select b.id from person b where a.email=b.email and a.id>b.id);
delete a from person a inner join person b on a.email=b.email 
where b.id<a.id and a.email=b.email ;

