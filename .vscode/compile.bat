@echo off


@REM Set paths
set workDir=%1
set javacVersion8=%2


@REM prepare
cd %workDir%
if not exist ".\bin" mkdir .\bin


@REM javac -sourcepath src -classpath classes;lib\Banners.jar src\farewells\GoodBye.java -d classes
%javacVersion8% ^
-sourcepath .\src ^
-classpath .\lib\*.jar;.\lib2\*.jar ^
-source 1.8 -target 1.8 ^
.\src\*.java ^
-d .\bin