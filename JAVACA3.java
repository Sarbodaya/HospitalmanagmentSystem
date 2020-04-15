import java.util.Scanner;
abstract class Screen{
	abstract void clearScreen();
}


public class HospitalManagementsystem  extends Screen{
	public int num;
	public int sum;
	public int n;
	public char name[30];
	public char disease[30];
	public int cabin,phone,age;
	public int n,i,j=0,a=0,g,flag,num,s1;

	int x[] = new int[50];
	Scanner s1 = new Scanner(System.in);
	void clearScreen(){
		System.out.flush();
}
}

class myException extends Exception{
	public myException(String s1){
		super(s1);
	}

}


class AddProfile extends HospitalManagementsystem{

	public void Add(){
		System.out.println("\n\n");
		System.out.println("Already data inputed in DataBase : "+num+"\n");
		System.out.println("How many entry do you want to add : \n");
		n=s1.nextInt();
		sum=n+num;
		for(int i=num,j=0;i<sum;i++){
			System.out.println("\n");
			System.out.println("Enter Patient Name :\n");
			x[i].name=s1.nextLine();
			System.out.println("Enter disease : \n");
			x[i].disease=s1.nextLine();
			System.out.println("Enter the age : \n");
			x[i].age=s1.nextInt();
			System.out.println("Enter the cabin no. : \n");
			x[i].cabin=s1.nextInt();
			System.out.println("Enter The Phone Number : \n");
			x[i].phone=s1.nextInt();
			System.out.println("\n");
			j++;
			a++;
			num++;

		}

	}
}
class Viewer extends AddProfile{	
	public  void View(){
		for(int i=0;i<num;i++){
			System.out.println("\n");
			System.out.println("Serial Number : "+ i+"\n");
			System.out.println("Name : "+x[i].name+"\n");
			System.out.println("Disease : "+x[i].disease+"\n");
			System.out.println("Cabin No. : "+x[i].cabin+"\n");
			System.out.println("Phone Number : "+x[i].phone+"\n");
			System.out.println("Age : "+x[i].age+"\n");
			System.out.println("\n\n");
		}

	}
}

