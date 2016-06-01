package com.cdtu.wechat.web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dom4j.DocumentException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cdtu.wechat.commons.utils.CheckUtil;
import com.cdtu.wechat.commons.utils.MessageUtil;
import com.cdtu.wechat.commons.utils.WechatUtil;

@Controller
@RequestMapping(value = "/wechat")
public class WeChatController {

  @RequestMapping(value = "/connect", method = RequestMethod.GET, produces = {"text/plain"})

  public void getConnect(String signature, String timestamp, String nonce, String echostr,
      HttpServletResponse response) throws IOException {
    if (CheckUtil.checkSignature(signature, timestamp, nonce)) {
      PrintWriter out = response.getWriter();
      System.out.println(echostr);
      out.write(echostr);
      out.flush();
      out.close();
    }
  }

  @RequestMapping(value = "/connect", method = RequestMethod.POST)
  public void postConnect(HttpServletRequest request, Writer out)
      throws IOException, DocumentException {
    Map<String, String> map = WechatUtil.xmlToMap(request);
    System.out.println(map);
    if ("event".equals(map.get("MsgType"))) {
      // 点击事件
      if (MessageUtil.EVENT_CLICK.equals(map.get("Event"))) {
        if ("11".equals(map.get("EventKey"))) {
          out.write(WechatUtil.createNewsMessage(map.get("FromUserName"), map.get("ToUserName")));

        }
      }
    }


  }
  
  
  @RequestMapping("/index")
  public String getIndex()
  {
	  return "index";
  }
  @RequestMapping("/admin")
  public String getAdmin()
  {
	  return "admin";
  }


}
