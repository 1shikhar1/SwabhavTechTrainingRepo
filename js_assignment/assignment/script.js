const changeBackgroundToRed = function(){
    document.body.style.backgroundColor = "#ff3333";
};

const changeBackgroundToYellow = function(){
    document.body.style.backgroundColor = "yellow";
};

document.getElementById("redButton").addEventListener("click", changeBackgroundToRed);
document.getElementById("YellowButton").addEventListener("click", changeBackgroundToYellow);





function ValidateName(inputtxt)
{
   var letters = /^[A-Za-z]+$/;
   if(!inputtxt.match(letters))
     {
        alert("Invalid name");
     }
}

function ValidateEmail(inputText)
{
    var mailformat = /^[a-zA-Z0-9_\.]+[@][a-z]+[\.][a-z]{2,3}$/;
    if(!inputText.match(mailformat))
    {
        alert("Invalid email");
    }
}

function ValidatePhone(inputText)
{
    var mailformat = /^[6,7,8,9][0-9]{9}$/;
    if(!inputText.match(mailformat))
    {
        alert("Invalid phone");
    }
}




const sub = document.getElementById('sub');

sub.addEventListener('click',()=>{

    ValidateName(document.getElementById("name").value);
    ValidateEmail(document.getElementById("email").value);
    ValidatePhone(document.getElementById('phone').value);
});

