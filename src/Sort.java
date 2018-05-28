public abstract class Sort implements Sortable {
    public abstract void sort(int[] a);

    protected static void print(final int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(' ');
            System.out.print(a[i]);
        }
    }
}
