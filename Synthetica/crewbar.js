$("document").ready(function (){
    $('.bar').each(function() {
        var percent = $(this).attr('title');
       $(this).animate({width: percent},2000);
    });
});