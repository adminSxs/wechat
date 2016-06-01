package com.cdtu.wechat.domain.position;

import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "position", schema = "")
public class Position {
  // 招聘信息编号
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column
  private long id;
  // 公司名称
  @Column
  private String title;
  // 薪资
  @Column
  private String salary;
  // 公司地址
  @Column
  private String address;
  // 工作性质
  @Column
  private String nature;
  // 工作经验
  @Column
  private String experience;
  // 最低学历
  @Column
  private String education;
  // 招聘人数
  @Column
  private String number;
  // 职位类别
  @Column
  private String type;
  // 公司描述
  @Column
  private String introduce;
  // 企业文化
  @Column
  private String culture;
  // 经营范围
  @Column
  private String scope;
  // 任职要求
  @Column
  private String worksRequire;
  // 工作内容
  @Column
  private String worksContent;
  // 工作时间
  @Column
  private String worksTime;
  //福利待遇
  @Column
  private String welfare;
  // 团队培养
  @Column
  private String teamBuild;
  // 晋升空间
  @Column
  private String promotion;
  // 工作环境
  @Column
  private String worksEnv;
  // 联系方式
  @Column
  private String connect;
  // 创建时间
  @Column
  private ZonedDateTime createTime = ZonedDateTime.now();

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getSalary() {
    return salary;
  }

  public void setSalary(String salary) {
    this.salary = salary;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getNature() {
    return nature;
  }

  public void setNature(String nature) {
    this.nature = nature;
  }

  public String getExperience() {
    return experience;
  }

  public void setExperience(String experience) {
    this.experience = experience;
  }

  public String getEducation() {
    return education;
  }

  public void setEducation(String education) {
    this.education = education;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getIntroduce() {
    return introduce;
  }

  public void setIntroduce(String introduce) {
    this.introduce = introduce;
  }

  public String getCulture() {
    return culture;
  }

  public void setCulture(String culture) {
    this.culture = culture;
  }

  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public String getWorksRequire() {
    return worksRequire;
  }

  public void setWorksRequire(String worksRequire) {
    this.worksRequire = worksRequire;
  }

  public String getWorksContent() {
    return worksContent;
  }

  public void setWorksContent(String worksContent) {
    this.worksContent = worksContent;
  }

  public String getWorksTime() {
    return worksTime;
  }

  public void setWorksTime(String worksTime) {
    this.worksTime = worksTime;
  }

  public String getTeamBuild() {
    return teamBuild;
  }

  public void setTeamBuild(String teamBuild) {
    this.teamBuild = teamBuild;
  }

  public String getPromotion() {
    return promotion;
  }

  public void setPromotion(String promotion) {
    this.promotion = promotion;
  }

  public String getWorksEnv() {
    return worksEnv;
  }

  public void setWorksEnv(String worksEnv) {
    this.worksEnv = worksEnv;
  }

  public String getConnect() {
    return connect;
  }

  public void setConnect(String connect) {
    this.connect = connect;
  }

  public ZonedDateTime getCreateTime() {
    return createTime;
  }

  public void setCreateTime(ZonedDateTime createTime) {
    this.createTime = createTime;
  }

public String getWelfare() {
	return welfare;
}

public void setWelfare(String welfare) {
	this.welfare = welfare;
}

@Override
public String toString() {
	return "Position [id=" + id + ", title=" + title + ", salary=" + salary + ", address=" + address + ", nature="
			+ nature + ", experience=" + experience + ", education=" + education + ", number=" + number + ", type="
			+ type + ", introduce=" + introduce + ", culture=" + culture + ", scope=" + scope + ", worksRequire="
			+ worksRequire + ", worksContent=" + worksContent + ", worksTime=" + worksTime + ", welfare=" + welfare
			+ ", teamBuild=" + teamBuild + ", promotion=" + promotion + ", worksEnv=" + worksEnv + ", connect="
			+ connect + ", createTime=" + createTime + "]";
}


  
  


}
