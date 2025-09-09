package SigortaYonetim;

import java.util.ArrayList;
import java.util.Date;

public class User {
    private String userName;
    private String userSurname;
    private String password;
    private String email;
    private String sifre;
    private String job;
    private int age;
    private ArrayList<Address> addresses;
    private Date lastLoginDate;

    public User(String userName, String userSurname, String password, String email, String sifre, String job, int age, ArrayList<Address> addresses, Date lastLoginDate) {
        this.userName = userName;
        this.userSurname = userSurname;
        this.password = password;
        this.email = email;
        this.sifre = sifre;
        this.job = job;
        this.age = age;
        this.addresses = addresses;
        this.lastLoginDate = lastLoginDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
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

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(ArrayList<Address> addresses) {
        this.addresses = addresses;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }
}
