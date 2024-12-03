public class weather {
    private String name;
    private int speed;
    private int percent;
    private boolean rain;
    private boolean cloud;
    private boolean sun;
    weather(String name,int speed,int percent,boolean rain,boolean cloud,boolean sun){
this.setName(name);
this.setSpeed(speed);
this.setPercent(percent);
this.setRain(rain);
this.setCloud(cloud);
this.setSun(sun);
    }
    public String getName(){
        return name;
    }
    public int getSpeed(){
        return speed;
    }
    public int getPercent(){
        return percent;
    }
    public boolean getRain(){
        return rain;
    }
    public boolean getCloud(){
        return cloud;
    }
    public boolean getSun(){
        return sun;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setSpeed(int speed){
        this.speed=speed;
    }
    public void setPercent(int percent){
        this.percent=percent;
    }
    public void setRain(boolean rain){
        this.rain=rain;
    }
    public void setCloud(boolean cloud){
        this.cloud=cloud;
    }
    public void setSun(boolean sun){
        this.sun=sun;
    }


}
