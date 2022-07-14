package testcases;

import java.time.LocalDate;

public class ItemCheck  {
	private int itemid;
	private String itemname;
	private int costprice;
	private int sellprice;
	private LocalDate dom;
	private LocalDate doe;
	public ItemCheck(int itemid, String itemname, int costprice, int sellprice, LocalDate dom, LocalDate doe) {
	    super();
	    this.itemid = itemid;
	    this.itemname = itemname;
	    this.costprice = costprice;
	    this.sellprice = sellprice;
	    this.dom = dom;
	    this.doe = doe;


	}
	ItemCheck i=null;
	public static boolean createObject(ItemCheck i) {
	    if(countDigit(i.itemid)>=3)
	        if(i.itemname.matches("[a-za-Z]-"))
	            if(i.sellprice>0 && i.costprice>0)
	                if(i.doe!=LocalDate.now())
	                    if(i.sellprice!=i.costprice)
	                        i =new ItemCheck(i.itemid,i.itemname,i.costprice,i.sellprice,i.dom,i.doe);

	    if(i!=null)
	        return true;
	    else
	        return false;
	}
	public static int countDigit(int itemid) {
	    int count=0;
	    while(itemid>0) {
	        count++;
	        itemid/=10;
	    }
	    return count;


	}
	public static void main(String[] args) {
	    ItemCheck i=new ItemCheck(1, "Pen", 200,500,LocalDate.of(2022, 11, 23),LocalDate.of(2023, 2, 10));
	    System.out.println(ItemCheck.createObject(i));
	}
	}


