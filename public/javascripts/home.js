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
            $('#userBox').text('Welcome back, ' + name);
        }
    }
}

load();