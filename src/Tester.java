
public class Tester extends Employee{
	private static BUGSTATUS status =BUGSTATUS.NEW;
	private static int count =0;
	private static int count2 =0;
	public static void main(String[] args) {
		//addNewBug();
		//setBugstatus();
		//retest();
		
	}
	public static void testing() {
		Manager  manager = new Manager();
		manager.assignBug();
		//run the code and find the bug
		if(count==0) {
			count++;
			System.out.println(count);
			addNewBug();
			
		}
		else
		{
			
		status = BUGSTATUS.REOPEN;
		System.out.println(status);
		count2++;
		while(count2<2) {
		Developer.bugAnalyzing(7365, "Abug");
		
		}
			
		}
		
	}
		
	   static void addNewBug() {
		Bug bug = new Bug();
		bug.setId(7365);
		bug.setName("Abug");
		bug.setPriority("High");
		bug.setLocation("inproject");
		bug.setType(BUGTYPE.ARITHMETIC);
		bug.setSeverity(SEVERITY.MILD);
		Developer developer = new Developer();
		System.out.println("Step1");
		developer.bugAnalyzing(bug.getId(),bug.getName());
		
		
		
	}
	//public static void setBugstatus() {
		
	//}
	   
	public static void retest(int id,String name,int c) {
		Manager manage = new Manager();
		if (c==1) {
		status = BUGSTATUS.RETEST;
		System.out.println("hi");
		testing();}
		else {
		
			status = BUGSTATUS.VERIFIED;
			status = BUGSTATUS.CLOSED;
			System.out.println(status);
			System.out.println("completed");
			manage.acknowledgeReport();
	
			
		}
		}
		
		
		
	
	
	public BUGSTATUS getStatus() {
		return status;
	}
	public void setStatus(BUGSTATUS status) {
		this.status = status;
	}
	
}
/*/if(count2==0) {
status = BUGSTATUS.RETEST;
testing();
}
else{/*/
