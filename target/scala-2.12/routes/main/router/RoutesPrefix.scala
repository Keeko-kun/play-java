// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/user/Documents/play-java/conf/routes
// @DATE:Wed Jun 13 11:12:44 CEST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
