# mysiseLogin
[![](https://img.shields.io/badge/license-MIT-blue.svg)](https://github.com/cncoder/mysiseLogin/master/LICENSE.txt)
[![](https://img.shields.io/github/release/cncoder/mysiseLogin.svg)](https://github.com/cncoder/mysiseLogin/releases)
[![](https://img.shields.io/github/stars/cncoder/mysiseLogin.svg)](https://github.com/cncoder/mysiseLogin/stargazers)
[![](https://img.shields.io/github/forks/cncoder/mysiseLogin.svg)](https://github.com/cncoder/mysiseLogin/network)
[![Facebook](https://img.shields.io/badge/facebook-@romennt-green.svg?style=flat)](https://www.facebook.com/romennt)


 * 模拟登录广州大学华软软件学院学生信息管理系统页面
 * 并实现 个人信息、课表、考试信息解析


#demo.java
  主函数入口
 * 使用Jsoup解析mysise
 * 功能分布详情看各个类说明
 * 请在此类写入你的账号密码
 * ![mysiseLogin](http://www.yicodes.com/wp-content/uploads/2016/05/main.png)
 * 有错误提示(返回值在login.java中)
 ![mysiseLogin](http://www.yicodes.com/wp-content/uploads/2016/05/学号错误.png)

#login.java
 获取登录相关参数
 关键类
 * 返回码说明：
 * 账号错误或者密码错误返回 error ，也可以根据需要修改
 * ![error](http://www.yicodes.com/wp-content/uploads/2016/05/返回的错误.png)
 * 账号成功登陆，返回 OK
 *  ![OK](http://www.yicodes.com/wp-content/uploads/2016/05/正确返回OK.png)

#class getcontent
 * 根据链接以及cookie获取相关内容
 * 每个函数都需要在login获得解析地址
 * 课程表放到二维数组中
 * 这样就可以达到跨平台处理了


#public class getline
 * 专门用于解析main.jsp 链接
 * 例如个人信息、课程表之类的
 * 因为每个链接对应都不一样，为了灵活一点独自处理

#使用方法:
* 以下都是静态变量，可以全局使用，前提是执行主函数中的 login.getloginvalue("输入你的学号","登陆密码")

##学生信息map
* static Map<String,String> infoMap = new HashMap<String,String>();

##学生成绩map
* static Map<String,String> scoreMap = new HashMap<String,String>();

##学生课表
* 定义九行六列数组
* 如 clasStrings[1][2]表示星期二第一节
* 而clasStrings[0][2] 表示星期二字符串
* null或者值为-1证明该时段没有课程
* static String [][] clasStrings = new String [9][8];
##考试安排表
* null证明没有考试，或者超出索引范围
* 如 examStrings[0][x]表示表头
* 而examStrings[1][?] 表示第一门课程
* static String [][] examStrings = new String [10][8];

#测试类
* 箭头是一一对应的，注意对于examStrings 和 clasStrings如果为 null 就是没有考试或者该时段不用上课
*  ![打印输出某些结果](http://www.yicodes.com/wp-content/uploads/2016/05/test.png)
