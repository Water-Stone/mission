<%@ page contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>와이파이 정보 구하기</title>
    <link rel="stylesheet" type="text/css" href="style.css">
    <script type="text/javascript">
        // function getUserLocation() {
        //
        // }
        
        function getWifiInfo() {

        }
    </script>
<%--    http://openapi.seoul.go.kr:8088/456a414e63746f643836455a45616f/json/TbPublicWifiInfo/1/5/--%>
</head>
<body>
<h1><%= "와이파이 정보 구하기" %>
</h1>
<table id="menuTable">
    <tr>
        <th><a href="index.jsp">홈</a></th>
        <th><a href="locationHistory.jsp">위치 히스토리 목록</a></th>
        <th><a href="wifiList.jsp">Open API 와이파이 정보 가져오기</a></th>
    </tr>
</table>
<br>
LAT: <input type="text" placeholder="0.0" id="LAT">
, LNG: <input type="text" placeholder="0.0" id="LNG">
<%--<button onclick="getUserLocation()">내 위치 가져오기</button>--%>
<button onclick="getWifiInfo()">근처 WiFi 정보 보기</button>
<br/>
<br>
<table id="wifiTable">
    <tr>
        <th>거리(km)</th>
        <th>관리번호</th>
        <th>자치구</th>
        <th>와이파이명</th>
        <th>도로명주소</th>
        <th>상세주소</th>
        <th>설치위치(층)</th>
        <th>설치유형</th>
        <th>설치기간</th>
        <th>서비스 구분</th>
        <th>망종류</th>
        <th>설치년도</th>
        <th>실내외 구분</th>
        <th>wifi 접속환경</th>
        <th>X좌표</th>
        <th>Y좌표</th>
        <th>작업일자</th>
    </tr>
</table>
<br/>
</body>
</html>