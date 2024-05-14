<%-- 
    Document   : index
    Created on : May 7, 2024, 9:29:11 PM
    Author     : loure
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LearnForge</title>
            
        <link rel="stylesheet" href="style.css">
        <link rel="stylesheet" href="assets/css/animate.css">
        <link rel="stylesheet" href="assets/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/css/fontawesome-all.min.css">
        <link rel="stylesheet" href="assets/css/lightbox.min.css">
        <link rel="stylesheet" href="assets/css/owl.carousel.min.css">
        <link rel="stylesheet" href="assets/css/responsive.css">
        <style>
              .text {
    font-size: 36px; /* Tamanho da fonte aumentado para 36px */
    border-right: 2px solid #333;
    animation: typing 1s steps(10, end), blink-caret 0.5s step-end infinite alternate;
    white-space: nowrap;
    overflow: hidden;
    width: 10ch; /* ajuste conforme o tamanho do texto */
  }
        </style>
    </head>
    <body data-spy="scroll" data-target=".navbar-nav">
    
     <!-- Preloader -->
    <div class="preloader">
        <div class="spinner">
            <div class="cube1"></div>
            <div class="cube2"></div>
        </div>
    </div>
    <!-- // Preloader -->
    

<!-- ====== Header ====== -->
<header id="header" class="header">
    <!-- ====== Navbar ====== -->
    <nav class="navbar navbar-expand-lg fixed-top">
        <div class="container">
            <!-- Logo -->
            <a class="navbar-brand" href="#">LearnForge</a>

            <!-- Mobile Menu -->
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <!-- Mobile Menu -->

            <div class="collapse navbar-collapse main-menu" id="navbarSupportedContent">
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item active"><a class="nav-link" href="#home">HOME</a></li>
                    <li class="nav-item"><a class="nav-link" href="#about">ABOUT</a></li>
                    <li class="nav-item"><a class="nav-link" href="#service">SERVICE</a></li>
                    <li class="nav-item"><a class="nav-link" href="#portfolio">PORTFOLIO</a></li>
                    <li class="nav-item"><a class="nav-link" href="blog.html">BLOG</a></li>
                    <li class="nav-item"><a class="nav-link pr0" href="#contact">CONTACT</a></li>
                </ul>
            </div>
        </div>
    </nav>
    <!-- ====== // Navbar ====== -->
</header>
<!-- ====== // Header ====== -->


    <!-- ====== Hero Area ====== -->
    <div class="hero-aria" id="home">
        <!-- Hero Area Content -->
        <div class="container">
            <div class="hero-content h-100">
                <div class="d-table">
                    <div class="d-table-cell">
                        <h2 class="text-uppercase">Learn <br> Forge</h2>
                        <h3 class="text-uppercase"><span></span></h3>
                     
		       <div class="button-animation">
                        <div class="text">Cadastrar</div>
                    </div>
                        <a href="#about" class="button smooth-scroll">Aqui</a>
                    </div>
                </div>
            </div>
        </div>
        <!-- // Hero Area Content -->
        <!-- Hero Area Slider -->
        <div class="hero-area-slids owl-carousel">
            <div class="single-slider">
                <!-- Single Background -->
                <div class="slider-bg" style="background-image: url(assets/images/hero-area/img-1.jpg)"></div>
                <!-- // Single Background -->
            </div>
            <div class="single-slider">
                <!-- Single Background -->
                <div class="slider-bg" style="background-image: url(assets/images/hero-area/img-2.jpg)"></div>
                <!-- // Single Background -->
            </div>
        </div>
        <!-- // Hero Area Slider -->
    </div>
  
  


<footer  style="padding: 30px; background-color: #000; border-bottom: 5px solid #ffc900; ">
    <div class="container">
        <div class="row">
            <div class="col-lg-12 text-center">
                <div class="copyright-text">
                    <p class="text-white">&copy; 2024 Portal ISCIM. Todos os direitos reservados.</p>
                    <p class="text-white">Desenvolvido por <a href="https://www.meusite.com">Seu Nome</a></p>
                </div>
            </div>
        </div>
    </div>
</footer>
    <!-- ====== // Footer Area ====== -->






     <!-- ====== ALL JS ====== -->
   <script src="assets/js/jquery-3.3.1.min.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script src="assets/js/lightbox.min.js"></script>
    <script src="assets/js/owl.carousel.min.js"></script>
    <script src="assets/js/jquery.mixitup.js"></script>
    <script src="assets/js/wow.min.js"></script>
    <script src="assets/js/typed.js"></script>
    <script src="assets/js/skill.bar.js"></script>
    <script src="assets/js/fact.counter.js"></script>
    <script src="assets/js/main.js"></script>
    
<script>
  function escreverTexto() {
    const texto = "Cadastrar";
    let index = 0;
    const textElement = document.querySelector('.text');
    
    function escrever() {
      if (index < texto.length) {
        textElement.textContent += texto.charAt(index);
        index++;
        setTimeout(escrever, 200); // velocidade de digitação (ajuste conforme necessário)
      } else {
        setTimeout(apagar, 1000); // tempo antes de apagar o texto
      }
    }
    
    function apagar() {
      if (index >= 0) {
        const newText = texto.substring(0, index);
        textElement.textContent = newText;
        index--;
        setTimeout(apagar, 100); // velocidade de apagar (ajuste conforme necessário)
      } else {
        setTimeout(escrever, 1000); // tempo antes de começar a escrever novamente
      }
    }
    
    escrever();
  }
  
  escreverTexto();
</script>

</body>
</html>
