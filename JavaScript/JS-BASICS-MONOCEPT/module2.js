const DataService = function(){
    let obj = {};

    obj.doTask1 = function(){
        console.log("Doing task 1");
    }

    obj.doTask2 = function(){
        console.log("Doing task 2");
    }

    return obj;
}();


// let data = DataService();

// data.doTask1();
// data.doTask2();

DataService.doTask1();
DataService.doTask2();