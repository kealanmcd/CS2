public class TestClass {
  public static void main(String[] args) {

    Reader Tom = new Reader("Tom");
    Bookcase shelf = new Bookcase();

    Book booksArray[] = new Book[] {
        new Book("The Lord of the Rings: The Fellowship of the Ring", "J. R. R. Tolkien", 1001),
        new Book("The Lord of the Rings: The Two Towers", "J. R. R. Tolkien", 1002),
        new Book("The Lord of the Rings: The Return of the King", "J. R. R. Tolkien", 1003),
        new Book("The Hobbit", "J. R. R. Tolkien", 1004),
        new Book("Harry Potter: Philosopher's Stone", "J. K. Rowling", 1005),      
        new Book("Harry Potter: Chamber of Secrets", "J. K. Rowling", 1006),
        new Book("Harry Potter: Prisoner of Azkaban", "J. K. Rowling", 1007),
        new Book("Harry Potter: Goblet of Fire", "J. K. Rowling", 1008),
        new Book("Harry Potter: Order of the Phoenix", "J. K. Rowling", 1009),
        new Book("Harry Potter: Half-Blood Prince", "J. K. Rowling", 1010),
        new Book("Harry Potter: Deathly Hallows", "J. K. Rowling", 1011),
        new Book("Brave New World", "Aldous Huxley", 1012),
        new Book("To Kill a Mockingbird", "Harper Lee", 1013),
        new Book("The Shining", "Stephen King", 1014),
        new Book("Nineteen Eighty-Four", "George Orwell", 1015),
        new Book("Animal Farm", "George Orwell", 1016),
        new Book("Charlie and the Chocolate Factory", "Roald Dahl", 1017),
        new Book("Matilda", "Roald Dahl", 1018),
        new Book("The BFG", "Roald Dahl", 1019),
        new Book("The Witches", "Roald Dahl", 1020),
        new Book("The Twits", "Roald Dahl", 1021),
        new Book("James and the Giant Peach", "Roald Dahl", 1022),
        new Book("Fantastic Mr Fox", "Roald Dahl", 1023),
        new Book("Oliver Twist", "Charles Dickens", 1024),
        new Book("Great Expectations", "Charles Dickens", 1025),
        new Book("The Sheep-Pig", "Dick King-Smith", 1026),
        new Book("The Fox Busters", "Dick King-Smith", 1027),
        new Book("The Hodgeheg", "Dick King-Smith", 1028),
        new Book("Martin's Mice", "Dick King-Smith", 1029),
        new Book("Invisible Dog", "Dick King-Smith", 1030),
        new Book("The Water Horse", "Dick King-Smith", 1031),
        new Book("The Queen's Nose", "Dick King-Smith", 1032),
        new Book("Animal Stories", "Dick King-Smith", 1033),
        new Book("Sophie's Snail", "Dick King-Smith", 1034),
        new Book("Sophie's Tom", "Dick King-Smith", 1035),
        new Book("Lady Lollipop", "Dick King-Smith", 1036),
        new Book("Harriet's Hare", "Dick King-Smith", 1037),
        new Book("A Mouse Called Wolf", "Dick King-Smith", 1038),
        new Book("George Speaks", "Dick King-Smith", 1039),
        new Book("Sophie Is Seven", "Dick King-Smith", 1040),
        new Book("The Cuckoo Child", "Dick King-Smith", 1041),
        new Book("Ace, the Very Important Pig", "Dick King-Smith", 1042),
        new Book("The Crowstarver", "Dick King-Smith", 1043),
        new Book("Sophie's Lucky", "Dick King-Smith", 1044),
        new Book("The School Mouse", "Dick King-Smith", 1045),
        new Book("Aristotle", "Dick King-Smith", 1046),
        new Book("Titus Rules!", "Dick King-Smith", 1047),
        new Book("Dinosaur Trouble", "Dick King-Smith", 1048),
        new Book("Sophie Hits Six", "Dick King-Smith", 1049),
        new Book("Three Terrible Trins", "Dick King-Smith", 1050)
    };

    for (int i = 0; i < 50; i++) {
        shelf.placeOnShelf(booksArray[i]);
    }

    shelf.printAllBooks();

    System.out.println();
    Tom.retrieveBook(shelf, booksArray[1]);
    Tom.getBook();
    System.out.println();
    shelf.printAllBooks();
    System.out.println();
    
    Tom.placeBookOnShelf(shelf);
    shelf.printAllBooks();
    System.out.println();

    Tom.getBook();
    Tom.retrieveBook(shelf, booksArray[3]);
    Tom.getBook();
    Tom.retrieveBook(shelf, booksArray[7]);

    System.out.println();
    Tom.getBook();
    Tom.placeBookOnShelf(shelf);
    Tom.getBook();
    System.out.println();
    shelf.placeOnShelf(booksArray[0]);
    shelf.placeOnShelf(booksArray[0]);

   // shelf.printAllBooks();

  }
}
