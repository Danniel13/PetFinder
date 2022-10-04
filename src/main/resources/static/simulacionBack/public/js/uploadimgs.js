window.onload = inicializar;
var fichero;
var imgsStorageRef;

function inicializar() {
    fichero = document.getElementById("select-img");
    fichero.addEventListener("change", uploadImg, false);

    imgsStorageRef = firebase.storage().ref();

    
};

function uploadImg() {
    var imgToUpload = fichero.files[0];

    var uploadTask = imgsStorageRef.child('animales/'+ imgToUpload.name).put(imgToUpload);
};