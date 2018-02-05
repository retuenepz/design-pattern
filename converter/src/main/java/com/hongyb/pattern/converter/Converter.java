package com.hongyb.pattern.converter;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 使用java8的新特性来来编写的converter
 * 这个类是这个模式的基类，可以充分的减少你的代码量。
 * Created by hongyanbo on 2018/2/5.
 */
public class Converter<T, U> {

    private final Function<T, U> fromDto;
    private final Function<U, T> fromEntity;

    /**
     * @param fromDto 用来将dto转化成entity的方法
     * @param fromEntity 用来将entity转化成user的方法
     */
    public Converter(final Function<T, U> fromDto, final Function<U, T> fromEntity) {
        this.fromDto = fromDto;
        this.fromEntity = fromEntity;
    }

    /**
     * 用所给Function将DTO转化成entity
     * @param userDto 要转化的DTO
     * @return 转化完毕的entity
     */
    public final U convertFromDto(final T userDto) {
        return fromDto.apply(userDto);
    }

    /**
     * 用所给Function将entity转化成DTO
     * @param user domain
     * @return The DTO
     */
    public final T convertFromEntity(final U user) {
        return fromEntity.apply(user);
    }

    /**
     * 将DTO集合转化成entity集合
     * @param dtoUsers DTO集合
     * @return entity集合
     */
    public final List<U> createFromDtos(final Collection<T> dtoUsers) {
        return dtoUsers.stream().map(this::convertFromDto).collect(Collectors.toList());
    }

    /**
     * 将entity集合转化成DTO集合
     * @param users entity集合
     * @return DTO集合
     */
    public final List<T> createFromEntities(final Collection<U> users) {
        return users.stream().map(this::convertFromEntity).collect(Collectors.toList());
    }

}