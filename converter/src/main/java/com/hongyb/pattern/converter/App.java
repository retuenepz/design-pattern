package com.hongyb.pattern.converter;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

/**
 * 转型
 * Created by hongyanbo on 2018/2/2.
 */
public class App {

    public static void main(String[] args) {
        UserConverter userConverter = new UserConverter();
        UserDto dtoUser = new UserDto("Jane", "Doe", true, "123@123.com");
        User user = userConverter.convertFromDto(dtoUser);
        System.out.println(user);

        ArrayList<User> users = Lists.newArrayList(new User("Camile", "Tough", false, "124sad"),
                new User("Marti", "Luther", true, "42309fd"), new User("Kate", "Smith", true, "if0243"));
        List<UserDto> dtoEntities = userConverter.createFromEntities(users);
        dtoEntities.forEach(System.out::println);

    }
}
