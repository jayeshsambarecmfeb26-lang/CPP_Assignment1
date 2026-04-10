//
//Q2: User Activity File Processor (File I/O) 
//Requirements: 
//1. Create a class ActivityProcessor. 
//2. Use BufferedReader with FileReader to read activity.txt. 
//3. Read the file line-by-line using a loop. 
//4. For each line: 
//○ Split the string using space. 
//○ Extract User and Activity. 
//5. Use a HashMap<String, Integer> to: 
//○ Store user as key 
//○ Increment count for each occurrence 
//6. After reading all lines: 
//○ Traverse the map to find the user with maximum activity 
//7. Use BufferedWriter / FileWriter to write results into activity_summary.txt 
//8. Add proper exception handling: 
//○ IOException 
//○ File not found case 
//C-DAC Mumbai
//9. Close all resources properly (or use try-with-resources) 
//User Activity File Content (activity.txt): 
//User1 LOGIN 
//User2 LOGIN 
//User1 PURCHASE 
//User3 LOGIN 
//User2 LOGOUT 
//User1 LOGOUT 
//User4 LOGIN 
//User3 PURCHASE 
//User2 PURCHASE 
//User1 LOGIN 
//User4 LOGOUT 
//User3 LOGOUT 
//User5 LOGIN 
//User5 PURCHASE 
//User2 LOGIN 
//User1 PURCHASE 
//User3 LOGIN 
//User4 PURCHASE 
//User5 LOGOUT 
//User2 LOGOUT

package JAVA_ASSIGNMENT_6;
import java.io.*;
import java.util.*;

public class ActivityProcessor {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("activity.txt"))) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(" ");
                String user = data[0];

                map.put(user, map.getOrDefault(user, 0) + 1);
            }

            String maxUser = "";
            int max = 0;

            for (String user : map.keySet()) {
                if (map.get(user) > max) {
                    max = map.get(user);
                    maxUser = user;
                }
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter("activity_summary.txt"))) {
                bw.write("User Activity Count:\n");

                for (String user : map.keySet()) {
                    bw.write(user + ": " + map.get(user) + "\n");
                }

                bw.write("\nMost Active User: " + maxUser);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}