package frc.lib;

public class RT {

    public static double m_time;

    public static double getTick () {

	  return (int) m_time / .02;

  }

  public static double getTick (double time) {

    return (int) time / .02;

  }

	public static boolean isTime (double time) {

		return getTick(time) == getTick(m_time);

    }

    public static boolean isTime (double time, double range) {

		return time - range <= m_time && time + range >= m_time;

	}


    public static boolean isAfter (double time) {

		return time > m_time;

    }

    public static boolean isBefore (double time) {

		return time < m_time;

    }

}
