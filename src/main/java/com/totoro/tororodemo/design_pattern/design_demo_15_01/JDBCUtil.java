package com.totoro.tororodemo.design_pattern.design_demo_15_01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCUtil {
    private static Logger logger = LoggerFactory.getLogger(JDBCUtil.class);

    public static final String URL = "jdbc:mysql://127.0.0.1:3306/dbtest";
    public static final String USER = "root";
    public static final String PASSWORD = "123456";

    public static void main(String[] args) throws Exception {
        // 1.加载驱动程序
        Class.forName("com.mysql.cj.jdbc.Driver");
        // 获得数据库连接
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        //3.操作数据库，实现增删改查
        Statement stmt = conn.createStatement();
        ResultSet resultSet = stmt.executeQuery("SELECT * FROM tpl_book");
        //如果有数据，rs.next()返回true
        while (resultSet.next()) {
            logger.info("测试结果 id：{} 类型：{}", resultSet.getString("id"),resultSet.getString("type"));
        }
    }
}
