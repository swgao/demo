package javashangke;

public class Person {
		String id;
		String name;
		Person(String id,String name){
			this.id=id;
			this.name=name;;
		}
		void print() {
			System.out.println("id="+id+",name="+name);
		}
}
