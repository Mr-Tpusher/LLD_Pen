package pen.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import pen.constants.PenBodyType;
import pen.interfaces.Writable;

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
