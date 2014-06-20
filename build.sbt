name := "SparkDemo"

version := "1.0.0"

scalaVersion := "2.10.4"

libraryDependencies ++= Seq("org.apache.spark" % "spark-core_2.10" % "1.0.0",
                    "org.apache.hadoop" % "hadoop-client" % "2.4.0" )

//resolvers ++= Seq("Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots")
resolvers ++= Seq(
    // HTTPS is unavailable for Maven Central
      "Maven Repository"     at "http://repo.maven.apache.org/maven2",
      "Apache Repository"    at "https://repository.apache.org/content/repositories/releases",
      "JBoss Repository"     at "https://repository.jboss.org/nexus/content/repositories/releases/",
      "MQTT Repository"      at "https://repo.eclipse.org/content/repositories/paho-releases/",
      "Cloudera Repository"  at "http://repository.cloudera.com/artifactory/cloudera-repos/",
      // For Sonatype publishing
      "sonatype-snapshots"   at "https://oss.sonatype.org/content/repositories/snapshots",
      "Akka Repository" at "http://repo.akka.io/releases/",
      // "sonatype-staging"     at "https://oss.sonatype.org/service/local/staging/deploy/maven2/",
      // also check the local Maven repository ~/.m2
      Resolver.mavenLocal
)
