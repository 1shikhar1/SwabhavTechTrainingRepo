const cPicker = document.getElementById("cPicker");

const dob = document.getElementById("dob");

const submit = document.getElementById("submit");

submit.addEventListener('click',()=>{
    document.body.style.background = cPicker.value;
    alert("Date of birth: "+dob.value);
});