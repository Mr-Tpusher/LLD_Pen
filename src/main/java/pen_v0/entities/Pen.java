package pen_v0.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import pen_v0.constants.PenBodyType;
import pen_v0.interfaces.Writable;

@Getter
@Setter
@ToString
public abstract class Pen implements Writable {
    private PenBodyType body;

    public Pen(PenBodyType body) {
        this.body = body;
    }

    @Override
    public abstract void write(String text);

}
