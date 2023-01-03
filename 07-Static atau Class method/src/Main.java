import java.util.ArrayList;
class Player{
    private static int numberOfPlayer;
    private static ArrayList<String> namelist =new ArrayList<String>();
  
    private String name;

    Player(String name){
        this.name = name;
        Player.numberOfPlayer++;
        Player.namelist.add(this.name);
    }

    void show(){
        System.out.println("Nama player: " + this.name);

    }
    //membuat static method
    static void showNumberOfPlayer(){
        System.out.println("Number of Player : " + Player.numberOfPlayer);
    }
    static ArrayList<String> Getnames(){
        return Player.namelist;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Player player1 = new Player("messi");
    }
}