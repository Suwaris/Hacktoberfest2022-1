public class NestedRecursion {
    
    public static void main(String[] args) {
        int num = nestedRecursion(90);
        System.out.println(num);
    }
    
    public static int nestedRecursion(int n) {
        if (n > 100) {
            return n - 10;
        }

        return nestedRecursion(nestedRecursion(n + 11));
    }
}
