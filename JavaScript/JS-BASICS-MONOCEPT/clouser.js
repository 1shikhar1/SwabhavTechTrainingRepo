// let name = "shikhar";

// function printName(){
//     console.log(name);
// }

// name = "abhishek";

// printName();


function outerFunction(outerVariable){
    const outerMore = "hello";
    return (innerVariable)=>{
        console.log("Outer variable: "+outerVariable);
        console.log("Inner variable: "+innerVariable);
        console.log("Outer function local variable: "+outerMore);
    }
}

const myFunction = outerFunction("outside");

// console.log(myFunction);
myFunction("inside");