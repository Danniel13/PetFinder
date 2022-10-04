import { toggleMoreInformation } from '../../../js/index.js';

document.addEventListener('DOMContentLoaded',() =>{

    const imgscontainer = document.querySelector('#imgscontainer');

    fetch('/simulacionBack/public/data/animales.json')
    .then(response => response.json())
    .then(data =>{

        // NOTE: ejemplo de filtrado
        // const filteredData = data.filter(pet => pet.genero === 'macho');
        // console.log(filteredData)

        data.forEach(animales => {
            imgscontainer.innerHTML += `
            
            <div class="col d-grid justify-content-center align-self-start">
            <div class="card card-section " >
                <p class="h1" id="name">${animales.nombre}</p>
                <img src="/simulacionBack/public/assets/${animales.id}.jpg" alt="" class="img-fluid">
                <p class="more-info" id="more-info">
                    <span class="d-block mt-2 py-2">Genero: ${animales.genero}</span>
                    <span class="d-block mt-2 py-2">Raza: ${animales.raza}</span>
                    <span class="d-block mt-2 py-2">Edad: ${animales.edad}</span>
                    <span class="d-block mt-2 py-2">Informacion: ${animales.lugar_de_desaparicion}</span>
                    <span class="d-block mt-2">Contacto: ${animales.contacto}</span>
                </p>
                <div class="card-body">
                <button type="button" class="btn btn-secondary btn-information" data-bs-container="body" data-bs-toggle="popover" data-bs-placement="bottom" data-bs-content="Bottom popover" id="btn-information">
                    Mas informacion
                </button>
            </div>
            </div>
            `
        })

        
        toggleMoreInformation();
        
    })
})

