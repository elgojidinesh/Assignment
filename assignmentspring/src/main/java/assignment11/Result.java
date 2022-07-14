package assignment11;

public class Result {


	private int maths;
	private int hindi;
	private int english;
	private int science;
	
	public  int total_marks;
	
	public Result( int maths, int hindi, int english, int science) {
		super();
	
		this.maths = maths;
		this.hindi = hindi;
		this.english = english;
		this.science = science;
		this.total_marks=maths+english+science+hindi;
	}



	
	
	
	

	
	
}
