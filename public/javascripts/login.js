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
            $(location).attr('href', '/home')
        }
    }
}

async function clickButton() {

    var username = $('#tbUsername').val();
    var password = $('#tbPassword').val();
    console.log(username + " " + password);

    var token = await getToken(username, password);

    if (token == ""){
        return;
    }
    else {
        $(location).attr('href', '/home')
    }
}

load();