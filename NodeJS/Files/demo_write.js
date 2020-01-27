var http=require('http');

var fs=require('fs');
    http.createServer(function(req,res)
    {
        fs.writeFile('demo.txt', 'Hello Everyone.!!!!!', function (err) {
        if (err) throw err;
        console.log('Successfully Saved !!!');
    })
        fs.appendFile('demo.txt', ' Pratiksha Deshmukh.....', function (err) {
        if (err) throw err;
        console.log('Updated!!!!!');

    })
    fs.rename('demo.txt', 'newdemo.txt', function (err) {
        if (err) throw err;
        console.log('File Renamed!');
    })
    fs.unlink('newdemo.txt', function (err) {
        if (err) throw err;
        console.log('File deleted!');
    })
       
    }).listen(4444);