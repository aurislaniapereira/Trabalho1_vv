package exceptions;

public class ExceptionEventoNaoExistente extends Exception{
	public ExceptionEventoNaoExistente() {
		super("o cliente n�o est� inscrito em nenhum evento!");
	}
}
