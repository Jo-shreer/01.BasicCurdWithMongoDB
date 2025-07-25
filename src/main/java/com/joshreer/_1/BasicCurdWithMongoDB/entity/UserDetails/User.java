
package com.joshreer._1.BasicCurdWithMongoDB.entity.UserDetails;

public class User {

    private String id;
    private String userName;
    private String address;
    private int age;

    public User() {}
    
    public User(String id, String userName, String address, int age) {
        this.id = id;
        this.userName = userName;
        this.address = address;
        this.age = age;
    }
    public String getId() 
    {
        return id;
    }
    public void setId(String id) 
    {
        this.id = id;
    }
    public String getUserName() 
    {
        return userName;
    }
    public void setUserName(String userName) 
    {
        this.userName = userName;
    }
    public String getAddress() 
    {
        return address;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }
    public int getAge() 
    {
        return age;
    }
    public void setAge(int age) 
    {
        this.age = age;
    }

    

}
