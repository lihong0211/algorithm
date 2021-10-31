import org.jetbrains.annotations.NotNull;

public class LinearSearch {
    private LinearSearch() {}

    public static <E> int search(E [] data, E target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(target)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String [] args) {
//        Integer[] data = { 21, 23, 37, 41, 5, 62 };
//        int res = LinearSearch.search(data, 62);
//        System.out.println(res);
//
//        int res1 = LinearSearch.search(data, 666);
//        System.out.println(res1);
//
//        Student[] students = {
//                new Student("lijunyi"),
//                new Student("Lihong"),
//                new Student("linyao"),
//                new Student("ruofei")
//        };
//        Student lihong = new Student("lihong");
//        int res2 = LinearSearch.search(students, lihong);
//        System.out.println(res2);

        Integer[] dataSize = { 1000000, 10000000 };
        for (int n: dataSize) {
            Integer[] arr = ArrayGenerator.generateOrderedArray(n);
            long startTime = System.nanoTime();
            for (int k = 0; k < 100; k++) {
                LinearSearch.search(arr, n);
            }
            int res3 = LinearSearch.search(arr, n);
            long endTime = System.nanoTime();
            double time = (endTime - startTime) / 1000000.0;
            System.out.println("n=" + n + ", 100 runs: " + time + "ms");
        }
    }
}
