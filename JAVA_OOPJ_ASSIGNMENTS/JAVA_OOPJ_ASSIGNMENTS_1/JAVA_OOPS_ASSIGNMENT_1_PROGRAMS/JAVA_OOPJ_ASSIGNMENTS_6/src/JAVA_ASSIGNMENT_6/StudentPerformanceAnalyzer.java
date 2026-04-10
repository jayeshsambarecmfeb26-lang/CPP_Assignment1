package JAVA_ASSIGNMENT_6;
//
//Q1: Student Performance Analyzer (CSV File I/O + Data 
//Processing) 
//Requirements: 
//● Create a class StudentPerformanceAnalyzer. 
//● Use BufferedReader with FileReader to read students.csv. 
//● Read the file line-by-line using a loop. 
//● Skip the header row before processing data. 
//Data Storage Using List: 
//● Create a class StudentRecord with fields: 
//○ name 
//○ subject 
//○ marks 
//● Use a List<StudentRecord> to: 
//○ Store all records from the file 
//For each line: 
//● Split the string using , 
//● Extract: 
//○ Student Name 
//○ Subject 
//○ Marks 
//● Create a StudentRecord object 
//● Add it to the list 
//Processing Logic (Using List + Maps): 
//● Traverse the List<StudentRecord> and: 
//○ Use HashMap<String, Integer> to store: 
//■ Total marks per student 
//○ Use HashMap<String, Integer> to store: 
//C-DAC Mumbai
//■ Number of subjects per student 
//○ Use HashMap<String, StudentRecord> (or suitable structure) to track: 
//■ Subject-wise topper (highest marks per subject) 
//After processing all records: 
//Calculate average marks for each student: 
//average = totalMarks / numberOfSubjects 
//●  
//● Traverse the map to find: 
//○ Student with highest total marks (Overall Topper) 
//Output File: 
//● Use BufferedWriter / FileWriter to write results into report.txt 
//Output Format (report.txt): 
//===== STUDENT REPORT ===== 
//Total & Average Marks: 
//Amit: Total = 235, Average = 78.33 
//Neha: Total = 263, Average = 87.66 
//Rahul: Total = 209, Average = 69.66 
//Priya: Total = 275, Average = 91.66 
//Subject Toppers: 
//Math: Priya (91) 
//Science: Neha (90) 
//English: Priya (95) 
//Overall Topper: Priya 
//Exception Handling: 
//● Handle: 
//○ IOException 
//○ File not found case 
//○ Number format issues (invalid marks) 
//Resource Management: 
//C-DAC Mumbai
//● Close all resources properly 
//OR 
//● Use try-with-resources 
//Student Data File Content (students.csv): 
//StudentID,Name,Subject,Marks 
//1,Amit,Math,78 
//2,Neha,Math,85 
//3,Rahul,Math,67 
//1,Amit,Science,82 
//2,Neha,Science,90 
//3,Rahul,Science,70 
//1,Amit,English,75 
//2,Neha,English,88 
//3,Rahul,English,72 
//4,Priya,Math,91 
//4,Priya,Science,89 
//4,Priya,English,95

	import java.io.*;

	import java.util.*;

	class StudentRecord 
	{
	    String name;
	    String subject;
	    int marks;

	    StudentRecord(String name, String subject, int marks)
	    {
	        this.name = name;
	        this.subject = subject;
	        this.marks = marks;
	    }
	}
	public class StudentPerformanceAnalyzer 
	{
		

	    public static void main(String[] args) 
	    {

	        List<StudentRecord> list = new ArrayList<>();

	        Map<String, Integer> totalMarks = new HashMap<>();
	        Map<String, Integer> subjectCount = new HashMap<>();
	        Map<String, StudentRecord> subjectTopper = new HashMap<>();

	        try (BufferedReader br = new BufferedReader(new FileReader("students.csv")))
	        {

	            String line;
	            br.readLine(); 

	            while ((line = br.readLine()) != null) {
	                String[] data = line.split(",");

	                String name = data[1];
	                String subject = data[2];
	                int marks = Integer.parseInt(data[3]);

	                StudentRecord sr = new StudentRecord(name, subject, marks);
	                list.add(sr);

	          
	                totalMarks.put(name, totalMarks.getOrDefault(name, 0) + marks);


	                subjectCount.put(name, subjectCount.getOrDefault(name, 0) + 1);

	                
	                if (!subjectTopper.containsKey(subject) ||
	                        subjectTopper.get(subject).marks < marks) {
	                    subjectTopper.put(subject, sr);
	                }
	            }

	            String overallTopper = "";
	            int maxMarks = 0;

	            for (String name : totalMarks.keySet())
	            {
	                if (totalMarks.get(name) > maxMarks) {
	                    maxMarks = totalMarks.get(name);
	                    overallTopper = name;
	                }
	            }

	            try (BufferedWriter bw = new BufferedWriter(new FileWriter("report.txt"))) {

	                bw.write("===== STUDENT REPORT =====\n");
	                bw.write("Total & Average Marks:\n");

	                for (String name : totalMarks.keySet()) {
	                    int total = totalMarks.get(name);
	                    double avg = (double) total / subjectCount.get(name);

	                    bw.write(name + ": Total = " + total + ", Average = " + avg + "\n");
	                }

	                bw.write("Subject Toppers:\n");

	                for (String sub : subjectTopper.keySet()) {
	                    StudentRecord sr = subjectTopper.get(sub);
	                    bw.write(sub + ": " + sr.name + " (" + sr.marks + ")\n");
	                }

	                bw.write("\nOverall Topper: " + overallTopper);
	            }

	        } catch (IOException | NumberFormatException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	
}
