package java8project;

public class method {
	private String doors ;
	private String engine ;
	private String drivers ;
	private int speed;
	public method() {
		doors = "open";
		engine = "off";
		drivers = "absent";
		speed = 0;
	}
	public String getDoors() {
		return doors;
	}
	public method(String doors, String engine, String drivers, int speed) {
	super();
	this.doors = doors;
	this.engine = engine;
	this.drivers = drivers;
	this.speed = speed;
}
	public void setDoors(String doors) {
		this.doors = doors;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getDrivers() {
		return drivers;
	}
	public void setDrivers(String drivers) {
		this.drivers = drivers;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void run(String doors , String engine , String driver, int speed) {
		if (doors.equals("close")  && engine.equals("on") && driver.equals("available") && speed > 0) {
			System.out.println("running");
		}else {
			System.out.println("not running");
		}
	}
	
	

	
	
		
//		int d = a + b;
//		System.out.println(d);
//	}
//public static int loop(int a) {
//	int area = a*a;
//	return area;

}
