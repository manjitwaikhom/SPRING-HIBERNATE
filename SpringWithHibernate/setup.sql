CREATE TABLE PERSON (
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(20) NOT NULL DEFAULT '',
  phone varchar(20) NOT NULL DEFAULT '',
  address varchar(20) NOT NULL DEFAULT '',
  email varchar(20) NOT NULL DEFAULT '',
  country varchar(20) DEFAULT NULL,
  PRIMARY KEY (id)
);

commit;