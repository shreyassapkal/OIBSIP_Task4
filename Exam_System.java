//Shreyas Sapkal
//Java Programming
//Task-4 Online Examination System
import java.util.HashMap;
import java.util.Scanner;
public class Exam_System{
Scanner input=new Scanner(System.in);
HashMap<String,Integer> data=new HashMap<String,Integer>();
	
	public void login() {
		data.put("Shreyas",1234); //username and password
		data.put("Yash",2345);
		System.out.println("\n\nWELCOME TO EXAM PORTAL---");
		String userid;
		int pwd;
		System.out.println("Login to continue...");
		System.out.print("Enter user id : ");
		userid=input.next();
		System.out.print("Enter password : ");
		pwd=input.nextInt();
		if(data.containsKey(userid) && data.get(userid)==pwd) {
			System.out.println("Login sucessful");
				option_menu();
		}
		else {
			System.out.println("SORRY!!! Invalid Login");
			System.out.println("Try again");
				login();
		}
	}
	public void option_menu() {
		int select;
		System.out.println("Enter the option you want to perform");
		System.out.println("1.Update profile and password");
		System.out.println("2.Start the exam");
		System.out.println("3.Logout");
		select=input.nextInt();
		switch(select) {
		case 1:
			data=update();
			option_menu();
			break;
		case 2:
			exam_que();
			option_menu();
			break;
		case 3:
			System.exit(0);
			break;
		default:
			System.out.println("Invalid entry");
		}
	}
	public HashMap<String,Integer> update(){
		String upser;
		int upwd;
		System.out.println("Welcome to Update profile");
		System.out.println("Enter user name");
		upser=input.next();
		if(data.containsKey(upser)) {
		System.out.println("Enter new password you to want to update to your profile");
		upwd = input.nextInt();
		data.replace(upser, upwd);
		}
		else {
			System.out.println("User doesn't exist");
		}
		return data;
	}
public void exam_que() {
	long examtime=System.currentTimeMillis();
	long endtime=examtime+30;
	int answer_count=0;
	int ans,score;
	System.out.println("Start the exam");
	
	//Question Start From Here 
	
	while(System.currentTimeMillis()<endtime) {
		System.out.println("You have 5 minutes to answer 5 questions");
		System.out.println("Each question carries 5 marks"+" "+"-1 for wrong answer");

        System.out.println("\n\nWho invented Java Programming?");
		System.out.println("1)James Gosling"+"\t"+"2)Bjarne Stroustrup"+"\t"+"3)Guido van Rossum"+"\t"+"4)Dennis Ritchie");
		System.out.println("Enter correct option");
		ans=input.nextInt();
		System.out.println("Answer Saved");
		if(ans==1) {
			answer_count++;
		}

		System.out.println("\n\n Which keyword is used for accessing the features of a package?		");
		System.out.println("\n1) package"+"\t"+"2) import"+"\t"+"3) extends"+"\t"+"4)export");
		System.out.println("Enter correct option");
		ans=input.nextInt();
		System.out.println("Answer Saved");
		if(ans==2) {
			answer_count++;
		}
		System.out.println("\n\nWhich of the following is not a Java features?");
		System.out.println("1)Dyanamic"+"\t"+"2)Architecture Neutral"+"\t"+"3)Use of Pointers"+"\t"+"4)JIT");
		System.out.println("Enter correct option");
		ans=input.nextInt();
		System.out.println("Answer Saved");
		if(ans==2) {
			answer_count++;
		}
		
		System.out.println("\n\n Which method of the Class.class is used to determine the name of a class represented by the class object as a String?");
		System.out.println("1) getClass()"+"\t"+"2) Intern()"+"\t"+"3) getName()"+"\t"+"4) toString()");
		System.out.println("Enter correct option");
		ans=input.nextInt();
		System.out.println("Answer Saved");
		if(ans==4) {
			answer_count++;
		}
		System.out.println("\n\nWhich of the following is a reserved keyword in Java?");
		System.out.println("1) object"+"\t"+"2) strictfp"+"\t"+"3) main"+"\t"+"4) system");
		System.out.println("Enter correct option");
		ans=input.nextInt();
		System.out.println("Answer Saved");
		if(ans==1) {
			answer_count++;
		}
		break;
	}
	System.out.println("You have finished the exam");
	score=answer_count*10-((5-answer_count)*5); //Score Counting 
	System.out.println("Your score is..."+" "+score+"/50");	
}

public static void main (String[] args)
{
	Exam_System log =new Exam_System();
		log.login(); //function calling
}
}