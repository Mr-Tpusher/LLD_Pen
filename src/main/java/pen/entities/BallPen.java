package pen.entities;

import lombok.*;
import pen.constants.PenBodyType;

@Getter
@Setter
public class BallPen extends Pen {
    private Refill refill;

    public BallPen(PenBodyType body, Refill refill) {
        super(body);
        this.refill = refill;
    }

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
