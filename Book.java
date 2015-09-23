package book;

public class Book {
	private int numPages, currentPage;
	Book(int input) {
		numPages=input;
		currentPage=1;
	}
	int getNumPages() {
		return numPages;
	}
	int getCurrentPage() {
		return currentPage;
	}
	void nextPage() {
		if (currentPage<numPages){
			currentPage++;
		}
	}
}