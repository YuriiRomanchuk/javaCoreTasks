package core.ConverterDegreesAndFahrenheitTaskFourPointTwo;

import java.io.InputStream;
import java.util.Scanner;

public class TemperatureInputController {

    Scanner in;

    TemperatureInputController(InputStream inputStream) {
        this.in = new Scanner(inputStream);
    }

    public int getVariantOfTemperature() {
        System.out.print("Choose a variant (1 - C to F 2 - F to C): ");
        return in.nextInt( );
    }

    public double getTemperature(nameSide) {
        System.out.print("Input " + nameSide);
        return in.nextDouble( );
    }

    }

}
