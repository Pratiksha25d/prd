global.console.log("Hello world..!!!")
var hello="Hello from node JS";
console.log(hello);
var justnode=hello.slice(17)
console.log(justnode)
console.log(`Rock on ${justnode}`)

console.log(__dirname);
console.log(__filename);

var path=require("path")
console.log(`Rock on ${path.basename(__filename)}`)

var us=require("underscore")
