package net.exercise.model

import java.time.ZonedDateTime

final case class Item(
                 id: Long,
                 productId: Long,
                 cost: BigDecimal,
                 shippingFee: BigDecimal,
                 taxAmount: BigDecimal,
                 creationDate: ZonedDateTime
               )
