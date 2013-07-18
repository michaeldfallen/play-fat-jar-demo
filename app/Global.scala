import java.net.URI
import play.api.{ Application, GlobalSettings }
import java.awt.Desktop

object Global extends GlobalSettings {

  override def onStart(app: Application) {
    super.onStart(app)

    if (Desktop.isDesktopSupported)
      Desktop.getDesktop.browse("http://localhost:9000")
  }

  implicit def string2URI(str:String):URI = new URI(str)

}
