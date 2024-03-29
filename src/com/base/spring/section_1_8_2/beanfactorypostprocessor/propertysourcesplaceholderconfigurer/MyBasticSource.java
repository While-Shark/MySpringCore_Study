package com.base.spring.section_1_8_2.beanfactorypostprocessor.propertysourcesplaceholderconfigurer;

public class MyBasticSource {

    private String driverClassName;
    private String url;
    private String username;
    private String password;


    public MyBasticSource(String driverClassName, String url, String username, String password) {
        this.driverClassName = driverClassName;
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public MyBasticSource() {

    }

    public String getDriverClassName() {
        return driverClassName;
    }



    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void close(){
        System.out.println("closed...");
    }

    @Override
    public String toString() {
        return "MyBasticSource{" +
                "driverClassName='" + driverClassName + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
