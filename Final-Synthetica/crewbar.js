$("document").ready(function (){
    $("#crew-id").hover(function(){
        $('.bar').each(function(event) {
            var percent = $(this).attr('title');
           $(this).animate({width: percent},2000);
        });
    });
    
});