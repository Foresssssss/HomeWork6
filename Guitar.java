package HW6;

public class Guitar extends Instrument{
    private int NumberOfStrings;
    Guitar(int NumberOfStrings){
        setNumberOfStrings(NumberOfStrings);
    }

    public void setNumberOfStrings(int numberOfStrings) {
        NumberOfStrings = numberOfStrings;
    }

    @Override
    public void play() {
        System.out.println("Играет гитара с "+NumberOfStrings+" струной/струнами");
    }
}
