# mysiseLogin
[![](https://img.shields.io/badge/license-MIT-blue.svg)](https://github.com/cncoder/mysiseLogin/master/LICENSE.txt) 
[![](https://img.shields.io/github/release/coderyi/mysiseLogin.svg)](https://github.com/cncoder/mysiseLogin/releases)
[![](https://img.shields.io/github/stars/coderyi/mysiseLogin.svg)](https://github.com/cncoder/mysiseLogin/stargazers) 
[![](https://img.shields.io/github/forks/coderyi/mysiseLogin.svg)](https://github.com/cncoder/mysiseLogin/network) 
[![Facebook](https://img.shields.io/badge/facebook-@romennt-green.svg?style=flat)](https://www.facebook.com/romennt)

![mysiseLogin](http://www.yicodes.com/) 
 * 模拟登录广州大学华软软件学院学生信息管理系统页面
 * 并实现 个人信息、课表、考试信息解析

 
#demo.java
  主函数入口
 * 使用Jsoup解析mysise
 * 功能分布详情看各个类说明
 * 架构请看 read me

 #login.java
 获取登录相关参数
 关键类
 
 
 #class getcontent
 /*
 * 根据链接以及cookie获取相关内容
 * 输出相关的ＪＳＯＮ信息
 * 每个函数都需要在login获得解析地址
 * 基本做到把每个网页元素装载到map中，然后转换成JSON
 * 课程表放到二维数组中
 * 这样就可以达到跨平台处理了
 */
 
 #public class getline
 /*
 * 专门用于解析main.jsp 链接
 * 例如个人信息、课程表之类的
 * 因为每个链接对应都不一样，为了灵活一点独自处理
 */

