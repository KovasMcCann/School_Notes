@echo off
setlocal

REM === CONFIGURE PATHS ===
set JAVA_FX_LIB=C:\javafx-sdk-21.0.2\lib
set SRC_DIR=src
set OUT_DIR=out
set JAR_NAME=app.jar
set MAIN_CLASS=Main
set APP_NAME=MyJavaFXApp

REM === CLEAN OLD OUTPUT ===
if exist %OUT_DIR% rmdir /s /q %OUT_DIR%
mkdir %OUT_DIR%

REM === COMPILE JAVA FILES ===
echo Compiling JavaFX application...
javac --module-path "%JAVA_FX_LIB%" --add-modules javafx.controls -d %OUT_DIR% %SRC_DIR%\%MAIN_CLASS%.java

IF %ERRORLEVEL% NEQ 0 (
    echo Compilation failed.
    exit /b %ERRORLEVEL%
)

REM === CREATE JAR ===
echo Creating JAR file...
jar --create --file %JAR_NAME% -C %OUT_DIR% .

REM === PACKAGE INTO STANDALONE EXE ===
echo Packaging with jpackage (no WiX, just EXE)...
jpackage ^
  --type app-image ^
  --name %APP_NAME% ^
  --input . ^
  --main-jar %JAR_NAME% ^
  --main-class %MAIN_CLASS% ^
  --module-path "%JAVA_FX_LIB%" ^
  --add-modules javafx.controls ^
  --dest out ^
  --win-console

echo Done! Find your standalone EXE in the "out\%APP_NAME%\bin" folder.
pause
