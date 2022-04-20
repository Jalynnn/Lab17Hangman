public class HangmanMain {

    public static void main(String[] args) {
        HangmanGame game = new HangmanGame();
        game.view.printScreen();
        String difficulty = game.view.getInput("Would you like easy or hard words? ");
        game.initializeWords(game.selectDifficulty(difficulty));
        game.wordSelect();
        game.view.getZero();
        game.printWordProgress();
        while(!game.finished){
            String guess = game.view.getInput("Guess a letter: ");
            game.guess(guess);
        }
    }
}
