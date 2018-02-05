package com.hongyb.pattern.converter;

/**
 * user 字段和userdto是一毛一样的
 * Created by hongyanbo on 2018/2/2.
 */
public class User {
    private String firstName ;
    private String lastName ;
    private boolean isActive ;
    private String userId;

    public User(String firstName, String lastName, boolean active, String userId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isActive = active;
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", isActive=" + isActive +
                ", userId='" + userId + '\'' +
                '}';
    }
}
