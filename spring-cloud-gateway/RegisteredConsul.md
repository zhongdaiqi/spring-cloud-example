# Spring Cloud Gateway注册到服务器中心(Consul)

## 准备环境

启动Consul（./consul agent -dev）作为服务中心，默认是8500端口，然后启动spring-cloud-provider（9001端口）和spring-cloud-provider-second（9002端口）两个项目作为微服务。  
在Consul管理后台可以看见两个服务启动：  
![Alt text](http://static.bluersw.com/images/spring-cloud-gateway/spring-cloud-gateway-05.png )  
