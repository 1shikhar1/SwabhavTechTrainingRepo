const todos= (resource,Callback)=>{

    const request = new XMLHttpRequest();
    
    // request.open("get","https://jsonplaceholder.typicode.com/todos");
    request.open("get",resource);
    
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
    
    todos("shikhar.json",(err, data)=>{
        console.log(data);
        todos("rohan.json",(err, data)=>{
            console.log(data);
            todos("ramya.json",(err, data)=>{
                console.log(data)
            });
        });
    });