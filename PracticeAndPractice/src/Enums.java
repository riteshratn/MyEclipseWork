
public enum Enums { 
	//enumeration
   Ritesh("cool","19"),
   Aarav("nice","20"),
   Rohan("good","18"),
   Rahul("funny","19"),
	Rohit("fine","7"),
	 Ram("kid","18");
	private final String bio;
	private final String year;
	Enums(String biodata,String birthday){
		bio=biodata;
		year=birthday;
	}
	public String getBio() {
		return bio;
	}
	public String getYear() {
		return year;
	}
}
