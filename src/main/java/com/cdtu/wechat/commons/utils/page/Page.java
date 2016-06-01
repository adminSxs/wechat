package com.cdtu.wechat.commons.utils.page;



public class Page {

	 // 每页显示数量
	  private Integer pageSize;
	  // 总计数量
	  private Integer total;
	  // 当前页数
	  private Integer pageIndex;

	  public Integer getPageSize() {
	    return pageSize;
	  }

	  public void setPageSize(Integer pageSize) {
	    this.pageSize = pageSize;
	  }

	  public Integer getTotal() {
	    return total;
	  }

	  public void setTotal(Integer total) {
	    this.total = total;
	  }

	  public Integer getPageIndex() {
	    return pageIndex;
	  }

	  public void setPageIndex(Integer pageIndex) {
	    this.pageIndex = pageIndex;
	  }

	  public Page() {
	    super();
	    this.pageIndex = INDEX;
	    this.pageSize = NUM;
	  }

	  // 定义一个单例对象
	  private static Page page = null;
	  // 当前页数
	  private static final int INDEX = 1;
	  // 每页显示数量
	  private static final int NUM = 10;
	  // 总计数量
	  private static final int TOTAL = 0;

	  /**
	   * Description : 初始化Page对象
	   * 
	   * @return
	   * 
	   * 
	   * @author: xinwu-yang
	   */
	  public static Page getPageInstance() {
	    if (page == null) {
	      page = new Page();
	      page.setPageIndex(INDEX);
	      page.setPageSize(NUM);
	      page.setTotal(TOTAL);
	    }
	    return page;
	  }

	  /**
	   * Description : 获取起始值
	   * 
	   * @return 返回起始值
	   * 
	   * 
	   * @author: xinwu-yang
	   */
	  public int getBeginNum() {
	    return (pageIndex - 1) * pageSize;
	  }

	  /**
	   * Description : 重置Page对象
	   * 
	   * 
	   * @author: xinwu-yang
	   */
	  public void reset() {
	    page.setPageIndex(INDEX);
	    page.setPageSize(NUM);
	    page.setTotal(TOTAL);
	  }

	  public Page(Integer pageIndex, Integer pageSize) {
	    super();
	    this.pageSize = pageSize;
	    this.pageIndex = pageIndex;
	  }

	@Override
	public String toString() {
		return "Page [pageSize=" + pageSize + ", total=" + total + ", pageIndex=" + pageIndex + "]";
	}
	  
	  
}
