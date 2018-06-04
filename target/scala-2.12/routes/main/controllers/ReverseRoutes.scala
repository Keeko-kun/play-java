// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/user/Documents/play-java/conf/routes
// @DATE:Mon May 28 10:58:42 CEST 2018

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

  // @LINE:19
  class ReverseGameController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:31
    def updateGame(): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "updategame")
    }
  
    // @LINE:23
    def getGame(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "getgame")
    }
  
    // @LINE:25
    def addUser(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "adduser")
    }
  
    // @LINE:21
    def newGame(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addgame")
    }
  
    // @LINE:19
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

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def app(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "app")
    }
  
    // @LINE:15
    def cake(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cake")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
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

  // @LINE:27
  class ReverseAuthController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def Authenticate(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "auth")
    }
  
    // @LINE:29
    def GetName(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "auth/name")
    }
  
  }


}
