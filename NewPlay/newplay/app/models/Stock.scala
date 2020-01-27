package models

case class Stock (val id: Long,
 var symbol: String,
 var company: Option[String])

object Stock {

 import anorm._
 import anorm.SqlParser._
 import play.api.db._
 import play.api.Play.current
 import anorm.SQL

 // create a SqlQuery for all of the "select all" methods


 /*val stock = {
  get[Long]("id") ~
    get[String]("symbol") ~
    get[String]("company") map {
   case id ~ symbol ~ company => Stock(id, symbol, company)
  }
 }

 def selectAll(): List[Stock] = DB.withConnection { implicit c =>
  SQL("select * from stocks order by symbol asc").as(stock *)
 }

}*/

 val sqlQuery = SQL("select * from stocks order by symbol asc")
 def selectAll(): List[Stock] = DB.withConnection { implicit connection =>
 sqlQuery().map( row =>
 Stock(row[Long]("id"),
 row[String]("symbol"),
 row[Option[String]]("company"))
 ).toList
 }

}