"use strict";
exports.__esModule = true;
var bank_1 = require("./bank");
var c = new bank_1.Customer("Sachin", "Tendulkar");
var b = new bank_1.Bank("HDFC", "Hydrabad");
var a = new bank_1.Account(2001, 5000);
console.log({ c: c, b: b, a: a });
