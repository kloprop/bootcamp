create schema exercise3;
use exercise3;

CREATE TABLE PLAYERS(
PLAYER_ID INTEGER NOT NULL UNIQUE,
GROUP_ID INTEGER NOT NULL);

CREATE TABLE MATCHES (
MATCH_ID INTEGER NOT NULL UNIQUE,
FIRST_PLAYER INTEGER NOT NULL,
SECOND_PLAYER INTEGER NOT NULL,
FIRST_SCORE INTEGER NOT NULL,
SECOND_SCORE INTEGER NOT NULL
);

insert into Players values (20,2); 
insert into Players values (30,1); 
insert into Players values (40,3); 
insert into Players values (45,1); 
insert into Players values (50,2); 
insert into Players values (65,1);  

insert into Matches values (1, 30, 45, 10, 12);
insert into Matches values (2, 20, 50, 5, 5);
insert into Matches values (13, 65, 45, 10, 10);
insert into Matches values (5, 30, 65, 3, 15);
insert into Matches values (42, 45, 65, 8, 4);

select * from players;
select * from matches;

With first_score as (
select p.player_id as id  , p.group_id as g_id ,sum(m.first_score) as score
from Players p, matches m
where p.player_id = m.first_player
group by p.player_id)
, 
second_score as (
select p.player_id as id,p.group_id ,sum(m.second_score) as score
from Players p, matches m
where p.player_id = m.second_player
group by p.player_id)
,
all_first as (
select p.player_id as id , p.group_id,coalesce(f.score,0) as score
from players p left join first_score f 
on p.player_id =  f.id )
,
all_second as (
select p.player_id as id , p.group_id,coalesce (s.score,0) as score
from players p left join second_score s 
on p.player_id = s.id)
,
total_table as(
select af.id as id, af.group_id,af.score + ase.score  as score
from all_first af, all_second ase
where af.id = ase.id)
,
max_table as (
select group_id,max(score) as score
from total_table
group by group_id)


select m.group_id, min(t.id) as winner_id
from max_table m , total_table t
where m.score = t.score
group by m.group_id;






select * from first_score;
select * from second_score;











