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

    @Override
    public void write(String text) {
        System.out.println(text);
        System.out.println("-> written with Marker");
        System.out.println("--------------------------");
    }
}
