package frc.lib;

public class Stat {

    private static boolean m_enabled = false;
	
	private ArrayList<Object> m_ls; 

	public final String m_title; 

	public Stat () {
		
		ls = new ArrayList<Object>();
		
	}

	public Stat (String title) {

		this(); // calls default constructor 

		m_title = title; 

	}

	public static void enable () { // allows stat to be run exclusively in testing mode if wanted 

		m_enabled = true; 

	}

	public static void clear () { 

		m_enabled = false; 

	}
	
	public void addVal (Object val) { // this would be used throughout the code base to store certain values 
		
		if (m_enabled) {

			m_ls.add(val); 

		}
		
	}
	
	public void printfData () { // this would be run when the robot is disabled

		title = ""; 

		if (m_enabled) {

			for(int i=0; i < m_ls.size(); i++){
			
            	System.out.println(title + " -- val: " + i + " is " + m_ls.get(i));
			
			}

		}
		
	}

	public void printfData (int skip) {

		title = ""; 

		if (m_enabled) {

			for(int i=0; i < m_ls.size(); i+=skip){
			
            	System.out.println(title + " -- val: " + i + " is " + m_ls.get(i));
			
			}

		}
		
	}
	
	public void printData () {

		if (m_enabled) {
		
			for(int i=0; i < m_ls.size(); i++){
			
            	System.out.println(m_ls.get(i));
			
			}

		}
		
	}


}