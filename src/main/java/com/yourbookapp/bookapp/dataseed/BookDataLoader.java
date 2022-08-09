package com.yourbookapp.bookapp.dataseed;

import com.yourbookapp.bookapp.data.BookRepository;
import com.yourbookapp.bookapp.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BookDataLoader implements CommandLineRunner {

    @Autowired
    BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {
        loadBookData();
    }

    private void loadBookData() {
        if(bookRepository.count() == 0 ) {
            Book book1 = new Book("Anna Karenina", "1481829580", "2012", 4, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1601352433l/15823480._SY475_.jpg");
            Book book2 = new Book("The Diary of a Young Girl", "9780553296983", "1993", 3, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1601352433l/15823480._SY475_.jpg");
            Book book3 = new Book("The Red and the Black", "0140447644 ", "2002", 3, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1601352433l/15823480._SY475_.jpg");
            Book book4 = new Book("The Old Man and the Sea", "0684830493", "1996", 4, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1601352433l/15823480._SY475_.jpg");
            Book book5 = new Book("Crime and Punishment", "0143058142", "2002", 4, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1601352433l/15823480._SY475_.jpg");
            Book book6 = new Book("The Idiot", "0679642420", "2003", 4, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1601352433l/15823480._SY475_.jpg");
            Book book7 = new Book("Notes from Underground", "067973452X", "1994", 4, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1601352433l/15823480._SY475_.jpg");
            Book book8 = new Book("The Sorrows of Young Werther", "0812969901", "2005", 3, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1601352433l/15823480._SY475_.jpg");
            Book book9 = new Book("War and Peace", "0307277747", "2008", 4, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1601352433l/15823480._SY475_.jpg");
            Book book10 = new Book("The Fortress", "0810117134", "1970", 4, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1601352433l/15823480._SY475_.jpg");
            Book book11 = new Book("The Master and Margarita", "0679760806", "1996", 4, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1327867963l/117833.jpg");
            Book book12 = new Book("Death and the Dervish", "0810112973", "1996", 4, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1601352433l/15823480._SY475_.jpg");
            Book book13 = new Book("The Bridge on the Drina", "0226020452 ", "1977", 4, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1601352433l/15823480._SY475_.jpg");
            Book book14 = new Book("The Stranger", "9780679720201", "1989", 4, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1601352433l/15823480._SY475_.jpg");
            Book book15 = new Book("Brave New World", "0060929871", "1998", 3, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1601352433l/15823480._SY475_.jpg");
            Book book16 = new Book("The Magic Mountain", "0679772871", "1996", 4, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1601352433l/15823480._SY475_.jpg");
            Book book17 = new Book("Les Misérables", "0449300021", "1982", 4, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1509394980l/36377471._SY475_.jpg");
            Book book18 = new Book("Antigona", "9681509404", "2006", 3, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1445640597l/7698411._SY475_.jpg");
            Book book19 = new Book("La Divina Commedia", "0679433139", "1995", 4, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1362129548l/15808636.jpg");
            Book book20 = new Book("The Hunchback of Notre-Dame", "0451527887", "2001", 4, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1388342667l/30597.jpg");
            bookRepository.save(book1);
            bookRepository.save(book2);
            bookRepository.save(book3);
            bookRepository.save(book4);
            bookRepository.save(book5);
            bookRepository.save(book6);
            bookRepository.save(book7);
            bookRepository.save(book8);
            bookRepository.save(book9);
            bookRepository.save(book10);
            bookRepository.save(book11);
            bookRepository.save(book12);
            bookRepository.save(book13);
            bookRepository.save(book14);
            bookRepository.save(book15);
            bookRepository.save(book16);
            bookRepository.save(book17);
            bookRepository.save(book18);
            bookRepository.save(book19);
            bookRepository.save(book20);

        }
    }
}
