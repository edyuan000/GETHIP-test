
# --- First database schema
# --- !Ups

create table college (
  id                        bigint not null,
  name                      varchar(255),
  st                        varchar(255),
  web_address               varchar(255),
  constraint pk_college primary key (id))
;

create table sport (
  sportid                   bigint not null,
  sportname                 varchar(255),
  division                  varchar(255),
  college_id                bigint,
  constraint pk_sport primary key (sportid))
;

create sequence college_seq start with 30;

create sequence sport_seq start with 400;

alter table sport add constraint fk_sport_college_1 foreign key (college_id) references college (id) on delete restrict on update restrict;
create index ix_sport_college_1 on sport (college_id);



# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists college;

drop table if exists sport;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists college_seq;

drop sequence if exists sport_seq;

