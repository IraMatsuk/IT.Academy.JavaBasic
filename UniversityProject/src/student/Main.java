package student;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	static int id = 1;
	
	static int getId() {
		return id++;
	}
	
	public static void writeToFile(String fileName, Object obj) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))){
            oos.writeObject(obj);
        }
        catch(Exception ex){             
            System.out.println(ex.getMessage());
        }
	}
	
	public static void main(String[] args) {
		String name = "Student";
		Random r = new Random();
		double min = 0.0;
		double max = 10.0;
		
		// Generate list of students with random marks
		List<Student> students = Stream.generate(Student::new).peek(s -> s.setName(name + getId())).peek(s -> s.setMark(r.nextInt(10))).limit(100).collect(Collectors.toList());
		
		// Save the list of students into the file
		writeToFile("file1.txt", students);
        
        // Filter the students whose marks is less than seven
        double filterMark = 7.0;
        List<Student> filterStudent = students.stream().filter(s -> s.getMark() < filterMark).collect(Collectors.toList());
        filterStudent = filterStudent.stream().sorted((s1, s2) -> Double.compare(s1.getMark(), s2.getMark())).collect(Collectors.toList());
        
		// Save the list of filtered and sorted students into the new file
        writeToFile("file2.txt", filterStudent);
        
        // Reverse the list of students
        filterStudent = filterStudent.stream().sorted(Comparator.comparingDouble(Student::getMark).reversed()).collect(Collectors.toList());
      
		// Save the list of reversed sorted students into the new file
        writeToFile("file3.txt", filterStudent);
        
        // Select three students from the list by random
        filterStudent = filterStudent.stream().limit(3).collect(Collectors.toList());
        //(filterStudent.get(r.nextInt(filterStudent.size())));	
	}
}
