package exceptions;

public class ExceptionEventoNaoExistente extends Exception{
	public ExceptionEventoNaoExistente() {
		super("o cliente não está inscrito em nenhum evento!");
	}
}
