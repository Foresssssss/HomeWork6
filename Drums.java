package HW6;

public class Drums extends Instrument {
    private int size;
    Drums(int size){
        setSize(size);
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Играет барабан с размером "+size);
    }
}