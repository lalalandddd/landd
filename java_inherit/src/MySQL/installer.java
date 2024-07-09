package MySQL;

public class installer {
	
/*
--- 교육용 개인 서버 개설 방법 ---
데이터 저장 : MySQL 8.0.37
다운로드  > custom > 서버, 워크벤치, 이그잼플 세 가지 8.0.37 추가 > 설치
서버설정 > port 3306 protocol 33060 > 선택지 두 개는 밑에 것으로
비번 123456, 아이디 : MySQL  (80은 지우자)
MySQL 8.0 Command Line Client 실행 > 비번 입력 > 8.0.37 서버 버전 확인

dbeaver 검색 > DBeaver Community | Free Universal Database Tool > 다운로드
windows (installer) 다운로드 > 실행 > 전체 사용 가능 체크 > 계속 다음 눌러서 설치 후 마침

show  databases; 엔터 > mysql, information, sys 최소 세 개는 보여야 한다.
현재 계정은 슈퍼관리자 loot > 계정을 만들어야 함
create user 계정명(원하는거) identified by ‘비번’(‘123456’) > (Query OK)
create database 데이터베이스명(계정명 ry0606과 같게) > show databases; > 계정명이 추가되어 있다.
계정 권한(회사에서는 하면 안 됨. 관리자 계정 권한을 전부 넘기는 것임) : grant all privileges on (DB명)ry0606.* to (계정명)ry0606@'%';  (Query OK)
계정 권한 변경 적용 : flush privileges;  (Query OK) > MySQL 종료

dbeaver 실행 > 데이터베이스 > 새 데이터베이스 연결 > MySQL 다음 > 
데이터베이스명(ry0606), 유저명(ry0606), 비번(123456) 적고 Test 눌러서 Connect 뜨면 ok > 완료 (설정 끗!)
*/

}
