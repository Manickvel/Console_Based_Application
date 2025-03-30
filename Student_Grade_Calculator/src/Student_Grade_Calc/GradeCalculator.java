package Student_Grade_Calc;
import java.util.Scanner;
class Subjects{
	int Mark[]=null;
	String Name[]=null;
	int n;
	Scanner sc = new Scanner(System.in);
	
	void SubjectsInput() {
		System.out.println("Enter the total No of Subject:");
		n=sc.nextInt();
		Mark=new int[n];
		Name = new String[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the " + (i+1) +" Subject Name");
			Name[i]=sc.next();
			System.out.println("Enter the " + (i+1) +" Subject Mark");
			Mark[i]=sc.nextInt();
			if(Mark[i]>100) {
				System.out.println("Plese Enter The Mark out of 100 ");
				Mark[i]=sc.nextInt();
			}

		}
		sc.close();
	}
	int CalculationOfMark() {
		Calculation c = new Calculation(Mark,n);
		return c.Total();
	}
	float CalculationOfAvg() {
		Calculation c = new Calculation(Mark,n);
		return c.Average();
	}
	void CalculationOfGrade() {
		Grade G = new Grade(Mark,Name);
		G.SubjectGrade();
	}
	
}
class Calculation{
	float Sum ;
	int m[]=null;
	int n;
	Calculation(int m[],int n){
		this.m=m;
		this.n=n;
	}
	
	int Total() {
		for(int i=0;i<n;i++) {
			 Sum+=m[i];
		}
		return (int)Sum;
	}
	float Average() {
		for(int i=0;i<n;i++) {
			 Sum+=m[i];
		}
		float Avg = Sum/n;
		return Avg;
	}
}
class Grade{
	int Mark[]=null;
	String Name[]=null;
	Grade(int Mark[],String Name[]){
	this.Mark=Mark;
	this.Name=Name;
	}
	void SubjectGrade() {
		for(int i=0;i<Mark.length;i++) {
			if(Mark[i]>=90) {
				System.out.println("You Got a 'A' Grade in "+ Name[i]+" Subject");
			}
			else if(Mark[i]>=80){
				System.out.println("You Got a 'B' Grade in "+ Name[i]+" Subject");
			}
			else if(Mark[i]>=70) {
				System.out.println("You Got a 'C' Grade in "+ Name[i]+" Subject");
			}
			else if(Mark[i]>=60) {
				System.out.println("You Got a 'D' Grade in "+ Name[i]+" Subject");
			}
			else if(Mark[i]>=35){
				System.out.println("You Got a 'E' Grade in "+ Name[i]+" Subject");
			}
			else {
				System.out.println("You Got a 'F' Grade in "+ Name[i]+" Subject");
			}
		}
		
	}
}
public class GradeCalculator {
	public static void main(String[] args){
		Subjects s = new Subjects();
		s.SubjectsInput();
		System.out.println("The Total Mark obtained in All Subjects are " + s.CalculationOfMark());
		System.out.printf("The Average Percentage of All Subjects is %.2f \n" ,s.CalculationOfAvg());
		s.CalculationOfGrade();
	}

}
