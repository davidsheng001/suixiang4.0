package entity;

import java.util.Date;

public class User {
    private int userId;
    private String userName;
    private String telNum;
    private String password;
    private String email;
    private String sex;
    private String school;
    private Date regDate;
    private String sign;
    private Date birthday;
    private String address;
    private String headP;
    private int bgId;
    private Date lockDate;
    public User(){}
    public User(int userId, String userName, String telNum, String password, String email, String sex, String school, Date regDate, String sign, Date birthday, String address, String headP, int bgId, Date lockDate) {
        this.userId = userId;
        this.userName = userName;
        this.telNum = telNum;
        this.password = password;
        this.email = email;
        this.sex = sex;
        this.school = school;
        this.regDate = regDate;
        this.sign = sign;
        this.birthday = birthday;
        this.address = address;
        this.headP = headP;
        this.bgId = bgId;
        this.lockDate = lockDate;
    }
    public User(int userId, String userName, String headP) {
        this.userId = userId;
        this.userName = userName;
        this.headP = headP;
    }

    public User( String userName, String telNum, String password) {
        this.userName = userName;
        this.telNum = telNum;
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHeadP() {
        return headP;
    }

    public void setHeadP(String headP) {
        this.headP = headP;
    }

    public int getBgId() {
        return bgId;
    }

    public void setBgId(int bgId) {
        this.bgId = bgId;
    }

    public Date getLockDate() {
        return lockDate;
    }

    public void setLockDate(Date lockDate) {
        this.lockDate = lockDate;
    }
}
