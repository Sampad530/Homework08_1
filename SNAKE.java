package homework08_01;

public class SNAKE extends REPTILE {
	 String name;
	    String danger_level;
       public String getName() {
	        return name;
	    }
	    protected void setName(String name) {
	        this.name = name;
	    }
	    public String getDangerLevel() {
	        return danger_level;
	    }
	    protected void setDangerLevel(String danger_level) {
	        this.danger_level = danger_level;
	    }
	    public String toString () {
	        return ("  Snake : " + name + "\nD.Level : " + "danger_level "+ " \n ");
	    }

}