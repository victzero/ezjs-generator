# eZjs-generator
generate code of model and mapper and provider and manager for eZjs-core framework
针对ezjs（https://github.com/victzero/ezjs）框架提供的逆向生成工具，自动生成Model层、DAO层（Mapper+Provider)、manager层。基于MyBatis Generator代码进行的插件开发。

## Downloading

## Building

## Getting started
```
java -jar generator-1.0.0-SNAPSHOT.jar -mysql.db ez_nfs_v1 -mysql.user root -mysql.pass root -target.module nfs -tables filemodel vodmodel
```

参数说明:
* mysql参数: 配置mysql数据库连接信息
    * host 数据库连接地址,默认为 "localhost"
    * db   数据库,必填
    * port 端口号,默认3306
    * user 用户,默认root
    * pass 密码,必填
* target参数: 生成目标信息
    * module   模块名称
    * dir  生成文件存放路径, 默认存放在当前执行目录
* tables参数: 指定需要生成的表,空格隔开
