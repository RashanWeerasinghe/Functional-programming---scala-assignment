object caesara{

def main(args:Array[String]){
print("Enter the text:");
var s=scala.io.StdIn.readLine();
print("Enter the key:");
var x=scala.io.StdIn.readInt();


val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

val E=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size)

val D=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)-key)%a.size)

val cipher=(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a))


val ct=cipher(E,s,x,alphabet)

val pt=cipher(D,ct,x,alphabet)


println("Encripted string: "+ct)
println("Decripted string: "+pt)
}
}