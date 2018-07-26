# mybatis
对mybatis的一些尝试与对企业实际应用的总结  

项目的整体路径如下：  
```
|
|-source ................................................... 一些项目相关的资料和文档总结
|-src ...................................................... 项目代码与配置文件夹
   |-main .................................................. 项目代码相关
   |   |-java .............................................. 项目java代码
   |   |   |-com.berg ...................................... 项目总的包
   |   |           |-application ........................... 对mybatis的应用示例
   |   |           |      |-firstclass ..................... 方法一
   |   |           |      |-secondclass .................... 方法二
   |   |           |      |-thiredclass .................... 方法三
   |   |           |-base .................................. mybatis基础知识的学习
   |   |           |   |-support ........................... 基础知识的基本支持
   |   |           |   |-xmlconfigures ..................... mybatis配置相关的学习
   |   |           |   |-xmlmappers ........................ mybatis mapper文件相关的学习
   |   |           |-utils ................................. 工具包
   |   |-resources ......................................... 配置文件与maper文件
   |         |-com.berg .................................... mapper文件
   |         |-config ...................................... 测试时候相关的配置文件
   |         |-db .......................................... 数据库创建文件
   |-test .................................................. 项目测试文件夹
       |-java .............................................. 项目测试相关代码
   
```
 
  
main中的代码提供了基本的功能与类的支持，所有的效果都在test里测试得到。  

在mybatis的应用中：  
其中，在firstclass包下是最规范的写法，但是存在N+1的问题;  
在secondclass包下是较为中正的写法，但是过于繁琐，不存在N+1的问题;  
在thirdclass包下是最简洁的写法，不存在N+1的问题，但是不够规范;  


对该项目感兴趣的朋友可以直接使用下面的方式将代码克隆到本地  
```
git clone https://github.com/berg-turing/mybatis.git
```
![](https://github.com/berg-turing/mybatis/raw/master/source/image/git_clone.png)


下面以IDEA为基础，简要介绍如何启用该项目： 

环境依赖  
项目开发工具：IntelliJ IDEA  
项目管理工具：maven  
版本控制工具：git  
数据库：mysql  

将代码克隆到本地之后，可以直接使用IDEA打开项目  
![](https://github.com/berg-turing/mybatis/raw/master/source/image/idea_index.png)


![](https://github.com/berg-turing/mybatis/raw/master/source/image/idea_openproject.png)


![](https://github.com/berg-turing/mybatis/raw/master/source/image/idea_asproject.png)

在项目路径下执行  
```
mvn clean install -Dmaven.test.skip=true
```

![](https://github.com/berg-turing/mybatis/raw/master/source/image/idea_mavenclean.png)


![](https://github.com/berg-turing/mybatis/raw/master/source/image/idea_mavencleanfin.png)

项目将引入mybatis、junit和mysql的依赖


![](https://github.com/berg-turing/mybatis/raw/master/source/image/idea_database.png)



![](https://github.com/berg-turing/mybatis/raw/master/source/image/workbench_exesql.png)


![](https://github.com/berg-turing/mybatis/raw/master/source/image/workbench_database.png)


