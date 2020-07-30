class Rational(n:Int,d:Int)
{
	require(d>0,"d must be greater than 0");
    def numer=n/gcd(n,d);
    def denom=d/gcd(n,d);
    def this(n:Int)=this(n,1);
    private def gcd(a:Int,b:Int):Int = if(b==0) a else gcd(b,a%b);
    def neg=new Rational(-this.numer,this.denom);
    override def toString= numer+"/"+denom;
}

object one
{
	def main(args:Array[String])
	{
		val r1=new Rational(7,11);
		val r2=r1.neg
		println("number   = "+r1);
		println("negetion = "+r2);
	}

}
