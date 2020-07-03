package javashangke;

public class Book4 {
	private String name;
	private double jiage;
	private String chubanshe;
	private String zuozhe;
	public Book4(String name, double jiage, String chubanshe, String zuozhe) {
		this.name = name;
		this.jiage = jiage;
		this.chubanshe = chubanshe;
		this.zuozhe = zuozhe;
	};
	public void print() {
		System.out.println("书名是《"+name+"》，作者是"+zuozhe+",他的价格是"+jiage+",出版社是"+chubanshe);
	}
}
