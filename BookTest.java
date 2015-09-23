package book;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int pages = 3;
		Book book = new Book(pages);
		for (int i=0; i<pages; i++){
			System.out.println(book.getCurrentPage());
			book.nextPage();
		}
		
	}

}