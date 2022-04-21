const doSomething = ()=>{
    return new Promise((resolve,reject)=>{
        resolve("data received");
        // reject("data could not be fetched");
    });
};


doSomething().then((data)=>{
    console.log(data);
}).catch((data)=>{
    console.log(data);
});