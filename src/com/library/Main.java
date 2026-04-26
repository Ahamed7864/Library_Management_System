package com.library;

import java.util.List;
import java.util.Scanner;

import com.library.factory.BookFactory;
import com.library.model.Book;
import com.library.model.Patron;
import com.library.repository.BookRepository;
import com.library.repository.PatronRepository;
import com.library.service.BookService;
import com.library.service.LendingService;
import com.library.strategy.TitleSearch;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);

        BookRepository bookRepo = new BookRepository();
        PatronRepository patronRepo = new PatronRepository();

        BookService bookService = new BookService(bookRepo);
        LendingService lendingService = new LendingService();

        Patron patron = new Patron("P1", "User");
        patronRepo.add(patron);

        while (true) {
            System.out.println("Library Menu");
            System.out.println("1. Add Book");
            System.out.println("2. Search Book");
            System.out.println("3. Remove Book");
            System.out.println("4. Checkout Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {

                case 1:
                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();

                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();

                    System.out.print("Enter Year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();

                    Book book = BookFactory.createBook(isbn, title, author, year);
                    bookService.addBook(book);

                    System.out.println("Book added successfully!");
                    break;

                case 2:
                    System.out.print("Enter title to search: ");
                    String keyword = scanner.nextLine();

                    List<Book> results = bookService.searchBooks(new TitleSearch(), keyword);

                    if (results.isEmpty()) {
                        System.out.println("No books found.");
                    } else {
                        System.out.println("Found books:");
                        results.forEach(b -> 
                            System.out.println(b.getIsbn() + " | " + b.getTitle() + " | " + b.getAuthor())
                        );
                    }
                    break;

                case 3:
                    System.out.print("Enter ISBN to remove: ");
                    String removeIsbn = scanner.nextLine();

                    if (bookRepo.get(removeIsbn) != null) {
                        bookRepo.getAll().remove(bookRepo.get(removeIsbn));
                        System.out.println("Book removed!");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter ISBN to checkout: ");
                    String checkoutIsbn = scanner.nextLine();

                    Book checkoutBook = bookRepo.get(checkoutIsbn);
                    if (checkoutBook != null) {
                        lendingService.checkout(checkoutBook, patron);
                        System.out.println("Book checked out!");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter ISBN to return: ");
                    String returnIsbn = scanner.nextLine();

                    Book returnBook = bookRepo.get(returnIsbn);
                    if (returnBook != null) {
                        lendingService.returnBook(returnBook, patron);
                        System.out.println("Book returned!");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    
}

}
