package spring.di.setter.bean;

public class FunPlayer implements MusicPlayer {

	@Override
	public void play(String song) {
		System.out.println("Playing song: " + song);
	}

	@Override
	public void pause(String song) {
		System.out.println("Pausing songs " + song);
	}

}
