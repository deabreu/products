package net.exercise.persistence

import net.exercise.model.{Item, Order, Product}
import slick.jdbc.PostgresProfile.api._

import java.time.ZonedDateTime

object Schema {

  class ProductDB(tag: Tag) extends Table[Product](tag, Some("exercise"), "products") {
    def id: Rep[Long] = column[Long]("product_id", O.PrimaryKey, O.AutoInc)

    def name: Rep[String] = column[String]("name")

    def category: Rep[String] = column[String]("category")

    def weight: Rep[BigDecimal] = column[BigDecimal]("weight")

    def price: Rep[BigDecimal] = column[BigDecimal]("price")

    def creationDate: Rep[ZonedDateTime] = column[ZonedDateTime]("creation_date")

    def lastUpdate = column[ZonedDateTime]("last_update")

    override def * = (id, name, category, weight, price, creationDate, lastUpdate) <> (Product.tupled, Product.unapply)
  }

  lazy val products = TableQuery[ProductDB]


  class ItemDB(tag: Tag) extends Table[Item](tag, Some("exercise"), "items") {
    def id: Rep[Long] = column[Long]("item_id", O.PrimaryKey, O.AutoInc)

    def productId: Rep[Long] = column[Long]("product_id")

    def cost: Rep[BigDecimal] = column[BigDecimal]("cost")

    def shippingFee: Rep[BigDecimal] = column[BigDecimal]("shipping_fee")

    def taxAmount: Rep[BigDecimal] = column[BigDecimal]("tax_amount")

    def creationDate: Rep[ZonedDateTime] = column[ZonedDateTime]("creation_date")

    override def * = (id, productId, cost, shippingFee, taxAmount, creationDate) <> (Item.tupled, Item.unapply)
  }

  lazy val items = TableQuery[ItemDB]


  class OrderDB(tag: Tag) extends Table[Order](tag, Some("exercise"), "products") {
    def id: Rep[Long] = column[Long]("order_id", O.PrimaryKey, O.AutoInc)

    def customerName: Rep[String] = column[String]("customer_name")

    def contact: Rep[String] = column[String]("contact")

    def shippingAddress: Rep[String] = column[String]("shipping_address")

    def total: Rep[BigDecimal] = column[BigDecimal]("total")

    def creationDate: Rep[ZonedDateTime] = column[ZonedDateTime]("creation_date")

    def lastUpdate = column[ZonedDateTime]("last_update")

    override def * = (id, customerName, contact, shippingAddress, total, creationDate, lastUpdate) <> (Order.tupled, Order.unapply)
  }

  lazy val orders = TableQuery[OrderDB]

}
