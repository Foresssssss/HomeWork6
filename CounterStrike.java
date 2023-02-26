package HW6;

public class CounterStrike implements ComputerGame {
    @Override
    public void shoot() {
        System.out.println("Мужчина с лосинами на голове стреляет");
    }

    @Override
    public void move() {
        System.out.println("Мужчина с лосинами на голове двигается");
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