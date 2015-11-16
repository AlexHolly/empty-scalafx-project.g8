## [giter8](http://github.com/n8han/giter8) template

### uses
* Scala 2.11.7
* Scalatest 2.2.4
* scalafx 8.0.60-R9


### predefined sbt plugins (require sbt 0.13.x):
* sbt-eclipse 4.0.0
* sbt-idea 1.6.0
* sbt-assembly 0.14.0


### usage:
Follow g8 [installation instructions](http://github.com/n8han/giter8#readme), [Install Issue](https://github.com/n8han/conscript/issues/72#issuecomment-156680186) or when using homebrew:

    brew install giter8

Go to your favourite shell and enter  

    g8 alexholly/empty-scalafx-project
    cd [app-name]
    sbt compile


generate project files for your favourite IDE

    sbt eclipse
    sbt gen-idea

build jar

    sbt assembly

### Issues

#### sbt run show permission error
remove the target folder
    
#### Exception in Application start method(probably path issue)
One of the .fxml files cannot be found place them in resources/
or in the same folder with the .scala/.java file which is looking for the .fxml file.
Check the .fxml filename, any hidden or switched characters? 

#### modena.css not found
.scala/.java files need to be in the right package folder "no default" and package mixing
OR missing in build.sbt
```
unmanagedJars in Compile += Attributed.blank(file(System.getenv("JAVA_HOME") + "/jre/lib/ext/jfxrt.jar"))
```
    
### License:
Licensed under the Apache License, Version 2.0, see http://www.apache.org/licenses/LICENSE-2.0
