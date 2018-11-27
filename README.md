# tensquare
十次方项目
启动docker
systemctl start docker

mysql容器
docker run -di --name=mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=3306 centos/mysql-57-centos7