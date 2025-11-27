package pen;

import pen.constants.InkColour;
import pen.constants.NibSize;
import pen.constants.PenBodyType;
import pen.entities.*;

public class Main {
    public static void main(String[] args) {
        // --------- BallPen-----------------------//
        // Create a 0.5 nib size, blue ink, plastic body, ball pen
        Pen ballpen = new BallPen(PenBodyType.PLASTIC, new Refill(new Nib(NibSize.POINT5), new Ink(InkColour.BLUE)));
        ballpen.write("Hello");

        // create a 0.7 nib size, black ink, metal body, ball pen
        Pen ballpen2 = new BallPen(PenBodyType.METAL, new Refill(new Nib(NibSize.POINT7), new Ink(InkColour.BLACK)));
        ballpen2.write("How are you?");


        // --------- InkPen-----------------------//
        Pen inkPen = new InkPen(PenBodyType.METAL, new Nib(NibSize.POINT5), new Ink(InkColour.RED));
        inkPen.write("What's up?");


        // --------- marker -----------------------//
        Pen marker = new Marker(PenBodyType.METAL, new Nib(NibSize.POINT7), new Ink(InkColour.GREEN));
        marker.write("Work hard, play harder.");

    }
}
