const path=require('path');
const fs=require('fs');
var http=require('http');
    http.createServer(function(req,res)
    {
       
        fs.readdir('/NodeJS',function(err,files){
           files.forEach(function(file){
               console.log("files ")
           })
        })
       
      
       
    }).listen(2233);