var myModule =require("./assign-module");
var hello =require("./assign-fun.js");
console.log("My name is :" + myModule.fname + myModule.lname);

var newGreet = new hello();
console.log(newGreet.sayHello())

