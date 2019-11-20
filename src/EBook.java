
/**
 * EBook.java - Sub-media item representing EBooks
 * @author Team Proxi
 */
public class EBook extends Media{

    /**
     * Variable
     */
    private String author;

    /**
     * Parameterized constructor for EBook
     * @param title The name of the EBook
     * @param genre The genre of the EBook
     * @param description A brief description of the EBook
     * @param year The year the EBook was released
     * @param newRelease If it is a new release will be marked true, otherwise marked false
     * @param copies The amount of copies available
     * @param anAuthor Declares author to anAuthor
     */
    public EBook(String title, String genre, String description, String year, boolean newRelease, int copies,
                 String anAuthor) {
    	super(title, genre, description, year, newRelease, copies);
    	this.author = anAuthor;
    	this.checkoutLength = 30;
    }
    	
    public String getAuthor() {
		  return author;
	}
    
    @Override
	/**
	 * Creates a copy of the ebook
	 * Overrides abstract copy() method from Media
	 */
	public void copy() {
		Object[] data = super.copyMediaData();
		EBook clone = new EBook((String)data[0],(String)data[1],(String)data[2],(String)data[3],((Boolean)data[4]).booleanValue(),((Integer)data[5]).intValue(),
				this.author);
	}
}