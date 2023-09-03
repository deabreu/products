package net.exercise.persistence.commands

case class InsertProductCommand(
                                 name: String,
                                 category: String,
                                 price: BigDecimal,
                                 weight: BigDecimal
                               )
