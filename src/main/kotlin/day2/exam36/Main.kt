package day2.exam36

// Getter와 Setter 모두 있는 경우, 커스텀 getter, setter

class Person(
    var name : String // var을 쓰면 자동으로 getter, setter가 생성된다.
){}

// 커스텀 getter, setter : 가상 필드 활용해 처리.
class Person2(
    private var _name: String
) {

    var name: String
        get() {
            if(_name.isEmpty()) {
                return "noname"
            }

            return _name
        }
        set(value) {
            if(value.isEmpty()) {
                println("이름은 공백일 수 없습니다.")
                _name = "noname"
            }
        }
}

fun main() {

    val p = Person2("")

//        p.name = ""
    println(p.name)

}