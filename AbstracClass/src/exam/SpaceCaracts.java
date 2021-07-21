package exam;

public class SpaceCaracts extends Spaces{
	private int bedrooms;
	private int bathrooms;
	private String furniture;
	private String chimney;
	
	public SpaceCaracts(){
	}
	public SpaceCaracts(String pw_space, float pw_meters, int pw_price, int pw_bedrooms, int pw_bathrooms, String pw_furniture, String pw_chimney){
		super(pw_space, pw_meters, pw_price);
		bedrooms=pw_bedrooms;
		bathrooms=pw_bathrooms;
		furniture=pw_furniture;
		chimney=pw_chimney;
	}
	
	public void Assig_bedrooms(int pw_bedrooms) {
		this.bedrooms=pw_bedrooms;
	}
	public void Assig_bathrooms(int pw_bathrooms) {
		this.bathrooms=pw_bathrooms;
	}
	public void Assig_furniture(String pw_furniture) {
		this.furniture=pw_furniture;
	}
	public void Assig_chimeney(String pw_chimney) {
		this.chimney=pw_chimney;
	}
	
	public int Show_bedrooms() {
		return bedrooms;
	}
	public int Show_bathrooms() {
		return bathrooms;
	}
	public String Show_furniture() {
		return furniture;
	}
	public String Show_chimney() {
		return chimney;
	}
}
