package HW6;

public class SnakesAndLadders implements TableGame{
    @Override
    public void rollDice() {
        int rollDice=(int)(Math.random()*7);//Теперь вам может выпасть 0!
        System.out.println(rollDice);
    }

    @Override
    public void start() {
        System.out.println("Игра начинается");
    }

    @Override
    public Boolean end() {
        System.out.println("Конец игры");
        return false;
    }
}