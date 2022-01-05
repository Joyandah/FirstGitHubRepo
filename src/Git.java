
public class Git {
	
  public static void main(String[] args) throws InterruptedException {
	  
	  for(int i = 0; i < 4; i++) {
		  System.out.println();
		  for(int j = 60; j > 0; j--) {
			  Thread.sleep(100);
			  System.out.println(j+" /"+i);
		  }
		  System.out.println("Hello world "+" Hello world");
	  }
    }
}
