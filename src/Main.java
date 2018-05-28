public class Main {
    private static Sortable insertionSort = new InsertionSort();

    public static void main(String[] args) {
        int [] a = {2, 1, 4 , 10, 9, 7, 8};

        insertionSort.sort(a);
    }
}
