// WAP to inject multiple names to a beans and break the names in to array of string and find
//out the string which is having no vowel in it.

package assignment6;

public class Vowel {
	String vm[];

	public String[] getVm() {
		return vm;
	}

	public void setVm(String[] vm) {
		this.vm = vm;
	}
	public void show()
	{
		for(int i=0;i<vm.length; i++)
		{
			System.out.println(vm[i]);
		}
	}
	public void result()
	{
		for(String a:vm)
		{
			String vm1=a.replaceAll("[aeiouAEIOU]","");
			if(a.equals(vm1))
			{
				System.out.println(a);
			}
		}
	}
}
