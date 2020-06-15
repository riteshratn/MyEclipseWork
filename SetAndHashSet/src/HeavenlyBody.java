import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody {
	private final String name;
	private final double orbitalPeriod;
	private final Set<HeavenlyBody> satellites;
	public HeavenlyBody(String name, double orbintaPeriod) {
		//super();
		this.name = name;
		this.orbitalPeriod = orbintaPeriod;
		this.satellites=new HashSet<>();
	}
	public String getName() {
		return name;
	}
	public double getOrbitalPeriod() {
		return orbitalPeriod;
	}
	public boolean addMoon(HeavenlyBody Moon) {
		return this.satellites.add(Moon);
	}
	public Set<HeavenlyBody> getSatellites() {
		return new HashSet<>(this.satellites);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		System.out.println("obj.getClass() is "+ obj.getClass());
		System.out.println("this.getClass() is"+ this.getClass());
		if((obj==null)||(obj.getClass() !=this.getClass())) {
			return false;
		}
		String objName=((HeavenlyBody)obj).getName();
		return this.name.contentEquals(objName);
		
	}
	
}
