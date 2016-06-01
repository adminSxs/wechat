<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="container">
	<h4 class="text-primary">{{p.title}}</h4>
	<hr />
	<span class="text-muted">发布日期:{{p.createTime.time | date:"yyyy-MM-dd HH:mm:ss"}}</span>
	<br />
	<br />
	<span class="font">职位月薪:</span>&nbsp;&nbsp;&nbsp;&nbsp;<span class="font"><strong>{{p.salary}}元/月</strong></span><br />
	<span class="font">工作地点:</span>&nbsp;&nbsp;&nbsp;&nbsp;<span class="font"></span><strong>{{p.address}}</strong><br />
	<span class="font">工作性质:</span>&nbsp;&nbsp;&nbsp;&nbsp;<span class="font"></span><strong>{{p.nature}}</strong><br />
	<span class="font">工作经验:</span>&nbsp;&nbsp;&nbsp;&nbsp;<span class="font"></span><strong>{{p.experience}}</strong><br />
	<span class="font">最低学历:</span>&nbsp;&nbsp;&nbsp;&nbsp;<span class="font"></span><strong>{{p.education}}</strong><br />
	<span class="font">招聘人数:</span>&nbsp;&nbsp;&nbsp;&nbsp;<span class="font"></span><strong>{{p.number}}人</strong><br />
	<span class="font">职位类别：</span>&nbsp;&nbsp;&nbsp;<span class="font"></span><strong>{{p.type}}</strong><br />
	<br />
<!-- 公司介绍 -->
<div ng-if="p.introduce != null">
<span class="font"><strong>公司介绍:</strong></span><br />
<p class="font">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span ng-bind-html="p.introduce"></span></p>
</div>
<!-- 企业文化 -->
<div ng-if="p.culture != null">
<span class="font"><strong>企业文化:</strong></span><br />
<p class="font">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span ng-bind-html="p.culture"></span></p>
<br/>
</div>

<!-- 经营范围 -->
<div ng-if="p.scope != null">
<span class="font"><strong>经营范围:</strong></span><br />
<p class="font">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span ng-bind-html="p.scope"></span></p><br />
</div>

<!-- 任职要求 -->
<div ng-if="p.worksRequire">
<span class="font"><strong>任职要求:</strong></span><br />
<!-- <p class="font">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;1、年龄45周岁以下（含45岁），男女不限。</p>
<p class="font">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2、大专（或同等学历）及以上学历，持有毕业证。</p>
<p class="font">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;3、有良好的销售服务意识，具备良好的沟通和表达能力、应变能力和解决问题的能力，能娴熟的运用普通话与人沟通交流。</p>
<p class="font">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;4、能熟练使用电脑办公软件</p>
<p class="font">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;5、性格坚韧，态度积极、工作细致，责任心强、有团队精神。</p>
 -->
 <p class="font">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span ng-bind-html="p.worksRequire"></span></p><br />
</div>


<!-- 工作内容 -->
<div ng-if="p.worksContent != null">
<span class="font"><strong> 工作内容:</strong></span><br />
<!-- <p class="font">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;1、依托公司资源与客户电话沟通，挖掘和跟进客户需求，达成保险销售指标；(无需外出)</p>
<p class="font">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2、快速、准确、专业地为客户提供保险产品的咨询服务；</p>
<p class="font">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;3、管理客户关系，负责客户资料和信息的收集维护工作；</p>
 --><p class="font">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span ng-bind-html="p.worksContent"></span></p><br />
</div>


<!-- 工作时间 -->
<div ng-if="p.worksTime != null">
<span class="font"><strong> 工作时间:</strong></span><br />
<p class="font">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span ng-bind-html="p.worksTime"></span></p>
<br/>
</div>

<!-- 福利待遇 -->
<div ng-if="p.welfare != null">
<span class="font"><strong>  福利待遇:</strong></span><br />
<span ng-bind-html="p.welfare"></span>
<br />
</div>


<!-- 团队培训及建设 -->
<div ng-if="p.teamBuild != null">
<span class="font"><strong>  团队培训及建设:</strong></span><br />

 <p class="font">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span ng-bind-html="p.teamBuild"></span></p><br />
</div>

<!-- 晋升空间： -->
<div ng-if="p.promotion != null">
<span class="font"><strong>  晋升空间:</strong></span><br />
<!-- <p class="font">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;    1、提供公平、公正的快速提升平台；</p>
 -->
 <p class="font">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span ng-bind-html="p.promotion"></span> </>
<!-- 工作环境 -->
<span class="font" ng-if="p.worksEnv"><strong>  工作环境:</strong></span><br/><br/>
<p class="font">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <span ng-bind-html="p.worksEnv"></span> </p><br />
</div>

<!-- 联系方式 -->
<div ng-if="p.connect != null">
<span class="font"><strong>  联系方式:</strong></span><br />
<!-- <p class="font">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  联系人：谢女士、黄女士
 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;座机：（028）87785090、87748974</p><br />
 -->
 <p class="font">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <span ng-bind-html="p.connect"></span>    </p><br />

</div>


</div>