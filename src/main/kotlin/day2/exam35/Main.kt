package day2.exam35

// Setter만 있는 경우(보통 잘 안씀)
class Person(){
    private var _name : String = ""

    var name : String
        get() = throw IllegalAccessException("읽을 수 없습니다.");
    set(value) {
        _name = value;
    }
}
