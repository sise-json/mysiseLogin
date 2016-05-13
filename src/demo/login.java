package demo;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.Connection.Method;
import org.jsoup.Connection.Response;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class login {
	//为了方便各个函数之间调用cookies ,特意定义这个静态变量
	static Map<String,String> cookies =null;
	public static String getloginvalue() throws Exception {
		//首先获取到学生信息管理系统页面
		Connection con = Jsoup.connect("http://class.sise.com.cn:7001/sise/login.jsp");
		con.header("User-Agent", "Mozilla/5.0 (compatible; MSIE 9.0; Windows NT 6.1; Trident/5.0; MALC)");
		Connection.Response rs = con.execute();
		try {
			rs = con.execute();
		} catch (Exception e) {
			System.out.println("false");
		}
		
		Document doc=Jsoup.parse(rs.body());
		//获取登录相关参数
		 Elements hidden = doc.select("div > form > input[type=\"hidden\"]:nth-child(1)");
		 String hiddename=hidden.attr("name");
		 String hiddenvalue=hidden.attr("value");
		 Elements random= doc.select("#random");
		 String randomvalue=random.attr("value");
		 
		 //开始模拟登陆
		 String username = "";
			String password = "";
			//map装载表单数据
			Map<String,String> map = new HashMap<String,String>();
			map.put("username", username);
			map.put("password", password);
			map.put(hiddename, hiddenvalue);
			map.put("random", randomvalue);
			
			
			
			//模拟浏览器创建连接，发起请求
			Connection conn = Jsoup.connect("http://class.sise.com.cn:7001/sise/login_check.jsp");
			conn.header("Host", "class.sise.com.cn:7001");
			conn.header("Referer", "http://class.sise.com.cn:7001/sise/index.jsp");
			conn.header("User-Agent", "Mozilla/5.0 (compatible; MSIE 9.0; Windows NT 6.1; Trident/5.0; MALC)");
			Response response = conn.ignoreContentType(true).method(Method.POST).data(map).execute();
			
			//判断密码正确性
			if(response.body().indexOf("index.jsp")<0){
				System.out.println("账号不存在，或密码错误！");
				return "账号不存在，或密码错误！";
			}
			
			//获取cookies
			cookies = response.cookies();
			
			
			//Set<String> keys = cookies.keySet();
			/*遍历输出cookie  这里只有一个cookie
			  *		for(String key:keys){
			  *			System.out.println(key+":"+cookies.get(key));
			  *				}
			*/
			//使用cookies保存的登录信息进行模拟登录获取信息系统主页
			Document main_jsp = Jsoup.connect("http://class.sise.com.cn:7001/sise/module/student_states/student_select_class/main.jsp").cookies(cookies).post();
			main_jsp.charset(Charset.forName("UTF-8"));
			//System.out.println(main_jsp);
	
			//创建爬取网站地图  地图put顺序地址按照学生管理系统排序
			Map<String,String> link = new HashMap<String,String>();
			link.put("infolink", getline.getinfolink(main_jsp));
			link.put("classlink", getline.getclasslink(main_jsp));
			link.put("examlink", getline.getexamlink(main_jsp));
			
			//根据网站地图，获取解析后的JSON信息
			//getcontent.getinfo(link.get("infolink").toString());
			//getcontent.getscore(link.get("infolink").toString());
			//getcontent.getclass(link.get("classlink").toString());
			getcontent.getexam(link.get("examlink").toString());
	
			return "OK";
	}
	

}
