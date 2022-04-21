const todos= (Callback)=>{

const request = new XMLHttpRequest();

// request.open("get","https://jsonplaceholder.typicode.com/todos");
request.open("get","shikhar.json");

request.send();

request.addEventListener('readystatechange',()=>{
    if(request.readyState==4 && request.status==200){
        // console.log(request,request.readyState);
        const data = JSON.parse(request.responseText);
        Callback(undefined,data);
    }else if(request.readyState==4){
        Callback("Could not fetch data",undefined);
    }
});
}

todos((err, data)=>{
    console.log("Callback is fired");

    if(err)
    console.log(err);
    else
    console.log(data);
});