import java.awt.*;

public class Car {
    //Data Types//
    double averageMilesPerGallon;
    String licensePlate;
    Color paintColor;
    Boolean workingTailLights;

    public Car(double averageMilesPerGallon, String licensePlate, Color paintColor, Boolean workingTailLights) {
        this.averageMilesPerGallon = averageMilesPerGallon;
        this.licensePlate = licensePlate;
        this.paintColor = paintColor;
        this.workingTailLights = workingTailLights;
    }

    public void changePaintColor(Color newPaintColor) {
        this.paintColor = newPaintColor;
    }
}
