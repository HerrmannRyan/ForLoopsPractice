import java.util.Scanner;

public class ForLoopPractice
	{

		static Scanner userInput = new Scanner (System.in);
		
		public static void main(String[] args)
			{
				//printDonuts();
				//ascendAndDescend();
				//printMultiplesOfFive();
				//totalNumbers();
				sumNumbersInUsersRange();

			}

		public static void printDonuts()
			{
				for(int i = 1; i <= 5; i++)
				{
					System.out.println("I love Donuts!!");	
				}
				
			}

		public static void ascendAndDescend()
			{
				for(int i = 1; i <= 5; i ++)
				{
					System.out.println(i);

				}
				for(int i = 5; i >= 0; i--)
				{
					System.out.println(i);	
				}
				
			}

		public static void printMultiplesOfFive()
			{
				
				for(int i = 5; i <= 100; i+=5)
				{
					System.out.println(i);	
				}
				
			}

		public static void totalNumbers()
			{
				int sum = 0;
				for(int i = 5; i <= 100; i+=5)
				{
					sum += i;	
				}
				System.out.println("The sum is equal to " + sum);
			}

		public static void sumNumbersInUsersRange()
			{
				
			 System.out.println("Please put in the lower bound.");
			 int lowerBound = userInput.nextInt();
			 System.out.println("Please put in the upper bound.");
			 int upperBound = userInput.nextInt();
			 
			 for(int i = lowerBound; i <= upperBound; i++)
			 {
				 lowerBound ++;
				 System.out.println(lowerBound);
			 }
			 
			 //System.out.println("The sum of all of these Numbers is " + lowerBound);
			
			}

	}
