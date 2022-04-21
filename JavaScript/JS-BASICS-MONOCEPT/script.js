// let name = "rohan";

// console.log(name, typeof name);

// name = "Aniket";

// console.log(name, typeof name);

// name =200;

// console.log(name, typeof name);

// const name = "shikhar";

// console.log(name);
// // name = "Aju";    Type error

// console.log(name);

// console.log(val);

// var val = "foo";


// let email = "indiaismycountry@gmail.com";

// console.log(email.toUpperCase());

// console.log("Index of @: ",email.indexOf("@"));

// let indx = email.indexOf("@");
// console.log(email.substring(indx+1,email.length));

// console.log("first and last index of country: ",email.indexOf("country"),email.indexOf("country")+"country".length-1);

// console.log(email.substring("country"));


// console.log(email.replace("ai",44));
// console.log(email.replaceAll("ai","AI"));

// console.log(email.slice(4));

// let title = "Indian cooking";
// let author = "remya";
// let likes = 100;

// let res = "Blog on "+title+" written by "+author+" got "+likes+" likes";

// console.log(res);

// res = `Blog on ${title} written by ${author} got ${likes} likes`;

// console.log(res);

// let html = `
//     <h3> Title ${title}</h3>
//     <h5> Author ${author} </h5>
//     <h5> Likes ${likes} </h5>
// `;

// console.log(html);

// let players = ['sachin', 'virat', 'rohit', 'mayank'];

// console.log(players);


// let str = players.join('-')

// console.log(str);

// console.log("Player length: "+players.length);

// let players2 = ["rahul","vinay"];

// players = players.concat(players2);

// console.log(players);

// players.push("shikhar");

// console.log(players);

// let n =Boolean("hello");
// console.log(Number(n));

// function greet(){
//     console.log("Good morning");
// }

// greet();

// var greet1 = function(){
//     console.log("Good night");
// }

// greet1();

// const greet1 = function(name,time){
//     console.log("Good "+time+" "+name);
// };

// greet1("Shikhar","morning");

// const greet1 = function(name="Akshay",time="Morning"){
//     console.log("Good "+time+" "+name);
// };

// greet1("Shikhar");

// const myFun = function(func){
//     let value = 80;
//     func(value+10);
// }

// const callBack = function(val){
//     console.log(val);
// }

// myFun(callBack);

// let players = ["sachin", "virat","rahul","rohit"];

// players.forEach(function(pl){
//     console.log(pl);
// });


// let employee = {
//     name : "Rohit",
//     email : "rohit@gmail.com",
//     age : 32,
//     projects : ["Sentiment analysis", "Library management","Insurance"],

//     login: function(){
//         console.log("employee logged in");
//     },

//     logout: function(){
//         console.log("employee logged out");
//     },

//     logProject: function(){
//         console.log("List of projects");
//         this.projects.forEach(project=>{
//             console.log(project);
//         });
//     }
// };

// console.log(employee);
// console.log(employee.name);
// console.log(employee.email);
// console.log(employee.age);
// console.log(employee.projects);
// employee.login();
// employee.logout();
// employee.logProject();

// let articles = [
//     {
//         article: "article 1",
//         likes: 100
//     },

//     {
//         article: "article 2",
//         likes: 200
//     },

//     {
//         article: "article 3",
//         likes: 300
//     } 
// ];

// articles.forEach(article=>{
//     console.log(article.article+" | "+article.likes);
// });

// let articles = [
//     {
//         article: "article 1",
//         likes: 100
//     },

//     {
//         article: "article 2",
//         likes: 200
//     },

//     {
//         article: "article 3",
//         likes: 300
//     } 
// ];

// articles.forEach(article=>{
//     console.log(article.article+" | "+article.likes);
// });



// let emp = {
//     name : "Rohit",
//     email : "rohit@gmail.com",
//     age : 32,
//     articles: [
//         {
//             article: "article 1",
//             likes: 100
//         },
    
//         {
//             article: "article 2",
//             likes: 200
//         },
    
//         {
//             article: "article 3",
//             likes: 300
//         } 
//     ],

//     login: function(){
//         console.log("employee logged in");
//     },

//     logout: function(){
//         console.log("employee logged out");
//     },

//     logArticle: function(){
//         console.log("List of articless");
//         this.articles.forEach(article=>{
//             console.log(article.article+" | "+article.likes);
//         });
//     }
// };

// emp.logArticle();

// let value = 20.674;

// console.log(Math.ceil(value));

// console.log(Math.floor(value));

// console.log(Math.trunc(value));

