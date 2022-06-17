set JAVA_HOME="C:\Madhuri\digital.pensieve\tools\jdk-11"
call mvn clean install -U
call mvn eclipse:clean -Dwtpversion=2.0
call mvn eclipse:eclipse -Dwtpversion=2.0
pause
