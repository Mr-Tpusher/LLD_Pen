package pen_v0.entities;
import lombok.*;
import pen_v0.constants.NibSize;

@Getter
@Setter
@ToString
public class Nib {
    private NibSize nibSize;

    public Nib(NibSize nibSize) {
        this.nibSize = nibSize;
    }
}
