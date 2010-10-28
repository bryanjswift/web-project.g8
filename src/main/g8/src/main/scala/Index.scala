package $organization$.web.resources

import com.sun.jersey.spi.resource.Singleton
import javax.ws.rs.{GET,Produces,Path,PathParam}
import javax.ws.rs.core.MediaType.{APPLICATION_XML,TEXT_PLAIN,TEXT_XML,TEXT_HTML}

@Singleton
@Path("/index")
class IndexResource {
  @GET
  @Produces(Array(TEXT_HTML))
  def message:String = {
    val xml = <h1>Hello $author$, From Jersey</h1>
    xml.toString
  }
}