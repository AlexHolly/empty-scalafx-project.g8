name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "$scala_version$"

assemblyJarName in assembly := "$name$" + ".jar"

addCompilerPlugin("org.scalamacros" % "paradise" % "$scalamacros_version$" cross CrossVersion.full)

unmanagedJars in Compile += Attributed.blank(file(System.getenv("JAVA_HOME") + "/jre/lib/ext/jfxrt.jar"))

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest"           % "$scalatest_version$" % "test",
  "org.scalafx"   %% "scalafxml-core-sfx8" % "$scalafx_core$",
  "org.scalafx"   %% "scalafx"             % "$scalafx$"
)

assemblyMergeStrategy in assembly := {
  case PathList("javax", "servlet", xs @ _*)         => MergeStrategy.first
  case PathList(ps @ _*) if ps.last endsWith ".html" => MergeStrategy.first
  case "application.conf"                            => MergeStrategy.concat
  case "unwanted.txt"                                => MergeStrategy.discard
  case x =>
    val oldStrategy = (assemblyMergeStrategy in assembly).value
    oldStrategy(x)
}
