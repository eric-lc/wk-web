$(function(){$(window).scroll(function(){var o=document.documentElement.clientHeight||document.body.clientHeight;$(window).scrollTop()>o?$(".backTop").show():$(".backTop").hide()}),$(".backTop").on("click",function(){$("html,body").animate({scrollTop:0})})});