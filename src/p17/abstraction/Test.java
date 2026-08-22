package p17.abstraction;

public class Test { 
	
	public static void main(String[] args) {
		Keyboard k = new MSWord();
		Keyboard k1 = new MusicPlayer();
		k.enter();
		k1.enter();
	}

}
