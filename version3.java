
import java.util.Random;
import java.util.Scanner;
import java.util.*;


//the winner always will be odd Player because the two players always will be the one
//Even or the other odd and always the sum of an even or odd number will give always odd number
public class version3{

	public static void main (String args[]){
		Random random=new Random();
		//variable

		int humanNumber=0;
		int computerNumber=0;
		int totalNumberOfScore=12;
		String choiceWhatToBe="";
		 int winnerTerm=0;
		Scanner keyWord=new Scanner(System.in);

		int humanEvenScore=0;
		int humanOddScore=0;
		int evenScore=0;
		int oddScore=0;
		int computerEvenScore=0;
		int computerOddScore=0;

		int pointCloserToSumComputer=2;
		int pointCloserToSumHuman=2;
		String winnerOfRoundComputer="COMPUTER";
		String winnerOfRoundHuman="HUMAN";
		int winnerRound=0;


	    int humanEvenWinner=0;
	    int humanOddWinner=0;
	    int ComputerEvenWinner=0;
        int ComputerOddWinner=0;

        int totalNumberOfRounds=4;

		int sum=0;
	    int  roundScore=3;
	    int humanWinner=0;
	    int computerWinner=0;
	    int winner=0;


        //int round=0;


               for (int round=1; round <=3; round++){
				  System.out.println("ROUND " +round);
                    System.out.println(" Lets start the game Do you Want to Be Even Or Odd Number");
				do{
			    choiceWhatToBe=keyWord.nextLine();

			     if(choiceWhatToBe.equalsIgnoreCase("Even")){
				    System.out.println("You need to choose only  Even Number such 2 4 6 8 10");
				     System.out.println("Enter your Even number");
				                //human
				                humanNumber=keyWord.nextInt();
                                computerNumber=random.nextInt(5)*2+1;//GENERATE ODD  NUMBERS
				                System.out.println("computer number is " +  computerNumber + " AND IS ODD");
					           if(humanNumber%2==0 && humanNumber<11 && humanNumber>0 &&computerNumber<11){
								}else{System.out.println(" OPPS ENTER THE EVEN NUMBER ");// IF HUMAN WILL ADD AN NUMBER THAT IS NOT EVEN, HE NEEDS TO REENTER NUMBER AFTER MESSAGE
								humanNumber=keyWord.nextInt();
								}

							    sum=humanNumber+computerNumber;

                                 //// THE ODD WINNER PROCESS
							       if (sum%2!=0 ){
							         System.out.println("The Sum of two numbers is:" +sum);
							   	     System.out.println("The Winner is the ODD Number in this case is Computer and gets 3 poinnts");
							   		   computerOddScore=roundScore+computerOddScore;
									   	 if (computerNumber==10 ||computerNumber==9){
									   	computerOddScore=computerOddScore+pointCloserToSumComputer;
	 System.out.println("COMPUTER because is close to the sum will get EXTRA 2 POINTS AND HIS TOTAL POINTS FROM ROUND ARE  5 POINTS");
									    }
									   	if (humanNumber==10 ||humanNumber==9){
									   	humanEvenScore=humanEvenScore+pointCloserToSumHuman;
     System.out.println("HUMAN because is close to the sum will get EXTRA 2 POINTS AND HIS TOTAL POINTS FROM ROUND ARE " + pointCloserToSumHuman);

							                }
							      }
                                           //CHECK WINNER TERM
					                          if(humanEvenScore>computerOddScore){
					   						   winnerTerm=humanEvenScore;

					   						   }else {winnerTerm=computerOddScore;}


                          //CHECK FOR WINNER
						   humanWinner=humanEvenScore+humanOddScore;
                           computerWinner=computerOddScore+computerEvenScore;
                        if(humanWinner>computerWinner){
						  winner=humanWinner;
						}else {winner=computerWinner;
						 } System.out.println();
						 	round++;
						 	System.out.println("ROUND " +round);
						    System.out.println(" Lets play again for NEXT  round Do you Want to Be Even Or Odd Number");

           }

          ///////IF HUMAN CHOICE IS ODD NUMBER

		     if(choiceWhatToBe.equalsIgnoreCase("ODD")){
	             computerNumber=(random.nextInt(5)+1)*2;//generate ODD NUMBERS

		           System.out.println("You need to choose only  ODD Number such 1 3 5 7 9");
		            System.out.println("Enter your ODD number");
		              humanNumber=keyWord.nextInt();
			         System.out.println("computer number is " +  computerNumber + "  AND IS EVEN");
				      if(humanNumber%2!=0 && humanNumber<11 && humanNumber>0 && computerNumber<11   ){
					}else{System.out.println(" OPPS ENTER THE ODD NUMBER ");// IF HUMAN WILL ADD AN NUMBER THAT IS NOT ODD, HE NEEDS TO REENTER NUMBER AFTER MESSAGE
							humanNumber=keyWord.nextInt();

						}

                            sum=humanNumber+computerNumber;

                                 //// THE ODD WINNER PROCESS
							       if (sum%2!=0 ){
							         System.out.println("The Sum of two numbers is:" +sum);
							   	     System.out.println("The Winner is the ODD Number in this case is the HUMAN and gets 3 points ");
							   		   humanOddScore=roundScore+humanOddScore;
									   	 if (computerNumber==10 ||computerNumber==9){
											 computerEvenScore=computerEvenScore+pointCloserToSumComputer;
	 System.out.println("COMPUTER because is close to the sum will get EXTRA  2 POINTS AND HIS TOTAL POINTS FROM THE ROUND ARE  " + pointCloserToSumComputer);

									    }
									   	if (humanNumber==10 ||humanNumber==9){
										humanOddScore=humanOddScore+pointCloserToSumHuman;
    System.out.println("HUMAN because is close to the sum will get EXTRA  2 POINTS AND HIS TOTAL POINTS FROM ROUND ARE 5 POINTS");
							                }
							      }

                        //CHECK THE WINNER TERM
                       if(humanOddScore>computerEvenScore){
						   winnerTerm=humanOddScore;
						   humanWinner=humanEvenScore+humanOddScore;
						   }else {winnerTerm=computerEvenScore;
						   computerWinner=computerOddScore+computerEvenScore;
						   }

                       // CHECK FOR WINNER IN ALL ROUNDS

                         humanWinner=humanEvenScore+humanOddScore;
                        computerWinner=computerOddScore+computerEvenScore;
                        if(humanWinner>computerWinner){
						winner=humanWinner;
						}else {winner=computerWinner;
						 } System.out.println();
		                  round++;
						   System.out.println("ROUND " +round);
						  System.out.println(" Lets play again for NEXT  round Do you Want to Be Even Or Odd Number");

								  }

}while(winner<=12);
              System.out.println("humanwinner  " + humanWinner  +"  TOTAL POINTS computer winner "+ computerWinner+ " TOTAL POINTS  FINAL winner   "+ winner + "POINTS");
              System.out.println("humanEvenScore  " + humanEvenScore  +"  POINTS  AND    computerOddScore IS   "+ computerOddScore+ " POINTS");
              System.out.println("humanOddScore  " + humanOddScore  +"  POINTS  AND    computerEvenScore IS   "+ computerEvenScore+ " POINTS");

System.out.println("WINNER OF THE GAME HAS :  " + winner +  " POINTS");
System.out.println();
}
}
}






