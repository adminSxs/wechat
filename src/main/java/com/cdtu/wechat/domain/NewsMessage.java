package com.cdtu.wechat.domain;

import java.util.List;

/**
 * @Description 图文消息实体
 * @author 53574
 *
 */
public class NewsMessage extends BaseMessage {
	
	private int ArticleCount;
	
	private List<News> Articles;

	public int getArticleCount() {
		return ArticleCount;
	}

	public void setArticleCount(int articleCount) {
		ArticleCount = articleCount;
	}

	public List<News> getArticles() {
		return Articles;
	}

	public void setArticles(List<News> articles) {
		Articles = articles;
	}

	@Override
	public String toString() {
		return "NewsMessage [ArticleCount=" + ArticleCount + ", Articles=" + Articles + "]";
	}
	
	
	
	
}
