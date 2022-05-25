var Student = /** @class */ (function () {
    function Student(_rollNo, _name) {
        this._rollNo = _rollNo;
        this._name = _name;
    }
    Student.prototype.getDetails = function () {
        return "RollNo is " + this._rollNo + " name is " + this._name;
    };
    Object.defineProperty(Student.prototype, "name", {
        get: function () {
            return this._name;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Student.prototype, "rollNo", {
        set: function (no) {
            this._rollNo = no;
        },
        enumerable: false,
        configurable: true
    });
    return Student;
}());
var s1 = new Student(101, "Rohan");
console.log(s1.getDetails());
console.log(s1.name);
s1.rollNo = 201;
console.log(s1.getDetails());
