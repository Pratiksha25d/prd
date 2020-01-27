var http=require('http');
var fs=require('fs');
http.createServer(function(req,res){
	fs.readFile('usingnpm.html',function(err,data){
		res.writeHead(200,{'Content-type':'text/html'});
		res.write(`{$data} Pratiksha`);
		res.end();
})
}).listen(7788);