
public class Developer extends Employee{
	private static BUGSTATUS status =BUGSTATUS.NEW;
	private static int counter=0;
	
	public static void bugAnalyzing(int id,String name) {
		//fixing the bug
		status = BUGSTATUS.FIXED;
		Tester test = new Tester();
		Bug bug = new Bug();
		bug.setId(id);
		bug.setName(name);
		counter++;
		status = BUGSTATUS.PENDING_REQUEST;
		System.out.println(status);

		while(counter < 2 ) {
		counter++;
		System.out.println(counter);
		test.retest(bug.getId(),bug.getName(),counter);
		break;
		}
		
		
		
		
	}
	public static void setBugstatus() {
		
	}
	
	public static void pendingRetest() {
		
	}
	public BUGSTATUS getStatus() {
		return status;
	}
	public void setStatus(BUGSTATUS status) {
		this.status = status;
	}
	
	
	
	
	

}
