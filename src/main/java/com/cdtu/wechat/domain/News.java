package com.cdtu.wechat.domain;
/**
 * @Description 图文消息内容
 * @author 53574
 *
 */
public class News {
	//图文消息  消息标题
	private String Title;
	//图文消息   消息描述
	private String Description;
	//图文消息   图片地址
	private String PicUrl;
	//图文消息   消息具体链接地址
	private String Url;
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getPicUrl() {
		return PicUrl;
	}
	public void setPicUrl(String picUrl) {
		PicUrl = picUrl;
	}
	public String getUrl() {
		return Url;
	}
	public void setUrl(String url) {
		Url = url;
	}
	@Override
	public String toString() {
		return "News [Title=" + Title + ", Description=" + Description + ", PicUrl=" + PicUrl + ", Url=" + Url + "]";
	}
	
	
	
	

}
