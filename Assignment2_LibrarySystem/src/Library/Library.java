package Library;

import java.util.*;

public class Library {
	
	private ArrayList<Book> books;
	private ArrayList<Patron> patrons;
	
	public Library() {
		books = new ArrayList<Book>();
		patrons = new ArrayList<Patron>();
	}
	
	public void addBook(Book myBook) {
		books.add(myBook);
	}
	
	public void removeBook(Book myBook) {
	    books.remove(myBook);
	}

	public ArrayList <Book> getBooks() {
	    return books;
	}
	
	// Initial Book Data
	public void getLibraryData() {  
		
		FictionBook book1 = new FictionBook("202001", "Adventures of Tom Sawyer         ", "Mark Twain", "Mystery", "978-048641", "Available");
	    FictionBook book2 = new FictionBook("202025", "Harry Potter and the Sorcerer's Stone", "J. K. Rowling", "Mystery", "444-395869", "Available");

	    NonFictionBook book3 = new NonFictionBook("202005", "Learn Java for Dummies           ", "John Smith", "Science", "AB0381AKEN", "Borrowed");
	    NonFictionBook book4 = new NonFictionBook("202006", "Learn JavaScript in 10 Minutes   ", "Jack Arnold", "Science", "NG0381AVUN", "Available");
	    NonFictionBook book5 = new NonFictionBook("202009", "Learning .Net is not boring      ", "Hungry Jack", "Science", "B00381AKHG", "Available");
	    
	    Book book6 = new Book("202010", "Shine while learing Ruby        ", "Britney Spears", "Science", "Available");
	    Book book7 = new Book("202011", "A journey to the centre of the earth", "Jules Verne", "Fiction", "Available");
	    Book book8 = new Book("202012", "Learn PHP and work in Facebook  ", "Bill Gate", "Science", "Available");
	    Book book9 = new Book("202013", "The Return of the King          ", "J.R.R. Tolkien", "Fantasy", "Borrowed");
	    Book book10 = new Book("202014", "Alice's Adventures in Wonderland", "Lewis Carroll", "Fantasy", "Borrowed");
	    Book book11 = new Book("202002", "Charlie and the Chocolate Factory", "Roald Dahl", "Fiction", "Borrowed");
	    Book book12 = new Book("202003", "The Lunar Chronicles series      ", "Marissa Meyer", "Fairy", "Available");
	    Book book13 = new Book("202004", "One Hundred Years of Solitude    ", "Gabriel Márquez", "Magical", "Available");
	    Book book14 = new Book("202007", "The Haunting of Hill House       ", "Shirley Jackson", "Horror", "Borrowed");
	    Book book15 = new Book("202008", "Tomorrow, and Tomorrow, and Tomorrow", "Gabrielle Zevin", "Fiction", "Available");
	    
	    addBook(book1);
	    addBook(book2);
	    addBook(book3);
	    addBook(book4);
	    addBook(book5);
	    addBook(book6);
	    addBook(book7);
	    addBook(book8);
	    addBook(book9);
	    addBook(book10);
	    addBook(book11);
	    addBook(book12);
	    addBook(book13);
	    addBook(book14);
	    addBook(book15);
	    
	    FacultyPatron user1 = new FacultyPatron(2020, "Allan Sherwood", "allan.sherwood@yahoo.com", "4088814551");
	    StudentPatron user2 = new StudentPatron(2021, "John Doe", "john.doe@example.com", "6698814551");
	    StudentPatron user3 = new StudentPatron(2022, "Christineb", "christineb@solarone.com", "4028814551");
	    StudentPatron user4 = new StudentPatron(2023, "David Goldstein", "david.goldstein@hotmail.com", "4058814551");
	   
	    addPatron(user1);
	    addPatron(user2);
	    addPatron(user3);
	    addPatron(user4);
	    
	    Transaction transaction1 = new Transaction(user1, book2);
	    user1.addToBorrowHistory(transaction1);
	    transaction1.setborrowedDate("03-10-2024");
	    transaction1.setreturnDate("06-23-2024");
	    
	    Transaction transaction2 = new Transaction(user1, book5);
	    user1.addToBorrowHistory(transaction2);
	    transaction2.setborrowedDate("01-17-2024");
	    transaction2.setreturnDate("06-17-2024");
	    		
	    Transaction transaction3 = new Transaction(user2, book7);
	    user2.addToBorrowHistory(transaction3);
	    transaction3.setborrowedDate("02-24-2024");
	    transaction3.setreturnDate("06-24-2024");
	    
	    Transaction transaction4 = new Transaction(user2, book13);
	    user2.addToBorrowHistory(transaction4);
	    transaction4.setborrowedDate("02-17-2023");
	    transaction4.setreturnDate("06-29-2024");
	    
	    Transaction transaction5 = new Transaction(user4, book14);
	    user4.addToBorrowHistory(transaction5);
	    transaction5.setborrowedDate("12-24-2023");
	    transaction5.setreturnDate("06-14-2024");
	}
	
	public void addPatron(Patron myUser) {
		patrons.add(myUser);
	}
	
	public void removePatron(Patron myUser) {
	    patrons.remove(myUser);
	}

	public ArrayList <Patron> getPatron() {
	    return patrons;
	}
	
	public Patron getPatron(int n) {
	    return patrons.get(n);
	}

	public int checkLogin(String email, String phone_number) {
		int index = - 1;
		for (Patron p: getPatron()) {
			if(p.email().equals(email) && p.phone_number().equals(phone_number)) {
				index = getPatron().indexOf(p);
				break;
			}	
		}
		return index;
	}
}
