package lab3;

public class TestAuthor {
	public static void main(String args[]) {
		Author author1 = new Author("Camil Petrescu", "camil@petrescu.com",'m');
		Author author2 = new Author("Stephenie Meyer", "stephenie.meyer@twilight.saga",'f');
		Author author3 = new Author("Dan Brown","danbrown@gmail.com",'m');
	
		System.out.println(author1.toString());
		System.out.println(author2.toString());
		System.out.println(author3.toString());
		
		author1.setEmail("camil@yahoo.com");
		System.out.println("Setted a new e-mail adress to author1.");
	
		System.out.println(author1.toString());		
	}
}
