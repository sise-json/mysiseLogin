package sise.checklogin;

import java.util.regex.Pattern;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 *  Class Name: getline.java
 *  Description: 专门用于解析main.jsp 链接
 *  例如个人信息、课程表之类的
 *  因为每个链接对应都不一样，为了灵活一点独自处理
 *  @author Abel TSE  DateTime 2016年5月15日 下午10:05:17 
 *  @email romennts@gmail.com 
 *  @version 1.0
 */
public class getline {
	//
	
	
	//返回个人信息链接
	public static String getinfolink(Document main_jsp){
		Elements stuclass=main_jsp.select("body > table > tbody > tr:nth-child(1) > td:nth-child(1) > table > tbody > tr > td");
		String stu=stuclass.attr("onclick");
		//正则表达式的匹配模式，对于华软内网更加方便匹配获得网址，以下函数相同
		Pattern p=Pattern.compile("'../../../../../?"); 
		String[] str=p.split(stu);
		//拼接成绝对地址
		String reallink="http://class.sise.com.cn:7001/" + str[1];
		//无法匹配最后一个点号，所以直接操控删除
		reallink=reallink.substring(0,reallink.length()-1);
		return reallink;	
			
	};
	
	//返回课程表链接
	public static String getclasslink(Document main_jsp){
		Elements stuclass=main_jsp.select("body > table > tbody > tr:nth-child(1) > td:nth-child(2) > table > tbody > tr > td");
		String stu=stuclass.attr("onclick");
		//正则表达式的匹配模式
		Pattern p=Pattern.compile("'/?"); 
		String[] str=p.split(stu);
		//拼接成绝对地址
		String reallink="http://class.sise.com.cn:7001/" + str[1];
		return reallink;
	};
	
	//返回考试安排表链接
	public static String getexamlink(Document main_jsp){
		Elements stuclass=main_jsp.select("body > table > tbody > tr:nth-child(1) > td:nth-child(3) > table > tbody > tr > td");
		String stu=stuclass.attr("onclick");
		//正则表达式的匹配模式
		Pattern p=Pattern.compile("'../../../../../?"); 
		String[] str=p.split(stu);
		String reallink="http://class.sise.com.cn:7001/" + str[1];
		reallink=reallink.substring(0,reallink.length()-1);
		return reallink;
	};
}
