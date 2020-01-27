var EventEmitter = require('events').EventEmitter;
var emitter =new EventEmitter();
/*emitter.on('onswipe',function(){
    console.log('door is opened');
});
emitter.on('onswipe',function(){
    console.log('fan is on');
});
emitter.on('onswipe',function(){
    console.log('AC is on');
}); */
emitter.once('onswipe',function(){
    console.log('door is opened');
});
emitter.once('onswipe',function(){
    console.log('fan is on');
});
emitter.once('onswipe',function(){
    console.log('AC is on');
});

emitter.emit('onswipe');
emitter.emit('onswipe');