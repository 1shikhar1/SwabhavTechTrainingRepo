class Customer{
    
    constructor(private _firstName:string, private _lastName:string){

    }

    fullName: string = this._firstName+" "+this._lastName;

    get firstName(){
        return this._firstName;
    }

    get lastName(){
        return this._lastName;
    }

    
}

let c: Customer = new Customer("Sachin","Tendulkar");

console.log(c.firstName);
console.log(c.lastName);
console.log(c.fullName);

c.fullName = "Rohan Sahu";

console.log(c.firstName);
console.log(c.lastName);
console.log(c.fullName);