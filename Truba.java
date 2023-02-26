package HW6;

public class Truba extends Instrument{
    private int diametr;
    Truba(int diametr){
        setDiametr(diametr);
    }

    public void setDiametr(int diametr) {
        this.diametr = diametr;
    }

    @Override
    public void play() {
        System.out.println("Играет труба диаметром "+diametr);
    }
}