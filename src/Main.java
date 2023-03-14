public class Main {
    public static void main(String[] args) {
       OnTaskDoneListener listener = System.out::println;
       OnTaskErrorListener error = ()->33;
       
       Worker worker  = new Worker(listener, error);
       worker.start();
    }
}