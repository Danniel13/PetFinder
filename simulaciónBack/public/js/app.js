document.addEventListener('DOMContentLoaded', () => {
    
    const aboutusContainer = document.querySelector('#aboutusContainer');


    fetch('/simulaciónBack/public/data/aboutus.json')
    .then(response => response.json())
    .then(data =>{

        data.forEach(desarrollador => {
            aboutusContainer.innerHTML += `
            
            <div container-fluid text-center text-white">
        
                <div class="row w-100 mx-auto servicio-fila">
                    <div class="col-lg-4 col-md-6 col-sm-12 my-3">
                        <h3 class="fs-2 mt-2 px-4 pb-1">${desarrollador.nombre}</h3>
                        <img src="/simulaciónBack/public/assets/${desarrollador.id}.jpg" alt="Foto-de-desarrollador" width="200" height="200"> 
                        <p class="px-3"><strong>edad: </strong>${desarrollador.edad}</p>
                        <p class="px-3"><strong>lugar_de_residencia: </strong> ${desarrollador.lugar_de_residencia}</p>
                        <p class="px-3"><strong>descripcion: </strong> ${desarrollador.descripcion}</p>
                    </div><!-- /.col-lg-4 --
                </div> <!-/.row -->
            </div>
            `
        })

        console.log(data);
    
    })

    
})
