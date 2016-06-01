<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html lang="en" ng-app="App">
<head>
	 <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
	<title>成都工业学院微信公众号</title>
	<link rel="stylesheet" href="assets/css/amazeui.css">
	<link rel="stylesheet" href="css/bootstrap.min.css" />
	<link rel="stylesheet" href="css/wechat.css" />
</head>
<body>	  
 <header data-am-widget="header"
          class="am-header am-header-default ">
      <div class="am-header-left am-header-nav">
          <a href="#left-link" class="am-btn am-btn-default">
              <span class="am-header-nav-title">
                返回
              </span>

                <i class="am-header-icon am-icon-home"></i>
          </a>
      </div>

      <h1 class="am-header-title">
          成都工业学院
      </h1>

      <div class="am-header-right am-header-nav">
          <a href="#user-link" class="">

                <i class="am-header-icon am-icon-user"></i>
          </a>
          <a href="#cart-link" class="am-btn am-btn-secondary">

             
          </a>
      </div>
  </header>

	  <!-- 侧边栏内容 -->
		 <nav data-am-widget="menu" class="am-menu  am-menu-offcanvas1"  data-am-menu-offcanvas> 
		    <a href="javascript: void(0)" class="am-menu-toggle">
		          <i class="am-menu-toggle-icon am-icon-bars"></i>
		    </a>

		    <div class="am-offcanvas" >
		      <div class="am-offcanvas-bar am-offcanvas-bar-flip">

		      <ul class="am-menu-nav am-avg-sm-1">
		          <li class="am-parent">
		            <a href="javascript:void(0);" class="" >校园招聘</a>
		              <ul class="am-menu-sub am-collapse  am-avg-sm-1 ">
		                  <li class="" ui-sref="rec">
		                    <a href="javascript:void(0);" class="" data-am-menu-offcanvas>专场招聘流程</a>
		                  </li>
		                  <!-- <li class="">
		                    <a href="javascript:void(0);" class=""  data-am-menu-offcanvas>发布校外招聘信息</a>
		                  </li> -->
		              </ul>
		          </li>
		          <li class="am-parent">
		            <a href="javascript:void(0);" class="" >交通食宿</a>
		              <ul class="am-menu-sub am-collapse  am-avg-sm-1 ">
		              <li class="">
		                    <a href="javascript:void(0);" class="" >校园周边世俗环境</a>
		                  </li>
		                  <li class="">
		                    <a href="javascript:void(0);" class="" >交通路线</a>
		                  </li>
		              </ul>
		          </li>
		          <li class="am-parent">
		            <a href="#c3" class="" >招聘信息</a>
		              <ul class="am-menu-sub am-collapse  am-avg-sm-1 ">
		                  <li class="" ui-sref="recShool">
		                    <a href="javascript:void(0);" class="" >校园招聘</a>
		                  </li>
		                  <li class="" ui-sref="recShoolOut">
		                    <a href="javascript:void(0);" class="" >校外招聘</a>
		                  </li>
		                  <li class=""　ui-sref="recPub">
		                    <a href="javascript:void(0);" class="" >公招信息</a>
		                  </li>
		                  <li class="">
		                    <a href="javascript:void(0);" class="" >国家基层项目信息</a>
		                  </li>
		              </ul>
		          </li>
		          <li class="am-parent">
		            <a href="javascript:void(0);" class="" >签约派遣</a>
		              <ul class="am-menu-sub am-collapse  am-avg-sm-1 ">
		                  <li class="">
		                    <a href="javascript:void(0);" class="" >档案管理</a>
		                  </li>
		                  <li class="">
		                    <a href="javascript:void(0);" class="" >户口派遣</a>
		                  </li>
		              </ul>
		          </li>
		      	
			  <li class="am-parent">
			  	<a href="javascript:void(0);">国家政策</a>
				<ul class="am-menu-sub am-collapse  am-avg-sm-1 ">
			                  <li class="">
			                    <a href="javascript:void(0);" class="" >创新创业</a>
			                  </li>
			                  <li class="">
			                    <a href="javascript:void(0);" class="" >考研政策</a>
			                  </li>
			                    <li class="">
			                    <a href="javascript:void(0);" class="" >应征入伍</a>
			                  </li>
			                    <li class="">
			                    <a href="javascript:void(0);" class="" >残疾人低保</a>
			                  </li>
			                    <li class="">
			                    <a href="javascript:void(0);" class="" >服务西部</a>
			                  </li>
			                    <li class="">
			                    <a href="javascript:void(0);" class="" >三支一扶</a>
			                  </li>
			              </ul>

			  </li>
			  
			  <li class="am-parent">
			  	<a href="javascript:void(0);">关于我们</a>
				<ul class="am-menu-sub am-collapse  am-avg-sm-1 ">
			                  <li class="" ui-sref="about">
			                    <a href="javascript:void(0);" class=""  >联系我们</a>
			                  </li>
			                  <li class="">
			                    <a href="javascript:void(0);" class="" >工作职责</a>
			                  </li>
			                    <li class="">
			                    <a href="javascript:void(0);" class="" >例行工作</a>
			                  </li>
			                    <li class="">
			                    <a href="javascript:void(0);" class="" >留言板</a>
			                  </li>
			              
			              </ul>

			  </li>
		      </ul>

		      </div>
		    </div>
		  </nav>




<div ui-view="content"></div>

<script src="assets/js/jquery.min.js"></script>
<script src="assets/js/amazeui.js"></script>
<script src="js/angular.js"></script>
<script src="js/angular-ui-router.js"></script>
<script src="js/angular-sanitize.min.js"></script>
<script src="js/Controller.js"></script>
<script src="js/app.js"></script>
<script src="js/baseHttp.js"></script>
<script src="js/Service.js"></script>

</body>
</html>