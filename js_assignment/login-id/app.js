var signInWindow = document.getElementById('id01');

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
    if (event.target == signInWindow) {
        signInWindow.style.display = "none";
    }
}



var signUpWindow = document.getElementById('id02');

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
  if (event.target == signUpWindow) {
    signUpWindow.style.display = "none";
  }
}



const signin = document.getElementById('signin');

signin.addEventListener('click',()=>{

    let x = document.getElementById("signin-form");

    email = x.elements["email"].value;
    password = x.elements["psw"].value;
    
    const savedData = localStorage.getItem("userDetails");
    const retrivedData = JSON.parse(savedData);


    if(email==retrivedData["email"] && password==retrivedData["password"]){
        alert("Authentication successful");
    } else{
        alert("Authentication unsuccessful");
    }
    
})









const signup = document.getElementById('signup');


signup.addEventListener('click',()=>{
    let x = document.getElementById("signup-form");

   email = x.elements["email"].value;
   password = x.elements["psw"].value;
   password_repeat = x.elements["psw-repeat"].value;

   if(password!=password_repeat)
   alert("Password not matched!");

   userDetails = {email: email, password: password};

   localStorage.setItem("userDetails",JSON.stringify(userDetails));

//    const savedData = localStorage.getItem("userDetails");
//    const retrivedData = JSON.parse(savedData);

//    alert(retrivedData["email"]);

    
})