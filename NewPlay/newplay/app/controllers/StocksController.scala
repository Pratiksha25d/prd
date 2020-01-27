package controllers
import akka.http.scaladsl.model.HttpHeader.ParsingResult.Ok
import play.api._
import play.api.mvc._
import views._
import models._
import play.mvc.Controller
import javax.inject._
import play.api._
import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class StocksController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {



    def list = Action {
      Ok(html.stocks.list(Stock.selectAll()))
      //Ok(html.stock.list(stocks.selectAll()))
    }



}
