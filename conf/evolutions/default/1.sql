# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table college (
  name                      varchar(255) not null,
  code                      bigint,
  constraint pk_college primary key (name))
;

create table shortlist (
  id                        bigint not null,
  name                      varchar(255),
  user_email                varchar(255),
  constraint pk_shortlist primary key (id))
;

create table user (
  email                     varchar(255) not null,
  username                  varchar(255),
  password                  varchar(255),
  constraint pk_user primary key (email))
;

create table info_form (
  sport                     varchar(255) not null,
  state                     varchar(255),
  constraint pk_info_form primary key (sport))
;


create table shortlist_college (
  shortlist_id                   bigint not null,
  college_name                   varchar(255) not null,
  constraint pk_shortlist_college primary key (shortlist_id, college_name))
;
create sequence college_seq;

create sequence shortlist_seq;

create sequence user_seq;

create sequence info_form_seq;

alter table shortlist add constraint fk_shortlist_user_1 foreign key (user_email) references user (email) on delete restrict on update restrict;
create index ix_shortlist_user_1 on shortlist (user_email);



alter table shortlist_college add constraint fk_shortlist_college_shortlis_01 foreign key (shortlist_id) references shortlist (id) on delete restrict on update restrict;

alter table shortlist_college add constraint fk_shortlist_college_college_02 foreign key (college_name) references college (name) on delete restrict on update restrict;

# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists college;

drop table if exists shortlist;

drop table if exists shortlist_college;

drop table if exists user;

drop table if exists info_form;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists college_seq;

drop sequence if exists shortlist_seq;

drop sequence if exists user_seq;

drop sequence if exists info_form_seq;

