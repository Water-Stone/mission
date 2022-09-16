package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTemplate {
    public static Connection getConnection() {
        try {
            Class.forName("org.sqlite.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // URL, ID, PW 데이터베이스 맞게 설정
        String url = "";
//        String id = "";
//        String pw = "";

        Connection con = null;

        try {
//            con = DriverManager.getConnection(url, id, pw);
            con = DriverManager.getConnection(url);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return con;
    }

    public static boolean isConnection(Connection con) {
        boolean val = true;

        try {
            if (con == null || con.isClosed()) {
                val = false;
            }
        } catch (SQLException e) {
            val = true;
            e.printStackTrace();
        }

        return val;
    }

    public static void close(Connection con) {
        if (isConnection(con)) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(Statement stmt) {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void commit(Connection con) {
        if (isConnection(con)) {
            try {
                con.commit();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void rollback(Connection con) {
        if (isConnection(con)) {
            try {
                con.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
