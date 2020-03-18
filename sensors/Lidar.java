package frc.lib.sensors;

import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj.DigitalInput;

public class Lidar {

    private Counter m_Lidar;
    private double m_offset;
    private double m_lastAverage;

    public Lidar(int dioPort) {
        m_Lidar = new Counter(new DigitalInput(dioPort));
        m_Lidar.setMaxPeriod(1.00);
        m_Lidar.setSemiPeriodMode(true);
        m_Lidar.reset();

        m_offset = 0;
    }

    public void setOffset(double offset) {
        m_offset = offset;
    }

    public void update() {
        m_lastAverage = Math.round(m_lastAverage + getDistanceRaw()) / 2.0;
    }

    // Returns in centimeters smoothed
    public double getDistance() {
        return m_lastAverage;
    }

    // Returns in centimeters
    public double getDistanceRaw() {
        if (m_Lidar.get() < 1)
            return 0;
        else
            return (m_Lidar.getPeriod() * 1000000.0 / 10.0) - m_offset; //convert to distance. sensor is high 10 us for every centimeter.
    }


}
