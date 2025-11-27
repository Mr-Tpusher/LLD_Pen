package pen_v0.entities;

import lombok.*;
import pen_v0.constants.InkColour;

@Getter
@Setter
@ToString
public class Ink {
    private InkColour inkColour;

    public Ink(InkColour inkColour) {
        this.inkColour = inkColour;
    }
}
