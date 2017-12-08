# 论坛项目 (Forum)

## 描述

## 相关名词
- 论坛 forum
- 帖子 post

## 技术点
- @RestController 给所有的controller方法都添加了@ResponseBody注解
## 遗留问题
- 更新语句为啥一定要加@Transactional
- 更新语句参数传进来没有中文乱码，但是保存到数据就有中文乱码    
    这样就不行 url:jdbc:mysql://localhost:3306/forum?useUnicode=true&amp;characterEncoding=utf-8
    这样就可以了 url: jdbc:mysql://Qlocalhost:3306/forum?characterEncoding=utf-8
- thymleaf 模板引擎的使用
- @Query 表名字开头大写， 尽管数据库里表的名字是小写的
- thymeleaf 模板缓存去掉了，修改hello world内容 还是不刷新的问题