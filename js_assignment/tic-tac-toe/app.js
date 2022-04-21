let count = 1;
let play = true;

const scoreBoard = document.querySelector("h2");
const buttons = document.querySelectorAll("h3");

buttons.forEach(button => {

    button.addEventListener('click', (btn) => {
        if (play) {
            if (count % 2 == 0 && (btn.target.innerText != "X" && btn.target.innerText != "O")) {
                btn.target.innerText = "X";
                btn.target.style.color = "red";
                scoreBoard.innerText = "O's turn"
                count++;
            }
            else if (btn.target.innerText != "X" && btn.target.innerText != "O") {
                btn.target.innerText = "O";
                btn.target.style.color = "#030fff";
                scoreBoard.innerText = "X's turn"
                count++;
            }
            if (count == 10) {
                bool = false;
                scoreBoard.innerHTML = "Match Draw";
                scoreBoard.style.color = "Grey";
            }
            checkWinner();
        }

    })

})

const checkWinner = () => {

    if (buttons[0].innerText === buttons[1].innerText && buttons[0].innerText === buttons[2].innerText) {
        winner(buttons[0].innerText);
    }
    if (buttons[3].innerText === buttons[4].innerText && buttons[3].innerText === buttons[5].innerText)
        winner();
    if (buttons[6].innerText === buttons[7].innerText && buttons[6].innerText === buttons[8].innerText) {
        winner(buttons[3].innerText);
    }

    if (buttons[0].innerText === buttons[3].innerText && buttons[0].innerText === buttons[6].innerText) {
        winner(buttons[0].innerText);
    }
    if (buttons[1].innerText === buttons[4].innerText && buttons[1].innerText === buttons[7].innerText) {
        winner(buttons[1].innerText);
    }
    if (buttons[2].innerText === buttons[5].innerText && buttons[2].innerText === buttons[8].innerText) {
        winner(buttons[2].innerText);
    }

    if (buttons[0].innerText === buttons[4].innerText && buttons[0].innerText === buttons[8].innerText) {
        winner(buttons[0].innerText);
    }
    if (buttons[2].innerText === buttons[4].innerText && buttons[2].innerText === buttons[6].innerText) {
        winner(buttons[2].innerText);
    }
}


const winner = (player) => {

    play = false;
    scoreBoard.innerText = "Player "+player+" won the game!";
    scoreBoard.style.color = "green";
}