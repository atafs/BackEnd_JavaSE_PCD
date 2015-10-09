package pt.progJava.americoLib.control45.logicaBase;



public class FluxoSwitch1 {

    /**
    * @param args the command line arguments
    */
    
	public enum Days {

   		 MONDAY,
  		 TUESDAY,
  		 WEDNESDAY,
 		 THURSDAY,
 		 FRIDAY,
  		 SATURDAY,
  		 SUNDAY;
 	 }
	

	public static void main(String[] args) {

   	   String current = args[0];
   	   Days currentDay = Days.valueOf(current.toUpperCase());

   	   switch (currentDay) {
    		case MONDAY:
      	    	case TUESDAY:
       	   	case WEDNESDAY:
        		System.out.println("boring");
         		break;
       		case THURSDAY:
          	 	System.out.println("getting better");
         	case FRIDAY:
         	case SATURDAY:
       	   	case SUNDAY:
            		System.out.println("much better");
			break;

		}
	
	
  	}

  }

