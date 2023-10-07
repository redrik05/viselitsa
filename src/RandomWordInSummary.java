import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class RandomWordInSummary {

    private String randomWord;
    private int randomLine;

    public String getRandomWord() {
        try (BufferedReader bf = new BufferedReader(new FileReader("summary.txt"))) {
            randomLine = (int) (Math.random() * 49723);
            for (int i = 1; i <= randomLine; i++) {
                bf.readLine();
                if (i == randomLine) {
                    randomWord = bf.readLine();
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return randomWord.toLowerCase();
    }

}
