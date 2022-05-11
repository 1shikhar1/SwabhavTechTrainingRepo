let userName:string
let cgpa:number
let isMale:boolean
let displayText:string

userName = "Sachin"
cgpa = 7.5

isMale = true

displayText = `
                =======================
                    Showing details
              ===========================
                 User is: ${userName}
                 Cgpa is: ${cgpa}
                 isMale: ${isMale}
`

console.log(displayText);