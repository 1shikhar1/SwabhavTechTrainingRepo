const url = 'http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students';

let userData = {};

function readData(){

    const formData = document.getElementById("form");

    userData["rollNo"]=formData.elements["rollNo"].value;
    userData["name"]=formData.elements["name"].value;
    userData["age"] = formData.elements["age"].value;
    userData["email"]=formData.elements["email"].value;
    userData["date"]=formData.elements["date"].value;

    
    if(formData.elements["isMale"].value=="on"){
      userData["isMale"]=true;
    } else{
      userData["isMale"]=false;
    }
}



let data = {

    rollNo: 777,
    name: "rahul",
    age: 777,
    email: "rahul777@gmail.com",
    date: "12/04/2022",
    isMale: true
}

let fetchData = {
  method: 'POST',
  body: JSON.stringify(userData),
  headers: new Headers({
    'Content-Type': 'application/json; charset=UTF-8',
    'Cache-Control': 'no-cache'
  })

}





const submitButton = document.getElementById("sub");


    submitButton.addEventListener('click',()=>{

      readData();

        // fetch(url, fetchData).then(function(result) {
        //     console.log("data not posted"+result);
        //     return result.json();
        // });


        fetch(url, fetchData).then(result => {
            console.log(result)
            return result.json();
        }).catch(err => {
            console.log(err);
        })
});







