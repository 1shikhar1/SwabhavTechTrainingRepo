
let randomNumber = Math.ceil(Math.random()*10);
let counter=0;
let turn = 3;
let flag = 0;

const range = document.getElementById("rangeInput");
var style = document.querySelector('[data="test"]');
const h2 = document.getElementById("turn");
const score = document.getElementById("score");

range.addEventListener("input", () => {

    counter++;

    if(flag==0){
        turn--;
    }
    
    if(counter<=3){
        
        h2.innerHTML = "You have "+turn+" turn.";

        const slider_value = range.value;
        let thumb_color;
        if (slider_value == 0) {
            thumb_color = "rgb(194, 194, 194)";
        }
        else if (slider_value >0 && slider_value < randomNumber) {
            thumb_color = "rgb(230, 212, 14)";
        }
        else if (slider_value > randomNumber) {
            thumb_color = "rgb(247, 10, 61)";
        }
        else {
            thumb_color = "rgb(31, 227, 9)";
            score.innerHTML = "You Won!";
            flag = 1;
        }
        style.innerHTML = `.slider::-webkit-slider-thumb { background-color: ${thumb_color} !important; } .slider:-moz-range-thumb {  ${thumb_color} !important; }`;

    }

    if(counter>3){
        if(flag!=0){
            h2.innerHTML = "You have 0 turn.";
        }

        if(flag==0){
            score.innerHTML = "You lose!";
        }

        thumb_color = "rgb(194, 194, 194)";
        style.innerHTML = `.slider::-webkit-slider-thumb { background-color: ${thumb_color} !important; } .slider:-moz-range-thumb {  ${thumb_color} !important; }`;
    }

    if(flag==1)
    {
        h2.innerHTML = "You have "+turn+" turn.";
        thumb_color = "rgb(31, 227, 9)";
        style.innerHTML = `.slider::-webkit-slider-thumb { background-color: ${thumb_color} !important; } .slider:-moz-range-thumb {  ${thumb_color} !important; }`;
    }
});