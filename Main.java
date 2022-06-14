//add import statements

import java.text.DecimalFormat;

/***************************************************************
 Filename: Density
 Created by: Melat Zerai
 Created on: 9/29/2021
 Comment: calculate density from the given mass and volume
 ***************************************************************/
class Main 
{
  public static void main(String[] args) 
  {
         DecimalFormat df= new DecimalFormat("#0.00##"); // our varibles would have a two decimal place

        double Mass = 40 ;
        double Volume = 8;
        double density;
        density = Mass/Volume;
        System.out.println("Mass = " + Mass + " kg\n" +  "Volume = " + Volume +" metres cubed");
        System.out.println("Density = " + df.format(density) + " kg per metre cubed");


  }//main
}//class