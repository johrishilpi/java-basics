package assignments;

public class A37_MatchesStringFunction {

	public static void main(String[] args) {
    String name="manish kumar tiwari";
    System.out.println(name.matches("(.*)i"));
    System.out.println(name.matches("m(.*)"));
    System.out.println(name.matches("(.*)k(.*)"));
    String name1="tom";
    System.out.println(name1.matches("..."));
    

	}

}
