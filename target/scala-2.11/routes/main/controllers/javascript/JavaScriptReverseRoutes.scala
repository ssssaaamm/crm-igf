
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/sarahi/crm-igf/conf/routes
// @DATE:Sat Nov 05 14:50:38 CST 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:53
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:53
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:25
  class ReverseAgenteServicioController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def incidencias: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AgenteServicioController.incidencias",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "agente_s/incidencias"})
        }
      """
    )
  
  }

  // @LINE:47
  class ReverseCountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:47
    def count: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CountController.count",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "count"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def login_post: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.login_post",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:11
    def register_post: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.register_post",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
        }
      """
    )
  
    // @LINE:12
    def about: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.about",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "about"})
        }
      """
    )
  
    // @LINE:9
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:10
    def register: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.register",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:7
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:33
  class ReverseAdministradorController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:35
    def empleado_new: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdministradorController.empleado_new",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/empleados/new"})
        }
      """
    )
  
    // @LINE:38
    def producto_edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdministradorController.producto_edit",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/productos/edit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:34
    def productos: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdministradorController.productos",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/productos"})
        }
      """
    )
  
    // @LINE:33
    def empleados: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdministradorController.empleados",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/empleados"})
        }
      """
    )
  
    // @LINE:37
    def empleado_edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdministradorController.empleado_edit",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/empleados/edit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:36
    def producto_new: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdministradorController.producto_new",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/productos/new"})
        }
      """
    )
  
    // @LINE:39
    def empleado_remove: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdministradorController.empleado_remove",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/empleados/remove/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:40
    def producto_remove: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdministradorController.producto_remove",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/productos/remove/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
  }

  // @LINE:49
  class ReverseAsyncController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:49
    def message: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsyncController.message",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
        }
      """
    )
  
  }

  // @LINE:29
  class ReverseAgenteMarketingController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def ofertas: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AgenteMarketingController.ofertas",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "agente_m/ofertas"})
        }
      """
    )
  
  }

  // @LINE:17
  class ReverseClienteController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def incidentes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClienteController.incidentes",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "incidentes"})
        }
      """
    )
  
    // @LINE:17
    def productos: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClienteController.productos",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "productos"})
        }
      """
    )
  
    // @LINE:18
    def ofertas: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClienteController.ofertas",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ofertas"})
        }
      """
    )
  
    // @LINE:20
    def carretilla: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClienteController.carretilla",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "carretilla"})
        }
      """
    )
  
  }


}
