package exam;

abstract class Spaces {
	private String space;
	private float meters;
	private int price;
	public Spaces() {
		space=" ";
		meters=(float)0.0;
		price=0;
	}
	public Spaces(String pw_space, float pw_meters, int pw_price) {
		space=pw_space;
		meters=pw_meters;
		price=pw_price;
	}
	
	public void Assing_Space(String pw_space) {
		space=pw_space;
	}
	public void Assig_meters(float pw_meters) {
		meters=pw_meters;
	}
	public void Assig_price(int pw_price) {
		price=pw_price;
	}
	public String Show_space() {
		return space;
	}
	public float Show_meters(){
		return meters;
	}
	public int Show_price() {
		return price;
	}
	
}
