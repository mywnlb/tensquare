# tensquare
十次方项目
启动docker
systemctl start docker

mysql容器
docker run -di --name=mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=3306 centos/mysql-57-centos7


出现错误
Access denied for user 'keystone'@'10.0.2.15' (using password: YES)") 
解决
1 docker exec -it mysql /bin/bash

2 mysql -u root -p (直接回车)

3 grant all privileges on *.* to root@'%' identified by '123456'; （123修改为你想要的密码）


redis容器
docker run -di --name=redis -p 6379:6379 redis

mongo容器
docker run -di --name=mongo -p 27017:27017 mongo

windows
开启服务  
mongod --dbpath=D:\mongodata



rabbitmq 容器

15672 (if management plugin is enabled)
15671 management监听端口
5672, 5671 (AMQP 0-9-1 without and with TLS)
4369 (epmd) epmd 代表 Erlang 端口映射守护进程
25672 (Erlang distribution)

docker run -di --name=rabbitmq -p 5671:5617 -p 5672:5672 -p 4369:4369 -p 15671:15671 -p 15672:15672 -p 25672:25672 rabbitmq:management