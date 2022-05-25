"use strict";
exports.__esModule = true;
exports.Customer = exports.Account = exports.Bank = void 0;
var Bank = /** @class */ (function () {
    function Bank(name, location) {
        this.name = name;
        this.location = location;
    }
    return Bank;
}());
exports.Bank = Bank;
var Account = /** @class */ (function () {
    function Account(accNo, balance) {
        this.accNo = accNo;
        this.balance = balance;
    }
    return Account;
}());
exports.Account = Account;
var Customer = /** @class */ (function () {
    function Customer(firstName, lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    return Customer;
}());
exports.Customer = Customer;
