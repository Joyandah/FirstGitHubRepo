
public class Git {
	
  public static void main(String[] args) throws InterruptedException {
	  
	  for(int i = 0; i < 4; i++) {
		  System.out.println();
		  for(int j = 60; j > 0; j--) {
			  Thread.sleep(1000);
			  System.out.println(j);
		  }
	  }
}
}
