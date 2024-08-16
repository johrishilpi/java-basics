package java_programs;

public class GlobalVariable {
int a=10;
static int b=20;
void man()
{
	final double pi=3.14;
	System.out.println(pi);
}
	public static void main(String[] args) {
	int z;
	System.out.println(b);
	GlobalVariable g1=new GlobalVariable();
	System.out.println(g1.a);
	g1.man();

	}

}
