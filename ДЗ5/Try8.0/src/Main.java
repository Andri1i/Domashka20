class Main {

    static boolean getParity(int n) {
        boolean parity = false;
        while (n != 0) {
            parity = !parity;
            n = n & (n - 1);
        }
        return parity;

    }


    public static void main(String[] args) {
        int n = 11;
        System.out.println("Парне число? " + n + " = " +
                (getParity(n) ? "Ні" : "Так"));
    }
}