
/**
 * Book.java - Submedia item representing books.
 * @author Team Proxi
 */
public class Book extends Media{
    private String author, publisher;
    private String ISBN;

    /**
     * Parameterized constructor for Book
     * @param title The name of the Book
     * @param genre the genre of the Book
     * @param description A brief description of the Book
     * @param year The year the Book was released
     * @param newRelease If it is a new release will be marked true, otherwise marked false
     * @param copies The amount of copies available
     * @param anAuthor Declares author to anAuthor
     * @param anISBN declares ISBN to anISBN
     * @param aPublisher Declares publisher to aPublisher
     */
    public Book(String title, String genre, String description, String year, boolean newRelease, int copies,
                String anAuthor, String anISBN, String aPublisher) {
    	super(title, genre, description, year, newRelease, copies);
    	this.author = anAuthor;
        this.ISBN = anISBN;
        this.publisher = aPublisher;
        this.checkoutLength = 30;
    }
	public String getAuthor() {
		return author;
	}
	public String getPublisher() {
		return publisher;
	}
	public String getISBN() {
		return ISBN;
	}

	/**
	 * Creates a copy of the book
	 * Overrides abstract copy() method from Media
	 */
	public void copy() {
		Object[] data = super.copyMediaData();
		Book clone = new Book((String)data[0],(String)data[1],(String)data[2],(String)data[3],((Boolean)data[4]).booleanValue(),((Integer)data[5]).intValue(),
				this.author,this.ISBN,this.publisher);
	}
}
