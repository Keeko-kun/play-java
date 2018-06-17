// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ShiMapleLeaf/Documents/play-java/conf/routes
// @DATE:Sun Jun 17 13:56:17 CEST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  IndexController_6: controllers.IndexController,
  // @LINE:8
  CountController_0: controllers.CountController,
  // @LINE:10
  AsyncController_2: controllers.AsyncController,
  // @LINE:13
  Assets_7: controllers.Assets,
  // @LINE:21
  AuthController_1: controllers.AuthController,
  // @LINE:27
  Application_8: controllers.Application,
  // @LINE:31
  ReviewController_3: controllers.ReviewController,
  // @LINE:35
  GameController_4: controllers.GameController,
  // @LINE:55
  DeveloperController_5: controllers.DeveloperController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    IndexController_6: controllers.IndexController,
    // @LINE:8
    CountController_0: controllers.CountController,
    // @LINE:10
    AsyncController_2: controllers.AsyncController,
    // @LINE:13
    Assets_7: controllers.Assets,
    // @LINE:21
    AuthController_1: controllers.AuthController,
    // @LINE:27
    Application_8: controllers.Application,
    // @LINE:31
    ReviewController_3: controllers.ReviewController,
    // @LINE:35
    GameController_4: controllers.GameController,
    // @LINE:55
    DeveloperController_5: controllers.DeveloperController
  ) = this(errorHandler, IndexController_6, CountController_0, AsyncController_2, Assets_7, AuthController_1, Application_8, ReviewController_3, GameController_4, DeveloperController_5, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, IndexController_6, CountController_0, AsyncController_2, Assets_7, AuthController_1, Application_8, ReviewController_3, GameController_4, DeveloperController_5, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.IndexController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cake""", """controllers.IndexController.cake"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home""", """controllers.IndexController.home"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.IndexController.login"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """auth""", """controllers.AuthController.Authenticate"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """name/""" + "$" + """token<[^/]+>""", """controllers.AuthController.GetName(token:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """auth/""" + "$" + """name<[^/]+>/""" + "$" + """pass<[^/]+>""", """controllers.AuthController.GetToken(name:String, pass:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """javascriptRoutes""", """controllers.Application.javascriptRoutes"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.AuthController.login"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reviews/topsix""", """controllers.ReviewController.GetTopSixReviews"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """games""", """controllers.IndexController.game"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """game""", """controllers.GameController.GetAllGames"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """games/verify/""" + "$" + """token<[^/]+>""", """controllers.AuthController.VerifyAdmin(token:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """games/""" + "$" + """name<[^/]+>/""" + "$" + """price<[^/]+>/""" + "$" + """url<[^/]+>/""" + "$" + """developer<[^/]+>""", """controllers.GameController.AddGame(name:String, price:Int, url:String, developer:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """game/""" + "$" + """id<[^/]+>""", """controllers.IndexController.gamePage(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """game/""" + "$" + """id<[^/]+>""", """controllers.GameController.FindGame(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """review/""" + "$" + """id<[^/]+>/""" + "$" + """score<[^/]+>/""" + "$" + """review<[^/]+>/""" + "$" + """token<[^/]+>""", """controllers.ReviewController.NewReview(id:Int, score:Int, review:String, token:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """review/""" + "$" + """id<[^/]+>""", """controllers.IndexController.review(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """review/""" + "$" + """id<[^/]+>""", """controllers.ReviewController.FindReview(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """developer/""" + "$" + """id<[^/]+>""", """controllers.IndexController.developer(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """developer/""" + "$" + """id<[^/]+>""", """controllers.ReviewController.GetByDeveloper(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """developer""", """controllers.DeveloperController.GetAllDevelopers"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """developer/""" + "$" + """studio<[^/]+>/""" + "$" + """ceo<[^/]+>/""" + "$" + """thirdParty<[^/]+>/""" + "$" + """parent<[^/]+>/""" + "$" + """indie<[^/]+>""", """controllers.DeveloperController.AddDeveloper(studio:String, ceo:String, thirdParty:Boolean, parent:String, indie:Boolean)"""),
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
    IndexController_6.index,
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
    Assets_7.versioned(fakeValue[String], fakeValue[Asset]),
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
  private[this] lazy val controllers_IndexController_cake4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cake")))
  )
  private[this] lazy val controllers_IndexController_cake4_invoker = createInvoker(
    IndexController_6.cake,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.IndexController",
      "cake",
      Nil,
      "POST",
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
    IndexController_6.home,
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
    IndexController_6.login,
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
  private[this] lazy val controllers_AuthController_Authenticate7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("auth")))
  )
  private[this] lazy val controllers_AuthController_Authenticate7_invoker = createInvoker(
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

  // @LINE:23
  private[this] lazy val controllers_AuthController_GetName8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("name/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AuthController_GetName8_invoker = createInvoker(
    AuthController_1.GetName(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthController",
      "GetName",
      Seq(classOf[String]),
      "POST",
      this.prefix + """name/""" + "$" + """token<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_AuthController_GetToken9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("auth/"), DynamicPart("name", """[^/]+""",true), StaticPart("/"), DynamicPart("pass", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AuthController_GetToken9_invoker = createInvoker(
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

  // @LINE:27
  private[this] lazy val controllers_Application_javascriptRoutes10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("javascriptRoutes")))
  )
  private[this] lazy val controllers_Application_javascriptRoutes10_invoker = createInvoker(
    Application_8.javascriptRoutes,
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

  // @LINE:29
  private[this] lazy val controllers_AuthController_login11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_AuthController_login11_invoker = createInvoker(
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

  // @LINE:31
  private[this] lazy val controllers_ReviewController_GetTopSixReviews12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reviews/topsix")))
  )
  private[this] lazy val controllers_ReviewController_GetTopSixReviews12_invoker = createInvoker(
    ReviewController_3.GetTopSixReviews,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ReviewController",
      "GetTopSixReviews",
      Nil,
      "GET",
      this.prefix + """reviews/topsix""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_IndexController_game13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("games")))
  )
  private[this] lazy val controllers_IndexController_game13_invoker = createInvoker(
    IndexController_6.game,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.IndexController",
      "game",
      Nil,
      "GET",
      this.prefix + """games""",
      """""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_GameController_GetAllGames14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("game")))
  )
  private[this] lazy val controllers_GameController_GetAllGames14_invoker = createInvoker(
    GameController_4.GetAllGames,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameController",
      "GetAllGames",
      Nil,
      "GET",
      this.prefix + """game""",
      """""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_AuthController_VerifyAdmin15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("games/verify/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AuthController_VerifyAdmin15_invoker = createInvoker(
    AuthController_1.VerifyAdmin(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthController",
      "VerifyAdmin",
      Seq(classOf[String]),
      "POST",
      this.prefix + """games/verify/""" + "$" + """token<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:39
  private[this] lazy val controllers_GameController_AddGame16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("games/"), DynamicPart("name", """[^/]+""",true), StaticPart("/"), DynamicPart("price", """[^/]+""",true), StaticPart("/"), DynamicPart("url", """[^/]+""",true), StaticPart("/"), DynamicPart("developer", """[^/]+""",true)))
  )
  private[this] lazy val controllers_GameController_AddGame16_invoker = createInvoker(
    GameController_4.AddGame(fakeValue[String], fakeValue[Int], fakeValue[String], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameController",
      "AddGame",
      Seq(classOf[String], classOf[Int], classOf[String], classOf[Long]),
      "POST",
      this.prefix + """games/""" + "$" + """name<[^/]+>/""" + "$" + """price<[^/]+>/""" + "$" + """url<[^/]+>/""" + "$" + """developer<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:41
  private[this] lazy val controllers_IndexController_gamePage17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("game/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_IndexController_gamePage17_invoker = createInvoker(
    IndexController_6.gamePage(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.IndexController",
      "gamePage",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """game/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:43
  private[this] lazy val controllers_GameController_FindGame18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("game/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_GameController_FindGame18_invoker = createInvoker(
    GameController_4.FindGame(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameController",
      "FindGame",
      Seq(classOf[Int]),
      "POST",
      this.prefix + """game/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:45
  private[this] lazy val controllers_ReviewController_NewReview19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("review/"), DynamicPart("id", """[^/]+""",true), StaticPart("/"), DynamicPart("score", """[^/]+""",true), StaticPart("/"), DynamicPart("review", """[^/]+""",true), StaticPart("/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ReviewController_NewReview19_invoker = createInvoker(
    ReviewController_3.NewReview(fakeValue[Int], fakeValue[Int], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ReviewController",
      "NewReview",
      Seq(classOf[Int], classOf[Int], classOf[String], classOf[String]),
      "POST",
      this.prefix + """review/""" + "$" + """id<[^/]+>/""" + "$" + """score<[^/]+>/""" + "$" + """review<[^/]+>/""" + "$" + """token<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:47
  private[this] lazy val controllers_IndexController_review20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("review/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_IndexController_review20_invoker = createInvoker(
    IndexController_6.review(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.IndexController",
      "review",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """review/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:49
  private[this] lazy val controllers_ReviewController_FindReview21_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("review/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ReviewController_FindReview21_invoker = createInvoker(
    ReviewController_3.FindReview(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ReviewController",
      "FindReview",
      Seq(classOf[Int]),
      "POST",
      this.prefix + """review/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:51
  private[this] lazy val controllers_IndexController_developer22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("developer/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_IndexController_developer22_invoker = createInvoker(
    IndexController_6.developer(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.IndexController",
      "developer",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """developer/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:53
  private[this] lazy val controllers_ReviewController_GetByDeveloper23_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("developer/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ReviewController_GetByDeveloper23_invoker = createInvoker(
    ReviewController_3.GetByDeveloper(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ReviewController",
      "GetByDeveloper",
      Seq(classOf[Int]),
      "POST",
      this.prefix + """developer/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:55
  private[this] lazy val controllers_DeveloperController_GetAllDevelopers24_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("developer")))
  )
  private[this] lazy val controllers_DeveloperController_GetAllDevelopers24_invoker = createInvoker(
    DeveloperController_5.GetAllDevelopers,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DeveloperController",
      "GetAllDevelopers",
      Nil,
      "POST",
      this.prefix + """developer""",
      """""",
      Seq()
    )
  )

  // @LINE:57
  private[this] lazy val controllers_DeveloperController_AddDeveloper25_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("developer/"), DynamicPart("studio", """[^/]+""",true), StaticPart("/"), DynamicPart("ceo", """[^/]+""",true), StaticPart("/"), DynamicPart("thirdParty", """[^/]+""",true), StaticPart("/"), DynamicPart("parent", """[^/]+""",true), StaticPart("/"), DynamicPart("indie", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DeveloperController_AddDeveloper25_invoker = createInvoker(
    DeveloperController_5.AddDeveloper(fakeValue[String], fakeValue[String], fakeValue[Boolean], fakeValue[String], fakeValue[Boolean]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DeveloperController",
      "AddDeveloper",
      Seq(classOf[String], classOf[String], classOf[Boolean], classOf[String], classOf[Boolean]),
      "POST",
      this.prefix + """developer/""" + "$" + """studio<[^/]+>/""" + "$" + """ceo<[^/]+>/""" + "$" + """thirdParty<[^/]+>/""" + "$" + """parent<[^/]+>/""" + "$" + """indie<[^/]+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_IndexController_index0_route(params@_) =>
      call { 
        controllers_IndexController_index0_invoker.call(IndexController_6.index)
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
        controllers_Assets_versioned3_invoker.call(Assets_7.versioned(path, file))
      }
  
    // @LINE:15
    case controllers_IndexController_cake4_route(params@_) =>
      call { 
        controllers_IndexController_cake4_invoker.call(IndexController_6.cake)
      }
  
    // @LINE:17
    case controllers_IndexController_home5_route(params@_) =>
      call { 
        controllers_IndexController_home5_invoker.call(IndexController_6.home)
      }
  
    // @LINE:19
    case controllers_IndexController_login6_route(params@_) =>
      call { 
        controllers_IndexController_login6_invoker.call(IndexController_6.login)
      }
  
    // @LINE:21
    case controllers_AuthController_Authenticate7_route(params@_) =>
      call { 
        controllers_AuthController_Authenticate7_invoker.call(AuthController_1.Authenticate)
      }
  
    // @LINE:23
    case controllers_AuthController_GetName8_route(params@_) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_AuthController_GetName8_invoker.call(AuthController_1.GetName(token))
      }
  
    // @LINE:25
    case controllers_AuthController_GetToken9_route(params@_) =>
      call(params.fromPath[String]("name", None), params.fromPath[String]("pass", None)) { (name, pass) =>
        controllers_AuthController_GetToken9_invoker.call(AuthController_1.GetToken(name, pass))
      }
  
    // @LINE:27
    case controllers_Application_javascriptRoutes10_route(params@_) =>
      call { 
        controllers_Application_javascriptRoutes10_invoker.call(Application_8.javascriptRoutes)
      }
  
    // @LINE:29
    case controllers_AuthController_login11_route(params@_) =>
      call { 
        controllers_AuthController_login11_invoker.call(AuthController_1.login)
      }
  
    // @LINE:31
    case controllers_ReviewController_GetTopSixReviews12_route(params@_) =>
      call { 
        controllers_ReviewController_GetTopSixReviews12_invoker.call(ReviewController_3.GetTopSixReviews)
      }
  
    // @LINE:33
    case controllers_IndexController_game13_route(params@_) =>
      call { 
        controllers_IndexController_game13_invoker.call(IndexController_6.game)
      }
  
    // @LINE:35
    case controllers_GameController_GetAllGames14_route(params@_) =>
      call { 
        controllers_GameController_GetAllGames14_invoker.call(GameController_4.GetAllGames)
      }
  
    // @LINE:37
    case controllers_AuthController_VerifyAdmin15_route(params@_) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_AuthController_VerifyAdmin15_invoker.call(AuthController_1.VerifyAdmin(token))
      }
  
    // @LINE:39
    case controllers_GameController_AddGame16_route(params@_) =>
      call(params.fromPath[String]("name", None), params.fromPath[Int]("price", None), params.fromPath[String]("url", None), params.fromPath[Long]("developer", None)) { (name, price, url, developer) =>
        controllers_GameController_AddGame16_invoker.call(GameController_4.AddGame(name, price, url, developer))
      }
  
    // @LINE:41
    case controllers_IndexController_gamePage17_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_IndexController_gamePage17_invoker.call(IndexController_6.gamePage(id))
      }
  
    // @LINE:43
    case controllers_GameController_FindGame18_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_GameController_FindGame18_invoker.call(GameController_4.FindGame(id))
      }
  
    // @LINE:45
    case controllers_ReviewController_NewReview19_route(params@_) =>
      call(params.fromPath[Int]("id", None), params.fromPath[Int]("score", None), params.fromPath[String]("review", None), params.fromPath[String]("token", None)) { (id, score, review, token) =>
        controllers_ReviewController_NewReview19_invoker.call(ReviewController_3.NewReview(id, score, review, token))
      }
  
    // @LINE:47
    case controllers_IndexController_review20_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_IndexController_review20_invoker.call(IndexController_6.review(id))
      }
  
    // @LINE:49
    case controllers_ReviewController_FindReview21_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_ReviewController_FindReview21_invoker.call(ReviewController_3.FindReview(id))
      }
  
    // @LINE:51
    case controllers_IndexController_developer22_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_IndexController_developer22_invoker.call(IndexController_6.developer(id))
      }
  
    // @LINE:53
    case controllers_ReviewController_GetByDeveloper23_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_ReviewController_GetByDeveloper23_invoker.call(ReviewController_3.GetByDeveloper(id))
      }
  
    // @LINE:55
    case controllers_DeveloperController_GetAllDevelopers24_route(params@_) =>
      call { 
        controllers_DeveloperController_GetAllDevelopers24_invoker.call(DeveloperController_5.GetAllDevelopers)
      }
  
    // @LINE:57
    case controllers_DeveloperController_AddDeveloper25_route(params@_) =>
      call(params.fromPath[String]("studio", None), params.fromPath[String]("ceo", None), params.fromPath[Boolean]("thirdParty", None), params.fromPath[String]("parent", None), params.fromPath[Boolean]("indie", None)) { (studio, ceo, thirdParty, parent, indie) =>
        controllers_DeveloperController_AddDeveloper25_invoker.call(DeveloperController_5.AddDeveloper(studio, ceo, thirdParty, parent, indie))
      }
  }
}
