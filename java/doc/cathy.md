# Create Project

https://start.spring.io/



# エラー対応

## Web server failed to start. Port 8080 was already in use.

ポートを開いてるプロセスをkillする方法

`$ lsof -i -P | grep 8080`
java      99189 jinghuizhen   36u  IPv6 0x830dcbcf090ac895      0t0  TCP *:8080 (LISTEN)

パラメータの「-9」を忘れないように

`$ kill -9 99189`

再度プロジェクトを起動する。

`$ ./mvnw spring-boot:run`


