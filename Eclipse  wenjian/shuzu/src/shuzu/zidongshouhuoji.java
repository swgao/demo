package shuzu;

public class zidongshouhuoji {
    int jiage=80;
    int yue;
    int total;
    void shopPromt() //欢迎
    {
  	  System.out.println("Welcome");
    }
    void insertMomey(int amount)//放钱
    {
  	  yue = yue+amount;
    }
    void showBalance()  //你有多钱
    {
  	  System.out.println(yue);
    }
    void getFood()//卖东西
    {
  	  if(yue>=jiage) {
  	  System.out.println("Here you are");
  	  yue= yue-jiage;
  	  total = total+jiage;}
  	  else
  		  System.out.println("你输入的钱不够");
    }
    
	public static void main(String[] args) {
		zidongshouhuoji vm= new zidongshouhuoji();
        vm.shopPromt();
        vm.showBalance();
        vm.insertMomey(100);
        vm.getFood();
        vm.showBalance();
	}
}

