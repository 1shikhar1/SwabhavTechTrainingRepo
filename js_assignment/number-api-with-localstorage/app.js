
const todos = (resource)=>{
    return new Promise((resolve,reject)=>{
        const request = new XMLHttpRequest();
        request.open("get",resource);

        request.send();

        request.addEventListener('readystatechange',()=>{
            if(request.readyState==4 && request.status==200){
                resolve(request.responseText);
            }else if(request.readyState==4){
                reject("Could not fetch data");
            }
    });
})};


const btnInput = document.getElementById('btnInput');

btnInput.addEventListener('click',()=>{
	document.getElementById('error').innerHTML = "";
	let textBox = document.getElementById('textBox').value;

	if(textBox==''){
		document.getElementById('error').innerHTML = "<br>Please enter a number";
	}else{


        let itemList = document.getElementById('item-list');
        let li = document.createElement('li');
        li.id = "lst";
        // li.textContent = data;
        li.className = "list-group-item";

        // let deleteButton = document.createElement('button');
        // deleteButton.textContent = "x";
        // deleteButton.id = "delete";
        // li.appendChild(deleteButton);




        const savedData = localStorage.getItem("savedData");
        const retrivedData = JSON.parse(savedData);

        if(retrivedData!=null)
        console.log("saved_data: "+retrivedData[textBox]);

        if(retrivedData!=null && retrivedData[textBox]!=null)
        {
            li.textContent = retrivedData[textBox];

            let pos = itemList.firstElementChild;
            if(pos==null){
                itemList.appendChild(li);
            }else{
                itemList.insertBefore(li,pos);
            }

        } else if(retrivedData!=null && retrivedData[textBox]==null){
            
            let listData = "";
            let url = "http://numbersapi.com/";
            url += textBox;

            todos(url).then((data)=>{
                // console.log(data);

                const now = new Date();

                retrivedData[textBox] = data+"\nAlready searched at "+now;

                localStorage.setItem("savedData",JSON.stringify(retrivedData));

                li.textContent = data;

                let pos = itemList.firstElementChild;
                if(pos==null){
                    itemList.appendChild(li);
                }else{
                    itemList.insertBefore(li,pos);
                }
    
            }).catch((data)=>{
                alert(data);
            });



        } else{

        let listData = "";
        let url = "http://numbersapi.com/";
        url += textBox;

        todos(url).then((data)=>{
            // console.log(data);

            const now = new Date();

            let myArray = {}
            console.log(typeof data);
            myArray[textBox]=data+"\nAlready searched at "+now;


            localStorage.setItem("savedData",JSON.stringify(myArray));


            li.textContent = data;


            let pos = itemList.firstElementChild;
            if(pos==null){
                itemList.appendChild(li);
            }else{
                itemList.insertBefore(li,pos);
            }

        }).catch((data)=>{
            alert(data);
        });
        }
	}

	document.getElementById('textBox').value = "";
});


let btn = document.querySelector('ul');

btn.addEventListener('click',function(e){
	let itemList = document.getElementById('item-list');
	let li = e.target.parentNode;
	console.log(e.target.parentNode);
	itemList.removeChild(li);
});

