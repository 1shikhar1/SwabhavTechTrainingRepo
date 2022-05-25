import * as im from "./bank";

let c = new im.Customer("Sachin", "Tendulkar");
let b = new im.Bank("HDFC", "Hydrabad");
let a = new im.Account(2001, 5000);

console.log({c,b,a});