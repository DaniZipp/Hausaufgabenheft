package gui;



public class Main {

	
	
	public static void main(String[] args) {
		Window window = new Window();	// Erstellen von window (ben�tigt zur Ausf�hrung )

		window.init("Hausaufgabenheft");
		
		
		while(true){
			try {
				Thread.sleep(16);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			window.update();
			
		}

	}

}
