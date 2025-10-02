package recriar.web_service.entities.enums;

public enum Parentesco {
	
	PAI(0),
	MÃE(1),
	AVÔ(2),
	AVÓ(3);
	
	private int code;
	
	private Parentesco (int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static Parentesco valueOf(int code) {
		
		for (Parentesco x : Parentesco.values()) {
			if (x.getCode() == code) {
				return x;
			}
		}
		throw new IllegalArgumentException("Códico Invalidp");
	}
	
}
