"use strict";
exports.__esModule = true;
var im = require("./bank");
var c = new im.Customer("Sachin", "Tendulkar");
var b = new im.Bank("HDFC", "Hydrabad");
var a = new im.Account(2001, 5000);
console.log({ c: c, b: b, a: a });
