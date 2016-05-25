package sise.checklogin;

import java.util.Map;

/**
 *  Class Name: TestPrint.java
 *  Description: 测试输出
 *  @author Abel TSE  DateTime 2016年5月15日 下午10:06:14 
 *  @email romennts@gmail.com 
 *  @version 1.0
 */
public class TestPrint {
	public static void print() {
		//测试输出
		System.out.println("学生个人信息：");
			for(Map.Entry<String, String> entry : getcontent.infoMap.entrySet()){
				    System.out.println(entry.getKey()+" : "+entry.getValue());
				}
			
		System.out.println("\n学生成绩：");
		System.out.print("获得办公软件成绩：");
		System.out.println(getcontent.scoreMap.get("办公软件"));
		System.out.println(getcontent.scoreMap.get("大学体育I"));
			
		System.out.println("\n学生课程表：");
		//其实可以根据数组第一个索引知 道判断第几节
		System.out.print("星期三第二节课："+ "时间是："+ getcontent.clasStrings[2][0]);
		System.out.println(" \t" + getcontent.clasStrings[2][3]);
		System.out.print("星期二第一节课："+ "时间是："+ getcontent.clasStrings[1][0]);
		System.out.println(" \t" + getcontent.clasStrings[1][2]);
		System.out.print("星期五第一节课："+ "时间是："+ getcontent.clasStrings[1][0]);
		System.out.println(" \t" + getcontent.clasStrings[1][5]);
	        
	   System.out.println("\n学生考试安排表：");
	   int i=0;
	   //输出第一门考试内容
	   for(String arr : getcontent.examStrings[1]){
			System.out.print(getcontent.examStrings[0][i]+":  ");
			System.out.println(arr);
			i++;
		}   
	
	}
}
	
