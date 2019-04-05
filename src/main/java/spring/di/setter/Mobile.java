package spring.di.setter;

import spring.di.setter.bean.DeviceInfo;
import spring.di.setter.bean.MusicPlayer;

public class Mobile {
	
	public Mobile() {
		super();
	}
	
	public Mobile(MusicPlayer musicPlayer, DeviceInfo deviceInfo) {
		super();
		this.musicPlayer = musicPlayer;
		this.deviceInfo = deviceInfo;
	}

	private MusicPlayer musicPlayer;
	private DeviceInfo deviceInfo;
	
	
	public MusicPlayer getMusicPlayer() {
		return musicPlayer;
	}

	public void setMusicPlayer(MusicPlayer musicPlayer) {
		this.musicPlayer = musicPlayer;
	}
	
	public void playSong(String song) {
		musicPlayer.play(song);
	}

	public DeviceInfo getDeviceInfo() {
		return deviceInfo;
	}

	public void setDeviceInfo(DeviceInfo deviceInfo) {
		this.deviceInfo = deviceInfo;
	}
}
