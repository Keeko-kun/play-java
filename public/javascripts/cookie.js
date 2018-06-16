function saveCookie(cname, cvalue, exdays){
    var d = new Date();
    d.setTime(d.getTime() + (exdays*24*60*60*1000));
    var expires = "expires="+ d.toUTCString();
    document.cookie = cname + "=" + cvalue + ";" + expires + ";path=/";
}

function getCookie(cname) {
    var name = cname + "=";
    var decodedCookie = decodeURIComponent(document.cookie);
    var ca = decodedCookie.split(';');
    for(var i = 0; i <ca.length; i++) {
        var c = ca[i];
        while (c.charAt(0) == ' ') {
            c = c.substring(1);
        }
        if (c.indexOf(name) == 0) {
            return c.substring(name.length, c.length);
        }
    }
    return "";
}

function deleteToken(){
    document.cookie = 'token' + '=; expires=Thu, 01 Jan 1970 00:00:01 GMT;';
}

async function getToken(username, password){
    var token = await JsRoutes.controllers.AuthController.GetToken(username, password).ajax({});

    console.log(token);

    if (token == ""){

    }
    else {
        saveCookie("token", token, 1);
    }

    return token;
}

async function load(){
    var token;

    token = getCookie("token");

    if (token == "") {

    }
    else {
        var name = await JsRoutes.controllers.AuthController.GetName(token).ajax({});

        console.log(name);

        if (name == ""){

        }
        else {
            $('#loginText').text('Logout');
        }
    }
}

load();

