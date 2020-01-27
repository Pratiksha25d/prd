var http=require('http');
var ejs=require('ejs');
var html='<html><head></head><body><h1>My name is<%= name %></h1></body></html>'
var myModule =require("./my-module")
http.createServer(function(req,res){
	res.writeHead(200,{'Content-type':'text/html'});
	var name=myModule.name;
	var renderhtml=ejs.render(html,{name:name});
	res.end(renderhtml);
	}
	).listen(9657)