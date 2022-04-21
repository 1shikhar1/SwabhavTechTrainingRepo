const quizData = [  
    {  
     question: "Golden Temple is situated in?",  
     a: "New Delhi",  
     b: "Amritsar",  
     c: "Agra",  
     d: "Mumbai",  
     answer: "b",  
    },  
    {  
     question: "The Indian Institute of Science is located at?",  
     a: "Kerala",  
     b: "Madras",  
     c: "Bangalore",  
     d: "New Delhi",  
     answer: "c",  
    },  
    {  
     question: "Which city is known as 'Financial Capital of India'?",  
     a: "New Delhi",  
     b: "Mumbai",  
     c: "Pune",  
     d: "Hyderabad",  
     answer: "b",  
    },  
    {  
     question: "Which city is known as 'Electronic City of India'??",  
     a: "Mumbai",  
     b: "Hyderabad",  
     c: "Guragon",  
     d: "Bangalore",  
     answer: "d",  
    },  
   ];



   const quiz = document.getElementById("quiz");

   const options = document.querySelectorAll(".answer");
   const questionElement = document.getElementById("question");

   const submitButton = document.getElementById("submit");  


   let currentQuestion = 0;  
   let score = 0;  

   const deselectAnswers = () => {
    options.forEach((option) => (option.checked = false));  
   };  


   const selectedAnswer = () => {
    let answer;  
    options.forEach((option) => {  
     if (option.checked) 
        answer = option.id;  
    });  
    return answer;  
   };

   const loadQuiz = () => {  
    const aData = document.getElementById("aData");  
    const bData = document.getElementById("bData");  
    const cData = document.getElementById("cData");  
    const dData = document.getElementById("dData"); 
    deselectAnswers();  
    const currentQuestionData = quizData[currentQuestion];  
    questionElement.innerText = currentQuestionData.question;  
    aData.innerText = currentQuestionData.a;  
    bData.innerText = currentQuestionData.b;  
    cData.innerText = currentQuestionData.c;  
    dData.innerText = currentQuestionData.d;  
   };  


   loadQuiz();  


   submitButton.addEventListener("click", () => {  

    const answer = selectedAnswer();  

    if (answer) {
        if (answer === quizData[currentQuestion].answer)
            score++;
            currentQuestion++;
        if (currentQuestion < quizData.length)
            loadQuiz();  
        else {
            quiz.innerHTML = `<h2>Total score: ${score}/${quizData.length}</h2>  
            <button onclick="history.go(0)">Play Again</button>` 
        }
    }  
   });

