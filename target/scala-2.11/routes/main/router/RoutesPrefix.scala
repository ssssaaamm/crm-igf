
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/sarahi/crm-igf/conf/routes
// @DATE:Sat Nov 05 14:50:38 CST 2016


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
