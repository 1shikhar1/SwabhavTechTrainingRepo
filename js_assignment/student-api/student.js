let students = []

fetch("http://gsmktg.azurewebsites.net:80/api/v1/techlabs/test/students").then((response) => {
    return response.json();
}).then((data) => {
    students = data;
    studentDetails();
}).catch((error) => {
    console.log("eerorrrrrrr", error);
})

const studentDetails = () => {

    let studentTable = document.getElementById("studentTable")
    students.forEach(student => {
       studentTable.innerHTML+=` <tr>
       <td>${student.id}</td>
       <td>${student.name}</td>
       <td>${student.rollNo}</td>
       <td>${student.age}</td>
       <td>${student.email}</td>
       <td>${student.date}</td>
     </tr>`;
    })
}
