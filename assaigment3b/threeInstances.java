public class ThreeInstances {
  private static int countInstance = 0 ; 
  private static final int  maxNumInstances = 3 ;
  private static ThreeInstances [] instances = new ThreeInstances [maxNumInstances] ; 
  private ThreeInstances(){} ;
  
  public static ThreeInstances getInstance(){
    if(countInstance < maxNumInstance){
    
    instance[countInstance] = new ThreeInstances() ;
      return [countInstance++] ;
    
    }
    else {
    System.out.println("reached max instances") ;
    }

  }
  

}

class Main {
 public static void main(String args [System.in]){
 ThreeInstances instance1 = ThreeInstances.getInstance() ;
    ThreeInstances instance2 = ThreeInstances.getInstance() ;
    ThreeInstances instance3 = ThreeInstances.getInstance() ;
 
 }
  
}
