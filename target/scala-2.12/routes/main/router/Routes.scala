// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ShiMapleLeaf/Documents/play-java/conf/routes
// @DATE:Mon Jun 11 10:43:05 CEST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  IndexController_4: controllers.IndexController,
  // @LINE:8
  CountController_0: controllers.CountController,
  // @LINE:10
  AsyncController_2: controllers.AsyncController,
  // @LINE:13
  Assets_5: controllers.Assets,
  // @LINE:21
  GameController_3: controllers.GameController,
  // @LINE:29
  AuthController_1: controllers.AuthController,
  // @LINE:37
  Application_6: controllers.Application,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    IndexController_4: controllers.IndexController,
    // @LINE:8
    CountController_0: controllers.CountController,
    // @LINE:10
    AsyncController_2: controllers.AsyncController,
    // @LINE:13
    Assets_5: controllers.Assets,
    // @LINE:21
    GameController_3: controllers.GameController,
    // @LINE:29
    AuthController_1: controllers.AuthController,
    // @LINE:37
    Application_6: controllers.Application
  ) = this(errorHandler, IndexController_4, CountController_0, AsyncController_2, Assets_5, GameController_3, AuthController_1, Application_6, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, IndexController_4, CountController_0, AsyncController_2, Assets_5, GameController_3, AuthController_1, Application_6, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.IndexController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cake""", """controllers.IndexController.cake"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home""", """controllers.IndexController.home"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.IndexController.login"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """gamejson""", """controllers.GameController.gamejson"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addgame""", """controllers.GameController.newGame"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getgame""", """controllers.GameController.getGame"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adduser""", """controllers.GameController.addUser"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """auth""", """controllers.AuthController.Authenticate"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """auth/name""", """controllers.AuthController.GetName"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updategame""", """controllers.GameController.updateGame"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """auth/""" + "$" + """name<[^/]+>/""" + "$" + """pass<[^/]+>""", """controllers.AuthController.GetToken(name:String, pass:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """javascriptRoutes""", """controllers.Application.javascriptRoutes"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.AuthController.login"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_IndexController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_IndexController_index0_invoker = createInvoker(
    IndexController_4.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.IndexController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_CountController_count1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count1_invoker = createInvoker(
    CountController_0.count,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      this.prefix + """count""",
      """ An example controller showing how to use dependency injection""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_AsyncController_message2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message2_invoker = createInvoker(
    AsyncController_2.message,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      this.prefix + """message""",
      """ An example controller showing how to write asynchronous code""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Assets_versioned3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
    Assets_5.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_IndexController_cake4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cake")))
  )
  private[this] lazy val controllers_IndexController_cake4_invoker = createInvoker(
    IndexController_4.cake,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.IndexController",
      "cake",
      Nil,
      "GET",
      this.prefix + """cake""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_IndexController_home5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home")))
  )
  private[this] lazy val controllers_IndexController_home5_invoker = createInvoker(
    IndexController_4.home,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.IndexController",
      "home",
      Nil,
      "GET",
      this.prefix + """home""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_IndexController_login6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_IndexController_login6_invoker = createInvoker(
    IndexController_4.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.IndexController",
      "login",
      Nil,
      "GET",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_GameController_gamejson7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("gamejson")))
  )
  private[this] lazy val controllers_GameController_gamejson7_invoker = createInvoker(
    GameController_3.gamejson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameController",
      "gamejson",
      Nil,
      "GET",
      this.prefix + """gamejson""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_GameController_newGame8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addgame")))
  )
  private[this] lazy val controllers_GameController_newGame8_invoker = createInvoker(
    GameController_3.newGame,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameController",
      "newGame",
      Nil,
      "POST",
      this.prefix + """addgame""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_GameController_getGame9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getgame")))
  )
  private[this] lazy val controllers_GameController_getGame9_invoker = createInvoker(
    GameController_3.getGame,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameController",
      "getGame",
      Nil,
      "GET",
      this.prefix + """getgame""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_GameController_addUser10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adduser")))
  )
  private[this] lazy val controllers_GameController_addUser10_invoker = createInvoker(
    GameController_3.addUser,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameController",
      "addUser",
      Nil,
      "GET",
      this.prefix + """adduser""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_AuthController_Authenticate11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("auth")))
  )
  private[this] lazy val controllers_AuthController_Authenticate11_invoker = createInvoker(
    AuthController_1.Authenticate,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthController",
      "Authenticate",
      Nil,
      "GET",
      this.prefix + """auth""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_AuthController_GetName12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("auth/name")))
  )
  private[this] lazy val controllers_AuthController_GetName12_invoker = createInvoker(
    AuthController_1.GetName,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthController",
      "GetName",
      Nil,
      "GET",
      this.prefix + """auth/name""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_GameController_updateGame13_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updategame")))
  )
  private[this] lazy val controllers_GameController_updateGame13_invoker = createInvoker(
    GameController_3.updateGame,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameController",
      "updateGame",
      Nil,
      "PUT",
      this.prefix + """updategame""",
      """""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_AuthController_GetToken14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("auth/"), DynamicPart("name", """[^/]+""",true), StaticPart("/"), DynamicPart("pass", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AuthController_GetToken14_invoker = createInvoker(
    AuthController_1.GetToken(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthController",
      "GetToken",
      Seq(classOf[String], classOf[String]),
      "POST",
      this.prefix + """auth/""" + "$" + """name<[^/]+>/""" + "$" + """pass<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_Application_javascriptRoutes15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("javascriptRoutes")))
  )
  private[this] lazy val controllers_Application_javascriptRoutes15_invoker = createInvoker(
    Application_6.javascriptRoutes,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "javascriptRoutes",
      Nil,
      "GET",
      this.prefix + """javascriptRoutes""",
      """""",
      Seq()
    )
  )

  // @LINE:39
  private[this] lazy val controllers_AuthController_login16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_AuthController_login16_invoker = createInvoker(
    AuthController_1.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthController",
      "login",
      Nil,
      "POST",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_IndexController_index0_route(params@_) =>
      call { 
        controllers_IndexController_index0_invoker.call(IndexController_4.index)
      }
  
    // @LINE:8
    case controllers_CountController_count1_route(params@_) =>
      call { 
        controllers_CountController_count1_invoker.call(CountController_0.count)
      }
  
    // @LINE:10
    case controllers_AsyncController_message2_route(params@_) =>
      call { 
        controllers_AsyncController_message2_invoker.call(AsyncController_2.message)
      }
  
    // @LINE:13
    case controllers_Assets_versioned3_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned3_invoker.call(Assets_5.versioned(path, file))
      }
  
    // @LINE:15
    case controllers_IndexController_cake4_route(params@_) =>
      call { 
        controllers_IndexController_cake4_invoker.call(IndexController_4.cake)
      }
  
    // @LINE:17
    case controllers_IndexController_home5_route(params@_) =>
      call { 
        controllers_IndexController_home5_invoker.call(IndexController_4.home)
      }
  
    // @LINE:19
    case controllers_IndexController_login6_route(params@_) =>
      call { 
        controllers_IndexController_login6_invoker.call(IndexController_4.login)
      }
  
    // @LINE:21
    case controllers_GameController_gamejson7_route(params@_) =>
      call { 
        controllers_GameController_gamejson7_invoker.call(GameController_3.gamejson)
      }
  
    // @LINE:23
    case controllers_GameController_newGame8_route(params@_) =>
      call { 
        controllers_GameController_newGame8_invoker.call(GameController_3.newGame)
      }
  
    // @LINE:25
    case controllers_GameController_getGame9_route(params@_) =>
      call { 
        controllers_GameController_getGame9_invoker.call(GameController_3.getGame)
      }
  
    // @LINE:27
    case controllers_GameController_addUser10_route(params@_) =>
      call { 
        controllers_GameController_addUser10_invoker.call(GameController_3.addUser)
      }
  
    // @LINE:29
    case controllers_AuthController_Authenticate11_route(params@_) =>
      call { 
        controllers_AuthController_Authenticate11_invoker.call(AuthController_1.Authenticate)
      }
  
    // @LINE:31
    case controllers_AuthController_GetName12_route(params@_) =>
      call { 
        controllers_AuthController_GetName12_invoker.call(AuthController_1.GetName)
      }
  
    // @LINE:33
    case controllers_GameController_updateGame13_route(params@_) =>
      call { 
        controllers_GameController_updateGame13_invoker.call(GameController_3.updateGame)
      }
  
    // @LINE:35
    case controllers_AuthController_GetToken14_route(params@_) =>
      call(params.fromPath[String]("name", None), params.fromPath[String]("pass", None)) { (name, pass) =>
        controllers_AuthController_GetToken14_invoker.call(AuthController_1.GetToken(name, pass))
      }
  
    // @LINE:37
    case controllers_Application_javascriptRoutes15_route(params@_) =>
      call { 
        controllers_Application_javascriptRoutes15_invoker.call(Application_6.javascriptRoutes)
      }
  
    // @LINE:39
    case controllers_AuthController_login16_route(params@_) =>
      call { 
        controllers_AuthController_login16_invoker.call(AuthController_1.login)
      }
  }
}
