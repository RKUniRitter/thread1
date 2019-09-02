//Professor Isidro Explica - Episódio 11 - Threads
//https://www.youtube.com/watch?v=gILOMDm1xxk&feature=youtu.be

public class MeuTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinhaThread t1, t2;
		
		t1 = new MinhaThread(1, 10, 500);
		t2 = new MinhaThread(2, 10, 800);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
			
			System.out.println("Thread principal encerra.");
			
		} catch (Exception ex) {
			System.out.println("Deu ruim ne thread principal... " +ex.getMessage());
		}
	}

}
