package pen.entities;

import lombok.*;
import pen.constants.PenBodyType;

@Getter
@Setter
@ToString
public class Marker extends Pen {
    private Nib nib;
    private Ink ink;

    public Marker(PenBodyType penBodyType, Nib nib, Ink ink) {
        super(penBodyType);
        this.nib = nib;
        this.ink = ink;
    }

    // here consideration is that, write() behaviour is different in all types of Pens
    @Override
    public void write(String text) {
        System.out.println(text);
        System.out.println("-> written with " + this);
        System.out.println("--------------------------");
    }
}
