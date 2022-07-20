package demo;

	import java.util.Scanner;
	public class emailValidation {
		public static void main(String[] args)
				{
		       System.out.println("Enter no of email id");
				Scanner sc = new Scanner(System.in);
				int m = sc.nextInt();
				String str[] = new String[m];
				for(int i=0; i<m ; i++)
				{
					System.out.println("Enter email id");
					str[i] = sc.next();
				}
				System.out.println("Enter email id to be searched: ") ;
				String sr  = sc.next();
				boolean flag = false ; 
				for(int i=0; i<m ; i++)
				{
					if(sr.equals(str[i]))
					{
					System.out.println("Required email id found at: "+(i+1));
				flag = true ;
					}
				}
			       if(!flag)
						System.out.println("Given email id is not in the array");
				}
				
			}