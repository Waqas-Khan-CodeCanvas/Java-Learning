/**
 * Steps to Setup Java Environment and JDK Configuration
 * 
 * 1. Download JDK:
 *    - Visit the official Oracle website or OpenJDK website.
 *    - Download the latest JDK version suitable for your operating system.
 * 
 * 2. Install JDK:
 *    - Run the downloaded installer.
 *    - Follow the installation instructions.
 *    - Note the installation directory (e.g., C:\Program Files\Java\jdk-XX).
 * 
 * 3. Set Environment Variables:
 *    - Open System Properties (Right-click on 'This PC' -> Properties -> Advanced system settings).
 *    - Click on 'Environment Variables'.
 *    - Under 'System variables', click 'New' and add:
 *      - Variable name: JAVA_HOME
 *      - Variable value: Path to your JDK installation (e.g., C:\Program Files\Java\jdk-XX)
 *    - Find the 'Path' variable, select it, and click 'Edit'.
 *    - Add a new entry: %JAVA_HOME%\bin
 * 
 * 4. Verify Installation:
 *    - Open Command Prompt.
 *    - Type `java -version` and `javac -version` to check the installation.
 * 
 * 5. Configure IntelliJ IDEA:
 *    - Open IntelliJ IDEA.
 *    - Go to File -> Project Structure -> Project.
 *    - Set the Project SDK to the JDK you installed.
 *    - Apply and close the settings.
 * 
 * Your Java environment and JDK are now configured!
 */