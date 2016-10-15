package smoothieMachine;

public class Fruit implements Ingredients {

	private String type;
	private String name;
	private String color;
	private int perBushel;
	
		
	public Fruit(String name){
		this.name = name;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPerBushel() {
		return perBushel;
	}

	public void setPerBushel(int perBushel) {
		this.perBushel = perBushel;
	}

}