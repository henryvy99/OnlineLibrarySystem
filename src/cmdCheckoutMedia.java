/**
 * cmdCheckoutMedia.java - Command to check media out
 * @author Team Proxi
 */
public class cmdCheckoutMedia implements Command {
    /**
     * Method to "check out" media
     */
    public void execute(String arg,User u) {
       for(Media m:LibrarySystem.getInstance().inventoryNoCopies()) {
    	   if(m.title.toUpperCase().equals(arg.toUpperCase())) { //Find media matching the title input
    		   u.checkoutMedia(m);
    		   return;
    	   }
       	}
    	System.out.println("There is no media with that title.");
    }

    /**
     *
     * @return true if the user account is not closed, false if account is closed
     */
    public boolean requiresUser() {
    	return true;
    }
}
