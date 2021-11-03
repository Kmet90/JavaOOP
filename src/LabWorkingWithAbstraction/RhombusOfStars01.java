package LabWorkingWithAbstraction;

import java.util.Scanner;

public class RhombusOfStars01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        StringBuilder sb = new StringBuilder();
        for (int r = 1; r <= n; r++) {
            sb.append(repeatString(r - n, " "));
        }
    }

    private static String repeatString(int count, String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(s);
        }
        return sb.toString();
    }
}

//public class Rhombus {
//    private final int n;
//
//    public Rhombus(int n) {
//        this.n = n;
//    }
//
//    public String getFigure() {
//        return getTop() +
//                getMiddle() +
//                getBottom();
//    }
//
//    private String getTop() {
//        StringBuilder out = new StringBuilder();
//        for (int r = 1; r < n; r++) {
//            out.append(repeatString(n - r, " "))
//                    .append(repeatString(r, "* "))
//                    .append(System.lineSeparator());
//        }
//        return out.toString();
//    }
//
//    private String getMiddle() {
//        return repeatString(n, "* ") + System.lineSeparator();
//    }
//
//    private String getBottom() {
//        StringBuilder out = new StringBuilder();
//        for (int r = 1; r < n; r++) {
//            out.append(repeatString(r, " "))
//                    .append(repeatString(n - r, "* "))
//                    .append(System.lineSeparator());
//        }
//        return out.toString().trim();
//    }
//
//    private String repeatString(int count, String str) {
//        StringBuilder out = new StringBuilder();
//
//        for (int i = 0; i < count; i++) {
//            out.append(str);
//        }
//        return out.toString();
//    }
