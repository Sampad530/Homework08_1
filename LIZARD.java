package homework08_01;

public class LIZARD extends REPTILE {
	 String name;
	    String status;
	    public String getName() {
	    	return name;
	    }
	    protected void setName(String name) {
	        this.name = name;
	    }
	    public String getStatus() {
	        return status;
	    }
	    protected void setStatus(String status) {
	        this.status = status;
	    }

	    public String toString () {
	        return (" Lizard : " + name + "\n status : " + status + " \n ");

}
}