/*const btnInformation = document.getElementsByClassName("btn-information");
const texInfo = document.getElementsByClassName("more-info");
const btnHide = document.getElementsByClassName("btn-hide");*/

const btnInformation = document.getElementsByName("btn-information");
const texInfo = document.getElementsByName("more-info");
const btnHide = document.getElementsByName("btn-hide");

btnInformation.addEventListener("click", function(){
    texInfo.style.display = "block";
    btnHide.style.display = "block";
    btnInformation.style.display = "none";
});

btnHide.addEventListener("click", function(){
    texInfo.style.display = "none";
    btnHide.style.display = "none";
    btnInformation.style.display = "block";

});


