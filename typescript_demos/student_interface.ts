interface IStudent{
    rollNo: number,
    firstName: string,
    lastName?: string
    marks: number[]
}

let students: IStudent[] = [{rollNo:101,firstName:"Rohan",marks:[100,30]},{rollNo:203,firstName:"Himanshu",marks:[90,80]}];

for(let s of students){
    console.log(s);
}