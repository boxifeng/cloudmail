package com.becc.shopping.cloudmail.database;

public class Mysql implements IConnection {
    private Integer port = 3306;
    private String ip = "127.0.0.1";

    @Override
    public void createConnection() {
        System.out.println("IP : " + this.ip + ",port : " + this.port);
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Mysql(Integer port, String ip) {
        this.port = port;
        this.ip = ip;
    }

    public Integer getPort() {
        return port;
    }

    public String getIp() {
        return ip;
    }

    public Mysql() {
        this.port = port;
        this.ip = ip;
    }
}
