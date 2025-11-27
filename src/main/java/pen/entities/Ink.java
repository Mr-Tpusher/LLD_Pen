package pen.entities;

import lombok.*;
import pen.constants.InkColour;
import pen.constants.NibSize;

@Getter
@Setter
@ToString
public class Ink {
    private InkColour inkColour;

    public Ink(InkColour inkColour) {
        this.inkColour = inkColour;
    }
}
