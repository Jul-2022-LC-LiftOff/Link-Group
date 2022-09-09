package com.yourbookapp.bookapp.dataseed;

import com.yourbookapp.bookapp.data.AuthorRepository;
import com.yourbookapp.bookapp.data.BookRepository;
import com.yourbookapp.bookapp.models.Author;
import com.yourbookapp.bookapp.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookDataLoader implements CommandLineRunner {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    AuthorRepository authorRepository;

    @Override
    public void run(String... args) throws Exception {
        loadBookData();
    }

    private void loadBookData() {

        if(authorRepository.count() == 0 ) {
            Author author1 = new Author("Leo Tolstoy");
            Author author2 = new Author("Anne Frank");
            Author author3 = new Author("Stendhal");
            Author author4 = new Author("Ernest Hemingway");
            Author author5 = new Author("Fyodor Dostoevsky");
            Author author6 = new Author("Johann Wolfgang von Goethe");
            Author author7 = new Author("Mesa Selimovic");
            Author author8 = new Author("Mikhail Bulgakov");
            Author author9 = new Author("Dante Alighieri");
            Author author10 = new Author("Ivo Andric ");
            Author author11 = new Author("Albert Camus");
            Author author12 = new Author("Aldous Huxley");
            Author author13 = new Author("Thomas Mann");
            Author author14 = new Author("Victor Hugo");
            Author author15 = new Author("Sophocles");
            Author author16 = new Author("Arthur C. Guyton");
            Author author17 = new Author("John E. Hall");

            authorRepository.save(author1);
            authorRepository.save(author2);
            authorRepository.save(author3);
            authorRepository.save(author4);
            authorRepository.save(author5);
            authorRepository.save(author6);
            authorRepository.save(author7);
            authorRepository.save(author8);
            authorRepository.save(author9);
            authorRepository.save(author10);
            authorRepository.save(author11);
            authorRepository.save(author12);
            authorRepository.save(author13);
            authorRepository.save(author14);
            authorRepository.save(author15);
            authorRepository.save(author16);
            authorRepository.save(author17);


            List<Author> authorsList1 = new ArrayList<>();
            authorsList1.add(author1);
            Book book1 = new Book("Anna Karenina", "1481829580", "2012", 4, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1601352433l/15823480._SY475_.jpg", authorsList1);
            List<Author> authorsList2 = new ArrayList<>();
            authorsList2.add(author2);
            Book book2 = new Book("The Diary of a Young Girl", "9780553296983", "1993", 3, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1601352433l/15823480._SY475_.jpg", authorsList2);
            List<Author> authorsList3 = new ArrayList<>();
            authorsList3.add(author3);
            Book book3 = new Book("The Red and the Black", "0140447644 ", "2002", 3, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1601352433l/15823480._SY475_.jpg", authorsList3);
            List<Author> authorsList4 = new ArrayList<>();
            authorsList4.add(author4);
            Book book4 = new Book("The Old Man and the Sea", "0684830493", "1996", 4, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1601352433l/15823480._SY475_.jpg", authorsList4);
            List<Author> authorsList5 = new ArrayList<>();
            authorsList5.add(author5);
            Book book5 = new Book("Crime and Punishment", "0143058142", "2002", 4, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1601352433l/15823480._SY475_.jpg", authorsList5);
            Book book6 = new Book("The Idiot", "0679642420", "2003", 4, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1601352433l/15823480._SY475_.jpg", authorsList5);
            Book book7 = new Book("Notes from Underground", "067973452X", "1994", 4, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1601352433l/15823480._SY475_.jpg", authorsList5);
            List<Author> authorsList6 = new ArrayList<>();
            authorsList6.add(author6);
            Book book8 = new Book("The Sorrows of Young Werther", "0812969901", "2005", 3, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1601352433l/15823480._SY475_.jpg", authorsList6);
            Book book9 = new Book("War and Peace", "0307277747", "2008", 4, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1601352433l/15823480._SY475_.jpg", authorsList5);
            List<Author> authorsList7 = new ArrayList<>();
            authorsList7.add(author7);
            Book book10 = new Book("The Fortress", "0810117134", "1970", 4, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1601352433l/15823480._SY475_.jpg", authorsList7);
            List<Author> authorsList8 = new ArrayList<>();
            authorsList8.add(author8);
            Book book11 = new Book("The Master and Margarita", "0679760806", "1996", 4, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1327867963l/117833.jpg", authorsList8);
            Book book12 = new Book("Death and the Dervish", "0810112973", "1996", 4, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1601352433l/15823480._SY475_.jpg", authorsList7);
            List<Author> authorsList10 = new ArrayList<>();
            authorsList10.add(author10);
            Book book13 = new Book("The Bridge on the Drina", "0226020452 ", "1977", 4, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1601352433l/15823480._SY475_.jpg", authorsList10);
            List<Author> authorsList11 = new ArrayList<>();
            authorsList11.add(author11);
            Book book14 = new Book("The Stranger", "9780679720201", "1989", 4, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1601352433l/15823480._SY475_.jpg", authorsList11);
            List<Author> authorsList12 = new ArrayList<>();
            authorsList12.add(author12);
            Book book15 = new Book("Brave New World", "0060929871", "1998", 3, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1601352433l/15823480._SY475_.jpg", authorsList12);
            List<Author> authorsList13 = new ArrayList<>();
            authorsList13.add(author13);
            Book book16 = new Book("The Magic Mountain", "0679772871", "1996", 4, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1601352433l/15823480._SY475_.jpg", authorsList13);
            List<Author> authorsList14 = new ArrayList<>();
            authorsList14.add(author14);
            Book book17 = new Book("Les Misérables", "0449300021", "1982", 4, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1509394980l/36377471._SY475_.jpg", authorsList14);
            List<Author> authorsList15 = new ArrayList<>();
            authorsList15.add(author15);
            Book book18 = new Book("Antigona", "9681509404", "2006", 3, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1445640597l/7698411._SY475_.jpg",authorsList15);
            List<Author> authorsList9 = new ArrayList<>();
            authorsList9.add(author9);
            Book book19 = new Book("La Divina Commedia", "0679433139", "1995", 4, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1362129548l/15808636.jpg", authorsList9);
            Book book20 = new Book("The Hunchback of Notre-Dame", "0451527887", "2001", 4, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1388342667l/30597.jpg", authorsList14);
            List<Author> authorsList16 = new ArrayList<>();
            authorsList16.add(author16);
            authorsList16.add(author17);
            Book book21 = new Book("Textbook of Medical Physiology", "0721602401", "2005", 4, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1386924074l/202734.jpg", authorsList16);
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
            bookRepository.save(book21);
        }

    }
}
