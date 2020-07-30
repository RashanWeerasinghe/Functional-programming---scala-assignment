class Account(id:String,A_Number:Int,balance:Double)
{
	var nic=id
	var Acc_Number=A_Number
	var A_Balance=balance
}

object four
{
	def main(args:Array[String])
	{
		var a1=new Account("A1",1100,50000)

		var a2=new Account("A2",1101,10000)
		var a3=new Account("A3",1102,25000)

		var a4=new Account("A4",1103,-10000)
		var a5=new Account("A5",1104,-5000)
		var a6=new Account("A6",1105,0)
		val Bank:List[Account]=List(a1,a2,a3,a4,a5,a6)
		
		print("Account numbers  are = ")

		var O_list=over(Bank);

		O_list.foreach(x=>print(x.Acc_Number+"   "))

		var Total_Balance=bal(Bank)

		print("\nthe sum of all account balances ="+Total_Balance.A_Balance)

		print("\nthe final balances of all accounts after apply the interest function=")

		var i_List=Interest(Bank)

		i_List.foreach(x=>print(x+" "))
	}

	val over=(list:List[Account])=>list.filter(x=>x.A_Balance<=0)
	val bal=(list:List[Account])=>list.reduce((x,y)=>new Account("S000",1000,x.A_Balance+y.A_Balance))
	val Interest=(list:List[Account])=>list.map(x=>(if(x.A_Balance>0) x.A_Balance*1.05d else x.A_Balance*1.01d))
}
