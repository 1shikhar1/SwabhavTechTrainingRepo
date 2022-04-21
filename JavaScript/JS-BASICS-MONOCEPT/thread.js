const worker = new Worker("worker.js");
const sumButton = document.querySelector("#sumButton");
const bgButton = document.querySelector("#bgButton");

sumButton.addEventListener('click',()=>{
    worker.postMessage("Hello world");
    // let sum = 0;
    // for(let i=0;i<1000000000;i++){
    //     sum += i;
    // }

    // alert("sum is: "+sum);
});

worker.onmessage = (message)=>{
    console.log(message.data);
    alert("Final sum is: "+message.data);
};

bgButton.addEventListener('click',()=>{
    if(document.body.style.backgroundColor!="green"){
        document.body.style.backgroundColor = "green";
    }else{
        document.body.style.backgroundColor = "blue";
    }
        
});