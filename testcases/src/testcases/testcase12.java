package testcases;

public class testcase12 implements Cloneable {
	int id;
	String name;

	public testcase12(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	public static boolean checkclone(testcase12 s1,testcase12 s2) {
		if (s1.id==s2.id &&s1.name==s2.name)
	return true;
		else
			return false;
	}
}
