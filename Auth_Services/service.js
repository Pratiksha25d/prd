const express=require("express");
var app=express();
const PORT=8000;
app.get('/auth' , function(req, res,next){
    res.send("Hello World");
    res.end();
    next();
},verifyUser);
app.listen(PORT, function(){
    console.log(`app running on port ${PORT}`);
})
function verifyUser(){
console.log("USER VERIFIED");
}

