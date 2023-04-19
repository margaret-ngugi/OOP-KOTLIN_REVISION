fun main() {
//Q1.
    var Ann = Human("Ann",20,58)
    Ann.eat(5)
    Ann.speak("What is your name?")
    Ann.birthday(20)


//Q2
    var information = Information("Faith","Wambui","faithwambui@gmail.com","+25456789043","weyricnajd")
    println(information.lastName)
    println(information.password)



}
//Create a class called Human with these attributes: name, age, weight. It has
//the following functions:

// eat(foodWeight: Int) :Prints “I am eating {foodWeight} kgs of food”
// and increments the human’s weight by the weight of the food eaten

//- speak(speech: String) :Prints the string passed to it

//birthday( ) :Increments the human’s age by 1

//Create an instance of this human class and invoke all its functions
class Human(var name: String,var age: Int,var weight: Int){


    fun eat(foodWeight:Int){
        println("I am eating food ${foodWeight} kg of food")
        weight += foodWeight
        println(weight)
    }
    fun speak(speech: String){
        println(speech)
    }
    fun birthday(date: Int){
        age += 1
        println(age)

    }
}

//Create a data class User with these fields: firstName, lastName, email,
//phoneNumber, password. Create an instance of User and print out any 2
//attributes
data class Information(var firstName:String,var lastName:String,var email:String,var phoneNumber:String,var password:String)


//My key takeaways are:
//When a function is declared inside a class, it is known as a class function, or member function.
// When an object of the class is created, it has access to all of the class functions.
//Class and Objects are the basic concepts of object-oriented programming language