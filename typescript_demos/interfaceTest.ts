interface ICustomer{
    id:number
    firstName : string
    lastName : string
    location ? : string
}

function printDetails(customers : Array<ICustomer>)
{
    for(let c of customers){
        console.log(c);
    }
}

printDetails([{id: 101, firstName: "Sachin", lastName: "Tendulkar"},
{id: 102, firstName: "Rahul", lastName: "Dravid", location: "Mumbai"}])