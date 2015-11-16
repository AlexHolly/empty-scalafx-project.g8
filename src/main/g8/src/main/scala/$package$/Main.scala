package $package$


import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafxml.core.{NoDependencyResolver, FXMLView}

object Main extends JFXApp {
  
  
  val root = FXMLView(getClass.getResource("/FirstScene.fxml"), NoDependencyResolver)
  
  //Frame
  stage = new JFXApp.PrimaryStage {
    //Frame Title
    title.value = "Hello ScalaFXML"
    //Show FirstScene.fxml
    scene = new Scene(root)
  }
  
}
