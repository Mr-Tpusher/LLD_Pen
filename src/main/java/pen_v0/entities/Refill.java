package pen_v0.entities;

import lombok.*;

@Getter
@Setter
@ToString
public class Refill {
    private Nib nib;
    private Ink ink;

    public Refill(Nib nib, Ink ink) {
        this.nib = nib;
        this.ink = ink;
    }

}
