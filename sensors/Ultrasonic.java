package frc.lib.sensors;

import edu.wpi.first.wpilibj.AnalogInput;

//https://www.maxbotix.com/documents/HRLV-MaxSonar-EZ_Datasheet.pdf
public class Ultrasonic {

    private AnalogInput m_ultrasonic;
    private final double kCentimetersPerVolt = 102.3541453428864;

    public Ultrasonic(int analogPort) {
        m_ultrasonic = new AnalogInput(analogPort);
    }

    public double getDistance () {
        return m_ultrasonic.getVoltage() * kCentimetersPerVolt;
    }

}
