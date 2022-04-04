package homework08_01;

public class REPTILE {
	protected String color;
    protected String weight;
    protected String length;
public String getColor() {
    	return color;
    }
     protected void setColor(String color) {
        this.color = color;
    }
    public String getWeight() {
        return weight;
    }
    protected void setWeight(String weight) {
        this.weight = weight;
    }
   public String getLength() {
        return length;
    }
   protected void setLength(String length) {
        this.length = length;
    }
    public String toString () {
        return (" color : " + color + "\n weight : " + weight + "\n length : " + length);

}

}
