# 论坛项目 (Forum)

## 描述

## 相关名词
- 论坛 forum
- 帖子 post

## 遗留问题
- 更新语句为啥一定要加@Transactional
- 更新语句参数传进来没有中文乱码，但是保存到数据就有中文乱码    
    这样就不行 url:jdbc:mysql://localhost:3306/forum?useUnicode=true&amp;characterEncoding=utf-8
    这样就可以了 url: jdbc:mysql://localhost:3306/forum?characterEncoding=utf-8
