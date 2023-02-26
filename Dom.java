package HW6;

public class Dom {
    public static void main(String[] args) {
        CounterStrike cs16=new CounterStrike();
        cs16.start();
        cs16.move();
        cs16.shoot();
        cs16.end();
        CounterStrike CSGO=new CounterStrike();
        CSGO.start();
        CSGO.move();
        CSGO.shoot();
        CSGO.end();
        SnakesAndLadders game1=new SnakesAndLadders();
        game1.start();
        game1.rollDice();
        game1.end();
        SnakesAndLadders game2=new SnakesAndLadders();
        game2.start();
        game2.rollDice();
        game2.end();
    }
}