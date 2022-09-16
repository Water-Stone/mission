package com.jdbc;

import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.*;

public class Connect_jdbc {
    public static void main(String[] args) {
        Connection con = null;
        String url = null;
        Statement statement = null;
        ResultSet rs = null;

        try {
            Class.forName("org.sqlite.jdbc.Driver");
        }catch (ClassNotFoundException ce){
            ce.printStackTrace();
        }

        try {
//            URL url = new URL("https://openapi.seoul.go.kr:8088/456a414e63746f643836455a45616f/json/TbPublicWifiInfo/1/5/");
//            HttpURLConnection uCon = (HttpURLConnection) url.openConnection();
//            uCon.setRequestMethod("GET");
            url = "jdbc:sqlite://118.42.53.223";
            con = DriverManager.getConnection(url);
            statement = con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (con != null) con.close();
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
        }
    }
}
