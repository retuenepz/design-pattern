package com.hongyb.pattern.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * 一个{@link CustomerDao}的实现，用于将customer存进数据库
 * Created by hongyanbo on 2018/2/5.
 */
public class DbCustomerDao  implements CustomerDao{
    /**
     * 日志
     */
    public static final Logger LOGGER= LoggerFactory.getLogger(DbCustomerDao.class);
    /**
     * 数据源
     */
    private final DataSource dataSource ;

    /**
     *
     * @param dataSource 需要提供一个数据源
     */
    public DbCustomerDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    /**
     *
     * @return 一个懒加载的stream,注意使用完毕后必须关闭stream,因为stream会维持一个数据库connection。及早关闭可以节省资源
     * @throws Exception
     */
    @Override
    public Stream<Customer> getAll() throws Exception {
        Connection connection ;
        try {
            connection = getConnection();

        }catch (SQLException e){
            throw new CustomerException(e.getMessage(),e);
        }

        return null;
    }

    private Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    @Override
    public Optional<Customer> getById() throws Exception {
        return null;
    }

    @Override
    public boolean add(Customer customer) throws Exception {
        return false;
    }

    @Override
    public boolean update(Customer customer) throws Exception {
        return false;
    }

    @Override
    public boolean delete(Customer customer) throws Exception {
        return false;
    }
}
