class account(id:String,A_Number:Int,balance:Double)
{
	var nic=id;
	var Acc_Number=A_Number;
	var A_Balance=balance;

	def withdraw(amount:Double)=if(A_Balance>amount) A_Balance=A_Balance-amount else println("not sufficient acount balance");
	def deposit(amount:Double)=A_Balance=A_Balance+amount;
	def transfer(acc:List[account],amount:Double)=
	{
		if(A_Balance>amount)
		{
			A_Balance=A_Balance-amount;
			acc.head.A_Balance=acc.head.A_Balance+amount;
		}
		else
		{
			println("not sufficient account balance");
		}
	}	
}

object three
{
	def main(args:Array[String])
	{
	
		println("\tBank method transfer ");

		var a1=new account("A1",1000,25000);
		var a2=new account("A2",1001,10000);
                 var a3=new account("A3",1002,20000);
		val bank:List[account]=List(a1,a2,a3);
		
		val x=find(1001,bank);
		a1.transfer(x,10000);

		println("Transferd Balance is = "+a1.A_Balance);
		println("Received Balance is = "+x.head.A_Balance);
	}

	val find=(Acc_Number:Int,list:List[account])=>list.filter(x=>x.Acc_Number.equals(Acc_Number));

}
