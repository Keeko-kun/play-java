// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ShiMapleLeaf/Documents/play-java/conf/routes
// @DATE:Sun May 27 10:47:44 CEST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

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


}
