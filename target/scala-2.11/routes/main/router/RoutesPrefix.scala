
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/vagrant/example-app/conf/routes
// @DATE:Sat Mar 04 02:42:50 UTC 2017


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
