public class Numero {
	int numero1, numero2;

	Numero() {

	}

	public void validaNumeros()throws Exception {
		if (numero1 <= 0) {		
			throw new Exception("O numero1 precisa ser maior que Zero");
		} else if (numero2 <= 0) {
			throw new Exception("O numero2 precisa ser maior que Zero");
		}
	}
public double dividir() {
	return numero1/numero2 ;
}
}
