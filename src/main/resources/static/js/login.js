const login = () => {
    const email = document.getElementById("floatingEmail").value;
    const password = document.getElementById("floatingPassword").value;

    if (email == "") {
        showError("¡El usuario es requerido!");
        return;
    }
    if (password == "") {
        showError("¡La contraseña es requerida!");
        return;
    }

    const body = {
        "email": email,
        "password": password
    };
    postToLogin(body);


};

const postToLogin = async (bodyObject) => {
    const url = "/api/login";
    const response = await fetch(url, {
        method: "POST",
        body: JSON.stringify(bodyObject),
        headers: {
            "Content-Type": "application/json"
        }
    });

    if (response.ok) {
        const email = await response.json();

        localStorage.setItem("loggedUser", JSON.stringify(email));
        
        alert("¡Welcome "+email.name+ " " + email.lastname +"!", "success");
        
        await new Promise(r => setTimeout(r, 2000));

        window.location.href = "/reporter";
    } else {
        const message = await response.text();
        showError(message);
    }
};

const showError = (message) => {
    alert(message, "danger");
}

const alert = (message, type) => {
    document.getElementById("errorBox").innerHTML = [
        `<div class="alert alert-${type} alert-dismissible" role="alert">`,
        `   <div>${message}</div>`,
        '   <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>',
        '</div>'
    ].join('')
}