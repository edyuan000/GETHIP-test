# --- Sample dataset

# --- !Ups

insert into college (id, name, st, web_address) values ( 6121, 'Creighton University', 'Nebraska', 'http://www.gocreighton.com');
insert into college (id, name, st, web_address) values ( 6877, 'University of Nebraska-Lincoln', 'Nebraska', 'http://www.huskers.com');
insert into college (id, name, st, web_address) values ( 6420, 'University of Nebraska-Omaha', 'Nebraska', 'http://www.omavs.com');
insert into college (id, name, st, web_address) values ( 6466, 'Chadron State College', 'Nebraska', 'http://www.chadroneagles.com');
insert into college (id, name, st, web_address) values ( 6467, 'University of Nebraska-Kearney', 'Nebraska', 'http://www.lopers.com');
insert into college (id, name, st, web_address) values ( 6469, 'Wayne State College', 'Nebraska', 'http://www.wscwildcats.com');
insert into college (id, name, st, web_address) values ( 6470, 'Nebraska Wesleyan University', 'Nebraska', 'http://www.nwusports.com');
insert into college (id, name, st, web_address) values ( 6053, 'Bellevue University', 'Nebraska', 'http://www.bubruins.com');
insert into college (id, name, st, web_address) values ( 6116, 'Concordia University', 'Nebraska', 'http://www.cune.edu/athletics');
insert into college (id, name, st, web_address) values ( 6165, 'Doane College', 'Nebraska', 'http://www.doaneathletics.com');
insert into college (id, name, st, web_address) values ( 6270, 'Hastings College', 'Nebraska', 'http://www.hastingsbroncos.com');
insert into college (id, name, st, web_address) values ( 6406, 'Midland University', 'Nebraska', 'http://www.midlandathletics.com');
insert into college (id, name, st, web_address) values ( 6468, 'Peru State College', 'Nebraska', 'http://www.pscbobcats.com');
insert into college (id, name, st, web_address) values ( 6106, 'College of Saint Mary', 'Nebraska', 'http://www.csmflames.com');
insert into college (id, name, st, web_address) values ( 6984, 'York College', 'Nebraska', 'http://www.ycpanthers.com');


insert into sport (sportid, sportname, division, college_id, prospectform) values (6, 'Men''s Golf', 'NAIA', 6053, 'http://bubruins.com/sports/mgolf/prospectiveathlete');
insert into sport (sportid, sportname, division, college_id, prospectform) values (18, 'Men''s Basketball', 'NAIA', 6053, 'http://bubruins.com/sports/mbkb/prospectiveathlete');
insert into sport (sportid, sportname, division, college_id, prospectform) values (31, 'Baseball', 'NAIA', 6053, 'http://bubruins.com/sports/bsb/prospectiveathlete');
insert into sport (sportid, sportname, division, college_id, prospectform) values (52, 'Men''s Soccer', 'NAIA', 6053, 'http://bubruins.com/sports/msoc/prospectiveathlete');
insert into sport (sportid, sportname, division, college_id, prospectform) values (135, 'Women''s Golf', 'NAIA', 6053, 'http://bubruins.com/sports/wgolf/prospectiveathlete');
insert into sport (sportid, sportname, division, college_id, prospectform) values (142, 'Women''s Soccer', 'NAIA', 6053, 'http://bubruins.com/sports/wsoc/prospectiveathlete');
insert into sport (sportid, sportname, division, college_id, prospectform) values (156, 'Softball', 'NAIA', 6053, 'http://bubruins.com/sports/sball/prospectiveathlete');
insert into sport (sportid, sportname, division, college_id, prospectform) values (181, 'Volleyball', 'NAIA', 6053, 'http://bubruins.com/sports/wvball/Questionnaire');
insert into sport (sportid, sportname, division, college_id, prospectform) values (1, 'Men''s Golf', 'Division 1', 6121, 'null');

# --- !Downs

delete from college;
delete from sport;