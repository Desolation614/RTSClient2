cd C:\RTSClient2\RTSClient2\decompiled

:: Search all .java files for likely client references and save to client_search_results.txt
(
  echo ===== Class declarations containing "Client" =====
  findstr /s /i /c:"class Client" *.java
  echo.
  echo ===== Fields of type Client =====
  findstr /s /i /c:"Client " *.java
  echo.
  echo ===== Static fields =====
  findstr /s /i /c:"static " *.java
  echo.
  echo ===== getInstance / getClient methods =====
  findstr /s /i /c:"getInstance" *.java
  findstr /s /i /c:"getClient" *.java
) > client_search_results.txt
