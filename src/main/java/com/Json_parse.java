package com;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Json_parse {
    public static String Load() throws IOException {
        String url = "http://openapi.seoul.go.kr:8088/456a414e63746f643836455a45616f/json/TbPublicWifiInfo/";
        String start = "/1";
        String end = "/100/";
        url += start;
        url += end;

        URL finalURL = new URL(url);
        HttpURLConnection conn = (HttpURLConnection) finalURL.openConnection();
        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

        StringBuilder sb = new StringBuilder();
        String line;
        while((line = br.readLine()) != null){
            sb.append(line);
        }
        br.close();
        conn.disconnect();

        return sb.toString();
    }
}
