package recriar.web_service.service.exceptions;

public class ResourceNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException (Object id) {
		super("Não foi encontrado o ID: " + id);
	}
}
