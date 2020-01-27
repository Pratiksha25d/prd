var http=require('http');
var fs=require('fs');
var server=http.createServer(function(req,res){
	res.writeHead(200,{'Content-type':'text/html'});
	var myRead=fs.createReadStream(__dirname + '/assign.html');
	myRead.pipe(res);
	res.write("Pratiksha")
});
server.listen(7777);
console.log("You are on port 7766")