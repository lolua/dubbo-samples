
## 启动顺序
### 1. 先启动 dubbo-provider-service 服务，其中通过配置 dubbo.protocol.port=20885 设置dubbo的端口为20885
### 2. 然后启动 dubbo-consumer-service 服务
### 3. 访问 http://localhost:8080/hello、http://localhost:8080/hello1 能正常访问
### 4. 停掉 dubbo-provider-service 服务，其中通过配置 dubbo.protocol.port=20886 设置dubbo的端口为20886（用于模拟不同的ip启动的情况）
### 5. 再次访问 http://localhost:8080/hello、http://localhost:8080/hello1 其中一个接口报错，一个接口正常访问
# dubbo-samples
# dubbo-samples
