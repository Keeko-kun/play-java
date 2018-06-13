// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/user/Documents/play-java/conf/routes
// @DATE:Wed Jun 13 11:12:44 CEST 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:13
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:21
  class ReverseGameController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:33
    def updateGame: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameController.updateGame",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "updategame"})
        }
      """
    )
  
    // @LINE:25
    def getGame: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameController.getGame",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getgame"})
        }
      """
    )
  
    // @LINE:27
    def addUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameController.addUser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "adduser"})
        }
      """
    )
  
    // @LINE:23
    def newGame: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameController.newGame",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addgame"})
        }
      """
    )
  
    // @LINE:21
    def gamejson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameController.gamejson",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "gamejson"})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseCountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def count: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CountController.count",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "count"})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseAsyncController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def message: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsyncController.message",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
        }
      """
    )
  
  }

  // @LINE:37
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:37
    def javascriptRoutes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.javascriptRoutes",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "javascriptRoutes"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseIndexController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def home: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.IndexController.home",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home"})
        }
      """
    )
  
    // @LINE:15
    def cake: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.IndexController.cake",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cake"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.IndexController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:19
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.IndexController.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:29
  class ReverseAuthController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:31
    def GetName: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthController.GetName",
      """
        function(token0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "name/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("token", token0))})
        }
      """
    )
  
    // @LINE:29
    def Authenticate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthController.Authenticate",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "auth"})
        }
      """
    )
  
    // @LINE:35
    def GetToken: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthController.GetToken",
      """
        function(name0,pass1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "auth/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("name", name0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("pass", pass1))})
        }
      """
    )
  
    // @LINE:39
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthController.login",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }


}
