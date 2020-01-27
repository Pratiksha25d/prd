var express =require('express');
var data =require('./data.json');
const app = express();
const PORT =3000;

app.listen(PORT,()=>{
console.log(`My application is running on port ${PORT}`);
console.log(data);

});
app.get('/',(req,res)=>{
    res.send(`a get request with / route on port ${PORT}`);
  
    });

app.post('/',(req,res)=>{
    res.send(`a post request with / route on port ${PORT}`);
    
});
app.put('/',(req,res)=>{
    res.send(`a put request with / route on port ${PORT}`);
    
    });
app.delete('/',(req,res)=>{
        res.send(`a delete request with / route on port ${PORT}`);
      
        });
 app.get('/item/:id',(req,res,next)=>{
            //res.send(`a get request with / route on port ${PORT}`); //
                console.log(req.params.id);
                let userId = Number(req.params.id);
                console.log(userId);
                console.log(data[userId]);
                res.send(data[userId]);
                res.json(data);
                next();
                },(req,res)=>
                console.log(`Did ypu get right data ??`)
                );
app.get('/itemredirect',(req,res)=>{
    res.redirect('https://regex101.com/');
            
    });

app.route('/itemChaining')
.get((req,res)=>
res.send(`a get request with / route on port ${PORT}`)
)
.post((req,res)=>
res.send(`a post request with / route on port ${PORT}`)
)
.put((req,res)=>
res.send(`a put request with / route on port ${PORT}`)
)
.delete((req,res)=>
res.send(`a delete request with / route on port ${PORT}`)
);

//Built-in midlewares

app.use(express.json());

app.post('/newItem',(req,res)=>{
    console.log(req.body);
    res.send(req.body);
});