package Factory;
public class NoSuchToyException extends Exception{

	/**
     *
     */
    private static final long serialVersionUID = -240630879128729713L;

    public NoSuchToyException(String title) {
        super(title);
    }

    
}