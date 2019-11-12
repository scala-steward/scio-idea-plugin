resolvers += Resolver.url(
  "jetbrains-bintray",
  url("https://dl.bintray.com/jetbrains/sbt-plugins/")
)(Resolver.ivyStylePatterns)

addSbtPlugin("org.jetbrains" % "sbt-idea-plugin" % "3.3.3")
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.2.1")
