
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

        let listData = "";
        let url = "http://numbersapi.com/";
        url += textBox;

        todos(url).then((data)=>{
            // console.log(data);
            
            let itemList = document.getElementById('item-list');
            let li = document.createElement('li');
            li.id = "lst";
            li.textContent = data;
            li.className = "list-group-item";

            // if(textBox%2==0)
            // {
            //     const lst = document.getElementById("lst");

            //     lst.setAttribute("style","background-color: red");
            // }
    
            let deleteButton = document.createElement('button');
            deleteButton.textContent = "x";
            deleteButton.id = "delete";
            li.appendChild(deleteButton);
    
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

	document.getElementById('textBox').value = "";
});


let btn = document.querySelector('ul');

btn.addEventListener('click',function(e){
	let itemList = document.getElementById('item-list');
	let li = e.target.parentNode;
	console.log(e.target.parentNode);
	itemList.removeChild(li);
});

