public class Main {
    public static void main(String[] args) {
        System.out.println("\nTask 1");
        int[] a = new int[]{1, 2, 3};
        double[] b = {1.57, 7.654, 9.986};
        String[] c = {"Veni", "vidi", "vici"};

        System.out.println("\nTask 2");
        for (int i = 0; i < a.length - 1; i++) {
            System.out.print("«" + a[i] + "», ");
        }
        System.out.println("«" + a[a.length - 1] + "».");
        // Решил попробовать массив «а» оформить красивее. Надеюсь такое разрешено.

        for (int i = 0; i < b.length - 1; i++) {
            System.out.print(b[i] + ", ");
        }
        System.out.println(b[b.length - 1] + ".");

        for (int i = 0; i < c.length - 1; i++) {
            System.out.print(c[i] + ", ");
        }
        System.out.println(c[c.length - 1] + ".");

        System.out.println("\nTask 3");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print("«" + a[i]);
            if (i != 0) {
                System.out.print("», ");
            }
            if (i == 0) {
                System.out.print("».");
            }
        }
        System.out.println();

        for (int i = a.length - 1; i > 0; i--) {
            System.out.print("«" + a[i] + "», ");
        }
        System.out.println("«" + a[0] + "».");

        // Прошу, подскажите пожалуйста, какой вариант стоит использовать, 1-ый или 2-ой?


        for (int i = b.length - 1; i >= 0; i--) {
            System.out.print(b[i]);
            if (i != 0) {
                System.out.print(", ");
            }
            if (i == 0) {
                System.out.print(".");
            }
        }
        System.out.println();

        for (int i = c.length - 1; i >= 0; i--) {
            System.out.print(c[i]);
            if (i != 0) {
                System.out.print(", ");
            }
            if (i == 0) {
                System.out.print(".");
            }
        }
        System.out.println();

        System.out.println("\nTask 4");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                a[i]++;
            }
            System.out.print(a[i] + " ");
        }
    }
}
