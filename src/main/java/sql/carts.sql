CREATE TABLE db.carts
(
  ID      BIGINT NOT NULL AUTO_INCREMENT,
  USER_ID BIGINT,
  PRIMARY KEY (ID),
  FOREIGN KEY (USER_ID) REFERENCES users(ID)
);