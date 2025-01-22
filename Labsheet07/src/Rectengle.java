
public class Rectengle {

	//private float length;
	//private float width;
	
	//Rectengle () {
		//length = 1.0f;
		//width = 1.0f;
		
    private float length = 1.0f;
	private float width = 1.0f;
	
	Rectengle() {}
	
	Rectengle(float length,float width){
		this.length = length;
		this.width = width;
		
	}
		
	 public float getLength() {
		 return this.length;
		 
	 }
	 
	 public void setLength(float length) {
		 this.length = length;
		 
	 }
	 
	 public float getWidth() {
		 return this.width;
		 
	 }
	 
	 public void setWidth(float width) {
		 this.width = width;
	 }
	 
	 public double getArea () {
		 return this.length * this.width;
		 
	 }
	 
	 public double getPerimeter() {
		 return 2 * (this.length + this.width);
		 
	 }
	 
	 public String showData () {
		return "Rectengle [length= " + this.length + ",width = "+
	 this.width+"]";
	 }
		
	 public String toString() {
			return "Rectengle [length= " + this.length + ",width = "+
		 this.width+"]";
	}
	 
}


