package com.clisoft.articulos.identificadores.configuracion;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.clisoft.articulos.identificadores")
@EnableTransactionManagement
@EnableJpaRepositories("com.clisoft.articulos.identificadores.persistencia")
public class TestConfiguracion {

	
	@Bean
	public MessageSource messageSource(){
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		
		messageSource.setBasename("Mensajes_Articulos");
		
		return messageSource ;
	}	

	@Bean
	public JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory){
		return new JpaTransactionManager(entityManagerFactory);
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource){
		LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
		
		entityManagerFactoryBean.setDataSource(dataSource);
		
		entityManagerFactoryBean.setPackagesToScan("com.clisoft.articulos.identificadores.entidades");
		
		entityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		
		Properties properties = new Properties();
		
		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.DerbyTenSevenDialect");
		properties.setProperty("hibernate.show_sql", "true");
		properties.setProperty("hibernate.format_sql", "true");
		//properties.setProperty("hibernate.current_session_context_class", "thread");
		properties.setProperty("hibernate.hbm2ddl.auto", "create");
		//properties.setProperty("hibernate.hbm2ddl.auto", "validate");
		
		entityManagerFactoryBean.setJpaProperties(properties);
		
		return entityManagerFactoryBean;
	}
	
	@Bean
	public DataSource dataSource(
			@Value("${db.user}") String username, 
			@Value("${db.password}") String password, 
			@Value("${db.url}") String url, 
			@Value("${db.driver.class.name}") String driverClassName){
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName(driverClassName);
		ds.setUrl(url);
		ds.setUsername(username);
		ds.setPassword(password);
		return ds;
	}
	
	@Bean
	public PropertyPlaceholderConfigurer properties(){
		PropertyPlaceholderConfigurer placeholderConfigurer 
								= new PropertyPlaceholderConfigurer();
		
		placeholderConfigurer.setLocation(
				new ClassPathResource("Configuracion.properties"));
		
		return placeholderConfigurer;
	}	
		
	
}
