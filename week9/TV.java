package week9;

public class TV {
    int channel = 1;
    int volumeLevel = 1;
    boolean on = false;

    public TV(int channel, int volumeLevel, boolean on) {
        this.channel = channel;
        this.volumeLevel = volumeLevel;
        this.on = on;
    }

    public TV() {
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        if(on && volumeLevel > 0 && volumeLevel < 7)
        this.volumeLevel = volumeLevel;
    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void channelUp(){
        if(on && channel < 120)
            channel++;
    }

    public void channelDown(){
        if(on && channel > 1)
            channel--;
    }

    public void volumeUp(){
        if(on && volumeLevel <= 7)
            volumeLevel++;
    }

    public void volumeDown(){
        if(on && volumeLevel > 1)
            volumeLevel--;
    }


}
