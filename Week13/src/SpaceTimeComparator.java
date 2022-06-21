import java.util.Comparator;

public class SpaceTimeComparator implements Comparator<SpaceTime>{

	@Override
	public int compare(SpaceTime o1, SpaceTime o2) {
	
		//sorting x
		if(o1.getX() > o2.getX())
			return 1;
		else if(o1.getX() < o2.getX())
			return -1;
		
		//sorting y
		if(o1.getY() > o2.getY())
			return 1;
		else if(o1.getY() < o2.getY())
			return -1;
		//sorting z
		if(o1.getZ() > o2.getZ())
			return 1;
		else if (o1.getZ() < o2.getZ())
			return -1;
		
		//sorting hour
		if(o1.getHour() > o2.getHour())
			return 1;
		else if(o1.getHour() < o2.getHour())
			return -1;
		
		//sorting minute
		if(o1.getMinute() > o2.getMinute())
			return 1;
		else if(o1.getMinute() < o2.getMinute())
			return -1;
		
		//sorting second
		if(o1.getSecond() > o2.getSecond())
			return 1;
		else if(o1.getSecond() < o2.getSecond())
			return -1;
		return 0;
	}

	}


