const demofun = async()=>{
    const response = await fetch("shikhar.json");
    if(response.status!=200)
    throw new Error("Could not fetch data");

    const data = await response.json();
    return data;
};

demofun().then((data)=>{
    console.log(data);
}).catch((error)=>{
    console.log("Rejected: "+error);
})