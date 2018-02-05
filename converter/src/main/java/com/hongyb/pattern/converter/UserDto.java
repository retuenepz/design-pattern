package com.hongyb.pattern.converter;

import java.util.Objects;

/**
 * userdto
 * Created by hongyanbo on 2018/2/2.
 */
public class UserDto {
    private String firstName;
    private String lastName;
    private boolean isActive;
    private String email;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserDto(String firstName, String lastName, boolean isActive, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isActive = isActive;
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", isActive=" + isActive +
                ", email='" + email + '\'' +
                '}';
    }

    @Override public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserDto userDto = (UserDto) o;
        return isActive == userDto.isActive && Objects.equals(firstName, userDto.firstName) && Objects
                .equals(lastName, userDto.lastName) && Objects.equals(email, userDto.email);
    }

    @Override public int hashCode() {
        return Objects.hash(firstName, lastName, isActive, email);
    }

}
