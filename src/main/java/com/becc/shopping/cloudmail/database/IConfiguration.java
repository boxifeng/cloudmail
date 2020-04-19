package com.becc.shopping.cloudmail.database;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IConfiguration {
    @Value("${mySql.ip}")
    private String ip;
    @Value("${mySql.port}")
    private Integer port;

    @Bean
    public IConnection getIConnection() {
        return new Mysql(this.port, this.ip);
    }
}
