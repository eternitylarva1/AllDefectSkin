@echo off
setlocal enabledelayedexpansion
for /f "delims=" %%i in ('dir /b *images_*') do (
echo %%i
set var=%%i
set var=!var:images_=!
echo %%i !var!
ren "%%i" "!var!"
)
pause