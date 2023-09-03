package net.exercise.service

import net.exercise.model.Product

trait ProductService {

  def add(prod: Product): Boolean
  def remove(prodId: Long): Boolean

  def updateQuantity()

}

class ProductServiceImpl extends ProductService {

  override def add(prod: Product): Boolean = false

  override def remove(prodId: Long): Boolean = ???
}