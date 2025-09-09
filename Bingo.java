public class Bingo {
    private String[] lyrics = {"B", "I", "N", "G", "O"};

 
    public Bingo() {
        sing();
    }

    public void sing() {
        for (int clapCount = 0; clapCount <= lyrics.length; clapCount++) {
            System.out.println("There was a farmer who had a dog,");
            System.out.println("And Bingo was his name-o.");

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < lyrics.length; j++) {
                    if (j < clapCount) {
                        System.out.print("(clap)");
                    } else {
                        System.out.print(lyrics[j]);
                    }
                    if (j < lyrics.length - 1) System.out.print("-");
                }
                System.out.println();
            }
            System.out.println("And Bingo was his name-o.\n");
        }
    }

    public static void main(String[] args) {
        new Bingo();
    }
}
