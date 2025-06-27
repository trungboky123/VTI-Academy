use adventureworks;

-- exercise 1 :
-- question 1 :
select name from product
where productsubcategoryid in (
      select productsubcategoryid from productsubcategory 
      where name = 'Saddles'
      );
      
-- question 2 :
select name from product
where productsubcategoryid in (
      select productsubcategoryid from productsubcategory 
      where name like 'Bo%'
      );
      
-- question 3 :
select name from product
where productsubcategoryid = 3 and listprice in (
      select min(listprice) from product 
      where productsubcategoryid = 3
      );
      
-- exercise 2 :
-- question 1 :
select c.name as country, p.name as province 
from countryregion c
join stateprovince p on c.countryregioncode = p.countryregioncode
order by p.stateprovinceid;


-- question 2 :
select c.name as country, p.name as province 
from countryregion c
join stateprovince p on c.countryregioncode = p.countryregioncode
where c.name = 'Germany' or c.name =  'Canada'
order by country;

-- question 3 :
select so.salesorderid, date(so.orderdate) as orderdate, sp.salespersonid, sp.salespersonid as businessentityid, sp.bonus, sp.salesytd
from salesperson sp 
join salesorderheader so on sp.salespersonid = so.salespersonid;

-- question 4 :
select so.salesorderid, date(so.orderdate) as orderdate, e.title as jobttitle, sp.bonus, sp.salesytd
from salesperson sp 
join salesorderheader so on sp.salespersonid = so.salespersonid
join employee e on sp.salespersonid = e.employeeid;