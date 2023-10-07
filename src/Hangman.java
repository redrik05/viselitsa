public class Hangman {
    private String[] hangman = {
            """
            ........................................
            
            ....#WWW=...............................
            
            .---#WWW#-----------------------------..
            
            .@WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW=..
            
            .@WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW=..
       
            """,
            """
            ........................................
            
            ....#WWW=...............................
            
            .---#WWW#-----------------------------..
            
            .@WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW=..
            
            .@WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW=..
            
            ....#WWW=..:WWW*............=+..........
            
            ....#WWW=-@WW#..............=+..........
            
            ....#WWWWWWW:...............=+..........
            
            ....#WWWWW*.................=+..........
            
           
            """,
            """
            ........................................
            
            ....#WWW=...............................
            
            .---#WWW#-----------------------------..
            
            .@WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW=..
            
            .@WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW=..
            
            ....#WWW=..:WWW*............=+..........
            
            ....#WWW=-@WW#..............=+..........
            
            ....#WWWWWWW:...............=+..........
            
            ....#WWWWW*.................=+..........
            
            ....#WWW@...................=+..........
            
            ....#WWW=...................=+..........
            
            ....#WWW=.................:#@=..........
            
            ....#WWW=....----........*WWWWW.........
            
            ....#WWW=..-..............=#WW+.........
    
            """,
            """
            ........................................
            
            ....#WWW=...............................
            
            .---#WWW#-----------------------------..
            
            .@WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW=..
            
            .@WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW=..
            
            ....#WWW=..:WWW*............=+..........
            
            ....#WWW=-@WW#..............=+..........
            
            ....#WWWWWWW:...............=+..........
            
            ....#WWWWW*.................=+..........
            
            ....#WWW@...................=+..........
            
            ....#WWW=...................=+..........
            
            ....#WWW=.................:#@=..........
            
            ....#WWW=....----........*WWWWW.........
            
            ....#WWW=..-..............=#WW+.........
            
            ....#WWW=..-.----..----:#@##WWWW=.......
            
            ....#WWW=..-.......--..#W@@#WWWWW:......
            
            ....#WWW=..-.......-...#W#@#WWW@W:......
            
            ....#WWW=..-.........--=@=##WWW@W:......
            

            """,
            """
            ........................................
            
            ....#WWW=...............................
            
            .---#WWW#-----------------------------..
            
            .@WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW=..
            
            .@WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW=..
            
            ....#WWW=..:WWW*............=+..........
            
            ....#WWW=-@WW#..............=+..........
            
            ....#WWWWWWW:...............=+..........
            
            ....#WWWWW*.................=+..........
            
            ....#WWW@...................=+..........
            
            ....#WWW=...................=+..........
            
            ....#WWW=.................:#@=..........
            
            ....#WWW=....----........*WWWWW.........
            
            ....#WWW=..-..............=#WW+.........
            
            ....#WWW=..-.----..----:#@##WWWW=.......
            
            ....#WWW=..-.......--..#W@@#WWWWW:......
            
            ....#WWW=..-.......-...#W#@#WWW@W:......
            
            ....#WWW=..-.........--=@=##WWW@W:......
            
            ....#WWW=..............=@#@@WWW@W:......
            
            ....#WWW=..............*@#WWWWW=@-......
            
            ....#WWW=................*WW#WW-........
            
            ....#WWW=................*WW#WW-........
            

            """,
            """
            ........................................
            
            ....#WWW=...............................
            
            .---#WWW#-----------------------------..
            
            .@WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW=..
            
            .@WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW=..
            
            ....#WWW=..:WWW*............=+..........
            
            ....#WWW=-@WW#..............=+..........
            
            ....#WWWWWWW:...............=+..........
            
            ....#WWWWW*.................=+..........
            
            ....#WWW@...................=+..........
            
            ....#WWW=...................=+..........
            
            ....#WWW=.................:#@=..........
            
            ....#WWW=....----........*WWWWW.........
            
            ....#WWW=..-..............=#WW+.........
            
            ....#WWW=..-.----..----:#@##WWWW=.......
            
            ....#WWW=..-.......--..#W@@#WWWWW:......
            
            ....#WWW=..-.......-...#W#@#WWW@W:......
            
            ....#WWW=..-.........--=@=##WWW@W:......
            
            ....#WWW=..............=@#@@WWW@W:......
            
            ....#WWW=..............*@#WWWWW=@-......
            
            ....#WWW=................*WW#WW-........
            
            ....#WWW=................*WW#WW-........
            
            ....#WWW=................*WW#WW-........
            
            ....#WWW=................*WW#WW-........
            
            ....#WWW=................*WW#WW-........
            
            ....#WWW=................*WW*W@.........

            """,
            """
            ........................................
            
            ....#WWW=...............................
            
            .---#WWW#-----------------------------..
            
            .@WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW=..
            
            .@WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW=..
            
            ....#WWW=..:WWW*............=+..........
            
            ....#WWW=-@WW#..............=+..........
            
            ....#WWWWWWW:...............=+..........
            
            ....#WWWWW*.................=+..........
            
            ....#WWW@...................=+..........
            
            ....#WWW=...................=+..........
            
            ....#WWW=.................:#@=..........
            
            ....#WWW=....----........*WWWWW.........
            
            ....#WWW=..-..............=#WW+.........
            
            ....#WWW=..-.----..----:#@##WWWW=.......
            
            ....#WWW=..-.......--..#W@@#WWWWW:......
            
            ....#WWW=..-.......-...#W#@#WWW@W:......
            
            ....#WWW=..-.........--=@=##WWW@W:......
            
            ....#WWW=..............=@#@@WWW@W:......
            
            ....#WWW=..............*@#WWWWW=@-......
            
            ....#WWW=................*WW#WW-........
            
            ....#WWW=................*WW#WW-........
            
            ....#WWW=................*WW#WW-........
            
            ....#WWW=................*WW#WW-........
            
            ....#WWW=................*WW#WW-........
            
            ....#WWW=................*WW*W@.........
            
            ....#WWW=...............................
            
            ....#WWW=...............................
            
            ....#WWW=...............................
            
            ........................................
            """,
    };

    private int countMistakes = 0;

    public void getHangman() {
        if (countMistakes >= hangman.length - 1) {
            System.out.println(hangman[countMistakes]);
            System.out.println("Осталось попыток: " + (hangman.length - (countMistakes + 1)));
            System.out.println("ИГРА ОКОНЧЕНА, ВЫ ПРОИГРАЛИ");
        } else {
            System.out.println(hangman[countMistakes]);
            System.out.println("Осталось попыток: " + (hangman.length - (countMistakes + 1)));
        }
        countMistakes++;
    }

    public int getCountMistakes() {
        return countMistakes;
    }

}







