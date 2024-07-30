case class Book(title: String, author: String, isbn: String)

object LibraryManagement {

  var library: Set[Book] = Set(
    Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565"),
    Book("To Kill a Mockingbird", "Harper Lee", "9780061120084"),
    Book("1984", "George Orwell", "9780451524935")
  )

  def addBook(book: Book): Unit = {
    library += book
    println(s"Book '${book.title}' added to the library.")
  }

  def removeBook(isbn: String): Unit = {
    var itemFound = false
  
    for (book <- library) {
      if (book.isbn == isbn) {
        library -= book  // Remove the book from the library
        itemFound = true  
        println(s"Book '${book.title}' removed from the library.")
      }
    }

    if (!itemFound) {
      println(s"No book found with ISBN $isbn.")
    }
  }

  def checkBook(isbn: String): Boolean = {
    var found = false
    for (book <- library) {
      if (book.isbn == isbn) {
        found = true  // Book is found
      }
    }
    found 
  }

  def displayLibrary(): Unit = {
    if (library.isEmpty) {
      println("The library is empty.")
    } else {
      library.foreach { book =>
        println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}")
      }
    }
  }

  def searchBookByTitle(title: String): Boolean = {
    var found = false
    for (book <- library) {
      if (book.title == title) {
        found = true  // Book is found
      }
    }
    found  
  }

  def displayBooksByAuthor(author: String): Unit = {
    var itemFound = false

    for (book <- library) {
      if (book.author == author) {
        itemFound = true
        println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}")
      }
    }

    if (!itemFound) {
      println(s"No books found by author $author.")
    }
  }

  def main(args: Array[String]): Unit = {
  println("Initial Library Collection:")
  displayLibrary()

  println("\nAdding a new book:")
  addBook(Book("Brave New World", "Aldous Huxley", "9780060850524"))
  displayLibrary()

  println("\nRemoving a book by ISBN:")
  removeBook("9780451524935")
  displayLibrary()

  println("\nChecking if a book is in the library by ISBN:")
  println(checkBook("9780743273565"))

  println("\nSearching for a book by title:")
  val titleToSearch = "To Kill a Mockingbird"
  if (searchBookByTitle(titleToSearch)) {
    println(s"Book '$titleToSearch' found in the library.")
  } else {
    println(s"Book '$titleToSearch' not found in the library.")
  }

  println("\nDisplaying all books by a specific author:")
  displayBooksByAuthor("Harper Lee")
}
}