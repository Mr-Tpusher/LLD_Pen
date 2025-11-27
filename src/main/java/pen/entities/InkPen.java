package pen.entities;

import lombok.*;
import pen.constants.PenBodyType;

@Getter
@Setter
public class InkPen extends Pen {
    private Nib nib;
    private Ink ink;

    public InkPen(PenBodyType penBodyType, Nib nib, Ink ink) {
        super(penBodyType);
        this.nib = nib;
        this.ink = ink;
    }
    @Override
    public void write(String text) {
        System.out.println(text);
        System.out.println("-> written with " + this);
        System.out.println("--------------------------");
    }

    @Override
    public String toString() {
        return "InkPen{" +
                "body=" + this.getBody() +
                ", nib=" + nib +
                ", ink=" + ink +
                '}';
    }
}
