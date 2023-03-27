package exception;

public class TriangleEdgesCheck {
    public static void checkTriangleEdges(int a, int b, int c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0
                || a + b <= c || b + c <= a || a + c <= b) {
            throw new IllegalTriangleException("Tam giác không hợp lệ");
        }
    }
}
