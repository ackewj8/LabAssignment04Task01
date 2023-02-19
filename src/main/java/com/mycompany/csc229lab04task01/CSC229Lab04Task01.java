/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc229lab04task01;
import java.util.Scanner;

/**
 *
 * @author willi
 * GitHub Link: https://github.com/ackewj8/LabAssignment04Task01.git
 */
public class CSC229Lab04Task01 {
    // 1 + 1 + n = 2 + n -> n
    // The runtime complexity of countDown is O(n)
    
    // int num's complexity is 1
    static void countDown(int num) {
        if (num == 0) // test
            // runs 1 time
            System.out.println("Blastoff!");
        else {
            // Printed until num reaches 0
            // runs n times
            System.out.println("...");
            countDown(num - 1); // recursive call
        }
    }
    public static void main(String[] args) {
        // Used to read the user's input
        Scanner scnr = new Scanner(System.in);
        int num; // How many seconds until blastoff
        System.out.println("How many seconds until blast off?: ");
        num = scnr.nextInt(); // Reading the user's input
        countDown(num); // Calling the countDown function
    }
}
