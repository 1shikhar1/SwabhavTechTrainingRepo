class Student{
    constructor(private _rollNo: number, private _name: string){

    }

    getDetails(){
        return "RollNo is "+this._rollNo+" name is "+this._name;
    }

    get name(){
        return this._name;
    }

    set rollNo(no: number){
        this._rollNo = no;
    }
}

let s1: Student = new Student(101,"Rohan");
console.log(s1.getDetails());
console.log(s1.name);

s1.rollNo = 201;
console.log(s1.getDetails());