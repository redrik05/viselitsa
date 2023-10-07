public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("НОВАЯ ИГРА");
            RandomWordInSummary rwis = new RandomWordInSummary();
            StartGame start = new StartGame(rwis.getRandomWord());
            start.start();
        }
    }
}