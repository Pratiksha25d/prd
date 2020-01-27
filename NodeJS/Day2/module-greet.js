var myModule =require("./my-module");
var hello =require("./greet.js");
console.log("My name is :" + myModule.name);

var newGreet = new hello();
console.log(newGreet.sayHello())