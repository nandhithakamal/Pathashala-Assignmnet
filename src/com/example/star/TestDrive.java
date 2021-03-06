package com.example.star;


import java.util.Scanner;

public class TestDrive{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Star");
        Star s = new Star();
        s.printStar();

        System.out.println();
        System.out.println("\nHorizontal line of stars");
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        s.printHorizontalLineOfStars(n);

        System.out.println();
        System.out.println("\nVertical line of stars");
        System.out.print("Enter a number: ");
        n = scanner.nextInt();
        s.printVerticalLineOfStars(n);
        System.out.println();

        System.out.println("\nRight triangle");
        RightTriangle rt = new RightTriangle();
        System.out.print("Enter a number: ");
        n = scanner.nextInt();
        rt.printTriangle(n);

        System.out.println("\nIsosceles triangle");
        IsoscelesTriangle it = new IsoscelesTriangle();
        System.out.print("Enter a number: ");
        n = scanner.nextInt();
        it.printTriangle(n);

        System.out.println("\nDiamond");
        Diamond d = new Diamond();
        System.out.print("Enter a number: ");
        n = scanner.nextInt();
        d.printDiamond(n);

        System.out.println("\nEngraved Diamond");
        EngravedDiamond ed = new EngravedDiamond();
        System.out.print("Enter a number: ");
        n = scanner.nextInt();
        ed.printDiamond(n);

    }
}
