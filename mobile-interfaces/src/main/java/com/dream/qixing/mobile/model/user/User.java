package com.dream.qixing.mobile.model.user;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private Integer userId;

    private String nickName;

    private String sex;

    /**
     * 骑过路线的难度最高等级 --根据路线进行测评，定期更新该字段，为推荐好友做准备
     */
    private Integer level;

    private String location;

    private String height;

    private String weight;

    private Integer bicycleAge;

    private String realName;

    private String weixinNum;

    private String role;

    private String mobile;

    private String password;

    private Date registeredTime;

    private Date lastLoginTime;

    private Integer total;

    /**
     * 根据使用次数和组件车队的次数
     */
    private Integer activeLevel;

    private String image;

    private String spreadCode;

    /**
     * 介绍人
     */
    private Integer recommendId;

    private static final long serialVersionUID = 1L;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height == null ? null : height.trim();
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight == null ? null : weight.trim();
    }

    public Integer getBicycleAge() {
        return bicycleAge;
    }

    public void setBicycleAge(Integer bicycleAge) {
        this.bicycleAge = bicycleAge;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getWeixinNum() {
        return weixinNum;
    }

    public void setWeixinNum(String weixinNum) {
        this.weixinNum = weixinNum == null ? null : weixinNum.trim();
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getRegisteredTime() {
        return registeredTime;
    }

    public void setRegisteredTime(Date registeredTime) {
        this.registeredTime = registeredTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getActiveLevel() {
        return activeLevel;
    }

    public void setActiveLevel(Integer activeLevel) {
        this.activeLevel = activeLevel;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getSpreadCode() {
        return spreadCode;
    }

    public void setSpreadCode(String spreadCode) {
        this.spreadCode = spreadCode == null ? null : spreadCode.trim();
    }

    public Integer getRecommendId() {
        return recommendId;
    }

    public void setRecommendId(Integer recommendId) {
        this.recommendId = recommendId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", nickName=").append(nickName);
        sb.append(", sex=").append(sex);
        sb.append(", level=").append(level);
        sb.append(", location=").append(location);
        sb.append(", height=").append(height);
        sb.append(", weight=").append(weight);
        sb.append(", bicycleAge=").append(bicycleAge);
        sb.append(", realName=").append(realName);
        sb.append(", weixinNum=").append(weixinNum);
        sb.append(", role=").append(role);
        sb.append(", mobile=").append(mobile);
        sb.append(", password=").append(password);
        sb.append(", registeredTime=").append(registeredTime);
        sb.append(", lastLoginTime=").append(lastLoginTime);
        sb.append(", total=").append(total);
        sb.append(", activeLevel=").append(activeLevel);
        sb.append(", image=").append(image);
        sb.append(", spreadCode=").append(spreadCode);
        sb.append(", recommendId=").append(recommendId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}