# MyProject
This repository contains:
- `MyProject.jar`: The executable JAR file.
- `run-myproject.bat`: A script to run the JAR on Windows.

## Prerequisites
- **Java 21 (JDK 21)** is required to run this program.
    - [Download Java 21 here](https://www.oracle.com/java/technologies/downloads).

## How to Run
1. **Download the Files**:
    - Download the folder  **runner** that has both files `MyProject.jar` and `run-myproject.bat`.
    

2. **Verify Java Installation**:
    - Ensure **Java 21 (JDK 21)** is installed.
    - Open a terminal/command prompt and type:
      ```bash
      java -version
      ```
      It should show something like:
      ```
      java version "21.x"
      ```

3. **Run the Program**:
    - On **Windows**:
        - Double-click `run-myproject.bat` to execute the JAR file.
    - On **Linux/Mac**:
        - Run the following command in the terminal:
          ```bash
          java -jar MyProject.jar
          ```

## Troubleshooting
- **Error: `UnsupportedClassVersionError`**:
    - If you see an error like:
      ```
      Main has been compiled by a more recent version of the Java Runtime
      ```
      This means your Java version is older than 21. Please download and install Java 21.

## License
This project is open-source and free to use.