// console.log(Math.random());

// console.log(Math.floor(Math.random()*(40-15+1)+40));


// const h3ref = document.querySelectorAll("h3");

// console.log(h3ref);
// h3ref.forEach(heading=>{
//     console.log(heading.textContent);

//     heading.textContent += " more content";
// });


// let players = ['sachin','virat','rohit','dhoni'];

// const playerList = document.querySelector("ul");

// console.log(playerList);

// let html = ``;

// html += playerList.innerHTML;

// players.forEach(player => {
//     html += `<li>${player}</li>\n`;
// });

// playerList.innerHTML = html;

// console.log(html);



// const divArea = document.querySelector("div");

// let websites = [
//     ["Google","www.google.com"],
//     ["Microsoft","www.microsoft.com"],
//     ["Facebook","www.facebook.com"],
//     ["Amazon","www.amazon.com"]
// ];


// let html =``;

// websites.forEach(website=>{
//     html += `<a href="${website[1]}">${website[0]}</a>\n`;
// });


// console.log(divArea);

// divArea.innerHTML = html;

// console.log(html);






// const divArea = document.querySelector("div");

// let websites = [
//     ["Google","www.google.com"],
//     ["Microsoft","www.microsoft.com"],
//     ["Facebook","www.facebook.com"],
//     ["Amazon","www.amazon.com"]
// ];


// let html =``;

// websites.forEach(website=>{
//     html += `<a href="${website[1]}">${website[0]}</a>\n`;
// });


// console.log(divArea);

// divArea.innerHTML = html;

// console.log(html);


// const divArea = document.querySelector('#pa');
// console.log(divArea.textContent);

// const divArea1 = document.querySelector('.error');
// console.log(divArea1.textContent);

// const divArea2 = document.querySelector('div.error');
// console.log(divArea2.textContent);


// const divArea = document.getElementById('pa');
// console.log(divArea.textContent);

// const divArea1 = document.getElementsByClassName("error");
// console.log(divArea1);

// const divArea2 = document.querySelectorAll('.error');
// console.log(divArea2);

// const divArea3 = document.querySelectorAll('p');
// console.log(divArea3);

// const divArea4 = document.getElementsByTagName('p');
// console.log(divArea4);


let players = [
    {name:'sachin',age:47,runs:15000,wickets:150},
    {name:'virat',age:38,runs:10000,wickets:100},
    {name:'rahul',age:45,runs:8600,wickets:97}
];

// players.forEach(function(player){
//     console.log("Name: "+player.name+"\nAge: "+player.age+"\nRuns: "+player.runs+"\nWickets: "+player.wickets);
// });


// populate data on tables

// const table = document.querySelector("table");

// let html=``;
// html = table.innerHTML;
// let n=1;
// players.forEach(function(player){
//     html += `<tr>
//         <td>${n}</td>
//         <td>${player.name}</td>
//         <td>${player.age}</td>
//         <td>${player.runs}</td>
//         <td>${player.wickets}</td>
//     </tr>`;
//     n = n+1;
// });

// table.innerHTML = html;


// get property and set property

// const link = document.querySelector('a');
// console.log(link);

// console.log(link.getAttribute('href'));
// link.setAttribute('href','www.facebook.com');
// link.innerText = "Facebook";
// console.log(link.getAttribute('href'));
// link.setAttribute('class','error');


// const para = document.querySelector('p');
// console.log(para.classList);

// para.classList.remove('error');

// console.log(para.classList);

// para.classList.add('success');

// console.log(para.classList);


// const tagss = document.querySelectorAll('p');

// tagss.forEach((element)=>{
//     let str = element.innerText;
//     if(str.match('error'))
//     {
//         element.setAttribute('class','error');
//     }

//     if(str.match('success'))
//     {
//         element.setAttribute('class','success');
//     }
// });

// document.getElementById("myText").value = "Johnny Bravo";

// const title = document.getElementById('inputTxt');

// const rep=function escapeRegex(string) {
//     return string.replace(/[^a-zA-Z0-9]/g, '');
//   }

// title.addEventListener('input',()=>{
//     document.getElementById("par").innerText = rep(title.value);
// })

// const article = document.querySelector('article');
// console.log(article.children);

// const para = document.querySelector('p');

// console.log(para.children);
// console.log(para.parentElement);
// console.log(para.nextElementSibling);

// Array.from(article.children).forEach(element=>{
//     element.classList.add("article-tag");
// })

// const scores = [10,30,40,50,2260,80];

