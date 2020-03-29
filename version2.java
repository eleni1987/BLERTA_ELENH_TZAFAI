
import java.util.Random;
import java.util.Scanner;
import java.util.*;
public class version2{

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


        //int round=0;


               for (int round=0; round <=totalNumberOfRounds; round++){
				  System.out.println("ROUND " +round);
                    System.out.println(" Lets start the game Do you Want to Be Even Or Odd Number");
				do{
			    choiceWhatToBe=keyWord.nextLine();

			     if(choiceWhatToBe.equalsIgnoreCase("Even")){
				    System.out.println("You need to choose only  Even Number such 2 4 6 8 10");
				     System.out.println("Enter your Even number");
				                //human
				                humanNumber=keyWord.nextInt();
				               // computerNumber=random.nextInt(10)+1;//generate from 1 to 10
                                computerNumber=random.nextInt(5)*2+1;//GENERATE EVEN NUMBERS
				                System.out.println("computer number is " +  computerNumber);
					           if(humanNumber%2==0 && humanNumber<11 && humanNumber>0 &&computerNumber<11){
                                System.out.println("computer IS ODD" );
							  	System.out.println("human and computer number are right");
								}else{System.out.println(" OPPS ENTER THE EVEN NUMBER ");
								humanNumber=keyWord.nextInt();


								}


							    sum=humanNumber+computerNumber;
							    //Even winner
							    if (sum%2==0){
							      System.out.println("The Sum of two numbers is:" +sum);
								  System.out.println("The Winner is the Even Number in this case is Human");
								      humanEvenScore=roundScore+humanEvenScore;
									   if (humanNumber==10 ||humanNumber==9){
										System.out.println("HUMAN because is close to the sum will get  " + pointCloserToSumHuman);
										    humanEvenScore=humanEvenScore+pointCloserToSumHuman;
                                            }
										 if (computerNumber==10 ||computerNumber==9){
											System.out.println("COMPUTER because is close to the sum will get  " + pointCloserToSumComputer);
											computerOddScore=computerOddScore+pointCloserToSumComputer;

							                }

							   }

                                 ////ODD WINNER
							       if (sum%2!=0 ){
							         System.out.println("The Sum of two numbers is:" +sum);
							   	     System.out.println("The Winner is the ODD Number in this case is Computer");
							   		   computerOddScore=roundScore+computerOddScore;
									   	 if (computerNumber==10 ||computerNumber==9){
									   	System.out.println("COMPUTER because is close to the sum will get  " + pointCloserToSumHuman);
									   	computerOddScore=computerOddScore+pointCloserToSumHuman;
									    }
									   	if (humanNumber==10 ||humanNumber==9){
									   	System.out.println("HUMAN because is close to the sum will get  " + pointCloserToSumComputer);
									   	humanEvenScore=humanEvenScore+pointCloserToSumComputer;

							                }
							      }


                        System.out.println("humanEvenScore  " + humanEvenScore  +"  POINTS  AND    computerOddScore IS   "+ computerOddScore+ " POINTS");
					                          if(humanEvenScore>computerOddScore){
					   						   winnerTerm=humanEvenScore;
					                              System.out.println("winner of round  IS HUMAN WITH "  + winnerTerm+ " points" );
					   						   }else {winnerTerm=computerOddScore;
					   						     System.out.println("winner of round IS COMPUTER "  + winnerTerm+ " points" );

						   }
                                     System.out.println(" Lets play again for this round Do you Want to Be Even Or Odd Number");
                                     System.out.println();

								  }





          ///////IF HUMAN CHOICE IS ODD NUMBER

		     if(choiceWhatToBe.equalsIgnoreCase("ODD")){
	             computerNumber=(random.nextInt(5)+1)*2;//generate from 1 to 10
	             //computerNumber=random.nextInt(5)*2;
				 System.out.println("computer number is " +  computerNumber);
			    System.out.println("You need to choose only  ODD Number such 1 3 5 7 9");
			     System.out.println("Enter your ODD number");
				                humanNumber=keyWord.nextInt();
				      if(humanNumber%2!=0 && humanNumber<11 && humanNumber>0 && computerNumber<11   ){
					System.out.println("computer IS EVEN" );
					System.out.println("human and computer number are right");
					}else{System.out.println(" OPPS ENTER THE ODD NUMBER ");
								humanNumber=keyWord.nextInt();


						}

                   sum=humanNumber+computerNumber;
							    //Even winner
							    if (sum%2==0){
							      System.out.println("The Sum of two numbers is:" +sum);
								  System.out.println("The Winner is the Even Number in this case is COMPUTER");
								      computerEvenScore=roundScore+computerEvenScore;
									   if (humanNumber==10 ||humanNumber==9){
										System.out.println("HUMAN will get  " + pointCloserToSumHuman);
										    humanOddScore=humanOddScore+pointCloserToSumHuman;
                                            }
										 if (computerNumber==10 ||computerNumber==9){
											System.out.println("Computer will get  " + pointCloserToSumComputer);
											computerEvenScore=computerEvenScore+pointCloserToSumComputer;

							                }

							   }

                                 ////ODD WINNER
							       if (sum%2!=0 ){
							         System.out.println("The Sum of two numbers is:" +sum);
							   	     System.out.println("The Winner is the ODD Number in this case is the HUMAN");
							   		   humanOddScore=roundScore+humanOddScore;
									   	 if (computerNumber==10 ||computerNumber==9){
									   	System.out.println("COMPUTER because is close to the sum will get  " + pointCloserToSumHuman);
									   	computerEvenScore=computerEvenScore+pointCloserToSumHuman;
									    }
									   	if (humanNumber==10 ||humanNumber==9){
									   	System.out.println("human because is close to the sum will get  " + pointCloserToSumComputer);
									   	humanOddScore=humanOddScore+pointCloserToSumComputer;

							                }
							      }


                       System.out.println("humanOddScore  " + humanOddScore  +"  POINTS  AND    computerOddScore IS   "+ computerEvenScore+ " POINTS");
                       if(humanOddScore>computerEvenScore){
						   winnerTerm=humanOddScore;
                           System.out.println("winner of round  IS HUMAN WITH "  + winnerTerm+ " points" );
						   }else {winnerTerm=computerEvenScore;
						     System.out.println("winner of round IS COMPUTER "  + winnerTerm+ " points" );

						   }
                                    System.out.println(" Lets play again for this round Do you Want to Be Even Or Odd Number");
                                    System.out.println();

								  }







}while(winnerTerm!=12);

System.out.println("WINNER ROUND IS :" +winnerRound);


System.out.println();
}
}
}






