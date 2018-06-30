package com.lightingshop.entity;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component("user")
public class User {

    private Integer userID;

    private String userName;

    private String address;

    private String postalCode = null;

    private String phone = null;

    private String email = null;

    private String gender = null;

    private Integer userroleID = null;

    private Integer userStatesID;

    private String loginID;

    private String loginPwd;

    private Date lastLoginTime = null;

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getUserroleID() {
        return userroleID;
    }

    public void setUserroleID(Integer userroleID) {
        this.userroleID = userroleID;
    }

    public Integer getUserStatesID() {
        return userStatesID;
    }

    public void setUserStatesID(Integer userStatesID) {
        this.userStatesID = userStatesID;
    }

    public String getLoginID() {
        return loginID;
    }

    public void setLoginID(String loginID) {
        this.loginID = loginID;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    @Override
    public String toString() {
        return "User [userID=" + userID + ", userName=" + userName + ", address=" + address + ", postalCode="
                + postalCode + ", phone=" + phone + ", email=" + email + ", gender=" + gender + ", userroleID="
                + userroleID + ", userStatesID=" + userStatesID + ", loginID=" + loginID + ", loginPwd=" + loginPwd
                + ", lastLoginTime=" + lastLoginTime + "]";
    }
	
}
