
public class Customer {
	String name;
	int edad;
	public boolean isAdult(){
		if(this.edad>=18){
			return true;
		}
		return false;
	}
}
