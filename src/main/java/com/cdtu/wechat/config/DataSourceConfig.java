package com.cdtu.wechat.config;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.alibaba.druid.filter.Filter;
import com.alibaba.druid.pool.DruidDataSource;

@Configuration
//加载配置文件
@PropertySource({"classpath:/config/db.properties"})
public class DataSourceConfig {
	private final static Logger LOGGER = LogManager.getLogger(DataSourceConfig.class.getName());
	@Autowired
	private Environment env;
	@Bean(name="dataSource")
	public DruidDataSource dataSource()
	{
		LOGGER.info("init datasource.....");
		DruidDataSource dataSource = new DruidDataSource();
		 dataSource.setDriverClassName(env.getRequiredProperty("driverClassName"));
		    dataSource.setUrl(env.getRequiredProperty("jdbc_url"));
		    dataSource.setUsername(env.getRequiredProperty("jdbc_username"));
		    dataSource.setPassword(env.getRequiredProperty("jdbc_password"));
		    dataSource.setValidationQuery(env.getRequiredProperty("validationQuery"));
		    dataSource.setInitialSize(0);
		    dataSource.setMaxActive(100);
		    dataSource.setMinIdle(0);
		    dataSource.setMaxWait(60000);
		    dataSource.setTestOnBorrow(false);
		    dataSource.setTestOnReturn(false);
		    dataSource.setTestWhileIdle(true);

		    dataSource.setTimeBetweenEvictionRunsMillis(60000);
		    dataSource.setMinEvictableIdleTimeMillis(2500000);

		    /* --使用druid连接池的超时回收机制排查连接泄露问题-- */
		    // 超过时间限制是否回收,超时时间3分钟
		    dataSource.setRemoveAbandoned(true);
		    dataSource.setRemoveAbandonedTimeout(180);
		    dataSource.setLogAbandoned(true);
		    try {
		      dataSource.setFilters("stat,wall");
		      List<Filter> filters = new ArrayList<>();
		      dataSource.setProxyFilters(filters);
		    } catch (SQLException e) {
		      LOGGER.error(e);
		    }
		return dataSource;
	}
	

}
