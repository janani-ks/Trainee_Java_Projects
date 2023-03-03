package allprojects;

class Detail implements Cloneable{
    String name;
    long num;
    String exdate;
    Detail(String n,long n1,String e){
        this.name=n;
        this.num=n1;
        this.exdate=e;
    }
    static boolean equals(Detail obj,Detail obj1) {
    	boolean b;
    	if(obj.num == obj1.num)
    		b = true;
    	else
    		b = false;
    	return b;
    }
    public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
		}  
    static Detail cloneobj()throws CloneNotSupportedException{
		Creditcard.display.println("Enter the new Credit card Details :");
		Creditcard.display.print("Name = ");
		String name = Creditcard.scan.nextLine();
		Creditcard.display.print("Card Number = ");
		long number;
		while(1>0) {
			number = Creditcard.storelong();
			if(Creditcard.b)
				break;
		}
		Creditcard.b = false;
		Creditcard.display.print("Expiry Date = ");
		String date = Creditcard.scan.nextLine();
		Detail obj = new Detail(name,number,date);
		return (Detail)obj.clone();
	}
}