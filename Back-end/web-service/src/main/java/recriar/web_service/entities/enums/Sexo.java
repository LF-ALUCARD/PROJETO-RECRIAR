package recriar.web_service.entities.enums;

public enum Sexo {

    MASCULINO(0),
    FEMININO(1);

    private int code;

    private Sexo(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static Sexo valueOf(int value) {
    	for(Sexo x : Sexo.values()) {
    		if (x.getCode() == value) {
    			return x;
    		}
    	}
    	throw new IllegalArgumentException("Códico Invalido");
    }
}
