package com.yourbookapp.bookapp.dataseed;

import com.yourbookapp.bookapp.data.AuthorRepository;
import com.yourbookapp.bookapp.data.BookRepository;
import com.yourbookapp.bookapp.data.GenreRepository;
import com.yourbookapp.bookapp.models.Author;
import com.yourbookapp.bookapp.models.Book;
import com.yourbookapp.bookapp.models.Genre;
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

    @Autowired
    GenreRepository genreRepository;

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

            Genre genre1 = new Genre("Literary realism");
            Genre genre2 = new Genre("Novel");
            Genre genre3 = new Genre("Biography");
            Genre genre4 = new Genre("Psychological fiction");
            Genre genre5 = new Genre("Literary fiction");
            Genre genre6 = new Genre("Drama");
            Genre genre7 = new Genre("Tragedy");
            Genre genre8 = new Genre("Romance");
            Genre genre9 = new Genre("Historical fiction");
            Genre genre10 = new Genre("Satire");
            Genre genre11 = new Genre("Fantasy fiction");
            Genre genre12 = new Genre("Absurdist fiction");
            Genre genre13 = new Genre("Crime fiction");
            Genre genre14 = new Genre("Science fiction");
            Genre genre15 = new Genre("Dystopian fiction");
            Genre genre16 = new Genre("Epic poetry");
            Genre genre17 = new Genre("Romanticism");
            Genre genre18 = new Genre("Gothic fiction");
            Genre genre19 = new Genre("Science");

            genreRepository.save(genre1);
            genreRepository.save(genre2);
            genreRepository.save(genre3);
            genreRepository.save(genre4);
            genreRepository.save(genre5);
            genreRepository.save(genre6);
            genreRepository.save(genre7);
            genreRepository.save(genre8);
            genreRepository.save(genre9);
            genreRepository.save(genre10);
            genreRepository.save(genre11);
            genreRepository.save(genre12);
            genreRepository.save(genre13);
            genreRepository.save(genre14);
            genreRepository.save(genre15);
            genreRepository.save(genre16);
            genreRepository.save(genre17);
            genreRepository.save(genre18);
            genreRepository.save(genre19);


            List<Author> authorsList1 = new ArrayList<>();
            authorsList1.add(author1);
            List<Genre>genreList1 = new ArrayList<>();
            genreList1.add(genre1);
            genreList1.add(genre2);
            Book book1 = new Book("Anna Karenina", "1481829580", "2012", 4, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1601352433l/15823480._SY475_.jpg", authorsList1, genreList1);
            List<Author> authorsList2 = new ArrayList<>();
            authorsList2.add(author2);
            List<Genre>genreList2 = new ArrayList<>();
            genreList2.add(genre3);
            Book book2 = new Book("The Diary of a Young Girl", "9780553296983", "1993", 3, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1601352433l/15823480._SY475_.jpg", authorsList2, genreList2);
            List<Author> authorsList3 = new ArrayList<>();
            authorsList3.add(author3);
            List<Genre>genreList3 = new ArrayList<>();
            genreList3.add(genre4);
            Book book3 = new Book("The Red and the Black", "0140447644 ", "2002", 3, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1601352433l/15823480._SY475_.jpg", authorsList3, genreList3);
            List<Author> authorsList4 = new ArrayList<>();
            authorsList4.add(author4);
            List<Genre>genreList4 = new ArrayList<>();
            genreList4.add(genre5);
            Book book4 = new Book("The Old Man and the Sea", "0684830493", "1996", 4, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1601352433l/15823480._SY475_.jpg", authorsList4, genreList4);
            List<Author> authorsList5 = new ArrayList<>();
            authorsList5.add(author5);
            Book book5 = new Book("Crime and Punishment", "0143058142", "2002", 4, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1601352433l/15823480._SY475_.jpg", authorsList5, genreList3);
            List<Genre>genreList5 = new ArrayList<>();
            genreList5.add(genre6);
            genreList5.add(genre7);
            Book book6 = new Book("The Idiot", "0679642420", "2003", 4, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1601352433l/15823480._SY475_.jpg", authorsList5, genreList5);
            List<Genre>genreList6 = new ArrayList<>();
            genreList6.add(genre1);
            Book book7 = new Book("Notes from Underground", "067973452X", "1994", 4, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1601352433l/15823480._SY475_.jpg", authorsList5, genreList6);
            List<Author> authorsList6 = new ArrayList<>();
            authorsList6.add(author6);
            List<Genre>genreList7 = new ArrayList<>();
            genreList7.add(genre8);
            Book book8 = new Book("The Sorrows of Young Werther", "0812969901", "2005", 3, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1601352433l/15823480._SY475_.jpg", authorsList6, genreList7);
            List<Genre>genreList8 = new ArrayList<>();
            genreList8.add(genre9);
            Book book9 = new Book("War and Peace", "0307277747", "2008", 4, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1601352433l/15823480._SY475_.jpg", authorsList5, genreList8);
            List<Author> authorsList7 = new ArrayList<>();
            authorsList7.add(author7);
            Book book10 = new Book("The Fortress", "0810117134", "1970", 4, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1601352433l/15823480._SY475_.jpg", authorsList7, genreList8);
            List<Author> authorsList8 = new ArrayList<>();
            authorsList8.add(author8);
            List<Genre>genreList9 = new ArrayList<>();
            genreList9.add(genre10);
            genreList9.add(genre11);
            Book book11 = new Book("The Master and Margarita", "0679760806", "1996", 4, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1327867963l/117833.jpg", authorsList8, genreList9);
            List<Genre>genreList10 = new ArrayList<>();
            genreList10.add(genre6);
            Book book12 = new Book("Death and the Dervish", "0810112973", "1996", 4, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1601352433l/15823480._SY475_.jpg", authorsList7, genreList10);
            List<Author> authorsList10 = new ArrayList<>();
            authorsList10.add(author10);
            Book book13 = new Book("The Bridge on the Drina", "0226020452 ", "1977", 4, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1601352433l/15823480._SY475_.jpg", authorsList10, genreList8);
            List<Author> authorsList11 = new ArrayList<>();
            authorsList11.add(author11);
            List<Genre>genreList11 = new ArrayList<>();
            genreList11.add(genre12);
            genreList11.add(genre13);
            Book book14 = new Book("The Stranger", "9780679720201", "1989", 4, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1601352433l/15823480._SY475_.jpg", authorsList11, genreList11);
            List<Author> authorsList12 = new ArrayList<>();
            authorsList12.add(author12);
            List<Genre>genreList12 = new ArrayList<>();
            genreList12.add(genre14);
            genreList12.add(genre15);
            Book book15 = new Book("Brave New World", "0060929871", "1998", 3, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1601352433l/15823480._SY475_.jpg", authorsList12, genreList12);
            List<Author> authorsList13 = new ArrayList<>();
            authorsList13.add(author13);
            Book book16 = new Book("The Magic Mountain", "0679772871", "1996", 4, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1601352433l/15823480._SY475_.jpg", authorsList13, genreList4);
            List<Author> authorsList14 = new ArrayList<>();
            authorsList14.add(author14);
            Book book17 = new Book("Les Misérables", "0449300021", "1982", 4, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1509394980l/36377471._SY475_.jpg", authorsList14, genreList8);
            List<Author> authorsList15 = new ArrayList<>();
            authorsList15.add(author15);
            List<Genre>genreList13 = new ArrayList<>();
            genreList13.add(genre7);
            Book book18 = new Book("Antigona", "9681509404", "2006", 3, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1445640597l/7698411._SY475_.jpg",authorsList15, genreList13);
            List<Author> authorsList9 = new ArrayList<>();
            authorsList9.add(author9);
            List<Genre>genreList14 = new ArrayList<>();
            genreList14.add(genre16);
            Book book19 = new Book("La Divina Commedia", "0679433139", "1995", 4, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1362129548l/15808636.jpg", authorsList9, genreList14);
            List<Genre>genreList15 = new ArrayList<>();
            genreList15.add(genre17);
            genreList15.add(genre18);
            Book book20 = new Book("The Hunchback of Notre-Dame", "0451527887", "2001", 4, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1388342667l/30597.jpg", authorsList14, genreList15);
            List<Author> authorsList16 = new ArrayList<>();
            authorsList16.add(author16);
            authorsList16.add(author17);
            List<Genre>genreList16 = new ArrayList<>();
            genreList16.add(genre19);
            Book book21 = new Book("Textbook of Medical Physiology", "0721602401", "2005", 4, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1386924074l/202734.jpg", authorsList16, genreList16);
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
