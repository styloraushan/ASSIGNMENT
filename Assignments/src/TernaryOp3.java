public class TernaryOp3 {
    int a = 15;
    int b = 42;
    int c = 37;
    int d = 29;
    int e = 56;
    int f = 48;

    public void printMax() {
        // Using nested ternary operators to find and print the maximum value
        int max = (a > b ? a : b) > (c > d ? c : d) ?
                ((a > b ? a : b) > (e > f ? e : f) ? (a > b ? a : b) : (e > f ? e : f)) :
                ((c > d ? c : d) > (e > f ? e : f) ? (c > d ? c : d) : (e > f ? e : f));

        System.out.println("The maximum value is: " + max);
    }

    public static void main(String[] args) {
       TernaryOp3 finder = new  TernaryOp3();
        finder.printMax();
    }
}
