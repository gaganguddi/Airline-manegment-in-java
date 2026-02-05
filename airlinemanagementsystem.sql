Create  database select * from login;;

use airlinemagement;
create table logintable(username varchar(20), password varchar(20));

insert into logintable values("admin", "admin");

select * from logintable;