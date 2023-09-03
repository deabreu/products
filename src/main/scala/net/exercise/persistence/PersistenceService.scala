package net.exercise.persistence

import net.exercise.model.{Item, Order, Product}
import slick.jdbc.PostgresProfile.api._
import DBContext.ec

import scala.concurrent.Future

class PersistenceService(db: Database) {

  private def insertItem(item: Item): Future[Item] = {
    import Schema.items
    lazy val returning = items returning items.map(_.id) into ((item, autoId) => item.copy(id = autoId))
    val action = returning += item
    db.run(action)
  }

  def insertOrder(order: Order, items: List[Item]): Future[Order] = {
    import Schema.orders
    val _ = Future.sequence(for {
      item <- items
    } yield insertItem(item))

    lazy val returning = orders returning orders.map(_.id) into ((order, autoId) => order.copy(id = autoId))
    val action = returning += order
    db.run(action)
  }


  def insertProduct(product: Product): Future[Product] = {
    import Schema.products
    lazy val returning = products returning products.map(_.id) into ((product, autoId) => product.copy(id = autoId))
    val action = returning += product
    db.run(action)
  }


  def updateItem(item: Item): Future[Item] = {

  }
}

object PersistenceService {
  val defaultDB = Database.forConfig("postgres")
}
