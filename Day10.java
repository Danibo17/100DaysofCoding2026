public class Day10 {
    public static void main(String[] args) {
        System.out.println("=== NILAI MINIMAL & MAKSIMAL TIPE DATA ===");
        System.out.println();

        // 1. byte
        System.out.println("byte :");
        System.out.println(" Minimal = " + Byte.MIN_VALUE);
        System.out.println(" Maksimal = " + Byte.MAX_VALUE);
        System.out.println();

        // 2. short
        System.out.println("short :");
        System.out.println(" Minimal = " + Integer.MIN_VALUE);
        System.out.println(" Maksimal = " + Short.MAX_VALUE);
        System.out.println();

        // 3. int
        System.out.println("int :");
        System.out.println(" Minimal = " + Integer.MIN_VALUE);
        System.out.println(" Maksimal = " + Integer.MAX_VALUE);
        System.out.println();

        // 4. long
        System.out.println("long :");
        System.out.println(" Minimal = " + Long.MIN_VALUE);
        System.out.println(" Maksimal = " + Long.MAX_VALUE);
        System.out.println();

        // 5. float
        System.out.println("float :");
        System.out.println(" Minimal : " + Float.MIN_VALUE);
        System.out.println(" Maksimal : " + Float.MAX_VALUE);
        System.out.println();

        // 6. double
        System.out.println("double :");
        System.out.println(" Minimal : " + Double.MIN_VALUE);
        System.out.println(" Maksimal : " + Double.MAX_VALUE);
        System.out.ptintln();

        // 7. char
        System.out.println("char :");
        System.out.println(" Minimal = " + (int)Character.MIN_VALUE + " (\\u0000)");
        System.out.println(" Maksimal = " + (int)Character.MAX_VALUE + " (\\uFFFF)");
        System.out.println();
        System.out.println("=== KESIMPULAN ===");
        System.out.println("Setiap tipe data punya batas simpan yang berbeda.");
        System.out.println("Pilih tipe data sesuai nilai yang akan disimpan!");
    }
}
