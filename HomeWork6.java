package HW6;

import java.util.Arrays;
import java.util.Iterator;

public class HomeWork6 {
    public static void main(String[] args) {
        Instrument[] instruments=new Instrument[3];
        instruments[0]=new Drums(120);
        instruments[1]=new Guitar(7);
        instruments[2]=new Truba(53);
        Iterator<Instrument> myIterator= Arrays.stream(instruments).iterator();
        while (myIterator.hasNext()){
            Instrument instrument= myIterator.next();
            instrument.play();
        }
        SnakesAndLadders sc=new SnakesAndLadders();
        CounterStrike cs=new CounterStrike();
    }
}