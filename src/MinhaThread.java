
public class MinhaThread extends Thread {
	
	private int id;
	private int valor;
	private int tempo;
	
	public MinhaThread (int id, int valor, int tempo) {
		this.id = id;
		this.valor = valor;
		this.tempo = tempo;
	}

	public void run() {
		try {
			for (int i=0; i < valor; i++) {
				System.out.println("Thread ID: " +id +" valor :" +i);
				Thread.sleep(tempo);
			}
		}
		catch (Exception ex) {
			System.out.println("Deu ruim..." +ex.getMessage());
		}
	}
	
}
