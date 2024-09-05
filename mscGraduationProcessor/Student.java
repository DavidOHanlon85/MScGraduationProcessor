/**
 * 
 */
package mscGraduationProcessor;

/**
 * This is the student class
 */
public abstract class Student {

	// Instance Variables

	private int studentNumber;
	private String firstName;
	private String lastName;

	// Constructors

	/**
	 * This is the default constructor
	 */
	public Student() {

	}

	/**
	 * @param studentNumber
	 * @param firstName
	 * @param lastName
	 */
	public Student(int studentNumber, String firstName, String lastName) {
		this.setStudentNumber(studentNumber);
		this.setFirstName(firstName);
		this.setLastName(lastName);
	}

	// Getters and setters

	/**
	 * @return the studentNumber
	 */
	public int getStudentNumber() {
		return studentNumber;
	}

	/**
	 * @param studentNumber the studentNumber to set
	 */
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	// toString method

	@Override
	public String toString() {
		return "Student [studentNumber=" + studentNumber + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	// Methods

}
