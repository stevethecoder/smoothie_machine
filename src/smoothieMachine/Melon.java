package smoothieMachine;

public class Melon extends Fruit implements Pitable {
	
	@Override
	public void pit() {
}
	public Melon(){
		super("Melon");
	}
		
	private int juiceOunces;
	private int iceOunces;
	private int blendTime;

	public int getJuiceOunces() {
		return juiceOunces;
	}

	public void setJuiceOunces(int juiceOunces) {
		this.juiceOunces = juiceOunces;
	}

	public int getIceOunces() {
		return iceOunces;
	}

	public void setIceOunces(int iceOunces) {
		this.iceOunces = iceOunces;
	}

	public int getBlendTime() {
		return blendTime;
	}

	public void setBlendTime(int blendTime) {
		this.blendTime = blendTime;
	}
}