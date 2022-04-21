
const btnInput = document.getElementById('btnInput');

btnInput.addEventListener('click',()=>{
	

// const addMoreFun = function addMore() {
	document.getElementById('error').innerHTML = "";
	let textBox = document.getElementById('textBox').value;

	if(textBox==''){
		document.getElementById('error').innerHTML = "<br>Please enter something";
	}else{
		let itemList = document.getElementById('item-list');
		let li = document.createElement('li');
		li.textContent = textBox;
		li.className = "list-group-item";


		let deleteButton = document.createElement('a');
		deleteButton.textContent = "delete";
		deleteButton.href = "javascript:void(0)";
		deleteButton.id = "delete";
		li.appendChild(deleteButton);


		let editButton = document.createElement('a');
		editButton.textContent = "edit";
		editButton.href = "javascript:void(0)";
		editButton.id = 'edit';
		li.appendChild(editButton);
		

		let pos = itemList.firstElementChild;
		if(pos==null){
			itemList.appendChild(li);
		}else{
			itemList.insertBefore(li,pos);
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

