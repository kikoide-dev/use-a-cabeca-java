package jogodeadivinhacao;

public class Player {
	int numero =0;
	
	public void guess() {
		numero = (int) (Math.random()*10);
		System.out.println("Estou pensando em " + numero);
		
	}
}
