import java.util.Comparator;

	public class SpaceTime{
		//variables
			private double x;
			private double y;
			private double z;
			private int hour;
			private int minute;
			private int second;
			
			//constructor 
			SpaceTime(double x, double y, double z, int hour, int minute, int second){
				super();
				this.x = x;
				this.y = y;
				this.z = z;
				this.hour = hour;
				this.minute = minute;
				this.second = second;
			}
			
			//getters and setters for private variables
			public double getX() {
				return x;
			}
			public void setX(double x) {
				this.x = x;
			}
			public double getY() {
				return y;
			}
			public void setY(double y) {
				this.y = y;
			}
			public double getZ() {
				return z;
			}
			public void setZ(double z) {
				this.z = z;
			}
			public int getHour() {
				return hour;
			}
			public void setHour(int hour) {
				this.hour = hour;
			}
			public int getMinute() {
				return minute;
			}
			public void setMinute(int minute) {
				this.minute = minute;
			}
			public int getSecond() {
				return second;
			}
			public void setSecond(int second) {
				this.second = second;
			}
			

			@Override
			public String toString() {
				System.out.println();
				return "SpaceTime [x=" + x + ", y=" + y + ", z=" + z + ", hour=" + hour + ", minute=" + minute + ", second="
						+ second + "]";
			}


		}
