package com.nathan;

import java.util.Date;
public class Main {

    public static void main(String[] args) {
        //Create 2D array of all the digits
        String[][] clockNumbers = new String[11][7];
        clockNumbers[0][0] = " --  ";
        clockNumbers[0][1] = "|  | ";
        clockNumbers[0][2] = "|  | ";
        clockNumbers[0][3] = "     ";
        clockNumbers[0][4] = "|  | ";
        clockNumbers[0][5] = "|  | ";
        clockNumbers[0][6] = " --  ";

        clockNumbers[1][0] = "   | ";
        clockNumbers[1][1] = "   | ";
        clockNumbers[1][2] = "   | ";
        clockNumbers[1][3] = "     ";
        clockNumbers[1][4] = "   | ";
        clockNumbers[1][5] = "   | ";
        clockNumbers[1][6] = "   | ";

        clockNumbers[2][0] = " --  ";
        clockNumbers[2][1] = "   | ";
        clockNumbers[2][2] = "   | ";
        clockNumbers[2][3] = " --  ";
        clockNumbers[2][4] = "|    ";
        clockNumbers[2][5] = "|    ";
        clockNumbers[2][6] = " --  ";

        clockNumbers[3][0] = " --  ";
        clockNumbers[3][1] = "   | ";
        clockNumbers[3][2] = "   | ";
        clockNumbers[3][3] = " --  ";
        clockNumbers[3][4] = "   | ";
        clockNumbers[3][5] = "   | ";
        clockNumbers[3][6] = " --  ";

        clockNumbers[4][0] = "     ";
        clockNumbers[4][1] = "|  | ";
        clockNumbers[4][2] = "|  | ";
        clockNumbers[4][3] = " --  ";
        clockNumbers[4][4] = "   | ";
        clockNumbers[4][5] = "   | ";
        clockNumbers[4][6] = "     ";

        clockNumbers[5][0] = " --  ";
        clockNumbers[5][1] = "|    ";
        clockNumbers[5][2] = "|    ";
        clockNumbers[5][3] = " --  ";
        clockNumbers[5][4] = "   | ";
        clockNumbers[5][5] = "   | ";
        clockNumbers[5][6] = " --  ";

        clockNumbers[6][0] = " --  ";
        clockNumbers[6][1] = "|    ";
        clockNumbers[6][2] = "|    ";
        clockNumbers[6][3] = " --  ";
        clockNumbers[6][4] = "|  | ";
        clockNumbers[6][5] = "|  | ";
        clockNumbers[6][6] = " --  ";

        clockNumbers[7][0] = " --  ";
        clockNumbers[7][1] = "   | ";
        clockNumbers[7][2] = "   | ";
        clockNumbers[7][3] = "     ";
        clockNumbers[7][4] = "   | ";
        clockNumbers[7][5] = "   | ";
        clockNumbers[7][6] = "     ";

        clockNumbers[8][0] = " --  ";
        clockNumbers[8][1] = "|  | ";
        clockNumbers[8][2] = "|  | ";
        clockNumbers[8][3] = " --  ";
        clockNumbers[8][4] = "|  | ";
        clockNumbers[8][5] = "|  | ";
        clockNumbers[8][6] = " --  ";

        clockNumbers[9][0] = " --  ";
        clockNumbers[9][1] = "|  | ";
        clockNumbers[9][2] = "|  | ";
        clockNumbers[9][3] = " --  ";
        clockNumbers[9][4] = "   | ";
        clockNumbers[9][5] = "   | ";
        clockNumbers[9][6] = " --  ";

        clockNumbers[10][0] = "     ";
        clockNumbers[10][1] = " --  ";
        clockNumbers[10][2] = "|  | ";
        clockNumbers[10][3] = " --  ";
        clockNumbers[10][4] = " --  ";
        clockNumbers[10][5] = "|  | ";
        clockNumbers[10][6] = " --  ";

        //Instantiate a Date Object
        Date currentTime = new Date();
        //Display time and date
        String str = String.format("%tc", currentTime);
        System.out.println(str);

        //Variables to hold 4 digits of number with substring
        int firstNum = Integer.parseInt(str.substring(11,12));
        int secondNum = Integer.parseInt(str.substring(12,13));
        int thirdNum = Integer.parseInt(str.substring(14,15));
        int fourthNum = Integer.parseInt(str.substring(15,16));

        //Print out the time with the array
        for(int i = 0; i < 7; i++){
            System.out.print(clockNumbers[firstNum][i]);
            System.out.print(clockNumbers[secondNum][i]);
            System.out.print(clockNumbers[10][i]);
            System.out.print(clockNumbers[thirdNum][i]);
            System.out.print(clockNumbers[fourthNum][i]);
            System.out.println();
        }
    }
}
