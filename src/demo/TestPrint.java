package demo;

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
			
		System.out.println("学生成绩：");
			for(Map.Entry<String, String> entry : getcontent.scoreMap.entrySet()){
				    System.out.println(entry.getKey()+" : "+entry.getValue());
				}
			
		System.out.println("学生课程表：");
		for(String[] arr : getcontent.clasStrings){
			for(String arr2 : arr){
				if (arr2!=null) {
					System.out.println(arr2+"\t");
				}
			}
		}
	        
	   System.out.println("学生考试安排表：");
	   for(String[] arr : getcontent.examStrings){
			for(String arr2 : arr){
				if (arr2!=null) {
					System.out.println(arr2+"\t");
				}
			}
		}   
	
	}
}
	
