package imasdegeladeira;

public class DrunKitTestDrive {
	public static void main(String[] args) {
		
		DrumKit d = new DrumKit();
		
		
		d.playTopHat();
		d.playSnare();
		
			d.snare = false;	
		if(d.snare == true) {
			d.playSnare();
		}
		
		
	}
}
