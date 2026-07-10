package first;

class book{
	private int id;
	private String name;
	private String author_name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor_name() {
		return author_name;
	}
	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}
}
public class Encapsulatioin2 {
	public static void main(String[]args) {
		book b = new book();
		b.setId(2);
		b.setName("the alchemist");
		b.setAuthor_name("paulo cohelo");
           
	           System.out.println(b.getId());
	           System.out.println(b.getName());
	           System.out.println(b.getAuthor_name());
	}}
