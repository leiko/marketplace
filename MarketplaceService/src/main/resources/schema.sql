DROP TABLE IF EXISTS item;

CREATE TABLE item (
  id INT PRIMARY KEY NOT NULL,
  user_id  INT NOT NULL,
  title  VARCHAR(100) NOT NULL,
  description  VARCHAR(500) NOT NULL,
  status  VARCHAR(20) NOT NULL);

INSERT INTO item (id, user_id, title, description, status)
VALUES (1, 1, "smartphone preto", "samsung galayx S8", "published");
INSERT INTO item (id, user_id, title, description, status)
VALUES (2, 1, "iphone branco", "pouco uso", "published");