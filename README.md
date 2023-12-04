**SEM BREAK PROJECT**

Classes backing Web pages:
```bash
├── PageIndex.java                    
├── PageMission.java                  
├── PageST2/3.java
```

Other Classes:
```bash
├── java/app                                - Package location for all Java files for the webserver
│         ├── App.java                      - Main Application entrypoint for Javalin
│         └── JDBCConnection.java    
├── java/helper                             - Location of the helper file for loading SQLite with JDBC
│         └── VTPProcessCSV.java            - Helper Java program to load SQLite database from the provided CSVs
```

Folders:
```bash
├── /src/main                    - Location of all files as required by build configuration
│         ├── java               - Java Source location
│         │    ├── app           - Package location for all Java files for the webserver
│         │    └── helper        - Location of the helper file for loading SQLite with JDBC
│         └── resources          - Web resources
│               ├── css          - CSS Style-sheets
│               └── images       - Image files
│ 
├── /target                      - build directory
├── /database                    - The folder to store sqlite database files (*.db files), SQL script (*.sql), and other files related to the database
├── pom.xml                      - Configure Build (DO NOT MODIFY)
└── README.md                    - This file ;)
```

**🚨 DO NOT MODIFY THE CONTENTS OF THIS FOLDER. 🚨**

# Authors
* Dr. Sakitha Sanvidu Manamperi
* Princess Kannan Arora

Copyright (c) 2023

