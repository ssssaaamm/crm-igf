
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object base_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class base extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,Html,Html,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, css: Html = Html(""), js: Html = Html(""))(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.75*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <title>"""),_display_(/*6.17*/title),format.raw/*6.22*/("""</title>
        <!-- <link rel="stylesheet" media="screen" href=""""),_display_(/*7.59*/routes/*7.65*/.Assets.versioned("stylesheets/main.css")),format.raw/*7.106*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*8.59*/routes/*8.65*/.Assets.versioned("images/favicon.png")),format.raw/*8.104*/(""""> -->
        <link rel="stylesheet" media="screen" href=""""),_display_(/*9.54*/routes/*9.60*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*9.110*/("""">
        <!-- <link rel="stylesheet" media="screen" href=""""),_display_(/*10.59*/routes/*10.65*/.Assets.versioned("stylesheets/sb-admin.css")),format.raw/*10.110*/(""""> -->
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*11.70*/routes/*11.76*/.Assets.versioned("font-awesome/css/font-awesome.min.css")),format.raw/*11.134*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*12.54*/routes/*12.60*/.Assets.versioned("stylesheets/shop-homepage.css")),format.raw/*12.110*/("""">
        """),_display_(/*13.10*/css),format.raw/*13.13*/("""
        
        
    """),format.raw/*16.5*/("""</head>
    <body>

        <div id="wrapper">
            
            <!-- Navigation -->
            <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <a class="navbar-brand" href=""""),_display_(/*25.52*/routes/*25.58*/.HomeController.index),format.raw/*25.79*/(""""><span class="glyphicon glyphicon-home" aria-hidden="true"></span> Inicio</a>
                </div>
                

                <!-- Top Menu Items -->
                <ul class="nav navbar-right top-nav">
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-option-vertical" aria-hidden="true"></span> Opciones <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li>
                                <a href=""""),_display_(/*35.43*/routes/*35.49*/.HomeController.login),format.raw/*35.70*/(""""><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Iniciar Sesion</a>
                            </li>
                            <li>
                                <a href=""""),_display_(/*38.43*/routes/*38.49*/.HomeController.register),format.raw/*38.73*/(""""><span class="glyphicon glyphicon-edit" aria-hidden="true"></span> Registrarse</a>
                            </li>
                            <li>
                                <a href=""""),_display_(/*41.43*/routes/*41.49*/.HomeController.about),format.raw/*41.70*/(""""><span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span> Acerca de</a>
                            </li>
                        </ul>
                    </li>
                    
                </ul>


            </nav>
            <!-- End Navigation -->
        </div>
        <!--/.wrapper-->


        <!-- Page Content -->
        <div class="container">

            """),_display_(/*58.14*/content),format.raw/*58.21*/("""

        """),format.raw/*60.9*/("""</div>
        <!-- /.container -->

        <div class="container">

            <hr>

            <!-- Footer -->
            <footer>
                <div class="row">
                    <div class="col-lg-12">
                        <p>Copyright &copy; Your Website 2014</p>
                    </div>
                </div>
            </footer>

        </div>
        <!-- /.container -->

        

        <script src=""""),_display_(/*81.23*/routes/*81.29*/.Assets.versioned("javascripts/jquery.js")),format.raw/*81.71*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*82.23*/routes/*82.29*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*82.78*/("""" type="text/javascript"></script>
        """),_display_(/*83.10*/js),format.raw/*83.12*/("""
    """),format.raw/*84.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,css:Html,js:Html,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,css,js)(content)

  def f:((String,Html,Html) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,css,js) => (content) => apply(title,css,js)(content)

  def ref: this.type = this

}


}

/**/
object base extends base_Scope0.base
              /*
                  -- GENERATED --
                  DATE: Sat Nov 05 14:50:38 CST 2016
                  SOURCE: /home/sarahi/crm-igf/app/views/base.scala.html
                  HASH: 1a167b703f01cf4b2feeee7854f2d53c3db40390
                  MATRIX: 758->1|926->74|954->76|1040->136|1065->141|1158->208|1172->214|1234->255|1321->316|1335->322|1395->361|1481->421|1495->427|1566->477|1654->538|1669->544|1736->589|1839->665|1854->671|1934->729|2017->785|2032->791|2104->841|2143->853|2167->856|2217->879|2594->1229|2609->1235|2651->1256|3262->1840|3277->1846|3319->1867|3542->2063|3557->2069|3602->2093|3822->2286|3837->2292|3879->2313|4300->2707|4328->2714|4365->2724|4823->3155|4838->3161|4901->3203|4985->3260|5000->3266|5070->3315|5141->3359|5164->3361|5196->3366
                  LINES: 27->1|32->1|34->3|37->6|37->6|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|47->16|56->25|56->25|56->25|66->35|66->35|66->35|69->38|69->38|69->38|72->41|72->41|72->41|89->58|89->58|91->60|112->81|112->81|112->81|113->82|113->82|113->82|114->83|114->83|115->84
                  -- GENERATED --
              */
          