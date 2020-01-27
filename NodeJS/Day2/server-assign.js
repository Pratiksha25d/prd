var http=require('http');
var ejs=require('ejs');
var hello =require("./assign-fun.js");
var myModule =require("./assign-module");
var html='<html><head></head><body><h1>My name is : <%= name %></h1></body></html>';

http.createServer(function(req,res){
	console.log("Server called")
	res.writeHead(200,{'Content-type':'text/html'});
	 var fname=myModule.fname;
	 var lname=myModule.lname;
	 var name =fname.concat(lname);
	 console.log(name)
	var newGreet = new hello();

	 var renderhtml=ejs.render(html,{name:name});
	
	res.end(renderhtml);
	}
	).listen(9779);