# marketplace

<h2>How to run docker</h2>

docker run --name=marketplacedb -e MYSQL_PASSWORD=senha -e MYSQL_USER=usuario -e MYSQL_ROOT_PASSWORD=admin123 -e MYSQL_DATABASE=marketplace -h localhost -p 3306:3306 -d mysql/mysql-server

<h2>How to access the database</h2>

docker exec -it marketplacedb mysql -h localhost -u root -p

<h2>How to access the APIs</h2>

http://localhost:8080/swagger-ui.html
