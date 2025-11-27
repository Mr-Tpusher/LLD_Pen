package pen_v0.entities;

import lombok.*;
import pen_v0.constants.PenBodyType;

@Getter
@Setter
public class BallPen extends Pen {
    private Refill refill;

    public BallPen(PenBodyType body, Refill refill) {
        super(body);
        this.refill = refill;
    }

    // here consideration is that, write() behaviour is different in all types of Pens
    @Override
    public void write(String text) {
        System.out.println(text);
        System.out.println("-> written with " + this);
        System.out.println("--------------------------");
    }

    @Override
    public String toString() {
        return "BallPen{" +
                "body=" + this.getBody() +
                ", refill=" + refill +
                '}';
    }
}
