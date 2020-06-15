package Challenge;

public class Labrador extends Dog{
	public Labrador(String name) {
		super(name);
	}
	
	public boolean equals(Object obj) {
		//return super.equals(obj);
		if(this==obj) {
			return true;
		}
		if(obj instanceof Labrador) {
			String objName=((Labrador) obj).getName();
			return this.getName().contentEquals(objName);
		}
		return false;
	}
	

}
