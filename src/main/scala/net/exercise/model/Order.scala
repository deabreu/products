package net.exercise.model

import java.time.ZonedDateTime


//todo attach item list
final case class Order(
                  id: Long,
                  customerName: String,
                  contact: String,
                  shippingAddress: String,
                  total: BigDecimal,
                  created: ZonedDateTime,
                  updated: ZonedDateTime
                )
