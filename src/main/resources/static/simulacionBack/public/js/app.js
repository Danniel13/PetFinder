document.addEventListener("DOMContentLoaded", () => {
  const aboutusContainer = document.querySelector("#aboutusContainer");

  fetch("/simulacionBack/public/data/aboutus.json")
    .then((response) => response.json())
    .then((data) => {
      data.forEach((desarrollador) => {
        aboutusContainer.innerHTML += `
            
            <div class="col-lg-4 col-md-6 col-sm-12">
                <div class="w-100 mx-auto servicio-fila">
                    <div class=" icono-wrap">
                        <h3>${desarrollador.nombre}</h3>
                        <img src="/simulacionBack/public/assets/${desarrollador.id}.jpg" alt="Foto-de-desarrollador" width="200" height="200"> 
                        <p class="px-3"><strong>Edad: </strong>${desarrollador.edad}</p>
                        <p class="px-3"><strong>Lugar de Residencia: </strong> ${desarrollador.lugar_de_residencia}</p>
                        <p class="px-3"><strong>Descripción: </strong> ${desarrollador.descripcion}</p>
                    </div>
                </div>  
            </div>
            `;
      });

      console.log(data);
    });
});
