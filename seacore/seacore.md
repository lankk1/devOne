# 项目简介
>1. springMVC和Druid数据库连接池的整合
>2. 和redis集群模式的整合
>3. 和redis哨兵模式的整合
>4. 引入外界的jar包，以及在打包时将其一并package
>5. 配置了如何打包需要的文件和去除不需要的文件


## 1.springMVC和Druid数据库连接池的整合
+ 1.1pom构建
在pom.xml中引入相应的spring包和Druid连接池包。
```
        <dependencies>
            <dependency>
            <groupId>xxxx</groupId>
            <artifactId>xxxx</artifactId>
            <version>版本号</version>
            </dependency>
        </dependencies>
```

+ 1.2 web.xml配置
加载顺序listener、filter、servlet、inteceptor

+ 启动载入


+ 正式环境配置
    + 检查tomcat等web服务器是否正常启动
    + 执行sql
    + 配置环境变量
        + Linux
        在/etc/profile文件中添加变量
        + Windows
        在系统变量中加入变量
    + 处理配置文件
    + 发布war包
    将war包复制到路径tomcat/webapps下
