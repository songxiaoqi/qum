package com.quming.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

/**
 * 订单实体
 */
public class Order implements Serializable {

    private static final long serialVersionUID = -1419631441080310078L;

    private Long orderId;

    private Integer orderState;

    private String firstName;

    private Integer sex;

    private String birthday;

    private String bornAddress;

    private String father;

    private String mother;

    private String brotherAndSister;

    private Integer nameNum;

    private String displayWord;

    private String phone;

    private String email;

    private Date createTime;

    private Date payTime;

    private Date sendTime;

    private Date updateTime;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBornAddress() {
        return bornAddress;
    }

    public void setBornAddress(String bornAddress) {
        this.bornAddress = bornAddress;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getBrotherAndSister() {
        return brotherAndSister;
    }

    public void setBrotherAndSister(String brotherAndSister) {
        this.brotherAndSister = brotherAndSister;
    }

    public Integer getNameNum() {
        return nameNum;
    }

    public void setNameNum(Integer nameNum) {
        this.nameNum = nameNum;
    }

    public String getDisplayWord() {
        return displayWord;
    }

    public void setDisplayWord(String displayWord) {
        this.displayWord = displayWord;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderState=" + orderState +
                ", firstName='" + firstName + '\'' +
                ", sex=" + sex +
                ", birthday='" + birthday + '\'' +
                ", bornAddress='" + bornAddress + '\'' +
                ", father='" + father + '\'' +
                ", mother='" + mother + '\'' +
                ", brotherAndSister='" + brotherAndSister + '\'' +
                ", nameNum=" + nameNum +
                ", displayWord='" + displayWord + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", createTime=" + createTime +
                ", payTime=" + payTime +
                ", sendTime=" + sendTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
