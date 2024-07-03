@ECHO OFF
REM 
REM Copyright 2024
REM
ECHO ---------------------------------------------------------------------------------------
ECHO USAGE
ECHO ------------------------------------------------------------------------------------------
ECHO Execute jenkins.bat from 'C:\Jenkins' using command prompt or double click it.
ECHO -------------------------------------------------------------------------------------------
SET JENKINS_HOME=D:\Jenkins
SET JENKINS_PORT=8100
REM Jenkins Create SECRET_KEY
REM  ------------------------------------------------------------------------------------------
ECHO Executing command...CD %JENKINS_HOME% 
CD %JENKINS_HOME%
ECHO Executing command... java -jar jenkins.war --httpPort=%JENKINS_PORT%
java -jar jenkins.war --httpPort=%JENKINS_PORT%
 