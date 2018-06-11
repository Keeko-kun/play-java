// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ShiMapleLeaf/Documents/play-java/conf/routes
// @DATE:Mon Jun 11 11:26:18 CEST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:13
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:21
  class ReverseGameController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:33
    def updateGame(): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "updategame")
    }
  
    // @LINE:25
    def getGame(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "getgame")
    }
  
    // @LINE:27
    def addUser(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "adduser")
    }
  
    // @LINE:23
    def newGame(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addgame")
    }
  
    // @LINE:21
    def gamejson(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "gamejson")
    }
  
  }

  // @LINE:8
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def count(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }

  // @LINE:10
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def message(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }

  // @LINE:37
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:37
    def javascriptRoutes(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "javascriptRoutes")
    }
  
  }

  // @LINE:6
  class ReverseIndexController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def home(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "home")
    }
  
    // @LINE:15
    def cake(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cake")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:19
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:29
  class ReverseAuthController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:31
    def GetName(token:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "name/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("token", token)))
    }
  
    // @LINE:29
    def Authenticate(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "auth")
    }
  
    // @LINE:35
    def GetToken(name:String, pass:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "auth/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("pass", pass)))
    }
  
    // @LINE:39
    def login(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "login")
    }
  
  }


}
