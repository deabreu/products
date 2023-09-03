package net.exercise.model

import java.time.ZonedDateTime

case class Order(id: Long, customerName: String, contact: String, shippingAddress: String, total: BigDecimal, creationDate: ZonedDateTime)
