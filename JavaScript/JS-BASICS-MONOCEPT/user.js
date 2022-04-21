class User{
    constructor(name,age){
        this.name = name;
        this.age = age;
    }
}


function printName(user) {
    console.log(`User name is ${user.name}`);
}

function printAge(user){
    console.log(`User age is ${user.age}`);
}


export default User;

export {printName,printAge};