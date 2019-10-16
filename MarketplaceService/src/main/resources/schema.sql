DROP TABLE IF EXISTS item;

CREATE TABLE item (
  id INT PRIMARY KEY NOT NULL,
  user_id  INT NOT NULL,
  title  VARCHAR(100) NOT NULL,
  description  VARCHAR(500) NOT NULL,
  status  VARCHAR(20) NOT NULL,
  price   VARCHAR(20) NOT NULL);

INSERT INTO item (id, user_id, title, description, status, price)
VALUES (1, 1, "smartphone preto", "samsung galayx S8", "published", "500,00");

INSERT INTO item (id, user_id, title, description, status, price)
VALUES (2, 1, "iphone branco", "pouco uso", "published", "800,00");

INSERT INTO item (id, user_id, title, description, status, price)
VALUES (3, 1, "galaxy s9", "usado por 1 ano", "published", "1500,00");

INSERT INTO item (id, user_id, title, description, status, price)
VALUES (4, 1, "huawei p20", "tela quebrada", "published", "900,00");

INSERT INTO item (id, user_id, title, description, status, price)
VALUES (5, 1, "iphone 7", "novo", "published", "4000,00");

INSERT INTO item (id, user_id, title, description, status, price)
VALUES (6, 1, "iphone 7", "3 anos de uso", "sold", "700,00");

INSERT INTO item (id, user_id, title, description, status, price)
VALUES (7, 1, "motorola", "acompanha capinha", "published", "1000,00");

INSERT INTO item (id, user_id, title, description, status, price)
VALUES (8, 1, "nexus", "na caixa", "published", "1200,00");

INSERT INTO item (id, user_id, title, description, status, price)
VALUES (9, 1, "iphone 4", "modelo antigo", "unpublished", "900,00");

INSERT INTO item (id, user_id, title, description, status, price)
VALUES (10, 1, "galaxy note 4", "algumas marcas de uso", "published", "500,00");