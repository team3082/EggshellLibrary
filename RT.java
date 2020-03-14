package frc.lib;

public class RT {

	private static double SPT = .02; // SPT stands for seconds per tick

	private static int m_tick;

	public static void incrementTick () {

		m_tick++;

	}

	public static void resetTick () {

		m_tick = 0;

	}

	public static double getTime () {

		return m_tick * SPT;

      }

	public static boolean isTime (double time) {

		return time == getTime();

      }

    public static boolean isTime (int time, int range) {

		return time - range <= getTime() && time + range >= getTime();

	}


      public static boolean isAfter (double time) {

		return time > getTime();

      }

      public static boolean isBefore (double time) {

		return time < getTime();

      }

}