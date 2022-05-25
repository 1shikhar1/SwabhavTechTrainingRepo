var Customer = /** @class */ (function () {
    function Customer(_firstName, _lastName) {
        this._firstName = _firstName;
        this._lastName = _lastName;
        this.fullName = this._firstName + " " + this._lastName;
    }
    Object.defineProperty(Customer.prototype, "firstName", {
        get: function () {
            return this._firstName;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Customer.prototype, "lastName", {
        get: function () {
            return this._lastName;
        },
        enumerable: false,
        configurable: true
    });
    return Customer;
}());
var c = new Customer("Sachin", "Tendulkar");
console.log(c.firstName);
console.log(c.lastName);
console.log(c.fullName);
c.fullName = "Rohan Sahu";
console.log(c.firstName);
console.log(c.lastName);
console.log(c.fullName);
