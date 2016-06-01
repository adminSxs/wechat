package com.cdtu.wechat.config;

import java.util.Properties;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
//启用注解事务管理，使用CGLib代理
@EnableTransactionManagement(proxyTargetClass = true)
@Import(DataSourceConfig.class)
public class DaoConfig {
	private static final Logger LOGGER = LogManager.getLogger(DaoConfig.class.getName());
	@Autowired
	private Environment env;
	@Resource(name="dataSource")
	private DruidDataSource dataSource;
	
	@Bean(name="sessionFactory")
	public LocalSessionFactoryBean sessionFactoryBean()
	{
		LOGGER.info("Init SessionFactory...");
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource);
	    String[] packagesToScan = new String[] {"com.cdtu.**.domain"};
	    sessionFactory.setPackagesToScan(packagesToScan);

	    Properties hibernateProperties = new Properties();
	    hibernateProperties.setProperty("hibernate.dialect",
	        env.getRequiredProperty("hibernate.dialect"));
	    hibernateProperties.setProperty("hibernate.current_session_context_class",
	        env.getRequiredProperty("hibernate.current_session_context_class"));
	    hibernateProperties.setProperty("hibernate.jdbc.batch_size",
	        env.getRequiredProperty("hibernate.jdbc.batch_size"));
	    hibernateProperties.setProperty("hibernate.order_updates",
	        env.getRequiredProperty("hibernate.order_updates"));

	    hibernateProperties.setProperty("hibernate.search.default.directory_provider",
	        env.getRequiredProperty("hibernate.search.directory_provider"));
	    hibernateProperties.setProperty("hibernate.search.default.indexBase",
	        env.getRequiredProperty("hibernate.search.indexBase"));

	    hibernateProperties.setProperty("hibernate.show_sql", "true");
	    hibernateProperties.setProperty("hibernate.format_sql", "true");
	    // create update create-drop validate
	    // hibernateProperties.setProperty("hibernate.hbm2ddl.auto",
	    // env.getRequiredProperty("hibernate.hbm2ddl.auto"));
	    sessionFactory.setHibernateProperties(hibernateProperties);
	   
		return sessionFactory;
	}
	
	 @Bean(name = "transactionManager")
	  public HibernateTransactionManager hibernateTransactionManager() {
	    LOGGER.info("Init transactionManager");
	    HibernateTransactionManager hibernateTransactionManager = new HibernateTransactionManager();
	    hibernateTransactionManager.setSessionFactory(sessionFactoryBean().getObject());
	    return hibernateTransactionManager;
	  }
	
	

}
