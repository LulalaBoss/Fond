

public class Game
{
  private long timeElapsed;
  

  public Game()
  {
    run();
  }
  
  public void run()
  {
    System.out.println("running");  
    timeElapsed = 0;
    Gameloop();	
  }
  
  public void Gameloop()
  {
    boolean isRunning = true;
  
    while(isRunning)
	{
	  long loopStartTime = System.currentTimeMillis();
	  
	  try
	  {
	    Thread.sleep(1000);
	  }
	  catch(InterruptedException ex)
	  {
	    Thread.currentThread().interrupt();
	  }
	  
	  long loopEndTime = System.currentTimeMillis();
	  
	  timeElapsed = (loopEndTime - loopStartTime) + timeElapsed;
	  
	  
	  printCurrentDate();	
	}
    
  }
  
  public void printCurrentDate()
  {
    System.out.println(timeElapsed);
  }

}