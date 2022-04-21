const divArea = document.querySelector('div');
let html = ``;
for(let i=1; i<=50; i++)
{
    html += `<span class="dot" id="${i}">${i}</span>`;
    if(i%10==0)
    html += `<br>`;
}
divArea.innerHTML = html;


let randomNumber = Math.ceil(Math.random()*50);

console.log(randomNumber);

let count =8;
let flag=0;
const btn = document.querySelectorAll(".dot");
const h2 = document.querySelector("h2");

const score = document.getElementById("score");

btn.forEach((button)=>{

    button.addEventListener('click',()=>{
        count--;
        if(count>=0)
        {
            h2.innerHTML = "You have "+count+" turn.";
        }
        if(button.textContent<randomNumber && count>=0)
            button.setAttribute("style", "background-color: #f2ab11");
    
        if(button.textContent>randomNumber && count>=0)
            button.setAttribute("style", "background-color: #a11a1a");
    
        if(button.textContent==randomNumber && count>=0){
            button.setAttribute("style", "background-color: green");
            flag=1;
            count=-1;
        }

        if(flag!=1 && count<=0)
            score.innerHTML = "You lose!";
 
        if(flag==1)
            score.innerHTML = "You won!";
    });  

});





