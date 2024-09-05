/**
 * 
 */
package mscGraduationProcessor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 
 */
public class ExamResultProcessor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Create container for students

		ArrayList<MscStudent> students = new ArrayList<MscStudent>();

		// Read in students from file

		readInStudentDetails(students);
		
		// Show all records to screen
		
		printAllStudentDetailsToConsole(students);
		
		// Classify the students
		
		classifyEachStudent(students);
		
		// Display classifications to console
		
		displayClassifcationsToConsole(students);
		
		// Write to file
		
		writeGraduationListToFile(students);

	}

	/**
	 * @param students
	 */
	public static void writeGraduationListToFile(ArrayList<MscStudent> students) {
		File file2 = new File("ListForGraduation.txt");
		
		try {
			FileWriter fw = new FileWriter(file2, false);
			BufferedWriter bw = new BufferedWriter(fw);
			
			for (MscStudent s : students) {
				bw.write(s.getStudentNumber() + " " + s.getFirstName() + " " + s.getLastName() + " - " + s.getClassification() + "\n");
			}
			
			bw.close();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * This method displays all classifications to console
	 * @param students
	 */
	public static void displayClassifcationsToConsole(ArrayList<MscStudent> students) {
		for (MscStudent s : students) {
			s.classificationsToScreen();
		}
		System.out.println("Number of records : " + students.size());
	}

	/**
	 * This method classifies each student
	 * @param students
	 */
	public static void classifyEachStudent(ArrayList<MscStudent> students) {
		for (MscStudent s : students) {
			s.classifyStudent();
		}
	}

	/**
	 * This method prints all student details to the console
	 * @param students
	 */
	public static void printAllStudentDetailsToConsole(ArrayList<MscStudent> students) {
		for (MscStudent s : students) {
			s.displayAllDetailstoConsole();
			System.out.println();
		}
		System.out.println("Number of records : " + students.size());
	}

	/**
	 * Reads in all student details from file
	 * 
	 * @param students
	 */
	public static void readInStudentDetails(ArrayList<MscStudent> students) {
		String line;

		File file = new File("ModuleScoresMSc-1.csv");

		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			// Removing column headers

			line = br.readLine();

			// Read first line

			line = br.readLine();

			while (line != null) {

				String[] studentDetails = line.split(",");

				MscStudent student = new MscStudent(Integer.parseInt(studentDetails[0]), studentDetails[1],
						studentDetails[2], Integer.parseInt(studentDetails[3]), Integer.parseInt(studentDetails[4]),
						Integer.parseInt(studentDetails[5]), Integer.parseInt(studentDetails[6]),
						Integer.parseInt(studentDetails[7]));

				// add to student array

				students.add(student);

				line = br.readLine();
			}

			br.close();
			fr.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
