import {Account, Customer, Bank} from "./bank";

let c = new Customer("Sachin", "Tendulkar");
let b = new Bank("HDFC", "Hydrabad");
let a = new Account(2001, 5000);

console.log({c,b,a});