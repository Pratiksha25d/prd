var slideIndex = 1;
        showSlides(slideIndex);
        function plusSlides(n) 
        {
            showSlides(slideIndex += n);
        }   
        function currentSlide(n)
        {
            showSlides(slideIndex = n);
        }
        function showSlides(n) 
        {
            var i;
            var slides = document.getElementsByClassName("mySlides");
            var dots = document.getElementsByClassName("dot");
            if (n > slides.length)
             {
                slideIndex = 1
            }    
            if (n < 1) {
                slideIndex = slides.length
            }
            for (i = 0; i < slides.length; i++) 
            {
             slides[i].style.display = "none";  
            }
            for (i = 0; i < dots.length; i++) 
            {
                dots[i].className = dots[i].className.replace(" active", "");
            }
            slides[slideIndex-1].style.display = "block";  
            dots[slideIndex-1].className += " active";
        }
        $(document).ready(function(){
            var carousel = $(".myslides");
            var carouselWidth = carousel.innerWidth();
            var sliderCount = carousel.children().length;
            var width = carouselWidth / sliderCount ;
            $(window).on("resize",function(){
                carouselWidth = carousel.innerWidth();
                width = carouselWidth / sliderCount ;
            })
            setInterval(function(){
                carousel.animate({marginLeft:-width},1000,function(){
                    $(this).find("myslides:last").after($(this).find("myslides:first"));
                    $(this).css({marginLeft:0});
                })
            },5000);
        })