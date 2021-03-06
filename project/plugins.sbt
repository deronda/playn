// pom-util POM helpers
libraryDependencies += "com.samskivert" % "sbt-pom-util" % "0.4-SNAPSHOT"

// a plugin for wiring up LWJGL native libraries
addSbtPlugin("com.github.philcali" % "sbt-lwjgl-plugin" % "3.1.4")

// TEMP: force use of locally installed version as mine has gwt-superdevmode
// a Maven repo needed for the sbt-gwt-plugin
// resolvers += "thunderklaus repo" at "http://thunderklaus.github.com/maven"

// handles GWT stuff for test-html build (also pulls in xsbt-web-plugin)
addSbtPlugin("net.thunderklaus" % "sbt-gwt-plugin" % "1.1-SNAPSHOT")
