window.onload = inicializar;
import { initializeApp } from 'https://www.gstatic.com/firebasejs/9.4.0/firebase-app.js';
import { getStorage, ref, uploadBytes, getDownloadURL } from "https://www.gstatic.com/firebasejs/9.4.0/firebase-storage.js";
import { getAuth, onAuthStateChanged, } from "https://www.gstatic.com/firebasejs/9.4.0/firebase-auth.js";

const firebaseConfig = {
    apiKey: "AIzaSyBBHhn0625QMPzDb13fTu_qWyV2LWWH3xE",
    authDomain: "petfinder-9ee36.firebaseapp.com",
    projectId: "petfinder-9ee36",
    storageBucket: "petfinder-9ee36.appspot.com",
    messagingSenderId: "228917325355",
    appId: "1:228917325355:web:28fb1054782c9df92d446e"
};
const app = initializeApp(firebaseConfig);
var file;
var storage;
var storageRef;
var imgUrl;

function inicializar() {
    file = document.querySelector('#fichero');
    console.log(file);
    file.addEventListener('change', uploadImage, false);
    storage = getStorage();
    console.log(storage);
}

async function  uploadImage()  {
    var imagenASubir = file.files[0];
    var name = imagenASubir.name;
    console.log(imagenASubir);
    storageRef = ref(storage, 'animales/' + name);
    console.log(storageRef);
    let snapshot = await  uploadBytes(storageRef, imagenASubir);
    console.log('uploaded')
    let url = await getDownloadURL(ref(storage, 'animales/' + name));
    file = document.querySelector('#imgUrl');
    file.value = url;
}

// var send = document.getElementById('send');

// send.onclick = function loadImage









