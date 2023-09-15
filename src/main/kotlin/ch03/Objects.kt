package ch03

// 자바의 싱글턴 생성패턴을 사용하는 클래스를
// object 키워드 선언할 수 있음, 근데 사용은 static 처럼 사용하면 된다
// static 처럼 키워드(object)만으로 선언이 편하고,
// 코드작성 생산성(싱글턴작성x) 메모리사용 최적화(싱글턴)는 가능하게 해놓음
object Singleton {
    var value: String = "I am a singleton!"

    fun showMessage(){
        println("Message from singleton: $value")
    }
}

fun main() {
    Singleton.showMessage()
    Singleton.value = "new value"
    Singleton.showMessage()

    // object expression(객체 표현식)
    // js: 변수 = 식 (표현식), 함수 표현식
    // const func = () => {console.log("aa")}
    // 코틀린: 변수 = 객체식,
    val myObject = object {
        var value: String = "I am a anonumous object"

        fun showMessage() {
            println("Message from anonumous object: $value")
        }
    }

    myObject.showMessage()
}