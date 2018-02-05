package com.hongyb.pattern.dao;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * 这个接口定义了数据访问的标准方法
 * 满足单一原则
 * 隔离了客户端和数据访问层，用户不需要担心数据是如何进行存取的，只需要使用这个接口就OK了
 * Created by hongyanbo on 2018/2/5.
 */
public interface CustomerDao {

    /**
     * 将所有用户以stream的形式返回，可能是懒加载也可能是预加载的，这取决于实现。stream使用完必须被关闭。
     * @return
     * @throws Exception
     */
    Stream<Customer> getAll() throws Exception;

    /**
     * getById
     * @return
     * @throws Exception
     */
    Optional<Customer> getById() throws Exception;

    /**
     *
     * @param customer 将要保存的对象
     * @return 如果保存成功就是true,对象已经存在了 false
     * @throws Exception
     */
    boolean add(Customer customer) throws Exception;

    /**
     *
     * @param customer 将要更新的对象
     * @return 更新成功true，更新失败false
     * @throws Exception
     */
    boolean update(Customer customer) throws Exception;

    /**
     *
     * @param customer 要删除的
     * @return 成功true失败false
     * @throws Exception
     */
    boolean delete(Customer customer) throws Exception;
}
