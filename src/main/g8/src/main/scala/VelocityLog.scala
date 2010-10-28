package project

import net.lag.logging.Logger
import org.apache.velocity.runtime.{RuntimeServices => Services}
import org.apache.velocity.runtime.log.LogChute

class VelocityLog extends LogChute {
  private val logger = Logger.get
  def init(services:Services) = { }
  def isLevelEnabled(level:Int) = logger.isLoggable(level)
  def log(level:Int, message:String) = logger.log(level,message)
  def log(level:Int, message:String, t:Throwable) = logger.log(level,t,message)
  private implicit def intToLevel(l:Int):Level = {
    l match {
      case LogChute.ERROR_ID => Logger.ERROR
      case LogChute.WARN_ID => Logger.WARNING
      case LogChute.INFO_ID => Logger.INFO
      case LogChute.DEBUG_ID => Logger.DEBUG
      case LogChute.TRACE_ID => Logger.TRACE
      case _ => Logger.ALL
    }
  }
}