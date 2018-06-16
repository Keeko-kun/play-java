// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ShiMapleLeaf/Documents/play-java/conf/routes
// @DATE:Sat Jun 16 17:06:19 CEST 2018

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

  // @LINE:35
  class ReverseGameController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:43
    def FindGame(id:Int): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "game/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:39
    def AddGame(name:String, price:Int, url:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "games/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("price", price)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("url", url)))
    }
  
    // @LINE:35
    def GetAllGames(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "game")
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

  // @LINE:31
  class ReverseReviewController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:31
    def GetTopSixReviews(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "reviews/topsix")
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
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def javascriptRoutes(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "javascriptRoutes")
    }
  
  }

  // @LINE:6
  class ReverseIndexController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:33
    def game(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "games")
    }
  
    // @LINE:17
    def home(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "home")
    }
  
    // @LINE:15
    def cake(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "cake")
    }
  
    // @LINE:41
    def gamePage(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "game/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
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

  // @LINE:21
  class ReverseAuthController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def GetToken(name:String, pass:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "auth/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("pass", pass)))
    }
  
    // @LINE:23
    def GetName(token:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "name/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("token", token)))
    }
  
    // @LINE:37
    def VerifyAdmin(token:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "games/verify/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("token", token)))
    }
  
    // @LINE:21
    def Authenticate(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "auth")
    }
  
    // @LINE:29
    def login(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "login")
    }
  
  }


}
