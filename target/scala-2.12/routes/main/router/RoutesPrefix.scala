// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ShiMapleLeaf/Documents/play-java/conf/routes
// @DATE:Mon Jun 11 11:26:18 CEST 2018


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