class Searches extends Viewer{ 
public  void Search(){
		int s,h,f;
		char u[100];
		System.out.println("What do you want to search ? \n");
		System.out.println("1.Serial No.\n 2.Name\n 3.Disease\n 4.Cabin No.\n 5.Phone No.\n 6.Age\n");
		System.out.println("Option : \n");
		h=s1.nextInt();
		if(h==1){
			System.out.println("Enter the number of Serial number of the Patient \n");
			s=s1.nextInt();
			if(s<num){
				System.out.println("\n");
				System.out.println("Serial Number :"+s+"\n");
				System.out.println("Name : "+x[s].name+"\n");
				System.out.println("Disease : "+x[s].disease+"\n");
				System.out.println("Cabin No. :"+x[s].cabin+"\n");
				System.out.println("Phone No. :"+x[s].phone+"\n");
				System.out.println("Age :"+x[s].age+"\n");
			}
			else{
				System.out.println("\n\n Not Found \n\n");
			}
		}
		else if(h==2){
			int f=1;
			System.out.println("Enter your Name : \n");
			u=s1.nextLine();
			for(g=0;g<num;g++){
				if(u.equalIgnoreCase(x[g].name)){
					System.out.println("\n");
					System.out.println("Serial Number : "+g+"\n");
					System.out.println("Name : "+x[g].name+"\n");
					System.out.println("Disease : "+x[g].disease"\n");
					System.out.println("Cabin No. : "+x[g].cabin+"\n"+"Phone No. : "+x[g].phone+"\n"+"Age : "+x[g].age);
					System.out.println("\n\n");
					f=0;
				}
			}
			if(f==1){
				System.out.println("\n Not Found ");
			}
		}	
		else if(h==3){
			int f=1;
			System.out.println("Enter the Disease : \n");
			u=s1.nextLine();
			for(g=0;g<num;g++){
				if(u.equalIgnoreCase(x[g].disease){
					System.out.println("\n");
					System.out.println("Serial Number : "+(g+1)+"\n");
					System.out.println("Name : "+x[g].name+"\n");
					System.out.println("Disease : "+x[g].disease+"\n");
					System.out.println("Cabin No. : "+x[g].cabin+"\n"+"Phone No. : "+x[g].phone+"\n"+"Age : "+x[g].age);
					System.out.println("\n\n");
					f=0;
				}
			}
			if(f==1){
				System.out.println("\n Not Found ");
			}
		}	
		else if(h==4){
			int f=1;
			System.out.println("Enter the Cabin No. : \n");
			f=s1.nextInt();
			for(g=0;g<num;g++){
				if(f==x[g].cabin){
					System.out.println("\n");
					System.out.println("Serial Number : "+g);
					System.out.println("Name : "+x[g].name+"\n");
					System.out.println("Disease : "+x[g].disease+"\n");
					System.out.println("Cabin No. : "+x[g].cabin+"\n"+"Phone No. : "+x[g].phone+"\n"+"Age : "+x[g].age);
					System.out.println("\n\n");
					f=0;
				}
			}
			if(f==1){
				System.out.println("\n Not Found ");
			}
		}
		else if(h==5){
			int f=1;
			System.out.println("Enter Phone No. : \n");
			f1.s1.nextInt();
			for(g=0;g<num;g++){
				if(f==x[g].phone){
					System.out.println("\n");
					System.out.println("Serial Number : "+g+"\n");
					System.out.println("Name : "+x[g].name+"\n");
					System.out.println("Disease : "+x[g].disease+"\n");
					System.out.println("Cabin No. : "+x[g].cabin+"\n"+"Phone No. : "+x[g].phone+"\n"+"Age : "+x[g].age);
					System.out.println("\n\n");
					f=0;
				}
			}
			if(f==1){
				System.out.println("\n Not Found ");
			}
		}
        else if(h==6){
        	int f=1;
        	System.out.println("Enter the Age : \n");
        	f=s1.nextInt();
        	for(g=0;g<num;g++){
				if(f==x[g].age){
					System.out.println("\n");
					System.out.println("Serial Number : "+g+"\n");
					System.out.println("Name : "+x[g].name+"\n");
					System.out.println("Disease : "+x[g].disease+"\n");
					System.out.println("Cabin No. : "+x[g].cabin+"\n"+"Phone No. : "+x[g].phone+"\n"+"Age : "+x[g].age);
					System.out.println("\n\n");
					f=0;
				}
			}
			if(f==1){
				System.out.println("\n Not Found");
			}
		}
		else{
			System.out.println("Invalid input\n\n");
		}
}
}

interface Delete{
public static void Del(){
	Scanner s1 = new Scanner(System.in);
	int f,h;
	System.out.println("Enter the serial Number of the Patient that you want to Delete\n");
	f=s1.nextInt();
	if(f<num){
		System.out.println("What do want ?  \n");
		System.out.println("1.Remove the whole record\n2.Remove Name\n3.Remove Disease\n4.Remove age\n");
		System.out.println("5.Remove Cabin\n6.Remove phone number\n Option : "+"\n");
		h=s1.nextInt();
		if(h==1){
			while(f<num){
				x[f].name=x[f+1].name;
				x[f].disease=x[f+1].disease;
				x[f].age=x[f+1].age;
				x[f].cabin=x[f+1].cabin;
				x[f].phone=x[f+1].phone;
				f++;
			}
			num--;
		}
		else if(h==2){
			x[f].name="Cleared";
		}
		else if(h==3){
			x[f].disease="Cleared";
		}
		else if(h==4){
			x[f].age=0;
		}
		else if(h==5){
			x[f].cabin=0;
		}
		else if(h==6){
			x[f].phone=0;
		}
	}
	else{
		System.out.println("\n Invalid Serial Number\n");
	}
}
}
interface Edit{

public static void Edit(){
	    Scanner s1 = new Scanner(System.in);
		int p,q;
		System.out.println("What you want to update ? \n");
		System.out.println("Enter your Option : \n");
		System.out.println("1.Name\n 2.Disease\n 3.Age\n 4.Cabin\n 5.Phone No.\n");
		System.out.println("Enter you Options : \n");
		q=s1.nextInt();
		if(q<=5){
			System.out.println("Enter the Serial No. Of Patient : "+num-1);
			p=s1.nextInt();
			if(p<num){
				if(q==1){
					System.out.println("Enter the new name : \n");
					x[p].name=s1.nextLine();
				}
				else if(q==2){
					System.out.println("Enter the new Disease : \n");
					x[p].disease=s1.nextLine();
				}
				else if(q==3){
					System.out.println("Enter the new Age : \n");
					x[p].age=s1.nextInt();
				}
				else if(q==4){
					System.out.println("Enter the new Cabin No. : \n");
					x[p].cabin=s1.nextInt();
				}
				else if (q==5){
					System.out.println("Enter the Phone no. : \n");
					x[p].phone=s1.nextInt();
				}
			}

			else{
				try{
					throw new myException("Entered no. is greater than Serial No. \n");
				}
				catch(myException e1){
					System.out.println("Exception Caught\n");
					System.out.println(e1.getMessage());

				}
			}

		else{
			try{
				throw new myException(" Invalid Option \n Try Again !!\n\n");
			}
			catch (myException e2){
				System.out.println("Exception Caught\n");
				System.out.println(e2.getMessage());

			}
		}
	}

}
}
class Test extends Searches{}

class Main implements Delete ,Edit{

public static void main(String[] args) {

	Test t1 = new Test();
	int choice;

	do{
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("**************HospitalManagementsystem*****************\n");
		System.out.println("1.Add Information\n");
		System.out.println("2.View Information\n");
		System.out.println("3.Search Information\n");
		System.out.println("4.Edit Information\n");
		System.out.println("5.Delete Information\n");
		System.out.println("6.Exit\n");
		System.out.println("Enter Your Choice :- \n");

		choice=sc.nextInt();
		switch(choice){
			case 1:
			t1.clearScreen();
			t1.Add();
			case 2:
			t1.clearScreen();
			t1.View();
			case 3:
			t1.clearScreen();
			t1.Search();
			case 4:
			t1.clearScreen();
			Edit.Edit();
			case 5:
			t1.clearScreen();
			Delete.Del();
			case 6:
			System.exit(0);
		}

	}

	while(choice!=5);	
}
}