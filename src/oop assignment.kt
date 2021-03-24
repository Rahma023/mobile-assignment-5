fun main() {
var Faiz=Human("Rahma",40,40.2.toFloat())
    Faiz.eat(9)
    println(Faiz.weight)

    Faiz.speak("I am clever")
    Faiz.birthday()

    var fullName=User("Halima","Yusuf","halimayusuf@gmail.com","0797776371","hal384")
    println(fullName.email)
    println(fullName.phoneNumber)

}


class Human(var name:String,var age:Int,var weight:Float){
    fun eat(foodWeight:Int):Float{
        println( "I am eating $foodWeight kgs of food")
        weight=weight+foodWeight
        return weight

    }
    fun speak(speech:String){
        println("$speech")
        }
    fun birthday(){
        age++
        println(age)

    }
}
data class User(var firstName:String,var lastName:String,var email:String,var phoneNumber:String,var password:String)

