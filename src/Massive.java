public class Massive {
    public static void main(String[] args) {
        String[] a = {"Каждый ", " охотник ", " желает ", " знать ", " где ", " сидит ", " фазан "};

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }

        int n = a.length;

        String change;

        for (int i = 0; i < n / 2; i++) {
            change = a[n - i - 1];
            a[n - i - 1] = a[i];
            a[i] = change;
        }

        System.out.println();

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}