<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="container">
	
	<div class="row">
		<div class="col-sm-4 col-xs-4"></div>
		<div class="col-sm-4 col-xs-4">
		<h3 class="text-primary">校内招聘</h3>
		</div>
		<div class="col-sm-4 col-xs-4">
		</div>
	</div>

	
	<div data-am-widget="list_news" class="am-list-news am-list-news-default" >
  <!--列表标题-->
    <div class="am-list-news-hd am-cf">
       <!--带更多链接-->
        <a href="javascript:void(0)" class="">
          <h2>就业快讯</h2>
            <span class="am-list-news-more am-fr">更多 &raquo;</span>
        </a>
          </div>

  <div class="am-list-news-bd">
  <ul class="am-list">

      <li class="am-g am-list-item-desced" ng-repeat="p in ps" ui-sref="recInfo({pid:p.id})">
          <a href="javascript:void(o);" class="am-list-item-hd ">{{p.title}}</a>


          <div class="am-list-item-text">
          <span ng-bind-html="p.introduce"></span>
			</div>

      </li>
      
    <!--    <li class="am-g am-list-item-desced">
          <a href="http://www.douban.com/online/11614662/" class="am-list-item-hd ">我很囧，你保重....晒晒旅行中的那些囧！</a>


          <div class="am-list-item-text">囧人囧事囧照，人在囧途，越囧越萌。标记《带你出发，陪我回家》http://book.douban.com/subject/25711202/为“想读”“在读”或“读过”，有机会获得此书本活动进行3个月，每月送出三本书。会有不定期bonus！</div>

      </li>
      
       <li class="am-g am-list-item-desced">
          <a href="http://www.douban.com/online/11614662/" class="am-list-item-hd ">我很囧，你保重....晒晒旅行中的那些囧！</a>


          <div class="am-list-item-text">囧人囧事囧照，人在囧途，越囧越萌。标记《带你出发，陪我回家》http://book.douban.com/subject/25711202/为“想读”“在读”或“读过”，有机会获得此书本活动进行3个月，每月送出三本书。会有不定期bonus！</div>

      </li>
      
       <li class="am-g am-list-item-desced">
          <a href="http://www.douban.com/online/11614662/" class="am-list-item-hd ">我很囧，你保重....晒晒旅行中的那些囧！</a>


          <div class="am-list-item-text">囧人囧事囧照，人在囧途，越囧越萌。标记《带你出发，陪我回家》http://book.douban.com/subject/25711202/为“想读”“在读”或“读过”，有机会获得此书本活动进行3个月，每月送出三本书。会有不定期bonus！</div>

      </li>
      
       <li class="am-g am-list-item-desced">
          <a href="http://www.douban.com/online/11614662/" class="am-list-item-hd ">我很囧，你保重....晒晒旅行中的那些囧！</a>


          <div class="am-list-item-text">囧人囧事囧照，人在囧途，越囧越萌。标记《带你出发，陪我回家》http://book.douban.com/subject/25711202/为“想读”“在读”或“读过”，有机会获得此书本活动进行3个月，每月送出三本书。会有不定期bonus！</div>

      </li>
      
       <li class="am-g am-list-item-desced">
          <a href="http://www.douban.com/online/11614662/" class="am-list-item-hd ">我很囧，你保重....晒晒旅行中的那些囧！</a>


          <div class="am-list-item-text">囧人囧事囧照，人在囧途，越囧越萌。标记《带你出发，陪我回家》http://book.douban.com/subject/25711202/为“想读”“在读”或“读过”，有机会获得此书本活动进行3个月，每月送出三本书。会有不定期bonus！</div>

      </li>
      
       <li class="am-g am-list-item-desced">
          <a href="http://www.douban.com/online/11614662/" class="am-list-item-hd ">我很囧，你保重....晒晒旅行中的那些囧！</a>


          <div class="am-list-item-text">囧人囧事囧照，人在囧途，越囧越萌。标记《带你出发，陪我回家》http://book.douban.com/subject/25711202/为“想读”“在读”或“读过”，有机会获得此书本活动进行3个月，每月送出三本书。会有不定期bonus！</div>

      </li>
      
       <li class="am-g am-list-item-desced">
          <a href="http://www.douban.com/online/11614662/" class="am-list-item-hd ">我很囧，你保重....晒晒旅行中的那些囧！</a>


          <div class="am-list-item-text">囧人囧事囧照，人在囧途，越囧越萌。标记《带你出发，陪我回家》http://book.douban.com/subject/25711202/为“想读”“在读”或“读过”，有机会获得此书本活动进行3个月，每月送出三本书。会有不定期bonus！</div>

      </li> -->

  </ul>
  <!-- 分页 -->
    <ul data-am-widget="pagination" class="am-pagination am-pagination-default">
      <li class="am-pagination-prev " ng-if="page.pageIndex != 1">
        <a href="javascript:void(0);" class="">上一页</a>
      </li>
      <li class="am-pagination-next " ng-if="page.total != page.pageIndex">
        <a href="javascript:void(0);" class="">下一页</a>
      </li>

  </ul>
  
  
  </div>

    </div>

</div>