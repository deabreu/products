package net.exercise.persistence.commands

case class UpdateProductCommand(
                                name: Option[String],
                                category: Option[String],
                                price: Option[BigDecimal],
                                weight: Option[BigDecimal]
                                )
