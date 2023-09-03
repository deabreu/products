package net.exercise.persistence

import java.util.concurrent.Executors
import scala.concurrent.ExecutionContext


object DBContext {
  implicit val ec = ExecutionContext.fromExecutor(Executors.newWorkStealingPool(4))
}
