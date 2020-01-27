var http=require('http');
var ejs=require('ejs');
var html='<html><head></head><body><h1>My name is</h1></body></html>'
http.createServer(function(req,res){
	res.writeHead(200,{'Content-type':'text/html'});
		res.write(`{$data} Pratiksha`);
		res.end();
	}
	)