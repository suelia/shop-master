0. 前言
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

**1. 算法（MD5, SHA1）**
```
@Autowired
KeyGeneration keyGeneration;
```
如需关闭Bean 注入请配置
```yaml
utils:
  key-generation: false
```

**2. 随机字符串**
```
@Autowired
RandomText randomText;
```
配置文件情况如下
```yaml
utlis:
  random:
    #默认获取数量为6 个字符，可修改，但不可小于1，大于字符池上限。
    count: 6
    #默认为开启状态，false 状态则为关闭数字，关闭小写字母，关闭大写字母加入字符池混淆
    number: true
    low-case: true
    up-case: true
    #修改各个类别字符池内容，Stirng[] 类型接收字符列
    low-chars: *,*,*,*
    up-chars: *,*,*,*
    numbers: *,*,*,*

```