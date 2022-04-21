const todos = (resource)=>{
    return new Promise((resolve,reject)=>{
        const request = new XMLHttpRequest();

        // request.open("get","https://jsonplaceholder.typicode.com/todos");
        request.open("get",resource);

        request.send();

        request.addEventListener('readystatechange',()=>{
            if(request.readyState==4 && request.status==200){
                // console.log(request,request.readyState);
                const data = JSON.parse(request.responseText);
                resolve(data);
            }else if(request.readyState==4){
                reject("Could not fetch data");
            }
    });
})};


todos("shikhar.json").then((data)=>{
    console.log("Shikhar data");
    console.log(data);
    return todos("rohan.json");
}).then((data)=>{
    console.log("Rohan data");
    console.log(data);
    return todos("ramya.json");
}).then((data)=>{
    console.log("Ramya data");
    return console.log(data);
}).catch((data)=>{
    console.log(data);
});