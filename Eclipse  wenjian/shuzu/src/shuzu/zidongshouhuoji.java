package shuzu;

public class zidongshouhuoji {
    int jiage=80;
    int yue;
    int total;
    void shopPromt() //��ӭ
    {
  	  System.out.println("Welcome");
    }
    void insertMomey(int amount)//��Ǯ
    {
  	  yue = yue+amount;
    }
    void showBalance()  //���ж�Ǯ
    {
  	  System.out.println(yue);
    }
    void getFood()//������
    {
  	  if(yue>=jiage) {
  	  System.out.println("Here you are");
  	  yue= yue-jiage;
  	  total = total+jiage;}
  	  else
  		  System.out.println("�������Ǯ����");
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

