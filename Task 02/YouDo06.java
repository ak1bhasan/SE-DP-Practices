class Applet{
    void launch() {
        System.out.println("Applet launched");
    }
}

class GameApplet extends Applet {
    void play() {
        System.out.println("Playing game");
    }
}

public class YouDo06 {
    public static void main(String[] args) {
        GameApplet game = new GameApplet();

        game.launch();
        game.play();
    }
}
