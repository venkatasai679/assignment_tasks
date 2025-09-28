class Counter1 {
    private int count;

    public Counter1() {
        this.count = 0;
    }

    public Counter1(int start) {
        this.count = start;
    }

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public int getCount() {
        return count;
    }
}
class counter{
    public static void main(String[] args) {
        Counter1 c=new Counter1(11);
        c.increment();
        System.err.println(c.getCount());
    }
}
