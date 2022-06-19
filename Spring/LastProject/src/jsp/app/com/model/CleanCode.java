package jsp.app.com.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;


	public class CleanCode
	{

		EntityManagerFactory factory;
		EntityManager manager;

		public CleanCode() 
		{

			factory = Persistence.createEntityManagerFactory("LastProject");
			manager = factory.createEntityManager();
			manager.getTransaction().begin();
		}

		public void addBook(String bookTitle, String bookAuthor, int edition, double price, String Type) {
			BookEntityClass book = new BookEntityClass();
			book.setBookTitle(bookTitle);
			book.setBookAuthor(bookAuthor);
			book.setBookEdition(edition);
			book.setBookPrice(price);
			book.setBookType(Type);
			manager.persist(book);
			close();
		}

		public BookEntityClass searchBook(String bookTitle) {
			BookEntityClass book = manager.find(BookEntityClass.class, bookTitle);
			close();
			return book;
		}

		public BookEntityClass updateBook(String bookTitle, int edition) {
			BookEntityClass book = manager.find(BookEntityClass.class, bookTitle);
			book.setBookEdition(edition);
			close();
			return book;
		}

		public void removeBook(String bookTitle) {
			BookEntityClass book = manager.find(BookEntityClass.class, bookTitle);
			manager.remove(book);
			close();
		}

		public boolean login(String email, String password) {
			UserDetails ul = new UserDetails();
			ul = manager.find(UserDetails.class, email);
			if ((ul.getEmail().equals(email)) && (ul.getPassword().equals(password))) {
				close();
				return true;
			} else {
				close();
				return false;
			}
		}

		public String newUser(String email, String name, String password) {
			UserDetails ul = new UserDetails();
			ul.setEmail(email);
			ul.setName(name);
			ul.setPassword(password);
			manager.persist(ul);
			close();
			return "Details Added";
		}

		public boolean Forgotpass(String email) {
			UserDetails ul = manager.find(UserDetails.class, email);

			if (ul.getEmail().equals(email)) {
				close();
				return true;
			} else {
				close();
				return false;
			}

		}

		public String Updatepass(String email, String password, String cPassword) {
			if (password.equals(cPassword)) {
				UserDetails ul = manager.find(UserDetails.class, email);
				ul.setPassword(password);
				close();
				return "Updated";
			} else {
				close();
				return "not updated";
			}
		}

		public void close() {
			manager.getTransaction().commit();
		}
	}
	


