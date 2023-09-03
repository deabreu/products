package net.exercise.model

import java.time.ZonedDateTime

final case class Product(
                  id: Long,
                  name: String,
                  category: String,
                  price: BigDecimal,
                  weight: BigDecimal,
                  created: ZonedDateTime,
                  updated: ZonedDateTime
                  )
