const counter = function(){
    let privateCounter = 0;

    function changeBy(val){
        privateCounter += val;
    }

    return {
        increment : function(){
            changeBy(1);
        },
        decrement : function(){
            changeBy(-1);
        },
        value : function(){
            return privateCounter;
        }

    }
}();

console.log(counter.value());
counter.increment(1);
counter.increment(1);
counter.increment(1);
counter.increment(1);

console.log(counter.value());