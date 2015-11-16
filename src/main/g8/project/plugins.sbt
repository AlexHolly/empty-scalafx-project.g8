resolvers += Classpaths.typesafeResolver

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "$sbteclipse_version$")

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "$sbtidea_version$")

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "$sbtassembly_version$")
