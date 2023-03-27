package view;

import config.InputConfig;
import exception.IllegalTriangleException;
import exception.TriangleEdgesCheck;

public class Main {
    public static void main(String[] args) {
        System.out.print("Input a: ");
        int a = InputConfig.getInteger();
        System.out.print("Input b: ");
        int b = InputConfig.getInteger();
        System.out.print("Input c: ");
        int c = InputConfig.getInteger();
        try {
            TriangleEdgesCheck.checkTriangleEdges(a, b, c);
        } catch (IllegalTriangleException e) {
            e.printStackTrace();
        }
        System.out.println("To be continue!!!");
    }
}
