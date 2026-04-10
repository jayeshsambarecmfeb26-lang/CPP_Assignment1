//
//Q3: Error Log Filter System (File I/O) 
//Requirements: 
//1. Create a class ErrorLogFilter. 
//2. Use BufferedReader to read system.log. 
//3. Use BufferedWriter to write into error.log. 
//4. Initialize a counter variable for error count. 
//5. Read file line-by-line: 
//○ Check if line contains "ERROR" (use contains() method) 
//6. If condition is true: 
//○ Write the line into error.log 
//○ Increment error counter 
//7. After processing: 
//○ Print total error count to console 
//C-DAC Mumbai
//8. Ensure: 
//○ Efficient reading (no full file loading) 
//9. Handle exceptions and close resources properly 
//Error Log File Content (system.log):  
//INFO Server started successfully 
//INFO User1 logged in 
//WARNING Disk space running low 
//ERROR Database connection failed 
//INFO Request received from User2 
//ERROR Null pointer exception in module X 
//INFO User3 logged out 
//WARNING High memory usage detected 
//ERROR Payment processing failed 
//INFO Backup completed successfully 
//ERROR Timeout while connecting to API 
//INFO User4 logged in 
//WARNING CPU usage high 
//ERROR File not found exception 
//INFO System shutting down 
//C-D

package JAVA_ASSIGNMENT_6;

import java.io.*;

public class ErrorLogFilter {
    public static void main(String[] args) {

        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("system.log"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("error.log"))) {

            String line;

            while ((line = br.readLine()) != null) {
                if (line.contains("ERROR")) {
                    bw.write(line);
                    bw.newLine();
                    count++;
                }
            }

            System.out.println("Total ERROR lines: " + count);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
