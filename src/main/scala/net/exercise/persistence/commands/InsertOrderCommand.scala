package net.exercise.persistence.commands

import net.exercise.model.{Item, Order}

import java.time.ZonedDateTime

final case class InsertOrderCommand(
                               customerName: String,
                               contact: String,
                               shippingAddress: String,
                               items: List[InsertOrderCommand.InsertOrder]
                             ) {
  def toOrderAndItems(now: ZonedDateTime): (Order, List[Item]) = {
    (Order(
      id = 0L,
      customerName = this.customerName,
      contact = this.contact,
      shippingAddress = this.shippingAddress,
      total = this.items.map(_.total).sum,
      created = now,
      updated = now
    ), this.items.map(_.toItem(now)))
  }
}

object InsertOrderCommand {
  final case class InsertOrder(
                                productId: Long,
                                cost: BigDecimal,
                                shippingFee: BigDecimal,
                                taxAmount: BigDecimal
                              ) {
    def toItem(now: ZonedDateTime): Item = Item(
      id = 0L,
      productId = this.productId,
      cost = this.cost,
      shippingFee = this.shippingFee,
      taxAmount = this.taxAmount,
      creationDate = now
    )

    def total: BigDecimal = this.cost + this.shippingFee + this.taxAmount
  }
}
