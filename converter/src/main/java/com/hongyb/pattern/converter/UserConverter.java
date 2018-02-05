package com.hongyb.pattern.converter;
/**
 *  通过java8的特性，向基类传达dto和domain(entity)的转化方式，那么你就可以使用Converter的四个方法啦
 *  如果有其他类型需要转还，只需要相应的Converter即可，例如TeacherConverter,StudentConverter...
 *  注意泛型一定要写好！！调了半天holy shit
 * Created by hongyanbo on 2018/2/5.
 */
public class UserConverter extends Converter<UserDto, User> {
    public UserConverter() {
        super(userDto -> new User(userDto.getFirstName(), userDto.getLastName(), userDto.isActive(),
                        userDto.getEmail()),
                user -> new UserDto(user.getFirstName(), user.getLastName(), user.isActive(),
                        user.getUserId()));
    }
}
