import java.util.Scanner;

public class StartGame {
    private Scanner sc; // сканнер для считывания букв с консоли
    private String secretWord; //загаданное слово
    private String[] guessedWord; // массив букв секретного слова для удобства манипуляций и сравнений
    private String[] secretWordArray; // массив для постепенного заполнения отгаданными буквами
    private int count;
    Hangman hangman;
    StartEndGame endGame;
    String alreadyChars; // буквы, которые уже были введены и не подошли

    public StartGame(String secretWord) {
        System.out.println(secretWord);
        hangman = new Hangman();
        endGame = new StartEndGame();
        sc = new Scanner(System.in);
        this.secretWord = secretWord;
        guessedWord = new String[secretWord.length()];
        secretWordArray = secretWord.split("");
        count = 0;
        alreadyChars = "";

        for (int i = 0; i < secretWordArray.length; i++) {
            guessedWord[i] = "#";
        }
    }

    public void start() {
        while (true) {
            System.out.println("Введите букву");
            String character = sc.nextLine().toLowerCase();

            if (alreadyChars.contains(character)) {
                System.out.println("Такая буква уже была");
            } else if (!secretWord.contains(character) && !alreadyChars.contains(character)) {
                hangman.getHangman();
                alreadyChars = alreadyChars + character;
            } else {
                System.out.println("Вы отгадали букву");
                alreadyChars = alreadyChars + character;
                if (secretWord.contains(character)) {
                    for (int i = 0; i < secretWordArray.length; i++) {
                        if (secretWordArray[i].equals(character)) {
                            count++;
                            guessedWord[i] = character;
                        }
                    }
                }
                for (String x: guessedWord){
                    System.out.print(x);
                }
                System.out.println("");
            }

            if (count == secretWordArray.length) {
                System.out.println("и вы отгадали слово целиком");
                System.out.println("ПОЗДРАВЛЯЕМ С ПОБЕДОЙ");
                break;
            } else if (hangman.getCountMistakes() == 7) {
                break;
            }
        }
        endGame.startEndGame();
    }
}
