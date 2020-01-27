var express = require('express');
var app = express();
const PORT = 3000;
app.listen(PORT)
console.log(`Listening on port:${PORT}`);
app.get("/auth",verifyUser,function(req,res,next){
 res.write("Hii");
    res.end();
    next();
})
app.listen(PORT, function(){
    console.log(`app running on port ${PORT}`);
})
function verifyUser(){
    res.send("verified user");

}