// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ShiMapleLeaf/Documents/play-java/conf/routes
// @DATE:Sun May 27 12:29:30 CEST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_1: controllers.HomeController,
  // @LINE:8
  CountController_0: controllers.CountController,
  // @LINE:10
  AsyncController_2: controllers.AsyncController,
  // @LINE:13
  Assets_4: controllers.Assets,
  // @LINE:19
  GameController_3: controllers.GameController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:8
    CountController_0: controllers.CountController,
    // @LINE:10
    AsyncController_2: controllers.AsyncController,
    // @LINE:13
    Assets_4: controllers.Assets,
    // @LINE:19
    GameController_3: controllers.GameController
  ) = this(errorHandler, HomeController_1, CountController_0, AsyncController_2, Assets_4, GameController_3, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, CountController_0, AsyncController_2, Assets_4, GameController_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cake""", """controllers.HomeController.cake"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """app""", """controllers.HomeController.app"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """gamejson""", """controllers.GameController.gamejson"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addgame""", """controllers.GameController.newGame"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getgame""", """controllers.GameController.getGame"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updategame""", """controllers.GameController.updateGame"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
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
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
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
  private[this] lazy val controllers_HomeController_cake4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cake")))
  )
  private[this] lazy val controllers_HomeController_cake4_invoker = createInvoker(
    HomeController_1.cake,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "cake",
      Nil,
      "GET",
      this.prefix + """cake""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_app5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("app")))
  )
  private[this] lazy val controllers_HomeController_app5_invoker = createInvoker(
    HomeController_1.app,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "app",
      Nil,
      "GET",
      this.prefix + """app""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_GameController_gamejson6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("gamejson")))
  )
  private[this] lazy val controllers_GameController_gamejson6_invoker = createInvoker(
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

  // @LINE:21
  private[this] lazy val controllers_GameController_newGame7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addgame")))
  )
  private[this] lazy val controllers_GameController_newGame7_invoker = createInvoker(
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

  // @LINE:23
  private[this] lazy val controllers_GameController_getGame8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getgame")))
  )
  private[this] lazy val controllers_GameController_getGame8_invoker = createInvoker(
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

  // @LINE:25
  private[this] lazy val controllers_GameController_updateGame9_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updategame")))
  )
  private[this] lazy val controllers_GameController_updateGame9_invoker = createInvoker(
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


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index)
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
        controllers_Assets_versioned3_invoker.call(Assets_4.versioned(path, file))
      }
  
    // @LINE:15
    case controllers_HomeController_cake4_route(params@_) =>
      call { 
        controllers_HomeController_cake4_invoker.call(HomeController_1.cake)
      }
  
    // @LINE:17
    case controllers_HomeController_app5_route(params@_) =>
      call { 
        controllers_HomeController_app5_invoker.call(HomeController_1.app)
      }
  
    // @LINE:19
    case controllers_GameController_gamejson6_route(params@_) =>
      call { 
        controllers_GameController_gamejson6_invoker.call(GameController_3.gamejson)
      }
  
    // @LINE:21
    case controllers_GameController_newGame7_route(params@_) =>
      call { 
        controllers_GameController_newGame7_invoker.call(GameController_3.newGame)
      }
  
    // @LINE:23
    case controllers_GameController_getGame8_route(params@_) =>
      call { 
        controllers_GameController_getGame8_invoker.call(GameController_3.getGame)
      }
  
    // @LINE:25
    case controllers_GameController_updateGame9_route(params@_) =>
      call { 
        controllers_GameController_updateGame9_invoker.call(GameController_3.updateGame)
      }
  }
}
