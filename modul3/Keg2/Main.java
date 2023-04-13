public class Main {
    public void queue(){
        Keg2 q = new Keg2(5);
        q.enqueue("satu");
        q.enqueue("dua");
        q.enqueue("tiga");
        q.enqueue("empat");

        System.out.println("remove : " + q.dequeue());
        System.out.println("element : " + q.peek());
        System.out.println("poll : " + q.dequeue());
        System.out.println("peek : " + q.peek());
    }

    public static void main(String[] args) {
        new Main().queue();
    }
}