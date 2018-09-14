 - 使用前切换到父项目目录运行命令：

```
    mvn clean install -pl utils -am -DskipTests
```

 - 依赖样式为
```xml
    <dependency>
        <groupId>team.whatdev</groupId>
        <artifactId>utils</artifactId>
        <version>1.0-SNAPSHOT</version>
    </dependency>
```