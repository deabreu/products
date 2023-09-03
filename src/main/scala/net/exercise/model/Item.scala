package net.exercise.model

import java.time.ZonedDateTime

case class Item(id: Long, productId: Long, cost: BigDecimal, shippingFee: BigDecimal, taxAmount: BigDecimal, creationDate: ZonedDateTime)
