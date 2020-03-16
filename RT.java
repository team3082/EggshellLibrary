package frc.lib;

public class RT {

	private static double SPT = .02; // SPT stands for seconds per tick

	private static int m_tick;

	// for Robot.java
	public static void incrementTick () {

		m_tick++;

	}

	public static void resetTick () {

		m_tick = 0;

	}

	// for general use
	public static double getTime () {

		return m_tick * SPT;

	}

	public static int getTick() {

		return m_tick;

	}

	public static int getTick(double time) {

		return (int) Math.round(time/SPT); // not sure why it wants me to caste to int, my compiler throws an error when I do not

	}

	public static boolean isTime (double time) {

		return getTick(time) == m_tick;

      }

    public static boolean isTime (int time, int range) {

		return getTick(time) - getTick(range) <= m_tick && getTick(time) + getTick(range) >= m_tick;

	}


      public static boolean isAfter (double time) {

		return getTick(time) > m_tick;

      }

      public static boolean isBefore (double time) {

		return getTick(time) < m_tick;

	  }

}