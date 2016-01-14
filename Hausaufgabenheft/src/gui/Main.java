package gui;



public class Main {

	
	
	public static void main(String[] args) {
		Window window = new Window();	// Erstellen von window (benötigt zur Ausführung )

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
