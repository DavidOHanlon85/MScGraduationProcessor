/**
 * 
 */
package mscGraduationProcessor;

/**
 * 
 */
public class MscStudent extends Student {
	
	//Instance Variables
	
	private int program;
	private int compFound;
	private int DBs;
	private int Web;
	private int SoftwareE;
	private String classification = "Not available";

	//Constructors
	
	/**
	 *  This is the default constructor
	 */
	public MscStudent() {
		// TODO Auto-generated constructor stub
	} 
	
	/**
	 * Constructor with args except classification
	 * 
	 * @param studentNumber
	 * @param firstName
	 * @param lastName
	 * @param program
	 * @param compFound
	 * @param dBs
	 * @param web
	 * @param softwareE
	 */
	public MscStudent(int studentNumber, String firstName, String lastName, int program, int compFound, int dBs, int web, int softwareE) {
		super(studentNumber, firstName, lastName);
		this.setProgram(program);
		this.setCompFound(compFound);
		this.setDBs(dBs);
		this.setWeb(web);
		this.setSoftwareE(softwareE);
	}
	
	/**
	 * Constructor with args
	 * 
	 * @param studentNumber
	 * @param firstName
	 * @param lastName
	 * @param program
	 * @param compFound
	 * @param dBs
	 * @param web
	 * @param softwareE
	 * @param classification
	 */
	public MscStudent(int studentNumber, String firstName, String lastName, int program, int compFound, int dBs, int web, int softwareE, String classification) {
		super(studentNumber, firstName, lastName);
		this.setProgram(program);
		this.setCompFound(compFound);
		this.setDBs(dBs);
		this.setWeb(web);
		this.setSoftwareE(softwareE);
		this.setClassification(classification);
	}
	
	// Getters and setters

	/**
	 * @return the program
	 */
	public int getProgram() {
		return program;
	}

	/**
	 * @param program the program to set
	 */
	public void setProgram(int program) {
		this.program = program;
	}

	/**
	 * @return the compFound
	 */
	public int getCompFound() {
		return compFound;
	}

	/**
	 * @param compFound the compFound to set
	 */
	public void setCompFound(int compFound) {
		this.compFound = compFound;
	}

	/**
	 * @return the dBs
	 */
	public int getDBs() {
		return DBs;
	}

	/**
	 * @param dBs the dBs to set
	 */
	public void setDBs(int dBs) {
		DBs = dBs;
	}

	/**
	 * @return the web
	 */
	public int getWeb() {
		return Web;
	}

	/**
	 * @param web the web to set
	 */
	public void setWeb(int web) {
		Web = web;
	}

	/**
	 * @return the softwareE
	 */
	public int getSoftwareE() {
		return SoftwareE;
	}

	/**
	 * @param softwareE the softwareE to set
	 */
	public void setSoftwareE(int softwareE) {
		SoftwareE = softwareE;
	}

	/**
	 * @return the classification
	 */
	public String getClassification() {
		return classification;
	}

	/**
	 * @param classification the classification to set
	 */
	public void setClassification(String classification) {
		this.classification = classification;
	}
	
	// toString Method
	
	@Override
	public String toString() {
		return "MscStudent [program=" + program + ", compFound=" + compFound + ", DBs=" + DBs + ", Web=" + Web
				+ ", SoftwareE=" + SoftwareE + ", classification=" + classification + ", getStudentNumber()="
				+ getStudentNumber() + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + "]";
	}
	
	// Methods
	
	/**
	 * This method displays all student details to console
	 */
	public void displayAllDetailstoConsole() {
		System.out.println("Student no. : " + getStudentNumber());
		System.out.println("First Name : " + getFirstName());
		System.out.println("Last name : " + getLastName());
		System.out.println("Module Results");
		System.out.println("Program : " + getProgram());
		System.out.println("Comp Found : " + getCompFound());
		System.out.println("DBs : " + getDBs());
		System.out.println("Web : " + getWeb());
		System.out.println("Software E : " + getSoftwareE());
		System.out.println("Average : " + calculateAverage());
		System.out.println("Classification : " + getClassification());
	}
	
	

	/**
	 * This method displays student no, first name, last name, average and classification to screen
	 */
	public void classificationsToScreen() {
		System.out.println();
		System.out.println("Student no. : " + getStudentNumber());
		System.out.println("First Name : " + getFirstName());
		System.out.println("Last name : " + getLastName());
		System.out.println("Average : " + calculateAverage());
		System.out.println("Classification : " + getClassification());
	}
	
	/**
	 * This private method calculates the average score for the taught modules and returns this as an int
	 * @return
	 */
	
	private int calculateAverage() {
		int total = (getProgram() * 2) + getCompFound() + getDBs() + getWeb() + getSoftwareE();
		return total / 6;
	}
	
	/**
	 * This method classifies a student based on classification bands
	 */
	public void classifyStudent() {
		int taughtAverage = calculateAverage();
		
		if (taughtAverage < 0) {
			setClassification("Error");
		} else if (taughtAverage >= 70 && taughtAverage <= 100) {
			setClassification("Distinction");
		} else if (taughtAverage >= 60 && taughtAverage <= 69) {
			setClassification("Commendation");
		} else if (taughtAverage >= 50 && taughtAverage <= 59) {
			setClassification("Pass");
		} else {
			setClassification("Fail");
		}
	}
	
	
	

	


}
