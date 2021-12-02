select * from city;
select * from country;
select * from countrylanguage;
select * from country where region="Caribbean";
select * from country where name="Aruba";
select * from country where region<>"caribbean";
select * from country where population > 78000;
select * from country where surfacearea<800;
select * from country where continent = "North America";
select * from country where surfacearea between 193 and 800;
select * from country where name like "a%";
select * from country where name like "%a";
select distinct continent from country;
select * from country where continent in("asia", "africa");