// const filtered = scores.filter(score=> score>=30);



// console.log(filtered);

// console.log(scores);

// const users=[
// 	{name:"Jay",premium:true},
// 	{name:"Roy",premium:false},
// 	{name:"Lee",premium:true},
// 	{name:"Jan",premium:false},
// 	{name:"Tim",premium:true}
// ];

// const filteredUsers = users.filter(user=> user.premium);

// console.log(filteredUsers);

// const prices = [100,300,400,200,250,500,350]

// const discountPrices = [];

// prices.forEach(price=> discountPrices.push(price/2));

// console.log(discountPrices);

// const salsePrice = prices.map(price=> price*0.5);

// console.log(salsePrice);


// const products=[
// 	{name:"Good night",price:350},
// 	{name:"Maggi",price:70},
// 	{name:"Rice",price:560},
// 	{name:"Biscuit",price:50},
// 	{name:"Shoe",price:900}
// ];


// const salsePrice = products.map((product)=>{
//     if(product.price>500){
//         return {name:product.name, price:product.price*0.7};
//     } else{
//         return product;
//     }

// });

// console.log(salsePrice);

// const arr =[25,35,76,11,29,36];
// const arr=[2,5,50,12,34,23,19,45,65,42];
// let arr2 = Number(arr);

// console.log(arr.sort((a,b)=>{
//     return a-b;
// }));



// const products=[
// 	{name:"Good night",price:350},
// 	{name:"Maggi",price:70},
// 	{name:"Rice",price:560},
// 	{name:"Biscuit",price:50},
// 	{name:"Shoe",price:900}
// ];



// console.log(products.sort((a,b)=>{
//     if(a.name.toLocaleLowerCase()>b.name.toLocaleLowerCase()){
//         return -1;
//     }else if(a.name.toLocaleLowerCase()>b.name.toLocaleLowerCase())
//     return 1;
// }));

// let count=0;
// const scores=[2,5,50,12,34,23,19,45,65,42];

// const res = scores.reduce((accum,score)=>{
//     if(score>30)
//     accum++;
// },0);

// console.log(res);

// arr.forEach((element)=>{
//     if(element>30)
//     count++;
// });

// console.log(count);

// day 5

const now = new Date();

console.log(now);

console.log(typeof now);

console.log(now.getFullYear());

console.log("Month: "+now.getMonth());

console.log("Date: "+now.getDate());

console.log(now.getTime());

console.log(now.getHours());

console.log(now.getMinutes());

console.log("Date: "+now.getDate()+"-"+(now.getMonth()+1)+"-"+now.getFullYear());

// const now = new Date();


// console.log(now.getTime());

// console.log(now.toDateString());

// console.log(now.toTimeString());

// console.log(now.toLocaleDateString());



// function showTime(){
// const now = new Date();
// h = now.getHours();
// m = now.getMinutes();
// if(m<10)
// m = "0"+m;
// s = now.getSeconds();
// if(s<10)
// s = "0"+s;

// const hrs = document.getElementById('hrs');
// const mins = document.getElementById('mins');
// const sec = document.getElementById('sec');

// hrs.innerHTML = h;
// mins.innerHTML = m;
// sec.innerHTML = s;
// }

// setInterval(showTime, 1000);

// const now = new Date();
// const before= new Date("February 20 2022 7:30:59");

// console.log(moment().calendar());

// console.log(dateFns.format(now,`dddd Do MMMM	YYYY`));

// console.log(dateFns.distanceInWords(now,before,{addSuffix:true}));


// console.log(1);
// console.log(2);
// console.log(3);

// setTimeout(()=>{
//     console.log("Callback function is called");
// },3000);

// console.log(4);
// console.log(5);
// setTimeout(()=>{
//     console.log("Callback function 2 is called");
// },2000);
// console.log(6);

// const bt1 = document.getElementById('bt1');
// const bt2 = document.getElementById('bt2');

// const now = new Date();
// stime = now.getTime();

// bt1.addEventListener('click',()=>{
//     while(true)
//     console.log(stime++);
    
// });

// bt2.addEventListener('click',()=>{
//     console.log("Button 2 clicked");
// });

// const greet = ()=>{
//     console.log(Hello);
// };

// const showAlert = ()=>{
//     alert("dabger");
// };

// setInterval(showAlert,2000);

// greet();

// var a = moment("2018-18-10 10:20:25");

// console.log(a.isValid());

// console.log(a.invalidAt());

// console.log(moment().toString());

// console.log(moment.locale("fr"));

// console.log(moment().format("LLLL"));
