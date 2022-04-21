function makeCustomer(){
    let _id, _name;
    let customer = {};

    customer.setId = function (id){
        _id = id;
    }

    customer.setName = function (name){
        _name = name;
    }

    customer.getDetails = function (){
        return `Customer name: ${_name} and id: ${_id}`;
    }

    return customer;
}

let cust = makeCustomer();

console.log(cust);

cust.setId(12);
cust.setName("Rohan");
console.log(cust.getDetails());