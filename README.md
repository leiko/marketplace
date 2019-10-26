# marketplace

<h2>How to run docker</h2>

MySQL Database

docker run --name=marketplacedb -e MYSQL_PASSWORD=senha -e MYSQL_USER=usuario -e MYSQL_ROOT_PASSWORD=admin123 -e MYSQL_DATABASE=marketplace -h localhost -p 3306:3306 -d mysql/mysql-server

Application

1. Create the image:

Go to root directory and execute: 

docker build -t marketplace:latest -f docker/Dockerfile .

2. To run the docker: 

docker run  --name marketplace --network="host"  marketplace:latest

<h2>How to access the database</h2>

docker exec -it marketplacedb mysql -h localhost -u root -p

<h2>How to access the front page</h2>

http://localhost:8080/

<h2>How to access the APIs</h2>

http://localhost:8080/swagger-ui.html
