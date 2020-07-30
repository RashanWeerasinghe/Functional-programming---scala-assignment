class Rational(n:Int,d:Int)
{
    require(d>0,"d must be greater than 0");
    def numer=n/gcd(n,d);
    def denom=d/gcd(n,d);
    def this(n:Int)=this(n,1);
    private def gcd(a:Int,b:Int):Int = if(b==0) a else gcd(b,a%b);
    def +(r:Rational)=new Rational(this.numer*r.denom + this.denom*r.numer,this.denom*r.denom);
    def neg=new Rational(-this.numer,this.denom);
    def -(r:Rational)=this+r.neg;
    override def toString= numer+"/"+denom;
}

object two
{
	def main(args:Array[String])
	{
		println("X-Y-Z\n");

		val r1=new Rational(3,4);
		val r2=new Rational(5,8);
		val r3=new Rational(2,7);
		val r4=r1-r2-r3;
		println("X-Y-Z = "+r4);
	}

}
