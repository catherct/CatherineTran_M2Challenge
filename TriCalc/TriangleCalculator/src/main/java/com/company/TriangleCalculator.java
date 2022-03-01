package com.company;

import java.util.Scanner;

public class TriangleCalculator {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);


        System.out.println("Enter length of adjacent side of right triangle.");
            int adj = Integer.parseInt(scan.nextLine());

        System.out.println("Enter length of opposite side of right triangle.");
            int opp = Integer.parseInt(scan.nextLine());


        double hyp = Math.sqrt((adj * adj) + (opp * opp)); // a^2 + b^2 = c^2
            System.out.println("The length of hypotenuse is... " + hyp);


//            System.out.println("The value of sine of the given angle is... " + Math.sin(hyp));
//            System.out.println("The value of cosine of the given angle is... " + Math.cos(hyp));
//            System.out.println("The value of tangent of the given angle is... " + Math.tan(hyp));

    }
}
