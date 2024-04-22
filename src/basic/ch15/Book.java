package basic.ch15;

public class Book {

	private int totalPage;
	private String title;
	private String author;

	// 생성자
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public Book(String title, String author, int totalPage) {
		this(title, author);
		this.totalPage = totalPage;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public void showInfo() {
		System.out.println(">>> 책 정보 <<<");
		System.out.println("제목 : " + title);
		System.out.println("저자 : " + author);
	}
}
