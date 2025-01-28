/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class JUET{
    String name;
    int age;
    
    public String setName(String name){
        this.name=name;
    }
    public int setAge(int age){
        this.age=age;
    }
    public int getAge(int age){
        return age;
    }
     public String getName(String name){
        return name;
    }
}
public class Main
{
	public static void main(String[] args) {
	JUET juet= new JUET();
	juet.setAge(22);
	juet.setName("Harsh");
	}
}
