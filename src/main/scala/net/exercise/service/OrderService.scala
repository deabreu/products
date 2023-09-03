package net.exercise.service

import net.exercise.model.{Item, Order}
import net.exercise.persistence.PersistenceService
import net.exercise.persistence.commands.InsertOrderCommand
import net.exercise.service.OrderService.persistenceHandler

import java.time.{ZoneId, ZonedDateTime}
import scala.concurrent.Future

trait OrderService {

  def place(inputOrder: InsertOrderCommand): Future[Boolean]

}

object OrderService {
  val persistenceHandler = new PersistenceService(PersistenceService.defaultDB)
}

class OrderServiceImpl extends OrderService {
  override def place(inputOrder: InsertOrderCommand): Future[Boolean] = {
    val now = ZonedDateTime.now(ZoneId.of("UTC"))
    val (order, items) = inputOrder.toOrderAndItems(now)

  }
}