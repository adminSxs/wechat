package com.cdtu.wechat.commons.utils;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;


import com.cdtu.wechat.domain.AccessToken;
import com.cdtu.wechat.domain.Button;
import com.cdtu.wechat.domain.ClickButton;
import com.cdtu.wechat.domain.Menu;
import com.cdtu.wechat.domain.News;
import com.cdtu.wechat.domain.NewsMessage;
import com.cdtu.wechat.domain.TextMessage;
import com.cdtu.wechat.domain.ViewButton;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion.Static;
import com.thoughtworks.xstream.XStream;

import net.sf.json.JSONObject;

public class WechatUtil {
	private static final String APPID = "wx57bd3d42c2253073";
	private static final String APPSECRET = "2ad85944b6b2ce996a7e316e8dabe8e2";
	
	private static final String ACCESS_TOKEN_URL = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET";
	
	private static final String UPLOAD_URL = "https://api.weixin.qq.com/cgi-bin/media/upload?access_token=ACCESS_TOKEN&type=TYPE";
	
	private static final String CREATE_MENU_URL = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token=ACCESS_TOKEN";
	
	private static final String QUERY_MENU_URL = "https://api.weixin.qq.com/cgi-bin/menu/get?access_token=ACCESS_TOKEN";
	
	private static final String DELETE_MENU_URL = "https://api.weixin.qq.com/cgi-bin/menu/delete?access_token=ACCESS_TOKEN";
	/**
	 * @Descript get请求
	 * @param url
	 * @return
	 */
	public static JSONObject doGet(String url)
	{
		DefaultHttpClient httpClient = new DefaultHttpClient();
		HttpGet get = new HttpGet(url);
		JSONObject jsonObject = null;
		try {
			HttpResponse response = httpClient.execute(get);
			HttpEntity entity = response.getEntity();
			if(entity != null){
				String result = EntityUtils.toString(entity,"UTF-8");
				jsonObject = JSONObject.fromObject(result);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		
		return jsonObject;
	}
	/**
	 * @Description post请求的封装
	 * @param url
	 * @param outStr
	 * @return
	 */
	
	public static JSONObject doPost(String url,String outStr){
		DefaultHttpClient httpClient = new DefaultHttpClient();
		HttpPost post = new HttpPost(url);
		JSONObject jsonObject = null;
		try {
			post.setEntity(new StringEntity(outStr, "UTF-8"));
			HttpResponse response = httpClient.execute(post);
			String result =EntityUtils.toString(response.getEntity(),"UTF-8");
			jsonObject = JSONObject.fromObject(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return jsonObject;
	}
	
	/**
	 * @Description 获取token
	 * @return
	 */
	public static AccessToken getAccessToken()
	{
		AccessToken token = new AccessToken();
		String url = ACCESS_TOKEN_URL.replace("APPID", APPID).replace("APPSECRET", APPSECRET);
		JSONObject jsonObject = doGet(url);
		System.out.println(jsonObject);
		System.out.println(jsonObject);
		if(jsonObject != null){
			token.setToken(jsonObject.getString("access_token"));
			token.setExpiresIn(jsonObject.getInt("expires_in"));
		}
		return token;
		
	}
	
	/**
	 * @Description 组装菜单
	 * @return
	 */
	public static Menu initMenu()
	{
		Menu menu = new Menu();
		//一级菜单 -----服务学生
		ClickButton button1 = new ClickButton();
		button1.setName("服务学生");
		button1.setType("click");
		button1.setKey("1");
		//二级菜单
		ClickButton button11 = new ClickButton();
		button11.setName("专业介绍");
		button11.setType("click");
		button11.setKey("11");
		
		ViewButton button12 = new ViewButton();
		button12.setName("校园招聘");
		button12.setType("view");
		button12.setUrl("http://baidu.com");
		
		
		ClickButton button121 = new ClickButton();
		button121.setName("专场招聘流程");
		button121.setKey("121");
		button121.setType("click");
		
		ClickButton button122 = new ClickButton();
		button122.setName("发布校外招聘信息");
		button122.setKey("122");
		button122.setType("click");
		
		button12.setSub_button(new Button[]{button121,button122}); 
		
		ClickButton button13 = new ClickButton();
		button13.setName("交通食宿");
		button13.setType("click");
		button13.setKey("13");
		
		ClickButton button131 = new ClickButton();
		button131.setName("校园周边食宿环境");
		button131.setKey("131");
		button131.setType("click");
		
		ClickButton button132 = new ClickButton();
		button132.setName("交通线路");
		button132.setKey("132");
		button132.setType("click");
		
		button13.setSub_button(new Button[]{button121,button122}); 
		
		
		button1.setSub_button(new Button[]{button11,button12,button13}); 
		//一级菜单-----服务学生
		ClickButton button2 = new ClickButton();
		button2.setName("服务企业");
		button2.setType("click");
		button2.setKey("21");
		//二级菜单
		ViewButton button21 = new ViewButton();
		button21.setName("招聘信息");
		button21.setType("view");
		button21.setUrl("http://zzb.ngrok.cc/index.jsp");
		
		
		
		
		ClickButton button22 = new ClickButton();
		button22.setName("签约派遣");
		button22.setType("click");
		button22.setKey("22");
		
		ClickButton button23 = new ClickButton();
		button23.setName("实习信息");
		button23.setType("click");
		button23.setKey("23");
		
		ClickButton button24 = new ClickButton();
		button24.setName("国家政策");
		button24.setType("click");
		button24.setKey("24");
		
		ClickButton button25 = new ClickButton();
		button25.setName("知识库");
		button25.setType("click");
		button25.setKey("25");
		
		ClickButton button26 = new ClickButton();
		button26.setName("满意度调查");
		button26.setType("click");
		button26.setKey("26");
		
		button2.setSub_button(new Button[]{button21,button22,button23,button24,button25}); 
		
		//一级菜单---关于我们
		ClickButton button3 = new ClickButton();
		button3.setName("关于我们");
		button3.setType("click");
		button3.setKey("3");
		//二级菜单
		ClickButton button31 = new ClickButton();
		button31.setName("联系我们");
		button31.setType("click");
		button31.setKey("31");
		
		ClickButton button32 = new ClickButton();
		button32.setName("工作职责");
		button32.setType("click");
		button32.setKey("32");
		
		ClickButton button33 = new ClickButton();
		button33.setName("例行工作");
		button33.setType("click");
		button33.setKey("33");
		
		ClickButton button34 = new ClickButton();
		button34.setName("留言板");
		button34.setType("click");
		button34.setKey("34");
		button3.setSub_button(new Button[]{button31,button32,button33,button34}); 
		
		menu.setButton(new Button[]{button1,button2,button3});
		return menu;
	}
	public static void main(String[] args) {
		
		String str = JSONObject.fromObject(initMenu()).toString();
	int createMenu = createMenu(getAccessToken().getToken(), str);
		
		
	}
	/**
	 * @Description 创建微信界面菜单
	 * @param token
	 * @param menu
	 * @return
	 */
	public static int createMenu(String token,String menu)
	{
		int result = 0;
		System.out.println(menu);
		System.out.println(token);
		String url = CREATE_MENU_URL.replace("ACCESS_TOKEN",token);
		JSONObject object = doPost(url, menu);
		if(object != null){
			result = object.getInt("errcode");
		}
		return result;
	}
	
	/**
	 * @Description 将xml转换为map
	 * @param request
	 * @return
	 * @throws IOException
	 * @throws DocumentException
	 */
	@SuppressWarnings("unchecked")
	public static Map<String, String> xmlToMap(HttpServletRequest request) throws IOException, DocumentException{
		Map<String, String> map = new HashMap<String,String>();
		SAXReader reader = new SAXReader();
		InputStream in = request.getInputStream();
		Document doc = reader.read(in);
		Element element = doc.getRootElement();
		List<Element> list = element.elements();
		for (Element element2 : list) {
			map.put(element2.getName(), element2.getText());
		}
		in.close();
		return map;
	}
	
	public static String createNewsMessage(String fromUserName,String toUserName )
	{

		NewsMessage newsMessage = new NewsMessage();
		newsMessage.setFromUserName(toUserName);
		newsMessage.setToUserName(fromUserName);
		newsMessage.setCreateTime(new Date().getTime());
		newsMessage.setMsgType("news");
		
		newsMessage.setArticleCount(1);
		//第一条图文消息
		News news = new News();
		news.setTitle("成都工业学院专业介绍");
		news.setDescription("我校创办于1913年，是辛亥革命后我省最早设立的工科学校之一，曾使用过“四川省立第一甲种工业学校”、“成都工业学校”、“成都无线电机械学校”成都无机校）等多个校名，1993年经原.。");
		news.setPicUrl("http://zzb.ngrok.cc/img/cdtu.jpg");
		news.setUrl("http://zzb.ngrok.cc/index.jsp");
		
		
		List<News> newsList = new ArrayList<News>();
		newsList.add(news);
		newsMessage.setArticles(newsList);
		
		
		return newsMessageToXml(newsMessage);
	}
	
	public static String MenuToXml(Menu menu){
		XStream stream = new XStream();
		stream.alias("xml", menu.getClass());
		return stream.toXML(menu);
	}
	
	public static String textMessageToXml(TextMessage textMessage){
		XStream xStream = new XStream();
		xStream.alias("xml", textMessage.getClass());
		return xStream.toXML(textMessage);
		
	}
	
	public static String newsMessageToXml(NewsMessage newsMessage){
		XStream stream = new XStream();
		stream.alias("xml", newsMessage.getClass());
		stream.alias("item",new News().getClass());
		return stream.toXML(newsMessage);
	}
	
	public static String getAccess_Token()
	{
		return null;
	}
	

}
