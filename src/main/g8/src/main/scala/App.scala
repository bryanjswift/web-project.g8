package $organization$

import com.codahale.fig.Configuration
import org.mortbay.jetty.Server
import org.mortbay.jetty.webapp.WebAppContext

object $sbt_project_name$App {
  val Config = new Configuration("src/main/resources/config.json")
  def main(args:Array[String]) {
    val server = new Server(Config("http.port").as[Int]);
    // create the context for the webapp
    val webapp = Config("webapp.path").or("src/main/webapp")
    val context = new WebAppContext()
    context.setDescriptor(webapp + "/WEB-INF/web.xml")
    context.setResourceBase(webapp)
    context.setContextPath(Config("webapp.context").or("/"))
    context.setParentLoaderPriority(true)
    // Alternatively Configure by XML
    // XmlConfiguration configuration = new XmlConfiguration(new FileInputStream("myJetty.xml"));
    // configuration.configure(server);

    // set the webapp context as the handler
    server.setHandler(context)
    // start the server
    server.start()
    server.join()
  }
}
