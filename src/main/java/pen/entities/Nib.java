package pen.entities;
import lombok.*;
import pen.constants.NibSize;

@Getter
@Setter
@ToString
public class Nib {
    private NibSize nibSize;

    public Nib(NibSize nibSize) {
        this.nibSize = nibSize;
    }
}
