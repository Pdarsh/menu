import java.io.*;
import java.lang.*;
import java.util.*;

class MyException extends Exception 
{
	public MyException(String s)
	{
		super(s);
	}
}


class vote1232 
{
	static int a=0;
	static int b=0;
	static int c=0;
	static int d=0;
	static int tot=0;
	
	public void voting(int n)
	{
		
		int password=1234;
		
		Scanner s1=new Scanner(System.in);
		Scanner s2=new Scanner(System.in);
		
		
		System.out.println("candidates names are as follows:\n");
		System.out.println("1. ABC\n2. XYZ\n3. PQR\n4. FGH\n5. Show Result\n");
		System.out.println("Enter your choise\n");
		
		int v=s1.nextInt();
		
		switch(v)
		{
			case 1: tot=tot+1;
							
				if(tot<=n)
				{
					a++;
				}
				else
				{
					System.out.println("'SORRY VOTE IS NOT COUNTED' AS VOTING FINISHED CHECK 'RESULT' \n");
				}	
					
				break;
				
			case 2:tot=tot+1;
				
				if(tot<=n)
				{
				 	b++;
				}
				else
				{
					System.out.println("'SORRY VOTE IS NOT COUNTED' AS VOTING FINISHED CHECK 'RESULT' \n");
				}
				break;
				
			case 3:tot=tot+1;
				
				if(tot<=n)
				{
				 	c++;
				}
				else
				{
					System.out.println("'SORRY VOTE IS NOT COUNTED' AS VOTING FINISHED CHECK 'RESULT' \n");
				}
				break;
				
			case 4: tot=tot+1;
				
				if(tot<=n)
				{
					d++;
				}
				else
				{
					System.out.println("'SORRY VOTE IS NOT COUNTED' AS VOTING FINISHED CHECK 'RESULT' \n");
				}
				break;
			
			case 5: System.out.println("Please Enter Password!!!");
				int pas=s2.nextInt();
				if(pas==password)
				{
					if(tot<n)
					{
						System.out.println("Voting is left");
					}	
					
					else
					{

						if(a>b && a>c && a>d)
						{
							System.out.println("Winner ABC by "+a+" Votes\n");
							
						}
						else if(b>c && b>d && b>a)
						{
							System.out.println("Winner XYZ by "+b+" Votes\n");
						}
						else if(c>a && c>b && c>d)
						{
							System.out.println("Winner PQR by "+c+" Votes\n");
						}
						else if(d>a && d>b && d>c)
						{
							System.out.println("Winner FGH by "+d+" Votes\n");
						}
						else if(a==b || a==c || a==d || b==c || b==d || c==d)	
						{
							System.out.println("THERE HAS BEEN A TIE SO FINAL DECISION WILL BE DECLARED LATER\n");
						}	
						else
						{
							System.out.println("No Voting has been done\n");
						}
					}
				}
				else
				{
					System.out.println("INCORRECT PASSWORD!!!\n Please enter correct password!!!");
				}	
				break;
		}
	}
		
	

	


	public static void main(String args[])throws IOException
	{

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br1= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\n---------WELCOME TO STUDENT COUNCIL ELECTIONS-------\n");
		System.out.println("Enter Number of voters\n");
		int n = Integer.parseInt(br1.readLine());
	
		int x=0;
		do
		{ 
			
			System.out.println("\nEnter\n1.For Voting Or To Check Results\n2.To Exit\n");
			int op= Integer.parseInt(br1.readLine());
			vote1232 v1= new vote1232();
			switch(op)
			{
				case 1:try
					{
						System.out.println("Enter your Age");
						int Age= Integer.parseInt(br.readLine());
						if(Age<18)
						{
							throw new MyException("Not allowed to vote");
						}
						else
						{
							System.out.println("Welcome to voter's group");
							 v1.voting(n);
						}
					}
					catch(MyException ex)
					{
						System.out.println("Exception caught");
						System.out.println(ex.getMessage());
					}
					break;
				
				case 2: x=3; break;
				
				default : System.out.println("INVALID CHOICE!!!!");
			}
		}while(x!=3);
	}
}


