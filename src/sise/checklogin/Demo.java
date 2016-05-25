package sise.checklogin;

/**
 *  Class Name: Demo.java
 *  Description: 主函数入口  使用Jsoup解析mysise
 *  @author Abel.TSE  DateTime 2016年5月15日 下午10:02:02 
 *  @email romennts@gmail.com 
 *  @version 1.0
 */
public class Demo {

	public static void main(String[] args) throws Exception {
		//一定要先执行这个函数，获得相关信息
		login.getloginvalue("请在这里输入你的账号","这里输入你的密码");	
		
		//测试打印输出！
		TestPrint.print();
	}
}

