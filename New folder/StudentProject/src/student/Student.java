package student;

/**
* This is a class to define the necessary attributes and methods to conceptualize a "Student"
* The spepcific tasks are: 
*Md.shafiq newaj shovo  
* @15/10/16 (a version number or a date)
*/
import java.util.Scanner;
import java.io.*;


public class Student {

Scanner input = new Scanner(System.in);
// Declare the important attributes of a student. For example:
//1.Id
//2. Name
//3. Department
//4. University
//5. GPAs in various terms (Multidimensional arrays)
//6. subjects for Current terms
//7. Credits and grades of Current Terms (Multidimmentional Array)

int id;
String name;
String Department ;
String University ;
double[] GPA = new double[8];
double[][][] CnG = new double[8][5][5];
double CGPA;

/**
* Define a constructor that initilize the default properties of the Student
*/
public Student(int Id,String Name,String department,String university)
{
id = Id;
name = Name;
Department = department;
University = university ;
}

/**
* Define a method to print the students details.
*/
public void studentDetailsById(int id)
{
//write your code here
System.out.println("ID : " + id);
System.out.println("Name : " +name);
System.out.println("Department : " + Department);
System.out.println("University : " + University); 
}


/**
* Define a method to update information of students by ID
* Use as many arguments as required.
*/
public void updateStudentById(int id)
{
//Write your code here
//i got confused here.
} 

/**
* Define a method to compute the CGPA from the Given term GPA for a particular student.
* se as many arguments as required.
*/
	public double computeCGPAByID()
	{
	// Write your code here
	double cgpa = 0;
	int count = 0;

	for(int i=0;i<8;i++)
	{
	System.out.println("Enter GPA of Sem " + (i+1) +" : ");
	GPA[i]=input.nextDouble();
	}


	for(int i=0;i<8;i++)
	{
	if(GPA[i] == 0)	continue;
	count++;
	cgpa+=GPA[i];
	}
	cgpa/=count;
	CGPA = cgpa;

	return cgpa;
	}


/**
* Define a method to compute the GPA from the given Credits and Grades of all the subjects
*/

//i got confused in this calculations. 


/**
* After performing required operations on each student, save the information to a file. Use File and PrintWriter Class. 
* use as many arguments as required.
* 
*/
public void saveStudent()
{
//problem in file operation handle.
}

/**
* Create a dummy files with infromations to describe the properties of a Student object and load the data files using Java File and Scanner class.
* use as many arguments as required.
*/
public static void main(String[] args)
{ 
Student[] students = new Student[50];
Scanner in = new Scanner(System.in);
for(int i=0; in.hasNextLine() ; i++)
{
int p=in.nextInt();
String q=in.next();
String r=in.next();
String s=in.next();
students[i] = new Student(p,q,r,s);
students[i].studentDetailsById(p);
//students[i].updateStudentById(p);

} 
}
}