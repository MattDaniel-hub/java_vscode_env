@echo off


@REM Set time
set _hh=%time:~0,2%
set _mm=%time:~3,2%
set _ss=%time:~6,2%
set __time=%_hh%%_mm%%_ss%


@REM Set paths
set workDir=%1
set mainClassName=%2


@REM prepare
cd %workDir%\bin


@REM jar cfm jar-file manifest-addition input-file(s)
jar --create --file=%workDir%\Output.jar --main-class=%mainClassName% . 
